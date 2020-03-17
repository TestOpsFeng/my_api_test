package top.testops.my_api_test.dao.been;

import java.util.List;

/**
  * @ClassName PageAppointmentRecordResponse
  * @Description TODO
  * @author carson
  * @date 2020/3/16
**/
public class PageAppointmentRecordResponse {

    /**
     * code : 200
     * message : 操作成功
     * data : {"pageNum":1,"pageSize":10,"size":10,"startRow":1,"endRow":10,"total":136,"pages":14,"list":[{"id":325,"userId":348,"eid":"qamy","level":"X","realName":"脚本自动执行","nickName":"AutoTest","gender":1,"mobile":"13160691244","channel":4,"nextFollowUpTime":null,"followUpNumber":0,"plannerId":null,"planner":null,"state":1,"createBy":null,"updateTime":null,"validOrders":0,"allocationTime":null,"reason":null,"channelName":null,"remark":null,"fnaTime":null,"channelName_1":"微信自然流量","channelId_1":21,"channelName_2":"微信自然流量","channelId_2":4,"fromLandingPage":false},{"id":316,"userId":338,"eid":"o9p2","level":"X","realName":"啊A","nickName":null,"gender":1,"mobile":"13160691010","channel":98,"nextFollowUpTime":null,"followUpNumber":1,"plannerId":null,"planner":null,"state":1,"createBy":null,"updateTime":null,"validOrders":0,"allocationTime":null,"reason":null,"channelName":null,"remark":"测试","fnaTime":"2020-03-08 12:00:00","channelName_1":"自然流量","channelId_1":97,"channelName_2":"自然流量","channelId_2":98,"fromLandingPage":true},{"id":313,"userId":334,"eid":"qrl3","level":"X","realName":"木刃","nickName":null,"gender":1,"mobile":"13160691004","channel":98,"nextFollowUpTime":null,"followUpNumber":1,"plannerId":null,"planner":null,"state":1,"createBy":null,"updateTime":null,"validOrders":0,"allocationTime":null,"reason":null,"channelName":null,"remark":"测试","fnaTime":"2020-03-05 12:00:00","channelName_1":"自然流量","channelId_1":97,"channelName_2":"自然流量","channelId_2":98,"fromLandingPage":true},{"id":312,"userId":333,"eid":"qvad","level":"X","realName":"test12","nickName":null,"gender":1,"mobile":"18900001251","channel":98,"nextFollowUpTime":null,"followUpNumber":0,"plannerId":null,"planner":null,"state":1,"createBy":null,"updateTime":null,"validOrders":0,"allocationTime":null,"reason":null,"channelName":null,"remark":null,"fnaTime":null,"channelName_1":"自然流量","channelId_1":97,"channelName_2":"自然流量","channelId_2":98,"fromLandingPage":true},{"id":311,"userId":332,"eid":"qw4a","level":"X","realName":"沐刃","nickName":null,"gender":1,"mobile":"13160691002","channel":98,"nextFollowUpTime":null,"followUpNumber":1,"plannerId":null,"planner":null,"state":1,"createBy":null,"updateTime":null,"validOrders":0,"allocationTime":null,"reason":null,"channelName":null,"remark":"测试","fnaTime":"2020-03-05 12:00:00","channelName_1":"自然流量","channelId_1":97,"channelName_2":"自然流量","channelId_2":98,"fromLandingPage":true},{"id":306,"userId":321,"eid":"qgem","level":"X","realName":"王先生","nickName":null,"gender":1,"mobile":"18800000000","channel":94,"nextFollowUpTime":null,"followUpNumber":1,"plannerId":null,"planner":null,"state":1,"createBy":null,"updateTime":null,"validOrders":0,"allocationTime":null,"reason":null,"channelName":null,"remark":"是否第一次购买保险：否（线上购买）\n是否在线上/线下代理人了解过产品：是\n客户对保险很了解，之前有专门学习过保险知识，此次想要咨询百年康惠保重疾险，平安医疗险，好医保长期医疗，腾讯微保意外险等产品，部分已购买部分还在考虑，想听下老师的建议，客户咨询后续收费，已告知目前一个月内限时免费\n\n给妈妈已经买了康惠保，两千多保费交20年，保额30万，只有重疾\n自己要买5000以下的重疾险保到70岁，不带轻中症，疑问比较多思路清晰细心的一个小女生。","fnaTime":"2020-03-10 12:00:00","channelName_1":"三笛公众号（投放）","channelId_1":34,"channelName_2":"66","channelId_2":94,"fromLandingPage":true},{"id":302,"userId":322,"eid":"jn6e","level":"X","realName":"landing","nickName":null,"gender":1,"mobile":"18945670005","channel":98,"nextFollowUpTime":null,"followUpNumber":0,"plannerId":null,"planner":null,"state":1,"createBy":null,"updateTime":null,"validOrders":0,"allocationTime":null,"reason":null,"channelName":null,"remark":null,"fnaTime":"2020-03-25 13:00:00","channelName_1":"自然流量","channelId_1":97,"channelName_2":"自然流量","channelId_2":98,"fromLandingPage":true},{"id":299,"userId":318,"eid":"j646","level":"X","realName":"哈哈哈哈","nickName":null,"gender":2,"mobile":"18718574653","channel":98,"nextFollowUpTime":null,"followUpNumber":0,"plannerId":null,"planner":null,"state":1,"createBy":null,"updateTime":null,"validOrders":0,"allocationTime":null,"reason":null,"channelName":null,"remark":null,"fnaTime":"2020-02-29 12:00:00","channelName_1":"自然流量","channelId_1":97,"channelName_2":"自然流量","channelId_2":98,"fromLandingPage":true},{"id":298,"userId":280,"eid":"qw59","level":"X","realName":"发","nickName":"23","gender":2,"mobile":"18765412351","channel":3,"nextFollowUpTime":null,"followUpNumber":0,"plannerId":null,"planner":null,"state":1,"createBy":null,"updateTime":null,"validOrders":0,"allocationTime":null,"reason":null,"channelName":null,"remark":null,"fnaTime":null,"channelName_1":"FNS系统测试","channelId_1":20,"channelName_2":"FNS系统测试","channelId_2":3,"fromLandingPage":true},{"id":292,"userId":311,"eid":"q28w","level":"X","realName":"哈哈哈哈哈4","nickName":null,"gender":1,"mobile":"18718574589","channel":98,"nextFollowUpTime":null,"followUpNumber":1,"plannerId":null,"planner":null,"state":1,"createBy":null,"updateTime":null,"validOrders":0,"allocationTime":null,"reason":null,"channelName":null,"remark":"测试fna","fnaTime":"2020-02-21 12:00:00","channelName_1":"自然流量","channelId_1":97,"channelName_2":"自然流量","channelId_2":98,"fromLandingPage":true}],"prePage":0,"nextPage":2,"isFirstPage":true,"isLastPage":false,"hasPreviousPage":false,"hasNextPage":true,"navigatePages":8,"navigatepageNums":[1,2,3,4,5,6,7,8],"navigateFirstPage":1,"navigateLastPage":8,"firstPage":1,"lastPage":8}
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
         * size : 10
         * startRow : 1
         * endRow : 10
         * total : 136
         * pages : 14
         * list : [{"id":325,"userId":348,"eid":"qamy","level":"X","realName":"脚本自动执行","nickName":"AutoTest","gender":1,"mobile":"13160691244","channel":4,"nextFollowUpTime":null,"followUpNumber":0,"plannerId":null,"planner":null,"state":1,"createBy":null,"updateTime":null,"validOrders":0,"allocationTime":null,"reason":null,"channelName":null,"remark":null,"fnaTime":null,"channelName_1":"微信自然流量","channelId_1":21,"channelName_2":"微信自然流量","channelId_2":4,"fromLandingPage":false},{"id":316,"userId":338,"eid":"o9p2","level":"X","realName":"啊A","nickName":null,"gender":1,"mobile":"13160691010","channel":98,"nextFollowUpTime":null,"followUpNumber":1,"plannerId":null,"planner":null,"state":1,"createBy":null,"updateTime":null,"validOrders":0,"allocationTime":null,"reason":null,"channelName":null,"remark":"测试","fnaTime":"2020-03-08 12:00:00","channelName_1":"自然流量","channelId_1":97,"channelName_2":"自然流量","channelId_2":98,"fromLandingPage":true},{"id":313,"userId":334,"eid":"qrl3","level":"X","realName":"木刃","nickName":null,"gender":1,"mobile":"13160691004","channel":98,"nextFollowUpTime":null,"followUpNumber":1,"plannerId":null,"planner":null,"state":1,"createBy":null,"updateTime":null,"validOrders":0,"allocationTime":null,"reason":null,"channelName":null,"remark":"测试","fnaTime":"2020-03-05 12:00:00","channelName_1":"自然流量","channelId_1":97,"channelName_2":"自然流量","channelId_2":98,"fromLandingPage":true},{"id":312,"userId":333,"eid":"qvad","level":"X","realName":"test12","nickName":null,"gender":1,"mobile":"18900001251","channel":98,"nextFollowUpTime":null,"followUpNumber":0,"plannerId":null,"planner":null,"state":1,"createBy":null,"updateTime":null,"validOrders":0,"allocationTime":null,"reason":null,"channelName":null,"remark":null,"fnaTime":null,"channelName_1":"自然流量","channelId_1":97,"channelName_2":"自然流量","channelId_2":98,"fromLandingPage":true},{"id":311,"userId":332,"eid":"qw4a","level":"X","realName":"沐刃","nickName":null,"gender":1,"mobile":"13160691002","channel":98,"nextFollowUpTime":null,"followUpNumber":1,"plannerId":null,"planner":null,"state":1,"createBy":null,"updateTime":null,"validOrders":0,"allocationTime":null,"reason":null,"channelName":null,"remark":"测试","fnaTime":"2020-03-05 12:00:00","channelName_1":"自然流量","channelId_1":97,"channelName_2":"自然流量","channelId_2":98,"fromLandingPage":true},{"id":306,"userId":321,"eid":"qgem","level":"X","realName":"王先生","nickName":null,"gender":1,"mobile":"18800000000","channel":94,"nextFollowUpTime":null,"followUpNumber":1,"plannerId":null,"planner":null,"state":1,"createBy":null,"updateTime":null,"validOrders":0,"allocationTime":null,"reason":null,"channelName":null,"remark":"是否第一次购买保险：否（线上购买）\n是否在线上/线下代理人了解过产品：是\n客户对保险很了解，之前有专门学习过保险知识，此次想要咨询百年康惠保重疾险，平安医疗险，好医保长期医疗，腾讯微保意外险等产品，部分已购买部分还在考虑，想听下老师的建议，客户咨询后续收费，已告知目前一个月内限时免费\n\n给妈妈已经买了康惠保，两千多保费交20年，保额30万，只有重疾\n自己要买5000以下的重疾险保到70岁，不带轻中症，疑问比较多思路清晰细心的一个小女生。","fnaTime":"2020-03-10 12:00:00","channelName_1":"三笛公众号（投放）","channelId_1":34,"channelName_2":"66","channelId_2":94,"fromLandingPage":true},{"id":302,"userId":322,"eid":"jn6e","level":"X","realName":"landing","nickName":null,"gender":1,"mobile":"18945670005","channel":98,"nextFollowUpTime":null,"followUpNumber":0,"plannerId":null,"planner":null,"state":1,"createBy":null,"updateTime":null,"validOrders":0,"allocationTime":null,"reason":null,"channelName":null,"remark":null,"fnaTime":"2020-03-25 13:00:00","channelName_1":"自然流量","channelId_1":97,"channelName_2":"自然流量","channelId_2":98,"fromLandingPage":true},{"id":299,"userId":318,"eid":"j646","level":"X","realName":"哈哈哈哈","nickName":null,"gender":2,"mobile":"18718574653","channel":98,"nextFollowUpTime":null,"followUpNumber":0,"plannerId":null,"planner":null,"state":1,"createBy":null,"updateTime":null,"validOrders":0,"allocationTime":null,"reason":null,"channelName":null,"remark":null,"fnaTime":"2020-02-29 12:00:00","channelName_1":"自然流量","channelId_1":97,"channelName_2":"自然流量","channelId_2":98,"fromLandingPage":true},{"id":298,"userId":280,"eid":"qw59","level":"X","realName":"发","nickName":"23","gender":2,"mobile":"18765412351","channel":3,"nextFollowUpTime":null,"followUpNumber":0,"plannerId":null,"planner":null,"state":1,"createBy":null,"updateTime":null,"validOrders":0,"allocationTime":null,"reason":null,"channelName":null,"remark":null,"fnaTime":null,"channelName_1":"FNS系统测试","channelId_1":20,"channelName_2":"FNS系统测试","channelId_2":3,"fromLandingPage":true},{"id":292,"userId":311,"eid":"q28w","level":"X","realName":"哈哈哈哈哈4","nickName":null,"gender":1,"mobile":"18718574589","channel":98,"nextFollowUpTime":null,"followUpNumber":1,"plannerId":null,"planner":null,"state":1,"createBy":null,"updateTime":null,"validOrders":0,"allocationTime":null,"reason":null,"channelName":null,"remark":"测试fna","fnaTime":"2020-02-21 12:00:00","channelName_1":"自然流量","channelId_1":97,"channelName_2":"自然流量","channelId_2":98,"fromLandingPage":true}]
         * prePage : 0
         * nextPage : 2
         * isFirstPage : true
         * isLastPage : false
         * hasPreviousPage : false
         * hasNextPage : true
         * navigatePages : 8
         * navigatepageNums : [1,2,3,4,5,6,7,8]
         * navigateFirstPage : 1
         * navigateLastPage : 8
         * firstPage : 1
         * lastPage : 8
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
             * id : 325
             * userId : 348
             * eid : qamy
             * level : X
             * realName : 脚本自动执行
             * nickName : AutoTest
             * gender : 1
             * mobile : 13160691244
             * channel : 4
             * nextFollowUpTime : null
             * followUpNumber : 0
             * plannerId : null
             * planner : null
             * state : 1
             * createBy : null
             * updateTime : null
             * validOrders : 0
             * allocationTime : null
             * reason : null
             * channelName : null
             * remark : null
             * fnaTime : null
             * channelName_1 : 微信自然流量
             * channelId_1 : 21
             * channelName_2 : 微信自然流量
             * channelId_2 : 4
             * fromLandingPage : false
             */

