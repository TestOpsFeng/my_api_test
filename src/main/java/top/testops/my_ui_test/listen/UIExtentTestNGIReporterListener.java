package top.testops.my_ui_test.listen;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.relevantcodes.extentreports.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.util.TextUtils;
import org.testng.*;
import org.testng.IReporter;
import org.testng.xml.XmlSuite;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 继承IReporter生成报告
 */
@Slf4j
public class UIExtentTestNGIReporterListener implements IReporter {

    private static final String OUTPUT_FOLDER = System.getProperty("user.dir") + "\\logs\\extend-report\\";
    private static final String FILE_NAME = "UI-extend.html";
    private static final String DocumentTitle = "UI测试";
    private static final String ReportName = "UI测试";
    private ExtentReports extent;

    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        log.info("ExtendReport写入： " + OUTPUT_FOLDER + FILE_NAME);
        extent = new ExtentReports(OUTPUT_FOLDER + FILE_NAME,
                true // true为覆盖已经生成的报告，false在已有的报告上面生成，不会覆盖旧的结果
                , DisplayOrder.NEWEST_FIRST // 最新运行的用例结果在第一个
                , NetworkMode.OFFLINE        //生成离线的，免得样式不对应
        );
        extent.startReporter(ReporterType.DB, OUTPUT_FOLDER + FILE_NAME); // 生成本地的DB数据文件

        for (ISuite suite : suites) {
            Map<String, ISuiteResult> result = suite.getResults();
            for (ISuiteResult r : result.values()) {
                ITestContext context = r.getTestContext();
                setTestNodes(context.getPassedTests(), LogStatus.PASS);
                setTestNodes(context.getFailedTests(), LogStatus.FAIL);
                setTestNodes(context.getSkippedTests(), LogStatus.SKIP);
            }
        }

        extent.flush();
        extent.close();
    }


    private void setTestNodes(IResultMap tests, LogStatus status) {
        ExtentTest test;
        if (tests.size() > 0) {
            for (ITestResult result : tests.getAllResults()) {
                String description = result.getMethod().getDescription();
                if (!TextUtils.isEmpty(description)) {
                    //有@Test的description，则以description生成测试用例标题
                    test = extent.startTest(description);
                } else {
                    //没有以方法名生成测试用例标题
                    test = extent.startTest(result.getMethod().getMethodName());
                }
                for (String group : result.getMethod().getGroups())
                    test.assignCategory(group);
                List<String> outputs = Reporter.getOutput(result);
                for (String output : outputs) {
                    test.log(status, output);
                }
                if (result.getThrowable() != null) {
                    //失败则输出到报表
                    test.log(status, result.getThrowable());
                    String error_png_path = "./error-png/error.png";
                    test.log(status, "报错截图如下,点击放大:" + test.addScreenCapture(error_png_path));
                }

                test.setStartedTime(getTime(result.getStartMillis()));
                test.setStartedTime(getTime(result.getStartMillis()));
                extent.endTest(test);
            }
        }
    }

//    private void buildTestNodes(IResultMap tests, Status status) {
//        ExtentTest test;
//        if (tests.size() > 0) {
//            for (ITestResult result : tests.getAllResults()) {
//                String description = result.getMethod().getDescription();
//                if (!TextUtils.isEmpty(description)) {
//                    //有@Test的description，则以description生成测试用例标题
//                    test = extent.createTest(description);
//                } else {
//                    //没有以方法名生成测试用例标题
//                    test = extent.createTest(result.getMethod().getMethodName());
//                }
//                for (String group : result.getMethod().getGroups())
//                    test.assignCategory(group);
//                List<String> outputs = Reporter.getOutput(result);
//                for (String output : outputs) {
//                    test.log(status, output);
//                }
//                if (result.getThrowable() != null) {
//                    //失败则输出到报表
//                    test.log(status, result.getThrowable());
//                }
//                test.getModel().setStartTime(getTime(result.getStartMillis()));
//                test.getModel().setEndTime(getTime(result.getEndMillis()));
//            }
//        }
//    }


    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }


}
