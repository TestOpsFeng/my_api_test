package top.testops.my_ui_test;

import cn.binarywang.tools.generator.ChineseMobileNumberGenerator;
import cn.binarywang.tools.generator.ChineseNameGenerator;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import top.testops.my_api_test.dao.AppDao;
import top.testops.my_api_test.dao.been.DataBeen;
import top.testops.my_api_test.dao.been.StandardBeen;
import top.testops.my_api_test.dao.been.UIDataBeen;
import top.testops.my_api_test.dao.been.body.ManualAddAppointmentBeen;
import top.testops.my_ui_test.page.BasePage;
import top.testops.my_ui_test.page.ProductPage;
import top.testops.utils.APIUtil;

/**
 * @author carson
 * @ClassName ProductTabTestCase
 * @Description TODO
 * @date 2020/3/27
 **/
public class ProductTabTestCase extends BaseSetup {

    @Test(description = "产品 - 用户管理")
    public void userManage() {
        ProductPage page = new ProductPage(driver);
        String readUserManager = page.readUserManager();
        UIDataBeen uiDataBeen = appDao.findUIByTag("listPageUserInfo");
        HttpPost httpPost = APIUtil.createHttpPost(uiDataBeen.getUrl());
        String body = uiDataBeen.getBody();
        APIUtil.setBody(body, httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        String firstEid = APIUtil.parseJsonForValue(httpResponse, uiDataBeen.getReturnJsonPath());
        Assert.assertEquals(readUserManager, firstEid);
    }

    @Test(description = "产品 - 微信授权记录")
    public void wechatBoundLog(){
        ProductPage page = new ProductPage(driver);
        String wechatBoundLog = page.readWechatBoundLog();
        UIDataBeen uiDataBeen = appDao.findUIByTag("listWeChatAuthRecord");
        HttpPost httpPost = APIUtil.createHttpPost(uiDataBeen.getUrl());
        String body = uiDataBeen.getBody();
        APIUtil.setBody(body, httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        String apiPhone = APIUtil.parseJsonForValue(httpResponse, uiDataBeen.getReturnJsonPath());
        Assert.assertEquals(wechatBoundLog, apiPhone);
    }


}
