package top.testops.my_api_test.dao.been;

import lombok.Data;

/**
 * @author carson
 * @ClassName DataBeen
 * @Description TODO
 * @date 2020/3/13
 **/
@Data
public class DataBeen {
    private int id;
    private String tag;
    private String url;
    private String body;
    private String expectedField;
    private String expectedValue;
    private String description;
    private int isRun;
}
