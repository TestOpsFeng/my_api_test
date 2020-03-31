package top.testops.my_ui_test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * @author carson
 * @ClassName ProductPage
 * @Description TODO
 * @date 2020/3/27
 **/
public class ProductPage extends BasePage {
    public static final String url = BasePage.host + "/#/nav/index/welcome";
    public By btnUserManager = new By.ByXPath("//*[text()='用户管理']");
    public By btnWechatBoundLog = new By.ByXPath("//*[text()='微信授权记录']");
    public By textFirstId = new By.ByXPath("//span[@class=\"el-link--inner\"][1]");
    public By textPhones = new By.ByXPath("//div[@class=\"cell\"]");


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public String readUserManager() {
        openPage(url);
        click(btnUserManager);
        return getText(textFirstId);
    }

    public String readWechatBoundLog(){
        openPage(url);
        click(btnWechatBoundLog);
        List<WebElement> elements = findElementsWithTimeout(textPhones);
        WebElement webElement = elements.get(8);
        return getText(webElement);
    }

}
