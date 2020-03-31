package top.testops.my_ui_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import top.testops.my_ui_test.listen.UIAnnotationTransformer;
import top.testops.my_ui_test.listen.UIExtentTestNGIReporterListener;
import top.testops.my_ui_test.page.LoginPage;

@Listeners({UIAnnotationTransformer.class, UIExtentTestNGIReporterListener.class})
public abstract class BaseSetup {
    protected WebDriver driver;

    @BeforeClass
    public void setupClass() {
        this.driver = new ChromeDriver(initChromOptions());
        this.initPage();
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
        loginPage.login("liangrongfeng","123456");
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
