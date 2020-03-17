package top.testops.my_api_test.dao.been.body;

import java.util.List;

public class SaveFinanceInfoBody {

    private FamilyFinanceInfoBean familyFinanceInfo;
    private InsuranceProposalBean insuranceProposal;
    private Object hasSir;
    private Object hasMadam;
    private List<EducationInfosBean> educationInfos;

    public FamilyFinanceInfoBean getFamilyFinanceInfo() {
        return familyFinanceInfo;
    }

    public void setFamilyFinanceInfo(FamilyFinanceInfoBean familyFinanceInfo) {
        this.familyFinanceInfo = familyFinanceInfo;
    }

    public InsuranceProposalBean getInsuranceProposal() {
        return insuranceProposal;
    }

    public void setInsuranceProposal(InsuranceProposalBean insuranceProposal) {
        this.insuranceProposal = insuranceProposal;
    }

    public Object getHasSir() {
        return hasSir;
    }

    public void setHasSir(Object hasSir) {
        this.hasSir = hasSir;
    }

    public Object getHasMadam() {
        return hasMadam;
    }

    public void setHasMadam(Object hasMadam) {
        this.hasMadam = hasMadam;
    }

    public List<EducationInfosBean> getEducationInfos() {
        return educationInfos;
    }

    public void setEducationInfos(List<EducationInfosBean> educationInfos) {
        this.educationInfos = educationInfos;
    }

    public static class FamilyFinanceInfoBean {
        /**
         * id : null
         * userId : 380
         * sirAnnualIncome : 30
         * madamAnnualIncome : 15
         * annualIncome : 45
         * cash : 5
         * fund : 6
         * stock : 7
         * otherInvest : 8
         * liquidAssets : 26
         * investAnnualIncome : 9
         * sirIncomeRate : 67
         * madamIncomeRate : 33
         * overseasAssetsSet : null
         * hongKongInsuranceSet : null
         * mortgage : 10
         * carLoan : 5
         * otherDebt : 0
         * totalDebt : 15
         * mortgagePayment : 1
         * carPayment : 0.5
         * annualMortgagePayment : 18
         * monthLivingExpense : 1
         * livingExpense : 12
         * alimonyPayment : 1
         * alimonyLimit : 10
         * alimonyAmount : 10
         * totalFamilyIncome : 54
         * totalFamilyExpense : 32.5
         * totalFamilyBalance : 21.5
         * childrenEducationAnnualBudget : 1.5
         * childrenEducationTotalBudget : 13.5
         */

        private Object id;
        private int userId;
        private int sirAnnualIncome;
        private String madamAnnualIncome;
        private int annualIncome;
        private String cash;
        private String fund;
        private String stock;
        private String otherInvest;
        private int liquidAssets;
        private String investAnnualIncome;
        private int sirIncomeRate;
        private int madamIncomeRate;
        private Object overseasAssetsSet;
        private Object hongKongInsuranceSet;
        private String mortgage;
        private String carLoan;
        private String otherDebt;
        private int totalDebt;
        private String mortgagePayment;
        private String carPayment;
        private int annualMortgagePayment;
        private String monthLivingExpense;
        private int livingExpense;
        private String alimonyPayment;
        private String alimonyLimit;
        private int alimonyAmount;
        private int totalFamilyIncome;
        private double totalFamilyExpense;
        private double totalFamilyBalance;
        private double childrenEducationAnnualBudget;
        private double childrenEducationTotalBudget;

        public Object getId() {
            return id;
        }

