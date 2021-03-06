package top.testops.my_ui_test.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Reporter;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * page的父类，封装了日志体系，等待元素体系
 */
public abstract class BasePage {
    private WebDriver driver;
    private static final Logger logger;
    protected static String host = "https://testfnspre.guanghebao.com";


    static {
        Logger mylog = LoggerFactory.getLogger("Log");
        logger = (Logger) Proxy.newProxyInstance(mylog.getClass().getClassLoader(), mylog.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Reporter.log(args[0].toString());
                return method.invoke(mylog, args);
            }
        });
    }
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * 打开页面，等待3秒是为了防止还没登陆获取token就跳转新页面
     *
     * @param url
     */
    public void openPage(String url) {
        this.sleep(1000L);
       logger.info(this.getClass().getSimpleName() + ": Navigate to: " + url);
        this.driver.navigate().to(url);
    }

    /**
     * 针对select的随机选择方法
     *
     * @param by
     * @return
     */
    public String randomSelect(By by) {
        WebElement elementWithTimeout = findElementWithTimeout(by);
        Select select = new Select(elementWithTimeout);
        List<WebElement> options = select.getOptions();
        int i = new Random().nextInt(options.size() - 1);
        String text = options.get(i).getText();
        select.selectByVisibleText(text);
       logger.info(this.getClass().getSimpleName() + ": Select Text： " + text);
        return text;
    }

    /**
     * 针对公司编辑页面写的select方法
     *
     * @param by
     * @return
     */
    public String myRandomSelect(By by) {
        click(by);
        By select_subCon_first = By.xpath("//div[@style=\"position: absolute; top: 0px; left: 0px; width: 100%;\"]");
        List<WebElement> list = findElementsWithTimeout(select_subCon_first);
        int size = list.size();
        By select_subCon_second = By.xpath("//div[@style=\"position: absolute; top: 0px; left: 0px; width: 100%;\"][" + size + "]/div/div/div/ul/li");
        List<WebElement> li_list = findElementsWithTimeout(select_subCon_second);
        int randomSubCon = random(0, li_list.size());
        String text = li_list.get(randomSubCon).getText();
        logger.info(this.getClass().getSimpleName() + ": Select Text： " + text);
        li_list.get(randomSubCon).click();
        return text;
    }

    /**
     * 随机获取element集合中的某一个
     *
     * @param by
     * @return
     */
    public WebElement getRandomElement(By by) {
        List<WebElement> list = findElementsWithTimeout(by);
        int size = list.size();
        int randomNum = random(0, size);
        WebElement element = list.get(randomNum);
        logger.info(this.getClass().getSimpleName() + ": Select Text： " + element.getText());
        return element;
    }

    /**
     * 针对公司datepicker的方法
     *
     * @param by
     */
    public void selectDate(By by, String date) {
        click(by);
        By text_date = By.xpath("//a[text()='Today']");
        sleep(1500);
        click(text_date);
        //a[text()="Today"]
    }

    /**
     * 随机数，包含left，和right
     *
     * @param left
     * @param right
     * @return
     */
    public int random(int left, int right) {
        int i = new Random().nextInt(right - left) + left;
        logger.info(this.getClass().getSimpleName() + ": Random int: " + i);
        return i;
    }

    /**
     * 滑动到元素可见
     *
     * @param by
     */
    public void scrollToElement(By by) {
        WebElement element = this.findElementWithTimeout(by);
        JavascriptExecutor je = (JavascriptExecutor) this.driver;
        logger.info(this.getClass().getSimpleName() + ": Scroll to: " + by);
        je.executeScript("arguments[0].scrollIntoView(true);", new Object[]{element});
    }

    /**
     * 跳转到新页面，并关闭旧页面
     */
    public void switchHandle() {
        String currentHandle = this.driver.getWindowHandle();
        Iterator var2 = this.driver.getWindowHandles().iterator();

        while (var2.hasNext()) {
            String handles = (String) var2.next();
            if (handles.equals(currentHandle)) {
                this.driver.close();
            } else {
                logger.info(this.getClass().getSimpleName() + ": Switch to: " + handles);
                this.driver.switchTo().window(handles);
            }
        }

    }

    /**
     * 查找元素，默认等待10秒
     *
     * @param by
     * @return
     */
    public WebElement findElementWithTimeout(By by) {
        return this.findElementWithTimeout(by, 10L);
    }

    /**
     * 等待元素，找到元素后返回
     *
     * @param by
     * @param timeout
     * @return
     */
    public WebElement findElementWithTimeout(By by, long timeout) {
        WebElement webElement = null;

        try {
            logger.info(this.getClass().getSimpleName() + ": Find element：" + by.toString());
            webElement = (WebElement) (new WebDriverWait(this.driver, timeout)).until(ExpectedConditions.elementToBeClickable(by));
            return webElement;
        } catch (TimeoutException var6) {
            logger.error(this.getClass().getSimpleName() + ": Can not find element: " + by.toString());
            throw new TimeoutException("没有找到元素: " + by.toString());
        } catch (NullPointerException var7) {
            logger.error( this.getClass().getSimpleName() + ": Can not find element: " + by.toString());
            throw new NullPointerException("没有找到元素: " + by.toString());
        }
    }

    /**
     * 封装查找一个集合的元素
     *
     * @param by
     * @return
     */
    public List<WebElement> findElementsWithTimeout(By by) {
        return findElementsWithTimeout(by, 10);
    }

    /**
     * 封装查找一个集合的元素
     *
     * @param by
     * @param timeout
     * @return
     */
    public List<WebElement> findElementsWithTimeout(By by, long timeout) {
        List<WebElement> webElements = null;
        try {
           logger.info(this.getClass().getSimpleName() + ": Find elements：" + by.toString());
            new WebDriverWait(this.driver, timeout).until(ExpectedConditions.presenceOfElementLocated(by));
            webElements = driver.findElements(by);
            return webElements;
        } catch (TimeoutException var6) {
            logger.error( this.getClass().getSimpleName() + ": Can not find elements: " + by.toString());
            throw new TimeoutException("没有找到元素: " + by.toString());
        } catch (NullPointerException var7) {
            logger.error( this.getClass().getSimpleName() + ": Can not find elements: " + by.toString());
            throw new NullPointerException("没有找到元素: " + by.toString());
        }
    }

    /**
     * 封装sleep方法
     *
     * @param millis 毫秒
     */
    public void sleep(long millis) {
        try {
           logger.info(this.getClass().getSimpleName() + ": Sleep in " + millis / 1000L + " seconds");
            Thread.sleep(millis);
        } catch (InterruptedException var4) {
            var4.printStackTrace();
        }

    }

    /**
     * 保存pagesource，用于调试
     */
    public void savePageSource() {
        String path = System.getProperty("user.dir") + "/src/java/report/PageSource.xml";

        try {
            FileWriter writer = new FileWriter(path);
            writer.write(this.driver.getPageSource());
            writer.flush();
            writer.close();
        } catch (IOException var4) {
            var4.printStackTrace();
        }
    }

