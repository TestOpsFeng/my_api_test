package top.testops.my_api_test.dao.been.body;

/**
  * @ClassName AddFollowUpRecordBody
  * @Description TODO
  * @author carson
  * @date 2020/3/16
**/
public class AddFollowUpRecordBody {

    /**
     * remark : 脚本自动完成『跟进记录』至待一促
     * appointmentId : 342
     * userId : 365
     * plannerId : 42
     * recordState : 3
     * userLevel : A
     */

    private String remark;
    private int appointmentId;
    private int userId;
    private int plannerId;
    private String recordState;
    private String userLevel;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPlannerId() {
        return plannerId;
    }

    public void setPlannerId(int plannerId) {
        this.plannerId = plannerId;
    }

    public String getRecordState() {
        return recordState;
    }

    public void setRecordState(String recordState) {
        this.recordState = recordState;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }
}
