package top.testops.my_ui_test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * @author carson
 * @ClassName LoginPage
 * @Description TODO
 * @date 2020/3/27
 **/
public class LoginPage extends BasePage {
    private By inputLogin = By.xpath("//input[@class=\"el-input__inner\"]");
    private By submit = By.xpath("//button[@class=\"el-button loginbtn el-button--success\"]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String userName, String password) {
        openPage(host);
        List<WebElement> logins = findElementsWithTimeout(inputLogin);
        sendKeys(logins.get(0), userName);
        sendKeys(logins.get(1), password);
        click(submit);
    }
}