        public void setId(Object id) {
            this.id = id;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getSirAnnualIncome() {
            return sirAnnualIncome;
        }

        public void setSirAnnualIncome(int sirAnnualIncome) {
            this.sirAnnualIncome = sirAnnualIncome;
        }

        public String getMadamAnnualIncome() {
            return madamAnnualIncome;
        }

        public void setMadamAnnualIncome(String madamAnnualIncome) {
            this.madamAnnualIncome = madamAnnualIncome;
        }

        public int getAnnualIncome() {
            return annualIncome;
        }

        public void setAnnualIncome(int annualIncome) {
            this.annualIncome = annualIncome;
        }

        public String getCash() {
            return cash;
        }

        public void setCash(String cash) {
            this.cash = cash;
        }

        public String getFund() {
            return fund;
        }

        public void setFund(String fund) {
            this.fund = fund;
        }

        public String getStock() {
            return stock;
        }

        public void setStock(String stock) {
            this.stock = stock;
        }

        public String getOtherInvest() {
            return otherInvest;
        }

        public void setOtherInvest(String otherInvest) {
            this.otherInvest = otherInvest;
        }

        public int getLiquidAssets() {
            return liquidAssets;
        }

        public void setLiquidAssets(int liquidAssets) {
            this.liquidAssets = liquidAssets;
        }

        public String getInvestAnnualIncome() {
            return investAnnualIncome;
        }

        public void setInvestAnnualIncome(String investAnnualIncome) {
            this.investAnnualIncome = investAnnualIncome;
        }

        public int getSirIncomeRate() {
            return sirIncomeRate;
        }

        public void setSirIncomeRate(int sirIncomeRate) {
            this.sirIncomeRate = sirIncomeRate;
        }

        public int getMadamIncomeRate() {
            return madamIncomeRate;
        }

        public void setMadamIncomeRate(int madamIncomeRate) {
            this.madamIncomeRate = madamIncomeRate;
        }

        public Object getOverseasAssetsSet() {
            return overseasAssetsSet;
        }

        public void setOverseasAssetsSet(Object overseasAssetsSet) {
            this.overseasAssetsSet = overseasAssetsSet;
        }

        public Object getHongKongInsuranceSet() {
            return hongKongInsuranceSet;
        }

        public void setHongKongInsuranceSet(Object hongKongInsuranceSet) {
            this.hongKongInsuranceSet = hongKongInsuranceSet;
        }

        public String getMortgage() {
            return mortgage;
        }

        public void setMortgage(String mortgage) {
            this.mortgage = mortgage;
        }

        public String getCarLoan() {
            return carLoan;
        }

        public void setCarLoan(String carLoan) {
            this.carLoan = carLoan;
        }

        public String getOtherDebt() {
            return otherDebt;
        }

        public void setOtherDebt(String otherDebt) {
            this.otherDebt = otherDebt;
        }

        public int getTotalDebt() {
            return totalDebt;
        }

        public void setTotalDebt(int totalDebt) {
            this.totalDebt = totalDebt;
        }

        public String getMortgagePayment() {
            return mortgagePayment;
        }

        public void setMortgagePayment(String mortgagePayment) {
            this.mortgagePayment = mortgagePayment;
        }

        public String getCarPayment() {
            return carPayment;
        }

        public void setCarPayment(String carPayment) {
            this.carPayment = carPayment;
        }

        public int getAnnualMortgagePayment() {
            return annualMortgagePayment;
        }

        public void setAnnualMortgagePayment(int annualMortgagePayment) {
            this.annualMortgagePayment = annualMortgagePayment;
        }

        public String getMonthLivingExpense() {
            return monthLivingExpense;
        }

        public void setMonthLivingExpense(String monthLivingExpense) {
            this.monthLivingExpense = monthLivingExpense;
        }

        public int getLivingExpense() {
            return livingExpense;
        }

        public void setLivingExpense(int livingExpense) {
            this.livingExpense = livingExpense;
        }

        public String getAlimonyPayment() {
            return alimonyPayment;
        }

        public void setAlimonyPayment(String alimonyPayment) {
            this.alimonyPayment = alimonyPayment;
        }

        public String getAlimonyLimit() {
            return alimonyLimit;
        }

        public void setAlimonyLimit(String alimonyLimit) {
            this.alimonyLimit = alimonyLimit;
        }

        public int getAlimonyAmount() {
            return alimonyAmount;
        }

        public void setAlimonyAmount(int alimonyAmount) {
            this.alimonyAmount = alimonyAmount;
        }

        public int getTotalFamilyIncome() {
            return totalFamilyIncome;
        }

        public void setTotalFamilyIncome(int totalFamilyIncome) {
            this.totalFamilyIncome = totalFamilyIncome;
        }

        public double getTotalFamilyExpense() {
            return totalFamilyExpense;
        }

        public void setTotalFamilyExpense(double totalFamilyExpense) {
            this.totalFamilyExpense = totalFamilyExpense;
        }

        public double getTotalFamilyBalance() {
            return totalFamilyBalance;
        }

        public void setTotalFamilyBalance(double totalFamilyBalance) {
            this.totalFamilyBalance = totalFamilyBalance;
        }

        public double getChildrenEducationAnnualBudget() {
            return childrenEducationAnnualBudget;
        }

        public void setChildrenEducationAnnualBudget(double childrenEducationAnnualBudget) {
            this.childrenEducationAnnualBudget = childrenEducationAnnualBudget;
        }

        public double getChildrenEducationTotalBudget() {
            return childrenEducationTotalBudget;
        }

        public void setChildrenEducationTotalBudget(double childrenEducationTotalBudget) {
            this.childrenEducationTotalBudget = childrenEducationTotalBudget;
        }
    }

