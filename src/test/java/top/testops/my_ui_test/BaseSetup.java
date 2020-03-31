package top.testops.my_ui_test;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import top.testops.my_api_test.MyApiTestApplication;
import top.testops.my_api_test.dao.AppDao;
import top.testops.my_api_test.dao.been.StandardBeen;
import top.testops.my_api_test.dao.been.UIDataBeen;
import top.testops.my_ui_test.listen.MyWebDriverEventListener;
import top.testops.my_ui_test.listen.UIAnnotationTransformer;
import top.testops.my_ui_test.listen.UIExtentTestNGIReporterListener;
import top.testops.my_ui_test.page.LoginPage;
import top.testops.utils.APIUtil;

@SpringBootTest(classes = MyApiTestApplication.class)
@Listeners({UIExtentTestNGIReporterListener.class})
public class BaseSetup extends AbstractTestNGSpringContextTests {

    protected WebDriver driver;

    @Autowired
    protected AppDao appDao;


        @BeforeClass
    public void setupClass() {
        driver = new EventFiringWebDriver(new ChromeDriver(initChromOptions())).register(new MyWebDriverEventListener());
//        this.driver = new ChromeDriver(initChromOptions());
        this.initPage();
        this.interfaceLogin();
    }

    private void interfaceLogin() {
        UIDataBeen login = appDao.findUIByTag("login");
        HttpPost httpPost = APIUtil.createHttpPost(login.getUrl());
        APIUtil.setBody(login.getBody(), httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        StandardBeen standardBeen = APIUtil.parseResponse(httpResponse, StandardBeen.class);
    }

    @AfterClass
    public void tearDownClass() throws InterruptedException {
        Thread.sleep(3000L);
//        driver.close();
//        if (driver != null) {
//            driver.quit();
//        }
    }

    private void initPage() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("liangrongfeng", "123456");
    }


    private ChromeOptions initChromOptions() {
        //在jenkins上跑脚本要设置driver路径
        System.setProperty("webdriver.chrome.driver", "E:\\IdeaProject\\my_api_test\\src\\main\\java\\top\\testops\\my_ui_test\\driver\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
//            Proxy proxy = new Proxy();
//            proxy.setHttpProxy("127.0.0.1:1080");
//            chromeOptions.setCapability("proxy",proxy);
//        chromeOptions.addArguments("--disable-images");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-gpu");
//        chromeOptions.addArguments("--hide-scrollbars");
//        //chromeOptions.addArguments("blink-settings=imagesEnabled=false");
//        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("lang=zh_CN.UTF-8");


        return chromeOptions;
    }

}
