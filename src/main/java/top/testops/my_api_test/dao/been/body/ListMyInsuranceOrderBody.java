package top.testops.my_api_test.dao.been.body;

import java.util.List;

/**
  * @ClassName ListMyInsuranceOrderBody
  * @Description TODO
  * @author carson
  * @date 2020/3/17
**/
public class ListMyInsuranceOrderBody {

    /**
     * state : 3
     * policyNo : 1715323740
     * insuranceTypes : []
     * pageSize : 10
     * pageNum : 1
     */

    private String state;
    private String policyNo;
    private int pageSize;
    private int pageNum;
    private List<?> insuranceTypes;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
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

    public List<?> getInsuranceTypes() {
        return insuranceTypes;
    }

    public void setInsuranceTypes(List<?> insuranceTypes) {
        this.insuranceTypes = insuranceTypes;
    }
}
