package top.testops.my_api_test;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.TestNG;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import top.testops.my_api_test.dao.been.ErrorBeen;
import top.testops.my_api_test.listen.ExtentTestNGIReporterListener;
import top.testops.my_api_test.service.UserService;
import top.testops.my_api_test.service.impl.UserServiceImpl;
import top.testops.utils.HttpUtil;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author carson
 * @ClassName TestNGDemo
 * @Description TODO
 * @date 2020/3/12
 **/
@SpringBootTest
@Listeners(ExtentTestNGIReporterListener.class)
public class TestNGDemo extends AbstractTestNGSpringContextTests {

    @Autowired
    private UserService userService;
    @Autowired()
    private Logger log;

    private CloseableHttpClient httpClient = HttpUtil.creatClient();

    @Test(description = "登录测试")
    public void test() {
        HttpGet httpGet = new HttpGet("http://testmanage.7tao.net:8081/app/channel/listChannel?parentId=0");
        try {
//            Reporter.log(String.valueOf(httpGet.getURI()));
            CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
            String resultJson = EntityUtils.toString(httpResponse.getEntity());
            log.info("mylog" + resultJson);
//            Reporter.log(resultJson);
            ErrorBeen errorBeen = JSON.parseObject(resultJson, ErrorBeen.class);
            log.info("been: " + errorBeen.toString());
            log.error("error: " + errorBeen.toString());
            Assert.assertEquals(1, 2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
