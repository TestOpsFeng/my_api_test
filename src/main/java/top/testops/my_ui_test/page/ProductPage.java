package top.testops.my_ui_test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author carson
 * @ClassName ProductPage
 * @Description TODO
 * @date 2020/3/27
 **/
public class ProductPage extends BasePage {
    public static final String url = BasePage.host + "/#/nav/index/welcome";
    public By btnUserManager = new By.ByXPath("//*[text()='用户管理']");
    public By textFirstId = new By.ByXPath("//span[@class=\"el-link--inner\"][1]");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickUserManager() {
        click(btnUserManager);
    }

    public String getFirstId() {
        return getText(textFirstId);
    }

}
