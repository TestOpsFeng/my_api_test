package top.testops.my_api_test.dao.been;

/**
  * @ClassName StandardBeen
  * @Description TODO
  * @author carson
  * @date 2020/3/12
**/
public class StandardBeen {

    /**
     * code : 401
     * message : 请先登录认证
     */

    private String code;
    private String message;

    @Override
    public String toString() {
        return "StandardBeen{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
