package top.testops.my_api_test;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import top.testops.my_api_test.dao.AppDao;
import top.testops.my_api_test.dao.been.DataBeen;
import top.testops.my_api_test.dao.been.PageEmployeesBeen;
import top.testops.my_api_test.dao.been.StandardBeen;
import top.testops.my_api_test.listen.ExtentTestNGIReporterListener;
import top.testops.my_api_test.service.UserService;
import top.testops.utils.APIUtil;

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
    @Autowired
    private AppDao appDao;

    @Test(description = "登录测试")
    public void login_test() {
        DataBeen login = appDao.findByTag("login");
        HttpPost httpPost = APIUtil.createHttpPost(login.getUrl());
        APIUtil.setBody(login.getBody(),httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        StandardBeen standardBeen = APIUtil.parseResponse(httpResponse, StandardBeen.class);
        Object Actual = APIUtil.parseExpectedField(login.getExpectedField(),standardBeen);
        Assert.assertEquals(Actual,login.getExpectedValue());
    }



    @Test(description = "获取员工列表")
    public void listPageEmployees_test(){
        DataBeen listPageEmployees = appDao.findByTag("listPageEmployees");
        HttpPost httpPost = APIUtil.createHttpPost(listPageEmployees.getUrl());
        APIUtil.setBody(listPageEmployees.getBody(),httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        PageEmployeesBeen pageEmployeesBeen = APIUtil.parseResponse(httpResponse, PageEmployeesBeen.class);
        Object Actual = APIUtil.parseExpectedField(listPageEmployees.getExpectedField(),pageEmployeesBeen);
        Assert.assertEquals(Actual,listPageEmployees.getExpectedValue());
//        Assert.assertEquals(standardBeen.getCode(),listPageEmployees.getExpected());
    }


    @BeforeClass
    private void login(){
        DataBeen login = appDao.findByTag("login");
        HttpPost httpPost = APIUtil.createHttpPost(login.getUrl());
        APIUtil.setBody(login.getBody(),httpPost);
        APIUtil.exec(httpPost);
    }
}
