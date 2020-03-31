package top.testops.my_ui_test;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.testng.Assert;
import org.testng.annotations.Test;
import top.testops.my_api_test.dao.been.UIDataBeen;
import top.testops.my_ui_test.page.MarketingPage;
import top.testops.utils.APIUtil;

/**
  * @ClassName MarketingTabTestCase
  * @Description TODO
  * @author carson
  * @date 2020/3/31
**/
public class MarketingTabTestCase extends BaseSetup {

    @Test(description = "市场运营 - 待处理用户")
    public void pendingUsers() {
        MarketingPage page = new MarketingPage(driver);
        String usersEid = page.readReadPendingUsersEid();
        UIDataBeen uiDataBeen = appDao.findUIByTag("listPendingUser");
        HttpPost httpPost = APIUtil.createHttpPost(uiDataBeen.getUrl());
        String body = uiDataBeen.getBody();
        APIUtil.setBody(body, httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        String firstEid = APIUtil.parseJsonForValue(httpResponse, uiDataBeen.getReturnJsonPath());
        Assert.assertEquals(usersEid, firstEid);
    }

    @Test(description = "市场运营 - 流量渠道")
    public void channelManage() {
        MarketingPage page = new MarketingPage(driver);
        String ui_channelNo = page.readChannelManage();
        UIDataBeen uiDataBeen = appDao.findUIByTag("listPageChannel");
        HttpPost httpPost = APIUtil.createHttpPost(uiDataBeen.getUrl());
        String body = uiDataBeen.getBody();
        APIUtil.setBody(body, httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        String api_channelNo = APIUtil.parseJsonForValue(httpResponse, uiDataBeen.getReturnJsonPath());
        Assert.assertEquals(ui_channelNo, api_channelNo);
    }

    @Test(description = "市场运营 - 投保渠道")
    public void purchaseChannelList() {
        MarketingPage page = new MarketingPage(driver);
        String ui_purchaseChannelList = page.readPurchaseChannelList();
        UIDataBeen uiDataBeen = appDao.findUIByTag("listPage");
        HttpPost httpPost = APIUtil.createHttpPost(uiDataBeen.getUrl());
        String body = uiDataBeen.getBody();
        APIUtil.setBody(body, httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        String api_purchaseChannelList = APIUtil.parseJsonForValue(httpResponse, uiDataBeen.getReturnJsonPath());
        Assert.assertEquals(ui_purchaseChannelList, api_purchaseChannelList);
    }

}
