package top.testops.my_api_test.dao.been;

import java.util.List;

/**
  * @ClassName PageUserInfo
  * @Description TODO
  * @author carson
  * @date 2020/3/13
**/
public class PageUserInfo {

    /**
     * code : 200
     * message : 操作成功
     * data : {"pageNum":1,"pageSize":10,"size":10,"startRow":1,"endRow":10,"total":333,"pages":34,"list":[{"id":345,"eid":"qggm","nickName":null,"mobile":null,"realName":"测试f","gender":0,"channel":3,"createBy":1,"createByName":"系统管理员","createTime":"2020-03-12 15:56:17","channelName_1":"FNS系统测试","channelId_1":20,"channelName_2":"FNS系统测试","channelId_2":3,"fromLandingPage":false},{"id":344,"eid":"jmb8","nickName":null,"mobile":null,"realName":"测试e","gender":0,"channel":3,"createBy":1,"createByName":"系统管理员","createTime":"2020-03-12 14:18:12","channelName_1":"FNS系统测试","channelId_1":20,"channelName_2":"FNS系统测试","channelId_2":3,"fromLandingPage":false},{"id":343,"eid":"jb62","nickName":null,"mobile":null,"realName":"测试d","gender":0,"channel":3,"createBy":1,"createByName":"系统管理员","createTime":"2020-03-12 12:16:32","channelName_1":"FNS系统测试","channelId_1":20,"channelName_2":"FNS系统测试","channelId_2":3,"fromLandingPage":false},{"id":342,"eid":"j656","nickName":null,"mobile":null,"realName":"测试c","gender":0,"channel":3,"createBy":1,"createByName":"系统管理员","createTime":"2020-03-11 11:02:01","channelName_1":"FNS系统测试","channelId_1":20,"channelName_2":"FNS系统测试","channelId_2":3,"fromLandingPage":false},{"id":341,"eid":"qzed","nickName":null,"mobile":"13160691007","realName":"LiangA","gender":0,"channel":98,"createBy":1,"createByName":"系统管理员","createTime":"2020-03-10 17:44:50","channelName_1":"自然流量","channelId_1":97,"channelName_2":"自然流量","channelId_2":98,"fromLandingPage":false},{"id":340,"eid":"qlbn","nickName":null,"mobile":"131606910081","realName":"梁","gender":0,"channel":4,"createBy":42,"createByName":"梁荣锋","createTime":"2020-03-10 17:33:02","channelName_1":"微信自然流量","channelId_1":21,"channelName_2":"微信自然流量","channelId_2":4,"fromLandingPage":false},{"id":339,"eid":"oe8n","nickName":null,"mobile":"2","realName":"家庭财务","gender":0,"channel":3,"createBy":1,"createByName":"系统管理员","createTime":"2020-03-10 15:46:41","channelName_1":"FNS系统测试","channelId_1":20,"channelName_2":"FNS系统测试","channelId_2":3,"fromLandingPage":false},{"id":338,"eid":"o9p2","nickName":null,"mobile":"13160691010","realName":"啊A","gender":1,"channel":98,"createBy":1,"createByName":"系统管理员","createTime":"2020-03-09 15:00:17","channelName_1":"自然流量","channelId_1":97,"channelName_2":"自然流量","channelId_2":98,"fromLandingPage":false},{"id":337,"eid":"q335","nickName":"金2","mobile":"13160691003","realName":"木","gender":1,"channel":5,"createBy":42,"createByName":"梁荣锋","createTime":"2020-03-09 14:58:49","channelName_1":"金金学社","channelId_1":22,"channelName_2":"金金学社","channelId_2":5,"fromLandingPage":false},{"id":336,"eid":"qd6y","nickName":"金","mobile":"13160691001","realName":"木","gender":1,"channel":16,"createBy":42,"createByName":"梁荣锋","createTime":"2020-03-09 14:57:39","channelName_1":"罗曼","channelId_1":33,"channelName_2":"罗曼","channelId_2":16,"fromLandingPage":false}],"prePage":0,"nextPage":2,"isFirstPage":true,"isLastPage":false,"hasPreviousPage":false,"hasNextPage":true,"navigatePages":8,"navigatepageNums":[1,2,3,4,5,6,7,8],"navigateFirstPage":1,"navigateLastPage":8,"firstPage":1,"lastPage":8}
     */