    public static class InsuranceProposalBean {
        /**
         * id : null
         * userId : 380
         * sirTreatment : 40
         * sirReimbursement : 20
         * sirDelayYear : 5
         * sirRehabilitationExpenses : 20
         * sirCriticalIllnessInsuranceCalcAmount : 149
         * sirCriticalIllnessInsuranceAmount : 400000
         * madamTreatment : 40
         * madamReimbursement : 20
         * madamDelayYear : 5
         * madamRehabilitationExpenses : 20
         * madamCriticalIllnessInsuranceCalcAmount : 94
         * madamCriticalIllnessInsuranceAmount : 4000000
         * extraYear : 5
         * familyTotalBurden : 99
         * partialLiquidAssets : 0
         * familyLifeInsuranceCalcAmount : 99
         * sirLifeInsuranceCalcAmount : 66
         * sirLifeInsuranceAmount : 70
         * madamLifeInsuranceCalcAmount : 33
         * madamLifeInsuranceAmount : 40
         * insuranceBudget : 100000
         * familyPremiumRate : 15
         * familyCalcPremium : 32250
         * sirPremiumRate : 100
         * sirCalcPremium : 21608
         * sirPremium : 40000
         * madamPremiumRate : 100
         * madamCalcPremium : 10643
         * madamPremium : 20000
         * createTime : null
         * updateTime : null
         */

        private Object id;
        private int userId;
        private int sirTreatment;
        private int sirReimbursement;
        private int sirDelayYear;
        private int sirRehabilitationExpenses;
        private int sirCriticalIllnessInsuranceCalcAmount;
        private String sirCriticalIllnessInsuranceAmount;
        private int madamTreatment;
        private int madamReimbursement;
        private int madamDelayYear;
        private int madamRehabilitationExpenses;
        private int madamCriticalIllnessInsuranceCalcAmount;
        private String madamCriticalIllnessInsuranceAmount;
        private int extraYear;
        private int familyTotalBurden;
        private int partialLiquidAssets;
        private int familyLifeInsuranceCalcAmount;
        private int sirLifeInsuranceCalcAmount;
        private String sirLifeInsuranceAmount;
        private int madamLifeInsuranceCalcAmount;
        private String madamLifeInsuranceAmount;
        private String insuranceBudget;
        private int familyPremiumRate;
        private int familyCalcPremium;
        private int sirPremiumRate;
        private int sirCalcPremium;
        private String sirPremium;
        private int madamPremiumRate;
        private int madamCalcPremium;
        private String madamPremium;
        private Object createTime;
        private Object updateTime;

        public Object getId() {
            return id;
        }

