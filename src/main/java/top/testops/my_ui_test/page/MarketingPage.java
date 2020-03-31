package top.testops.my_ui_test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
  * @ClassName MarketingPage
  * @Description TODO
  * @author carson
  * @date 2020/3/31
**/
public class MarketingPage extends BasePage {
    public MarketingPage(WebDriver driver) {
        super(driver);
    }
    public static final String url = BasePage.host + "/#/nav/marketing/welcome";
    public By btnPendingUsers = new By.ByXPath("//*[text()='待处理用户']");
    public By btnChannelManage = new By.ByXPath("//*[text()='流量渠道']");
    public By btnPurchaseChannel = new By.ByXPath("//*[text()='投保渠道']");
    public By btnMarketing = new By.ByXPath("//*[text()='市场运营']");
    public By textFirstEid = new By.ByXPath("//div[@class=\"cell\"]");

    public String readReadPendingUsersEid(){
        openPage(url);
        click(btnMarketing);
        click(btnPendingUsers);
        List<WebElement> elementsWithTimeout = findElementsWithTimeout(textFirstEid);
        WebElement webElement;
        webElement = elementsWithTimeout.get(11);
        return getText(webElement);
    }
    public String readChannelManage(){
        openPage(url);
        click(btnMarketing);
        click(btnChannelManage);
        List<WebElement> elementsWithTimeout = findElementsWithTimeout(textFirstEid);
        WebElement webElement = elementsWithTimeout.get(13);
        return getText(webElement);
    }

    public String readPurchaseChannelList() {
        openPage(url);
        click(btnMarketing);
        click(btnPurchaseChannel);
        List<WebElement> elementsWithTimeout = findElementsWithTimeout(textFirstEid);
        WebElement webElement = elementsWithTimeout.get(5);
        return getText(webElement);
    }
}
