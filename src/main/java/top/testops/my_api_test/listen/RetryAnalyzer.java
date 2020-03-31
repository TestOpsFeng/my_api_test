package top.testops.my_api_test.listen;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;

/**
 * @author carson
 * @ClassName UIRetryAnalyzer
 * @Description 用于设置失败重试
 * @date 2020/3/12
 **/
public class RetryAnalyzer implements IRetryAnalyzer {
    int counter = 0;
    //重试的次数
    int retryLimit = 2;
    @Override
    public boolean retry(ITestResult result) {
        if (counter < retryLimit) {
            if (result.getThrowable() != null) {
                counter++;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}