        public void setId(Object id) {
            this.id = id;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getSirTreatment() {
            return sirTreatment;
        }

        public void setSirTreatment(int sirTreatment) {
            this.sirTreatment = sirTreatment;
        }

        public int getSirReimbursement() {
            return sirReimbursement;
        }

        public void setSirReimbursement(int sirReimbursement) {
            this.sirReimbursement = sirReimbursement;
        }

        public int getSirDelayYear() {
            return sirDelayYear;
        }

        public void setSirDelayYear(int sirDelayYear) {
            this.sirDelayYear = sirDelayYear;
        }

        public int getSirRehabilitationExpenses() {
            return sirRehabilitationExpenses;
        }

        public void setSirRehabilitationExpenses(int sirRehabilitationExpenses) {
            this.sirRehabilitationExpenses = sirRehabilitationExpenses;
        }

        public int getSirCriticalIllnessInsuranceCalcAmount() {
            return sirCriticalIllnessInsuranceCalcAmount;
        }

        public void setSirCriticalIllnessInsuranceCalcAmount(int sirCriticalIllnessInsuranceCalcAmount) {
            this.sirCriticalIllnessInsuranceCalcAmount = sirCriticalIllnessInsuranceCalcAmount;
        }

        public String getSirCriticalIllnessInsuranceAmount() {
            return sirCriticalIllnessInsuranceAmount;
        }

        public void setSirCriticalIllnessInsuranceAmount(String sirCriticalIllnessInsuranceAmount) {
            this.sirCriticalIllnessInsuranceAmount = sirCriticalIllnessInsuranceAmount;
        }

        public int getMadamTreatment() {
            return madamTreatment;
        }

        public void setMadamTreatment(int madamTreatment) {
            this.madamTreatment = madamTreatment;
        }

        public int getMadamReimbursement() {
            return madamReimbursement;
        }

        public void setMadamReimbursement(int madamReimbursement) {
            this.madamReimbursement = madamReimbursement;
        }

        public int getMadamDelayYear() {
            return madamDelayYear;
        }

        public void setMadamDelayYear(int madamDelayYear) {
            this.madamDelayYear = madamDelayYear;
        }

        public int getMadamRehabilitationExpenses() {
            return madamRehabilitationExpenses;
        }

        public void setMadamRehabilitationExpenses(int madamRehabilitationExpenses) {
            this.madamRehabilitationExpenses = madamRehabilitationExpenses;
        }

        public int getMadamCriticalIllnessInsuranceCalcAmount() {
            return madamCriticalIllnessInsuranceCalcAmount;
        }

        public void setMadamCriticalIllnessInsuranceCalcAmount(int madamCriticalIllnessInsuranceCalcAmount) {
            this.madamCriticalIllnessInsuranceCalcAmount = madamCriticalIllnessInsuranceCalcAmount;
        }

        public String getMadamCriticalIllnessInsuranceAmount() {
            return madamCriticalIllnessInsuranceAmount;
        }

        public void setMadamCriticalIllnessInsuranceAmount(String madamCriticalIllnessInsuranceAmount) {
            this.madamCriticalIllnessInsuranceAmount = madamCriticalIllnessInsuranceAmount;
        }

        public int getExtraYear() {
            return extraYear;
        }

        public void setExtraYear(int extraYear) {
            this.extraYear = extraYear;
        }

        public int getFamilyTotalBurden() {
            return familyTotalBurden;
        }

        public void setFamilyTotalBurden(int familyTotalBurden) {
            this.familyTotalBurden = familyTotalBurden;
        }

        public int getPartialLiquidAssets() {
            return partialLiquidAssets;
        }

        public void setPartialLiquidAssets(int partialLiquidAssets) {
            this.partialLiquidAssets = partialLiquidAssets;
        }

        public int getFamilyLifeInsuranceCalcAmount() {
            return familyLifeInsuranceCalcAmount;
        }

        public void setFamilyLifeInsuranceCalcAmount(int familyLifeInsuranceCalcAmount) {
            this.familyLifeInsuranceCalcAmount = familyLifeInsuranceCalcAmount;
        }

        public int getSirLifeInsuranceCalcAmount() {
            return sirLifeInsuranceCalcAmount;
        }

        public void setSirLifeInsuranceCalcAmount(int sirLifeInsuranceCalcAmount) {
            this.sirLifeInsuranceCalcAmount = sirLifeInsuranceCalcAmount;
        }

        public String getSirLifeInsuranceAmount() {
            return sirLifeInsuranceAmount;
        }

        public void setSirLifeInsuranceAmount(String sirLifeInsuranceAmount) {
            this.sirLifeInsuranceAmount = sirLifeInsuranceAmount;
        }

        public int getMadamLifeInsuranceCalcAmount() {
            return madamLifeInsuranceCalcAmount;
        }

        public void setMadamLifeInsuranceCalcAmount(int madamLifeInsuranceCalcAmount) {
            this.madamLifeInsuranceCalcAmount = madamLifeInsuranceCalcAmount;
        }

        public String getMadamLifeInsuranceAmount() {
            return madamLifeInsuranceAmount;
        }

        public void setMadamLifeInsuranceAmount(String madamLifeInsuranceAmount) {
            this.madamLifeInsuranceAmount = madamLifeInsuranceAmount;
        }

        public String getInsuranceBudget() {
            return insuranceBudget;
        }

        public void setInsuranceBudget(String insuranceBudget) {
            this.insuranceBudget = insuranceBudget;
        }

        public int getFamilyPremiumRate() {
            return familyPremiumRate;
        }

        public void setFamilyPremiumRate(int familyPremiumRate) {
            this.familyPremiumRate = familyPremiumRate;
        }

        public int getFamilyCalcPremium() {
            return familyCalcPremium;
        }

        public void setFamilyCalcPremium(int familyCalcPremium) {
            this.familyCalcPremium = familyCalcPremium;
        }

        public int getSirPremiumRate() {
            return sirPremiumRate;
        }

        public void setSirPremiumRate(int sirPremiumRate) {
            this.sirPremiumRate = sirPremiumRate;
        }

        public int getSirCalcPremium() {
            return sirCalcPremium;
        }

        public void setSirCalcPremium(int sirCalcPremium) {
            this.sirCalcPremium = sirCalcPremium;
        }

        public String getSirPremium() {
            return sirPremium;
        }

        public void setSirPremium(String sirPremium) {
            this.sirPremium = sirPremium;
        }

        public int getMadamPremiumRate() {
            return madamPremiumRate;
        }

        public void setMadamPremiumRate(int madamPremiumRate) {
            this.madamPremiumRate = madamPremiumRate;
        }

        public int getMadamCalcPremium() {
            return madamCalcPremium;
        }

        public void setMadamCalcPremium(int madamCalcPremium) {
            this.madamCalcPremium = madamCalcPremium;
        }

        public String getMadamPremium() {
            return madamPremium;
        }

        public void setMadamPremium(String madamPremium) {
            this.madamPremium = madamPremium;
        }

        public Object getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Object createTime) {
            this.createTime = createTime;
        }

