package top.testops.my_ui_test;

import cn.binarywang.tools.generator.ChineseNameGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;
import top.testops.my_ui_test.page.BasePage;
import top.testops.my_ui_test.page.ProductPage;

/**
 * @author carson
 * @ClassName ProductTabTestCase
 * @Description TODO
 * @date 2020/3/27
 **/
public class ProductTabTestCase extends BaseSetup {
    @Test(description = "验证用户管理第一个Id展示正常")
    public void testSearch() {
        ProductPage page = new ProductPage(driver);
        page.clickUserManager();
        Assert.assertEquals(page.getFirstId(), "qw6k");
    }
}
