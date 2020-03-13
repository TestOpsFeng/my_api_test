package top.testops.my_api_test;

import com.alibaba.fastjson.JSON;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import top.testops.my_api_test.dao.been.ErrorBeen;
import top.testops.my_api_test.service.UserService;
import top.testops.utils.HttpUtil;

import java.io.IOException;

@SpringBootTest
class MyApiTestApplicationTests extends AbstractTestNGSpringContextTests {

    @Autowired
    private UserService userService;
    private CloseableHttpClient httpClient = HttpUtil.creatClient();

    @Test
    public void test() {
        userService.findUser();
        HttpGet httpGet = new HttpGet("http://testmanage.7tao.net:8081/app/channel/listChannel?parentId=0");
        try {
            CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
            String resultJson = EntityUtils.toString(httpResponse.getEntity());
//            Rlog.info("mylog" + resultJson);
            ErrorBeen errorBeen = JSON.parseObject(resultJson, ErrorBeen.class);
//            Rlog.info("been: " + errorBeen.toString());
            Assert.assertEquals("a","b");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