        public Object getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Object updateTime) {
            this.updateTime = updateTime;
        }
    }

    public static class EducationInfosBean {
        /**
         * id : null
         * userId : 380
         * familyId : 285
         * familyName : 儿子
         * annualBudget : 1.5
         * totalBudget : 13.5
         * method : 1
         * graduateYear : 9
         * createTime : null
         * updateTime : null
         */

        private Object id;
        private int userId;
        private int familyId;
        private String familyName;
        private double annualBudget;
        private double totalBudget;
        private int method;
        private String graduateYear;
        private Object createTime;
        private Object updateTime;

        public Object getId() {
            return id;
        }

        public void setId(Object id) {
            this.id = id;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getFamilyId() {
            return familyId;
        }

        public void setFamilyId(int familyId) {
            this.familyId = familyId;
        }

        public String getFamilyName() {
            return familyName;
        }

        public void setFamilyName(String familyName) {
            this.familyName = familyName;
        }

        public double getAnnualBudget() {
            return annualBudget;
        }

        public void setAnnualBudget(double annualBudget) {
            this.annualBudget = annualBudget;
        }

        public double getTotalBudget() {
            return totalBudget;
        }

        public void setTotalBudget(double totalBudget) {
            this.totalBudget = totalBudget;
        }

        public int getMethod() {
            return method;
        }

        public void setMethod(int method) {
            this.method = method;
        }

        public String getGraduateYear() {
            return graduateYear;
        }

        public void setGraduateYear(String graduateYear) {
            this.graduateYear = graduateYear;
        }

        public Object getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Object createTime) {
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
