package top.testops.my_api_test.dao.been;

import java.util.List;

/**
  * @ClassName ListPageProductResponse
  * @Description TODO
  * @author carson
  * @date 2020/3/17
**/
public class ListPageProductResponse {

    /**
     * code : 200
     * message : 操作成功
     * data : {"pageNum":1,"pageSize":10,"size":10,"startRow":1,"endRow":10,"total":13,"pages":2,"list":[{"id":96,"name":"测试","shortName":"一个测试产品","insuranceType":1,"insuranceAgent":"平安","purchaseChannel":15,"state":1,"purchaseLink":"https://www.baidu.com/","slogan":null,"feature":"we","createTime":"2020-02-17 23:19:49","createBy":null,"updateTime":null,"updateBy":null,"isCalcommission":0},{"id":93,"name":"kof-oric","shortName":"kof","insuranceType":1,"insuranceAgent":"ghxzz","purchaseChannel":15,"state":1,"purchaseLink":null,"slogan":null,"feature":"1.\n2.\n3\n.","createTime":"2019-12-17 11:46:53","createBy":null,"updateTime":null,"updateBy":null,"isCalcommission":1},{"id":85,"name":"fdsafds","shortName":"fssaaxx","insuranceType":1,"insuranceAgent":"15465416","purchaseChannel":15,"state":1,"purchaseLink":"xxxxxxxxxxxxxx","slogan":"2123456","feature":"1.\n2.","createTime":"2019-12-16 15:55:38","createBy":null,"updateTime":null,"updateBy":null,"isCalcommission":0},{"id":84,"name":"sdfas","shortName":"dsfxx","insuranceType":1,"insuranceAgent":"1dsf","purchaseChannel":13,"state":1,"purchaseLink":null,"slogan":null,"feature":"1.\n2.\n3.","createTime":"2019-12-16 14:34:34","createBy":null,"updateTime":null,"updateBy":null,"isCalcommission":1},{"id":81,"name":"123452","shortName":"1231","insuranceType":1,"insuranceAgent":"34455563","purchaseChannel":12,"state":1,"purchaseLink":"http://www.qq.com","slogan":"","feature":"feafaefef45","createTime":"2019-12-16 14:30:47","createBy":null,"updateTime":null,"updateBy":null,"isCalcommission":1},{"id":73,"name":"阳光i保麦满分定期寿险","shortName":"阳光i保麦满分Pro","insuranceType":1,"insuranceAgent":"阳光保险","purchaseChannel":8,"state":1,"purchaseLink":"https://sky.baoinsurance.com/m/short/trial?wareId=20241&accountId=10000657526","slogan":null,"feature":"1、等待期：60天 ；\n2、身故保障 ：赔付100%保额；\n3、全残保障：赔付100%保额；\n4、被保人保费豁免（可选）：轻症/重疾后豁免后续保费。\n5、51岁前且剩余保障期大于5年，可在结婚/生子/贷款买房后，免健康告知增加保额,每次增加50%\n6、年金转换选择权、保障延长选择权","createTime":"2019-11-14 16:56:24","createBy":null,"updateTime":null,"updateBy":null,"isCalcommission":1},{"id":71,"name":"平安e生保plusx","shortName":"平安e生保plus2","insuranceType":1,"insuranceAgent":"中国平安","purchaseChannel":1,"state":1,"purchaseLink":"","slogan":null,"feature":"1.保障全面\n2.\n3.","createTime":"2019-10-27 17:03:19","createBy":null,"updateTime":null,"updateBy":null,"isCalcommission":1},{"id":55,"name":"大麦甜蜜家定期寿险 （30年）","shortName":"大麦甜蜜家（30年）","insuranceType":1,"insuranceAgent":"华贵人寿","purchaseChannel":1,"state":1,"purchaseLink":"https://cps.qixin18.com/wfz1046933/product/detail-103939-128316.html?from=spks","slogan":null,"feature":"1、等待期：90天 ；\n2、第一身故或身体全残保险金：赔付100%保额；\n3、第二身故或身体全残保险金：赔付100%保额；\n4、身故或身体全残特别保险金：赔付400%保额；\n5、身故或身体全残：豁免后续保费。","createTime":"2019-08-10 17:00:42","createBy":null,"updateTime":null,"updateBy":null,"isCalcommission":1},{"id":54,"name":"擎天柱3号定期寿险（优选版）","shortName":"擎天柱3号（优选版）","insuranceType":1,"insuranceAgent":"招商仁和","purchaseChannel":3,"state":1,"purchaseLink":"https:/www.baodan360.com/insurance/detail?id=137051&chn=cps_154016014&subagent=12891","slogan":null,"feature":"1、等待期：90天 ；\n2、身故保障 ：赔付100%保额；\n3、全残保障：赔付100%保额；\n4、被保人保费豁免（可选）：轻症/重疾后豁免后续保费。","createTime":"2019-08-10 16:59:25","createBy":null,"updateTime":null,"updateBy":null,"isCalcommission":1},{"id":53,"name":"擎天柱3号定期寿险（标准版）","shortName":"擎天柱3号（标准版）","insuranceType":1,"insuranceAgent":"招商仁和","purchaseChannel":3,"state":1,"purchaseLink":"https:/www.baodan360.com/insurance/detail?id=137051&chn=cps_154016014&subagent=12891","slogan":null,"feature":"1、等待期：90天 ；\n2、身故保障 ：赔付100%保额。\n3、全残保障：赔付100%保额。\n4、被保人保费豁免（可选）：轻症/重疾后豁免后续保费；","createTime":"2019-08-10 16:58:19","createBy":null,"updateTime":null,"updateBy":null,"isCalcommission":1}],"prePage":0,"nextPage":2,"isFirstPage":true,"isLastPage":false,"hasPreviousPage":false,"hasNextPage":true,"navigatePages":8,"navigatepageNums":[1,2],"navigateFirstPage":1,"navigateLastPage":2,"firstPage":1,"lastPage":2}
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
         * total : 13
         * pages : 2
         * list : [{"id":96,"name":"测试","shortName":"一个测试产品","insuranceType":1,"insuranceAgent":"平安","purchaseChannel":15,"state":1,"purchaseLink":"https://www.baidu.com/","slogan":null,"feature":"we","createTime":"2020-02-17 23:19:49","createBy":null,"updateTime":null,"updateBy":null,"isCalcommission":0},{"id":93,"name":"kof-oric","shortName":"kof","insuranceType":1,"insuranceAgent":"ghxzz","purchaseChannel":15,"state":1,"purchaseLink":null,"slogan":null,"feature":"1.\n2.\n3\n.","createTime":"2019-12-17 11:46:53","createBy":null,"updateTime":null,"updateBy":null,"isCalcommission":1},{"id":85,"name":"fdsafds","shortName":"fssaaxx","insuranceType":1,"insuranceAgent":"15465416","purchaseChannel":15,"state":1,"purchaseLink":"xxxxxxxxxxxxxx","slogan":"2123456","feature":"1.\n2.","createTime":"2019-12-16 15:55:38","createBy":null,"updateTime":null,"updateBy":null,"isCalcommission":0},{"id":84,"name":"sdfas","shortName":"dsfxx","insuranceType":1,"insuranceAgent":"1dsf","purchaseChannel":13,"state":1,"purchaseLink":null,"slogan":null,"feature":"1.\n2.\n3.","createTime":"2019-12-16 14:34:34","createBy":null,"updateTime":null,"updateBy":null,"isCalcommission":1},{"id":81,"name":"123452","shortName":"1231","insuranceType":1,"insuranceAgent":"34455563","purchaseChannel":12,"state":1,"purchaseLink":"http://www.qq.com","slogan":"","feature":"feafaefef45","createTime":"2019-12-16 14:30:47","createBy":null,"updateTime":null,"updateBy":null,"isCalcommission":1},{"id":73,"name":"阳光i保麦满分定期寿险","shortName":"阳光i保麦满分Pro","insuranceType":1,"insuranceAgent":"阳光保险","purchaseChannel":8,"state":1,"purchaseLink":"https://sky.baoinsurance.com/m/short/trial?wareId=20241&accountId=10000657526","slogan":null,"feature":"1、等待期：60天 ；\n2、身故保障 ：赔付100%保额；\n3、全残保障：赔付100%保额；\n4、被保人保费豁免（可选）：轻症/重疾后豁免后续保费。\n5、51岁前且剩余保障期大于5年，可在结婚/生子/贷款买房后，免健康告知增加保额,每次增加50%\n6、年金转换选择权、保障延长选择权","createTime":"2019-11-14 16:56:24","createBy":null,"updateTime":null,"updateBy":null,"isCalcommission":1},{"id":71,"name":"平安e生保plusx","shortName":"平安e生保plus2","insuranceType":1,"insuranceAgent":"中国平安","purchaseChannel":1,"state":1,"purchaseLink":"","slogan":null,"feature":"1.保障全面\n2.\n3.","createTime":"2019-10-27 17:03:19","createBy":null,"updateTime":null,"updateBy":null,"isCalcommission":1},{"id":55,"name":"大麦甜蜜家定期寿险 （30年）","shortName":"大麦甜蜜家（30年）","insuranceType":1,"insuranceAgent":"华贵人寿","purchaseChannel":1,"state":1,"purchaseLink":"https://cps.qixin18.com/wfz1046933/product/detail-103939-128316.html?from=spks","slogan":null,"feature":"1、等待期：90天 ；\n2、第一身故或身体全残保险金：赔付100%保额；\n3、第二身故或身体全残保险金：赔付100%保额；\n4、身故或身体全残特别保险金：赔付400%保额；\n5、身故或身体全残：豁免后续保费。","createTime":"2019-08-10 17:00:42","createBy":null,"updateTime":null,"updateBy":null,"isCalcommission":1},{"id":54,"name":"擎天柱3号定期寿险（优选版）","shortName":"擎天柱3号（优选版）","insuranceType":1,"insuranceAgent":"招商仁和","purchaseChannel":3,"state":1,"purchaseLink":"https:/www.baodan360.com/insurance/detail?id=137051&chn=cps_154016014&subagent=12891","slogan":null,"feature":"1、等待期：90天 ；\n2、身故保障 ：赔付100%保额；\n3、全残保障：赔付100%保额；\n4、被保人保费豁免（可选）：轻症/重疾后豁免后续保费。","createTime":"2019-08-10 16:59:25","createBy":null,"updateTime":null,"updateBy":null,"isCalcommission":1},{"id":53,"name":"擎天柱3号定期寿险（标准版）","shortName":"擎天柱3号（标准版）","insuranceType":1,"insuranceAgent":"招商仁和","purchaseChannel":3,"state":1,"purchaseLink":"https:/www.baodan360.com/insurance/detail?id=137051&chn=cps_154016014&subagent=12891","slogan":null,"feature":"1、等待期：90天 ；\n2、身故保障 ：赔付100%保额。\n3、全残保障：赔付100%保额。\n4、被保人保费豁免（可选）：轻症/重疾后豁免后续保费；","createTime":"2019-08-10 16:58:19","createBy":null,"updateTime":null,"updateBy":null,"isCalcommission":1}]
         * prePage : 0
         * nextPage : 2
         * isFirstPage : true
         * isLastPage : false
         * hasPreviousPage : false
         * hasNextPage : true
         * navigatePages : 8
         * navigatepageNums : [1,2]
         * navigateFirstPage : 1
         * navigateLastPage : 2
         * firstPage : 1
         * lastPage : 2
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
             * id : 96
             * name : 测试
             * shortName : 一个测试产品
             * insuranceType : 1
             * insuranceAgent : 平安
             * purchaseChannel : 15
             * state : 1
             * purchaseLink : https://www.baidu.com/
             * slogan : null
             * feature : we
             * createTime : 2020-02-17 23:19:49
             * createBy : null
             * updateTime : null
             * updateBy : null
             * isCalcommission : 0
             */

