package top.testops.my_api_test.dao.been.body;

/**
  * @ClassName ConfirmUserBody
  * @Description TODO
  * @author carson
  * @date 2020/3/17
**/
public class ConfirmUserBody {

    /**
     * orderNo : 65014707613995008
     * plannerId : null
     * pageNum : 1
     * userId : 370
     */

    private String orderNo;
    private Object plannerId;
    private int pageNum;
    private int userId;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Object getPlannerId() {
        return plannerId;
    }

    public void setPlannerId(Object plannerId) {
        this.plannerId = plannerId;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
