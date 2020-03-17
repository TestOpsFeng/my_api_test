package top.testops.my_api_test.dao.been;

import java.util.List;

/**
  * @ClassName ListMyInsuranceOrderResponse
  * @Description TODO
  * @author carson
  * @date 2020/3/17
**/
public class ListMyInsuranceOrderResponse {

    /**
     * code : 200
     * message : 操作成功
     * data : {"pageNum":1,"pageSize":10,"size":1,"startRow":1,"endRow":1,"total":1,"pages":1,"list":[{"orderNo":"65014707613995008","policyNo":"1715323740","orderType":1,"channelId":null,"product":95,"productName":"超级玛丽2020 MAX","insuranceType":2,"purchaseChannel":3,"purchaseChannelName":"小雨伞（牛保100）","sumInsured":0,"paymentPeriod":30,"insurancePeriod":"保终身","policyHolderMobile":"130****2013","policyHolder":"自动测试","insured":"自动测试","paymentTime":"2020-02-03 19:20:58","price":3510,"premium":3510,"standardPremium":0,"totalPremium":105300,"remark":"","plannerId":42,"planner":"梁荣锋","userId":null,"realName":null,"nickName":null,"mobile":null,"createTime":"2020-03-17 09:45:14","createByName":"梁荣锋","userInfo":null,"eid":null,"isCalcommission":1,"channelName_1":null,"channelId_1":null,"channelName_2":null,"channelId_2":null}],"prePage":0,"nextPage":0,"isFirstPage":true,"isLastPage":true,"hasPreviousPage":false,"hasNextPage":false,"navigatePages":8,"navigatepageNums":[1],"navigateFirstPage":1,"navigateLastPage":1,"firstPage":1,"lastPage":1}
     */

    private String code;
    private String message;
    private DataBean data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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
         * pageNum : 1
         * pageSize : 10
         * size : 1
         * startRow : 1
         * endRow : 1
         * total : 1
         * pages : 1
         * list : [{"orderNo":"65014707613995008","policyNo":"1715323740","orderType":1,"channelId":null,"product":95,"productName":"超级玛丽2020 MAX","insuranceType":2,"purchaseChannel":3,"purchaseChannelName":"小雨伞（牛保100）","sumInsured":0,"paymentPeriod":30,"insurancePeriod":"保终身","policyHolderMobile":"130****2013","policyHolder":"自动测试","insured":"自动测试","paymentTime":"2020-02-03 19:20:58","price":3510,"premium":3510,"standardPremium":0,"totalPremium":105300,"remark":"","plannerId":42,"planner":"梁荣锋","userId":null,"realName":null,"nickName":null,"mobile":null,"createTime":"2020-03-17 09:45:14","createByName":"梁荣锋","userInfo":null,"eid":null,"isCalcommission":1,"channelName_1":null,"channelId_1":null,"channelName_2":null,"channelId_2":null}]
         * prePage : 0
         * nextPage : 0
         * isFirstPage : true
         * isLastPage : true
         * hasPreviousPage : false
         * hasNextPage : false
         * navigatePages : 8
         * navigatepageNums : [1]
         * navigateFirstPage : 1
         * navigateLastPage : 1
         * firstPage : 1
         * lastPage : 1
         */

        private int pageNum;
        private int pageSize;
        private int size;
        private int startRow;
        private int endRow;
        private int total;
        private int pages;
        private int prePage;
        private int nextPage;
        private boolean isFirstPage;
        private boolean isLastPage;
        private boolean hasPreviousPage;
        private boolean hasNextPage;
        private int navigatePages;
        private int navigateFirstPage;
        private int navigateLastPage;
        private int firstPage;
        private int lastPage;
        private List<ListBean> list;
        private List<Integer> navigatepageNums;

        public int getPageNum() {
            return pageNum;
        }

