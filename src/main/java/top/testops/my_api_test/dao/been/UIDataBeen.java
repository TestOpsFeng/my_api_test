package top.testops.my_api_test.dao.been;


import lombok.Data;

/**
 * @Description
 * @Author  Hunter
 * @Date 2020-03-31
 */

@Data
public class UIDataBeen {
    private Long id;
    private String tag;
    private String url;

    private String body;

    private String returnJsonPath;

    private String description;

    private String isRun;

    private String useSql;

}