            private int id;
            private int userId;
            private String eid;
            private String level;
            private String realName;
            private String nickName;
            private int gender;
            private String mobile;
            private int channel;
            private Object nextFollowUpTime;
            private int followUpNumber;
            private Object plannerId;
            private Object planner;
            private int state;
            private Object createBy;
            private Object updateTime;
            private int validOrders;
            private Object allocationTime;
            private Object reason;
            private Object channelName;
            private Object remark;
            private Object fnaTime;
            private String channelName_1;
            private int channelId_1;
            private String channelName_2;
            private int channelId_2;
            private boolean fromLandingPage;

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

            public String getEid() {
                return eid;
            }

            public void setEid(String eid) {
                this.eid = eid;
            }

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getRealName() {
                return realName;
            }

            public void setRealName(String realName) {
                this.realName = realName;
            }

            public String getNickName() {
                return nickName;
            }

            public void setNickName(String nickName) {
                this.nickName = nickName;
            }

            public int getGender() {
                return gender;
            }

            public void setGender(int gender) {
                this.gender = gender;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public int getChannel() {
                return channel;
            }

            public void setChannel(int channel) {
                this.channel = channel;
            }

            public Object getNextFollowUpTime() {
                return nextFollowUpTime;
            }

            public void setNextFollowUpTime(Object nextFollowUpTime) {
                this.nextFollowUpTime = nextFollowUpTime;
            }

            public int getFollowUpNumber() {
                return followUpNumber;
            }

            public void setFollowUpNumber(int followUpNumber) {
                this.followUpNumber = followUpNumber;
            }

            public Object getPlannerId() {
                return plannerId;
            }

            public void setPlannerId(Object plannerId) {
                this.plannerId = plannerId;
            }

            public Object getPlanner() {
                return planner;
            }

            public void setPlanner(Object planner) {
                this.planner = planner;
            }

            public int getState() {
                return state;
            }

            public void setState(int state) {
                this.state = state;
            }

            public Object getCreateBy() {
                return createBy;
            }

            public void setCreateBy(Object createBy) {
                this.createBy = createBy;
            }

            public Object getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(Object updateTime) {
                this.updateTime = updateTime;
            }

            public int getValidOrders() {
                return validOrders;
            }

            public void setValidOrders(int validOrders) {
                this.validOrders = validOrders;
            }

            public Object getAllocationTime() {
                return allocationTime;
            }

            public void setAllocationTime(Object allocationTime) {
                this.allocationTime = allocationTime;
            }

            public Object getReason() {
                return reason;
            }

            public void setReason(Object reason) {
                this.reason = reason;
            }

            public Object getChannelName() {
                return channelName;
            }

            public void setChannelName(Object channelName) {
                this.channelName = channelName;
            }

            public Object getRemark() {
                return remark;
            }

            public void setRemark(Object remark) {
                this.remark = remark;
            }

            public Object getFnaTime() {
                return fnaTime;
            }

            public void setFnaTime(Object fnaTime) {
                this.fnaTime = fnaTime;
            }

            public String getChannelName_1() {
                return channelName_1;
            }

            public void setChannelName_1(String channelName_1) {
                this.channelName_1 = channelName_1;
            }

            public int getChannelId_1() {
                return channelId_1;
            }

            public void setChannelId_1(int channelId_1) {
                this.channelId_1 = channelId_1;
            }

            public String getChannelName_2() {
                return channelName_2;
            }

            public void setChannelName_2(String channelName_2) {
                this.channelName_2 = channelName_2;
            }

            public int getChannelId_2() {
                return channelId_2;
            }

            public void setChannelId_2(int channelId_2) {
                this.channelId_2 = channelId_2;
            }

            public boolean isFromLandingPage() {
                return fromLandingPage;
            }

            public void setFromLandingPage(boolean fromLandingPage) {
                this.fromLandingPage = fromLandingPage;
            }
        }
    }
}
