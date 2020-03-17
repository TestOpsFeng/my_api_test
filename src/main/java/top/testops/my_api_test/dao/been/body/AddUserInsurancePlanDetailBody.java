package top.testops.my_api_test.dao.been.body;

/**
  * @ClassName AddUserInsurancePlanDetailBody
  * @Description TODO
  * @author carson
  * @date 2020/3/17
**/
public class AddUserInsurancePlanDetailBody {

    /**
     * name : 擎天柱3号（优选版）
     * planId : 103
     * familyId : 283
     * productId : 54
     * insuranceType : 1
     * annualPremium : 20000
     * insuranceAmount : 70
     * insurancePeriod : 至70岁
     * paymentPeriod : 30年
     * slogan : null
     * feature : 1、等待期：90天 ；
     2、身故保障 ：赔付100%保额；
     3、全残保障：赔付100%保额；
     4、被保人保费豁免（可选）：轻症/重疾后豁免后续保费。
     * purchaseLink : https:/www.baodan360.com/insurance/detail?id=137051&chn=cps_154016014&subagent=12891
     * userId : 380
     */

    private String name;
    private int planId;
    private int familyId;
    private int productId;
    private int insuranceType;
    private String annualPremium;
    private int insuranceAmount;
    private String insurancePeriod;
    private String paymentPeriod;
    private Object slogan;
    private String feature;
    private String purchaseLink;
    private int userId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public int getFamilyId() {
        return familyId;
    }

    public void setFamilyId(int familyId) {
        this.familyId = familyId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(int insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getAnnualPremium() {
        return annualPremium;
    }

    public void setAnnualPremium(String annualPremium) {
        this.annualPremium = annualPremium;
    }

    public int getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(int insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public String getInsurancePeriod() {
        return insurancePeriod;
    }

    public void setInsurancePeriod(String insurancePeriod) {
        this.insurancePeriod = insurancePeriod;
    }

    public String getPaymentPeriod() {
        return paymentPeriod;
    }

    public void setPaymentPeriod(String paymentPeriod) {
        this.paymentPeriod = paymentPeriod;
    }

    public Object getSlogan() {
        return slogan;
    }

    public void setSlogan(Object slogan) {
        this.slogan = slogan;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getPurchaseLink() {
        return purchaseLink;
    }

    public void setPurchaseLink(String purchaseLink) {
        this.purchaseLink = purchaseLink;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
