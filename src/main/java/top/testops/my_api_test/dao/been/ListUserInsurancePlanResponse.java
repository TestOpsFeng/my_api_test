package top.testops.my_api_test.dao.been;

import java.util.List;

/**
  * @ClassName ListUserInsurancePlanResponse
  * @Description TODO
  * @author carson
  * @date 2020/3/17
**/
public class ListUserInsurancePlanResponse {

    /**
     * code : 200
     * message : 操作成功
     * data : [{"id":103,"userId":380,"name":"方案-自动生成","annualPremium":86000,"lifeInsuranceAmount":140,"criticalIllnessInsuranceAmount":400,"medicalInsuranceAmount":50,"accidentInsurance":200,"plannerId":42,"planner":"梁荣锋","createTime":"2020-03-17 11:21:30","updateTime":null},{"id":104,"userId":380,"name":"方案2","annualPremium":0,"lifeInsuranceAmount":0,"criticalIllnessInsuranceAmount":0,"medicalInsuranceAmount":0,"accidentInsurance":0,"plannerId":42,"planner":"梁荣锋","createTime":"2020-03-17 11:59:26","updateTime":null}]
     */

    private int code;
    private String message;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 103
         * userId : 380
         * name : 方案-自动生成
         * annualPremium : 86000
         * lifeInsuranceAmount : 140
         * criticalIllnessInsuranceAmount : 400
         * medicalInsuranceAmount : 50
         * accidentInsurance : 200
         * plannerId : 42
         * planner : 梁荣锋
         * createTime : 2020-03-17 11:21:30
         * updateTime : null
         */

        private int id;
        private int userId;
        private String name;
        private int annualPremium;
        private int lifeInsuranceAmount;
        private int criticalIllnessInsuranceAmount;
        private int medicalInsuranceAmount;
        private int accidentInsurance;
        private int plannerId;
        private String planner;
        private String createTime;
        private Object updateTime;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAnnualPremium() {
            return annualPremium;
        }

        public void setAnnualPremium(int annualPremium) {
            this.annualPremium = annualPremium;
        }

        public int getLifeInsuranceAmount() {
            return lifeInsuranceAmount;
        }

        public void setLifeInsuranceAmount(int lifeInsuranceAmount) {
            this.lifeInsuranceAmount = lifeInsuranceAmount;
        }

        public int getCriticalIllnessInsuranceAmount() {
            return criticalIllnessInsuranceAmount;
        }

        public void setCriticalIllnessInsuranceAmount(int criticalIllnessInsuranceAmount) {
            this.criticalIllnessInsuranceAmount = criticalIllnessInsuranceAmount;
        }

        public int getMedicalInsuranceAmount() {
            return medicalInsuranceAmount;
        }

        public void setMedicalInsuranceAmount(int medicalInsuranceAmount) {
            this.medicalInsuranceAmount = medicalInsuranceAmount;
        }

        public int getAccidentInsurance() {
            return accidentInsurance;
        }

        public void setAccidentInsurance(int accidentInsurance) {
            this.accidentInsurance = accidentInsurance;
        }

        public int getPlannerId() {
            return plannerId;
        }

        public void setPlannerId(int plannerId) {
            this.plannerId = plannerId;
        }

        public String getPlanner() {
            return planner;
        }

        public void setPlanner(String planner) {
            this.planner = planner;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public Object getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Object updateTime) {
            this.updateTime = updateTime;
        }
    }
}
