package top.testops.my_api_test.dao.been.body;

import java.util.List;

/**
  * @ClassName SaveFamilyMemberBody
  * @Description TODO
  * @author carson
  * @date 2020/3/17
**/
public class SaveFamilyMemberBody {

    /**
     * userId : 379
     * familyMembers : [{"id":280,"userId":379,"role":1,"realName":"脚本一","aliasName":null,"birthday":null,"jobNature":null,"city":null,"socialSecurity":null,"healthInsuranceLend":null,"extremeSports":null,"hasPolicy":null,"physicalExamination":null,"illnessRecord":null,"remark":null,"visible":null},{"id":281,"userId":379,"role":2,"realName":"脚本二","aliasName":null,"birthday":null,"jobNature":null,"city":null,"socialSecurity":null,"healthInsuranceLend":null,"extremeSports":null,"hasPolicy":null,"physicalExamination":null,"illnessRecord":null,"remark":null,"visible":null},{"id":282,"userId":379,"role":3,"realName":"脚本三","aliasName":null,"birthday":null,"jobNature":null,"city":null,"socialSecurity":null,"healthInsuranceLend":null,"extremeSports":null,"hasPolicy":null,"physicalExamination":null,"illnessRecord":null,"remark":null,"visible":null}]
     */

    private int userId;
    private List<FamilyMembersBean> familyMembers;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<FamilyMembersBean> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(List<FamilyMembersBean> familyMembers) {
        this.familyMembers = familyMembers;
    }

    public static class FamilyMembersBean {
        /**
         * id : 280
         * userId : 379
         * role : 1
         * realName : 脚本一
         * aliasName : null
         * birthday : null
         * jobNature : null
         * city : null
         * socialSecurity : null
         * healthInsuranceLend : null
         * extremeSports : null
         * hasPolicy : null
         * physicalExamination : null
         * illnessRecord : null
         * remark : null
         * visible : null
         */

        private int id;
        private int userId;
        private int role;
        private String realName;
        private Object aliasName;
        private Object birthday;
        private Object jobNature;
        private Object city;
        private Object socialSecurity;
        private Object healthInsuranceLend;
        private Object extremeSports;
        private Object hasPolicy;
        private Object physicalExamination;
        private Object illnessRecord;
        private Object remark;
        private Object visible;

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

        public int getRole() {
            return role;
        }

        public void setRole(int role) {
            this.role = role;
        }

        public String getRealName() {
            return realName;
        }

        public void setRealName(String realName) {
            this.realName = realName;
        }

        public Object getAliasName() {
            return aliasName;
        }

        public void setAliasName(Object aliasName) {
            this.aliasName = aliasName;
        }

        public Object getBirthday() {
            return birthday;
        }

        public void setBirthday(Object birthday) {
            this.birthday = birthday;
        }

        public Object getJobNature() {
            return jobNature;
        }

        public void setJobNature(Object jobNature) {
            this.jobNature = jobNature;
        }

        public Object getCity() {
            return city;
        }

        public void setCity(Object city) {
            this.city = city;
        }

        public Object getSocialSecurity() {
            return socialSecurity;
        }

        public void setSocialSecurity(Object socialSecurity) {
            this.socialSecurity = socialSecurity;
        }

        public Object getHealthInsuranceLend() {
            return healthInsuranceLend;
        }

        public void setHealthInsuranceLend(Object healthInsuranceLend) {
            this.healthInsuranceLend = healthInsuranceLend;
        }

        public Object getExtremeSports() {
            return extremeSports;
        }

        public void setExtremeSports(Object extremeSports) {
            this.extremeSports = extremeSports;
        }

        public Object getHasPolicy() {
            return hasPolicy;
        }

        public void setHasPolicy(Object hasPolicy) {
            this.hasPolicy = hasPolicy;
        }

        public Object getPhysicalExamination() {
            return physicalExamination;
        }

        public void setPhysicalExamination(Object physicalExamination) {
            this.physicalExamination = physicalExamination;
        }

        public Object getIllnessRecord() {
            return illnessRecord;
        }

        public void setIllnessRecord(Object illnessRecord) {
            this.illnessRecord = illnessRecord;
        }

        public Object getRemark() {
            return remark;
        }

        public void setRemark(Object remark) {
            this.remark = remark;
        }

        public Object getVisible() {
            return visible;
        }

        public void setVisible(Object visible) {
            this.visible = visible;
        }
    }
}