        public void setPageNum(int pageNum) {
            this.pageNum = pageNum;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getStartRow() {
            return startRow;
        }

        public void setStartRow(int startRow) {
            this.startRow = startRow;
        }

        public int getEndRow() {
            return endRow;
        }

        public void setEndRow(int endRow) {
            this.endRow = endRow;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public int getPrePage() {
            return prePage;
        }

        public void setPrePage(int prePage) {
            this.prePage = prePage;
        }

        public int getNextPage() {
            return nextPage;
        }

        public void setNextPage(int nextPage) {
            this.nextPage = nextPage;
        }

        public boolean isIsFirstPage() {
            return isFirstPage;
        }

        public void setIsFirstPage(boolean isFirstPage) {
            this.isFirstPage = isFirstPage;
        }

        public boolean isIsLastPage() {
            return isLastPage;
        }

        public void setIsLastPage(boolean isLastPage) {
            this.isLastPage = isLastPage;
        }

        public boolean isHasPreviousPage() {
            return hasPreviousPage;
        }

        public void setHasPreviousPage(boolean hasPreviousPage) {
            this.hasPreviousPage = hasPreviousPage;
        }

        public boolean isHasNextPage() {
            return hasNextPage;
        }

        public void setHasNextPage(boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
        }

        public int getNavigatePages() {
            return navigatePages;
        }

        public void setNavigatePages(int navigatePages) {
            this.navigatePages = navigatePages;
        }

        public int getNavigateFirstPage() {
            return navigateFirstPage;
        }

        public void setNavigateFirstPage(int navigateFirstPage) {
            this.navigateFirstPage = navigateFirstPage;
        }

        public int getNavigateLastPage() {
            return navigateLastPage;
        }

        public void setNavigateLastPage(int navigateLastPage) {
            this.navigateLastPage = navigateLastPage;
        }

        public int getFirstPage() {
            return firstPage;
        }

        public void setFirstPage(int firstPage) {
            this.firstPage = firstPage;
        }

        public int getLastPage() {
            return lastPage;
        }

        public void setLastPage(int lastPage) {
            this.lastPage = lastPage;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public List<Integer> getNavigatepageNums() {
            return navigatepageNums;
        }

        public void setNavigatepageNums(List<Integer> navigatepageNums) {
            this.navigatepageNums = navigatepageNums;
        }

        public static class ListBean {
            /**
             * orderNo : 65014707613995008
             * policyNo : 1715323740
             * orderType : 1
             * channelId : null
             * product : 95
             * productName : 超级玛丽2020 MAX
             * insuranceType : 2
             * purchaseChannel : 3
             * purchaseChannelName : 小雨伞（牛保100）
             * sumInsured : 0
             * paymentPeriod : 30
             * insurancePeriod : 保终身
             * policyHolderMobile : 130****2013
             * policyHolder : 自动测试
             * insured : 自动测试
             * paymentTime : 2020-02-03 19:20:58
             * price : 3510
             * premium : 3510
             * standardPremium : 0
             * totalPremium : 105300
             * remark :
             * plannerId : 42
             * planner : 梁荣锋
             * userId : null
             * realName : null
             * nickName : null
             * mobile : null
             * createTime : 2020-03-17 09:45:14
             * createByName : 梁荣锋
             * userInfo : null
             * eid : null
             * isCalcommission : 1
             * channelName_1 : null
             * channelId_1 : null
             * channelName_2 : null
             * channelId_2 : null
             */

            private String orderNo;
            private String policyNo;
            private int orderType;
            private Object channelId;
            private int product;
            private String productName;
            private int insuranceType;
            private int purchaseChannel;
            private String purchaseChannelName;
            private int sumInsured;
            private int paymentPeriod;
            private String insurancePeriod;
            private String policyHolderMobile;
            private String policyHolder;
            private String insured;
            private String paymentTime;
            private int price;
            private int premium;
            private int standardPremium;
            private int totalPremium;
            private String remark;
            private int plannerId;
            private String planner;
            private Object userId;
            private Object realName;
            private Object nickName;
            private Object mobile;
            private String createTime;
            private String createByName;
            private Object userInfo;
            private Object eid;
            private int isCalcommission;
            private Object channelName_1;
            private Object channelId_1;
            private Object channelName_2;
            private Object channelId_2;

            public String getOrderNo() {
                return orderNo;
            }

            public void setOrderNo(String orderNo) {
                this.orderNo = orderNo;
            }

            public String getPolicyNo() {
                return policyNo;
            }

            public void setPolicyNo(String policyNo) {
                this.policyNo = policyNo;
            }

            public int getOrderType() {
                return orderType;
            }

            public void setOrderType(int orderType) {
                this.orderType = orderType;
            }

            public Object getChannelId() {
                return channelId;
            }

            public void setChannelId(Object channelId) {
                this.channelId = channelId;
            }

            public int getProduct() {
                return product;
            }

            public void setProduct(int product) {
                this.product = product;
            }

            public String getProductName() {
                return productName;
            }

            public void setProductName(String productName) {
                this.productName = productName;
            }

            public int getInsuranceType() {
                return insuranceType;
            }

            public void setInsuranceType(int insuranceType) {
                this.insuranceType = insuranceType;
            }

            public int getPurchaseChannel() {
                return purchaseChannel;
            }

            public void setPurchaseChannel(int purchaseChannel) {
                this.purchaseChannel = purchaseChannel;
            }

            public String getPurchaseChannelName() {
                return purchaseChannelName;
            }

            public void setPurchaseChannelName(String purchaseChannelName) {
                this.purchaseChannelName = purchaseChannelName;
            }

            public int getSumInsured() {
                return sumInsured;
            }

            public void setSumInsured(int sumInsured) {
                this.sumInsured = sumInsured;
            }

            public int getPaymentPeriod() {
                return paymentPeriod;
            }

            public void setPaymentPeriod(int paymentPeriod) {
                this.paymentPeriod = paymentPeriod;
            }

            public String getInsurancePeriod() {
                return insurancePeriod;
            }

            public void setInsurancePeriod(String insurancePeriod) {
                this.insurancePeriod = insurancePeriod;
            }

            public String getPolicyHolderMobile() {
                return policyHolderMobile;
            }

            public void setPolicyHolderMobile(String policyHolderMobile) {
                this.policyHolderMobile = policyHolderMobile;
            }

            public String getPolicyHolder() {
                return policyHolder;
            }

            public void setPolicyHolder(String policyHolder) {
                this.policyHolder = policyHolder;
            }

            public String getInsured() {
                return insured;
            }

            public void setInsured(String insured) {
                this.insured = insured;
            }

            public String getPaymentTime() {
                return paymentTime;
            }

            public void setPaymentTime(String paymentTime) {
                this.paymentTime = paymentTime;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public int getPremium() {
                return premium;
            }

            public void setPremium(int premium) {
                this.premium = premium;
            }

            public int getStandardPremium() {
                return standardPremium;
            }

            public void setStandardPremium(int standardPremium) {
                this.standardPremium = standardPremium;
            }

            public int getTotalPremium() {
                return totalPremium;
            }

            public void setTotalPremium(int totalPremium) {
                this.totalPremium = totalPremium;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
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

            public Object getUserId() {
                return userId;
            }

            public void setUserId(Object userId) {
                this.userId = userId;
            }

            public Object getRealName() {
                return realName;
            }

            public void setRealName(Object realName) {
                this.realName = realName;
            }

            public Object getNickName() {
                return nickName;
            }

            public void setNickName(Object nickName) {
                this.nickName = nickName;
            }

            public Object getMobile() {
                return mobile;
            }

            public void setMobile(Object mobile) {
                this.mobile = mobile;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public String getCreateByName() {
                return createByName;
            }

            public void setCreateByName(String createByName) {
                this.createByName = createByName;
            }

            public Object getUserInfo() {
                return userInfo;
            }

            public void setUserInfo(Object userInfo) {
                this.userInfo = userInfo;
            }

            public Object getEid() {
                return eid;
            }

            public void setEid(Object eid) {
                this.eid = eid;
            }

            public int getIsCalcommission() {
                return isCalcommission;
            }

            public void setIsCalcommission(int isCalcommission) {
                this.isCalcommission = isCalcommission;
            }

            public Object getChannelName_1() {
                return channelName_1;
            }

            public void setChannelName_1(Object channelName_1) {
                this.channelName_1 = channelName_1;
            }

            public Object getChannelId_1() {
                return channelId_1;
            }

            public void setChannelId_1(Object channelId_1) {
                this.channelId_1 = channelId_1;
            }

            public Object getChannelName_2() {
                return channelName_2;
            }

            public void setChannelName_2(Object channelName_2) {
                this.channelName_2 = channelName_2;
            }

            public Object getChannelId_2() {
                return channelId_2;
            }

            public void setChannelId_2(Object channelId_2) {
                this.channelId_2 = channelId_2;
            }
        }
    }
}