            private int id;
            private String name;
            private String shortName;
            private int insuranceType;
            private String insuranceAgent;
            private int purchaseChannel;
            private int state;
            private String purchaseLink;
            private Object slogan;
            private String feature;
            private String createTime;
            private Object createBy;
            private Object updateTime;
            private Object updateBy;
            private int isCalcommission;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getShortName() {
                return shortName;
            }

            public void setShortName(String shortName) {
                this.shortName = shortName;
            }

            public int getInsuranceType() {
                return insuranceType;
            }

            public void setInsuranceType(int insuranceType) {
                this.insuranceType = insuranceType;
            }

            public String getInsuranceAgent() {
                return insuranceAgent;
            }

            public void setInsuranceAgent(String insuranceAgent) {
                this.insuranceAgent = insuranceAgent;
            }

            public int getPurchaseChannel() {
                return purchaseChannel;
            }

            public void setPurchaseChannel(int purchaseChannel) {
                this.purchaseChannel = purchaseChannel;
            }

            public int getState() {
                return state;
            }

            public void setState(int state) {
                this.state = state;
            }

            public String getPurchaseLink() {
                return purchaseLink;
            }

            public void setPurchaseLink(String purchaseLink) {
                this.purchaseLink = purchaseLink;
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

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
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

            public Object getUpdateBy() {
                return updateBy;
            }

            public void setUpdateBy(Object updateBy) {
                this.updateBy = updateBy;
            }

            public int getIsCalcommission() {
                return isCalcommission;
            }

            public void setIsCalcommission(int isCalcommission) {
                this.isCalcommission = isCalcommission;
            }
        }
    }
}
