package top.testops.my_api_test.dao.been.body;

/**
  * @ClassName AddPlanScheduleBody
  * @Description TODO
  * @author carson
  * @date 2020/3/17
**/
public class AddPlanScheduleBody {

    /**
     * startTime : 2020-03-16 00:00:00
     * duration : 1
     * remark : 脚本自动添加
     * userId : 387
     */

    private String startTime;
    private int duration;
    private String remark;
    private int userId;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