//    /**
//     * 保存截图
//     */
//    public void saveScreenCapture(String name) {
//        String path = System.getProperty("user.dir") + "/logs/extend-report/" + name + ".png";
//        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        try {
//            //复制内容到指定文件中
//            FileUtils.copyFile(scrFile, new File(path));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    /**
     * 等待loading，避免selenium行为被拦截
     *
     * @param by
     */
    public void waitForLoading(By by) {
       logger.info(this.getClass().getSimpleName() + ": Waiting for loading：" + by.toString());
        for (int i = 0; i < 20; i++) {
            try {
                new WebDriverWait(this.driver, 4).until(ExpectedConditions.elementToBeClickable(by));
                sleep(1500);
            } catch (TimeoutException e) {
                sleep(1000);
                return;
            }
        }
    }

    /**
     * 点击元素
     *
     * @param by
     */
    public void click(By by) {
        WebElement webElement = this.findElementWithTimeout(by);
       logger.info(this.getClass().getSimpleName() + ": Click element: " + by.toString());
        webElement.click();
    }

    /**
     * 输入文字
     *
     * @param by
     * @param text
     */
    public void sendKeys(By by, String text) {
        WebElement webElement = this.findElementWithTimeout(by);
       logger.info(this.getClass().getSimpleName() + ": SendKeys 『"+text+"』 to element: " + by.toString());
        webElement.sendKeys(new CharSequence[]{text});
    }
    public void sendKeys(WebElement webElement, String text) {
        logger.info(this.getClass().getSimpleName() + ": SendKeys 『"+text+"』 to element: " + webElement.getText());
        webElement.sendKeys(new CharSequence[]{text});
    }

    /**
     * 清理input后，再输入text
     *
     * @param by
     * @param text
     */
    public void sendKeysAfterClear(By by, String text) {
        WebElement webElement = this.findElementWithTimeout(by);
       logger.info(this.getClass().getSimpleName() + ": Clear text for element: " + by.toString());
        webElement.clear();
       logger.info(this.getClass().getSimpleName() + ": SendKeys 『"+text+"』 to element: " + by.toString());
        webElement.sendKeys(new CharSequence[]{text});
    }

    /**
     * 获取元素的文本text()
     *
     * @param by
     * @return
     */
    public String getText(By by) {
        String text = this.findElementWithTimeout(by).getText();
        logger.info(this.getClass().getSimpleName() + ": Get Text 『"+text+"』 in element: " + by.toString());
        return text;
    }
    public String getText(WebElement element) {
        String text = element.getText();
        logger.info(this.getClass().getSimpleName() + ": Get Text 『"+text+"』 in element");
        return text;
    }


    public void ExecJs(String js) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript(js);
    }

    public String getAttr(By by, String attrKey) {
        WebElement webElement = this.findElementWithTimeout(by);
       logger.info(this.getClass().getSimpleName() + ": Get " + attrKey + " in element: " + by.toString());
        return webElement.getAttribute("value");
    }
}