    private int code;
    private String message;
    private DataBean data;

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
         * total : 333
         * pages : 34
         * list : [{"id":345,"eid":"qggm","nickName":null,"mobile":null,"realName":"测试f","gender":0,"channel":3,"createBy":1,"createByName":"系统管理员","createTime":"2020-03-12 15:56:17","channelName_1":"FNS系统测试","channelId_1":20,"channelName_2":"FNS系统测试","channelId_2":3,"fromLandingPage":false},{"id":344,"eid":"jmb8","nickName":null,"mobile":null,"realName":"测试e","gender":0,"channel":3,"createBy":1,"createByName":"系统管理员","createTime":"2020-03-12 14:18:12","channelName_1":"FNS系统测试","channelId_1":20,"channelName_2":"FNS系统测试","channelId_2":3,"fromLandingPage":false},{"id":343,"eid":"jb62","nickName":null,"mobile":null,"realName":"测试d","gender":0,"channel":3,"createBy":1,"createByName":"系统管理员","createTime":"2020-03-12 12:16:32","channelName_1":"FNS系统测试","channelId_1":20,"channelName_2":"FNS系统测试","channelId_2":3,"fromLandingPage":false},{"id":342,"eid":"j656","nickName":null,"mobile":null,"realName":"测试c","gender":0,"channel":3,"createBy":1,"createByName":"系统管理员","createTime":"2020-03-11 11:02:01","channelName_1":"FNS系统测试","channelId_1":20,"channelName_2":"FNS系统测试","channelId_2":3,"fromLandingPage":false},{"id":341,"eid":"qzed","nickName":null,"mobile":"13160691007","realName":"LiangA","gender":0,"channel":98,"createBy":1,"createByName":"系统管理员","createTime":"2020-03-10 17:44:50","channelName_1":"自然流量","channelId_1":97,"channelName_2":"自然流量","channelId_2":98,"fromLandingPage":false},{"id":340,"eid":"qlbn","nickName":null,"mobile":"131606910081","realName":"梁","gender":0,"channel":4,"createBy":42,"createByName":"梁荣锋","createTime":"2020-03-10 17:33:02","channelName_1":"微信自然流量","channelId_1":21,"channelName_2":"微信自然流量","channelId_2":4,"fromLandingPage":false},{"id":339,"eid":"oe8n","nickName":null,"mobile":"2","realName":"家庭财务","gender":0,"channel":3,"createBy":1,"createByName":"系统管理员","createTime":"2020-03-10 15:46:41","channelName_1":"FNS系统测试","channelId_1":20,"channelName_2":"FNS系统测试","channelId_2":3,"fromLandingPage":false},{"id":338,"eid":"o9p2","nickName":null,"mobile":"13160691010","realName":"啊A","gender":1,"channel":98,"createBy":1,"createByName":"系统管理员","createTime":"2020-03-09 15:00:17","channelName_1":"自然流量","channelId_1":97,"channelName_2":"自然流量","channelId_2":98,"fromLandingPage":false},{"id":337,"eid":"q335","nickName":"金2","mobile":"13160691003","realName":"木","gender":1,"channel":5,"createBy":42,"createByName":"梁荣锋","createTime":"2020-03-09 14:58:49","channelName_1":"金金学社","channelId_1":22,"channelName_2":"金金学社","channelId_2":5,"fromLandingPage":false},{"id":336,"eid":"qd6y","nickName":"金","mobile":"13160691001","realName":"木","gender":1,"channel":16,"createBy":42,"createByName":"梁荣锋","createTime":"2020-03-09 14:57:39","channelName_1":"罗曼","channelId_1":33,"channelName_2":"罗曼","channelId_2":16,"fromLandingPage":false}]
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
             * id : 345
             * eid : qggm
             * nickName : null
             * mobile : null
             * realName : 测试f
             * gender : 0
             * channel : 3
             * createBy : 1
             * createByName : 系统管理员
             * createTime : 2020-03-12 15:56:17
             * channelName_1 : FNS系统测试
             * channelId_1 : 20
             * channelName_2 : FNS系统测试
             * channelId_2 : 3
             * fromLandingPage : false
             */

            private int id;
            private String eid;
            private Object nickName;
            private Object mobile;
            private String realName;
            private int gender;
            private int channel;
            private int createBy;
            private String createByName;
            private String createTime;
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

            public String getEid() {
                return eid;
            }

            public void setEid(String eid) {
                this.eid = eid;
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

            public String getRealName() {
                return realName;
            }

            public void setRealName(String realName) {
                this.realName = realName;
            }

            public int getGender() {
                return gender;
            }

            public void setGender(int gender) {
                this.gender = gender;
            }

            public int getChannel() {
                return channel;
            }

            public void setChannel(int channel) {
                this.channel = channel;
            }

            public int getCreateBy() {
                return createBy;
            }

            public void setCreateBy(int createBy) {
                this.createBy = createBy;
            }

            public String getCreateByName() {
                return createByName;
            }

            public void setCreateByName(String createByName) {
                this.createByName = createByName;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
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
