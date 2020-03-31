package top.testops.my_api_test.listen;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.util.TextUtils;
import org.testng.*;
import org.testng.xml.XmlSuite;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
  * @ClassName UIExtentTestNGIReporterListener
  * @Description TODO
  * @author carson
  * @date 2020/3/12
**/
@Slf4j
public class ExtentTestNGIReporterListener implements IReporter {


    private static final String OUTPUT_FOLDER = System.getProperty("user.dir") + "\\logs\\extend-report\\";
    private static final String FILE_NAME = "API-extend.html";
    private static final String DocumentTitle = "API测试";
    private static final String ReportName = "API测试";
    private ExtentReports extent;
    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        init();
        for (ISuite suite : suites) {
            Map result = suite.getResults();
            for (Object obj : result.values()) {
                ISuiteResult r = (ISuiteResult) obj;
                ITestContext context = r.getTestContext();


                buildTestNodes(context.getFailedTests(), Status.FAIL);
                buildTestNodes(context.getSkippedTests(), Status.SKIP);
                buildTestNodes(context.getPassedTests(), Status.PASS);
            }
        }


        for (String s : Reporter.getOutput()) {
            extent.setTestRunnerOutput(s);
        }


        extent.flush();
    }


    private void init() {
        File file=new File(OUTPUT_FOLDER);
        if (!file.exists()){
            try {
                file.mkdir();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        log.info("ExtendReport写入： " + OUTPUT_FOLDER + FILE_NAME);
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(OUTPUT_FOLDER + FILE_NAME);
        htmlReporter.config().setDocumentTitle(DocumentTitle);
        htmlReporter.config().setReportName(ReportName);
        htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
        htmlReporter.config().setTheme(Theme.STANDARD);


        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setReportUsesManualConfiguration(true);
    }


    private void buildTestNodes(IResultMap tests, Status status) {
        ExtentTest test;
        if (tests.size() > 0) {
            for (ITestResult result : tests.getAllResults()) {
                String description = result.getMethod().getDescription();
                if (!TextUtils.isEmpty(description)) {
                    //有@Test的description，则以description生成测试用例标题
                    test = extent.createTest(description);
                } else {
                    //没有以方法名生成测试用例标题
                    test = extent.createTest(result.getMethod().getMethodName());
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
                }
                test.getModel().setStartTime(getTime(result.getStartMillis()));
                test.getModel().setEndTime(getTime(result.getEndMillis()));
            }
        }
    }


    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }




}
