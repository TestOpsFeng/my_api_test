package top.testops.my_api_test.dao.been.body;

/**
  * @ClassName ListPageProductBody
  * @Description TODO
  * @author carson
  * @date 2020/3/17
**/
public class ListPageProductBody {

    /**
     * name : null
     * pageSize : 10
     * pageNum : 1
     * state : 1
     * insuranceType : 1
     */

    private Object name;
    private int pageSize;
    private int pageNum;
    private int state;
    private String insuranceType;

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }
}
