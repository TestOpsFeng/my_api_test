package top.testops.my_api_test.dao.been;

/**
  * @ClassName GenerateFamilyMemberResponse
  * @Description TODO
  * @author carson
  * @date 2020/3/17
**/
public class GenerateFamilyMemberResponse {

    /**
     * code : 200
     * message : 操作成功
     * data : {"id":278}
     */

    private int code;
    private String message;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 278
         */

        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
