package top.testops.my_api_test.dao.been;

import java.util.List;

/**
  * @ClassName PageEmployeesBeen
  * @Description TODO
  * @author carson
  * @date 2020/3/13
**/
public class PageEmployeesBeen {

    /**
     * code : 200
     * message : 操作成功
     * data : {"pageNum":1,"pageSize":999,"size":52,"startRow":1,"endRow":52,"total":52,"pages":1,"list":[{"id":1,"name":"admin","realName":"系统管理员","password":null,"gender":2,"mobile":"18888888888","email":"lizejin@7tao.net","joinTime":"2019-08-06","openId":null,"visible":true,"createTime":"2019-08-06 00:08:04","updateTime":"2020-01-06 08:07:29","roleName":"系统管理员"},{"id":2,"name":"haiyun","realName":"test","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:31:19","updateTime":"2020-03-03 14:50:36","roleName":"测试工程师"},{"id":3,"name":"luohaiyun","realName":"骆海韵","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:36:15","updateTime":"2019-10-12 15:27:16","roleName":"销售"},{"id":4,"name":"zhangmeiqi","realName":"张美琪","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:36:48","updateTime":"2019-08-25 17:52:42","roleName":"二阶学员"},{"id":5,"name":"liweixian","realName":"李伟贤","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:37:23","updateTime":"2019-08-25 17:52:46","roleName":"二阶学员"},{"id":6,"name":"liudan","realName":"刘丹","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:37:59","updateTime":"2019-08-25 17:52:50","roleName":"二阶学员"},{"id":7,"name":"lizejin","realName":"李泽津","password":null,"gender":2,"mobile":"13000000000","email":"lizejin@7tao.net","joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:38:30","updateTime":"2019-08-25 17:52:55","roleName":"二阶学员"},{"id":8,"name":"guotianliang","realName":"郭天亮","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:38:52","updateTime":"2019-08-25 17:53:00","roleName":"二阶学员"},{"id":9,"name":"zhangxinling","realName":"张昕玲","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:39:17","updateTime":"2019-08-25 17:53:05","roleName":"二阶学员"},{"id":10,"name":"zhaohaoyu","realName":"赵浩宇","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:39:49","updateTime":"2019-10-31 16:23:22","roleName":"二阶学员"},{"id":11,"name":"xiaxiaoyu","realName":"夏啸宇","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:40:20","updateTime":"2019-08-25 17:53:23","roleName":"二阶学员"},{"id":12,"name":"wangchen","realName":"王琛","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:41:02","updateTime":"2019-08-25 17:53:27","roleName":"二阶学员"},{"id":13,"name":"luoyan","realName":"罗妍","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:41:28","updateTime":"2019-08-25 17:53:32","roleName":"二阶学员"},{"id":14,"name":"wuxinxin","realName":"吴鑫鑫","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:42:10","updateTime":"2019-08-25 17:53:35","roleName":"二阶学员"},{"id":15,"name":"duyi","realName":"杜伊","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:42:46","updateTime":"2019-08-25 17:53:39","roleName":"二阶学员"},{"id":16,"name":"chenguo","realName":"陈果","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 20:48:28","updateTime":"2019-08-25 20:48:33","roleName":"二阶学员"},{"id":17,"name":"yangguojiang","realName":"杨国江","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2019-08-26","openId":null,"visible":true,"createTime":"2019-08-26 17:35:21","updateTime":"2019-08-26 17:35:28","roleName":"系统管理员"},{"id":18,"name":"xumengli","realName":"徐梦力","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-08-26","openId":null,"visible":true,"createTime":"2019-08-26 18:01:53","updateTime":"2019-08-26 18:01:59","roleName":"二阶学员"},{"id":19,"name":"pifengyi","realName":"皮凤仪","password":null,"gender":2,"mobile":"13000000000","email":"xx@xx.com","joinTime":"2019-09-23","openId":null,"visible":true,"createTime":"2019-09-23 14:25:58","updateTime":"2019-09-23 14:27:05","roleName":"实习生"},{"id":20,"name":"wangfangzhi","realName":"王方誌","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2019-09-25","openId":null,"visible":true,"createTime":"2019-09-25 10:27:53","updateTime":"2019-09-25 10:28:05","roleName":"合伙人"},{"id":21,"name":"gaoyun","realName":"高云","password":null,"gender":2,"mobile":"15914261436","email":null,"joinTime":"2019-10-13","openId":null,"visible":true,"createTime":"2019-10-13 21:49:54","updateTime":"2019-10-13 21:53:39","roleName":"试用期销售"},{"id":22,"name":"xufeng","realName":"许凤","password":null,"gender":2,"mobile":"15310095434","email":null,"joinTime":"2019-10-13","openId":null,"visible":true,"createTime":"2019-10-13 21:50:55","updateTime":"2019-10-14 10:36:28","roleName":"试用期销售"},{"id":23,"name":"ezongju","realName":"鄂宗菊","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-10-31","openId":null,"visible":true,"createTime":"2019-10-13 21:51:39","updateTime":"2020-03-10 12:31:26","roleName":"产品专员"},{"id":24,"name":"huxiangyu","realName":"胡翔宇","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-10-31","openId":null,"visible":true,"createTime":"2019-10-13 21:52:03","updateTime":"2019-10-13 21:53:50","roleName":"试用期销售"},{"id":25,"name":"lihaicheng","realName":"李海城","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2019-10-31","openId":null,"visible":true,"createTime":"2019-10-13 21:52:24","updateTime":"2019-10-13 21:53:54","roleName":"试用期销售"},{"id":26,"name":"zhujiashu","realName":"朱家树","password":null,"gender":1,"mobile":"13000000000","email":"506715722@qq.com","joinTime":"2019-10-25","openId":null,"visible":true,"createTime":"2019-10-25 10:17:32","updateTime":"2019-11-09 15:16:08","roleName":"系统管理员"},{"id":27,"name":"ceshi","realName":"测试删除","password":null,"gender":1,"mobile":"18666666666","email":null,"joinTime":"2019-10-31","openId":null,"visible":false,"createTime":"2019-10-31 16:01:14","updateTime":"2019-10-31 16:30:22","roleName":null},{"id":28,"name":"aaaaa","realName":"aaaaa","password":null,"gender":1,"mobile":"12344566775","email":null,"joinTime":"2019-10-31","openId":null,"visible":false,"createTime":"2019-10-31 16:30:57","updateTime":"2019-10-31 16:31:20","roleName":null},{"id":29,"name":"chenjinling","realName":"陈进玲","password":null,"gender":2,"mobile":"13927357923","email":null,"joinTime":"2019-11-07","openId":null,"visible":true,"createTime":"2019-11-07 15:33:01","updateTime":"2019-11-27 14:41:43","roleName":"销售"},{"id":30,"name":"heyini","realName":"何旖旎","password":null,"gender":2,"mobile":"18565667852","email":null,"joinTime":"2019-11-07","openId":null,"visible":true,"createTime":"2019-11-07 15:34:06","updateTime":"2019-11-07 15:35:43","roleName":"试用期销售"},{"id":31,"name":"wuwenfen","realName":"吴雯芬","password":null,"gender":2,"mobile":"17805803143","email":null,"joinTime":"2019-11-07","openId":null,"visible":true,"createTime":"2019-11-07 15:34:41","updateTime":"2019-11-07 15:35:47","roleName":"试用期销售"},{"id":32,"name":"zhengjinlian","realName":"郑锦链","password":null,"gender":2,"mobile":"17665310554","email":null,"joinTime":"2019-11-07","openId":null,"visible":true,"createTime":"2019-11-07 15:35:30","updateTime":"2019-11-07 15:35:51","roleName":"试用期销售"},{"id":33,"name":"chenlisheng","realName":"陈立生","password":null,"gender":1,"mobile":"13066990542","email":"lizejin@7tao.net","joinTime":"2019-11-09","openId":null,"visible":true,"createTime":"2019-11-09 14:24:34","updateTime":"2020-01-06 08:07:38","roleName":"系统管理员"},{"id":34,"name":"test2","realName":"test2","password":null,"gender":1,"mobile":"13714110178","email":"506715722@qq.com","joinTime":"2019-11-10","openId":null,"visible":true,"createTime":"2019-11-09 16:20:02","updateTime":"2019-11-09 16:28:37","roleName":"test2"},{"id":35,"name":"test1","realName":"体验用户1","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2019-11-18","openId":null,"visible":true,"createTime":"2019-11-18 10:26:33","updateTime":"2019-11-18 10:27:36","roleName":"体验用户"},{"id":36,"name":"sunqihong","realName":"孙绮虹","password":null,"gender":1,"mobile":"13066990000","email":null,"joinTime":"2019-11-25","openId":null,"visible":true,"createTime":"2019-11-25 16:51:54","updateTime":"2019-12-11 14:34:47","roleName":"系统管理员"},{"id":37,"name":"lvao","realName":"吕傲","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2019-11-27","openId":null,"visible":true,"createTime":"2019-11-27 10:51:02","updateTime":"2019-12-11 18:37:03","roleName":"系统管理员"},{"id":38,"name":"minfengfeng","realName":"闵丰丰","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2020-02-27","openId":null,"visible":true,"createTime":"2020-02-27 23:52:33","updateTime":"2020-02-27 23:53:01","roleName":"试用期销售"},{"id":39,"name":"qiaofu","realName":"谯福","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2020-02-27","openId":null,"visible":true,"createTime":"2020-02-27 23:53:39","updateTime":"2020-02-27 23:54:53","roleName":"试用期销售"},{"id":40,"name":"shijing","realName":"石晶","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2020-02-27","openId":null,"visible":true,"createTime":"2020-02-27 23:54:18","updateTime":"2020-02-27 23:54:58","roleName":"试用期销售"},{"id":41,"name":"ronggengneng","realName":"荣庚能","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2020-02-27","openId":null,"visible":true,"createTime":"2020-02-27 23:54:43","updateTime":"2020-02-27 23:55:07","roleName":"试用期销售"},{"id":42,"name":"liangrongfeng","realName":"梁荣锋","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2020-03-03","openId":null,"visible":true,"createTime":"2020-03-03 13:54:52","updateTime":"2020-03-03 14:47:16","roleName":"测试工程师"},{"id":43,"name":"carson","realName":"carson","password":null,"gender":1,"mobile":"13160690000","email":null,"joinTime":"2020-03-04","openId":null,"visible":true,"createTime":"2020-03-04 16:47:22","updateTime":"2020-03-04 16:48:47","roleName":"客户关系ALL"},{"id":44,"name":"Test01","realName":"Test01","password":null,"gender":1,"mobile":"13160691001","email":null,"joinTime":"2020-03-03","openId":null,"visible":true,"createTime":"2020-03-10 16:22:43","updateTime":null,"roleName":null},{"id":45,"name":"Test02","realName":"Test02","password":null,"gender":1,"mobile":"13160691002","email":null,"joinTime":"2020-03-03","openId":null,"visible":true,"createTime":"2020-03-10 16:27:06","updateTime":null,"roleName":null},{"id":46,"name":"Test03","realName":"Test03","password":null,"gender":1,"mobile":"13160691003","email":null,"joinTime":"2020-03-03","openId":null,"visible":true,"createTime":"2020-03-10 16:27:06","updateTime":null,"roleName":null},{"id":47,"name":"Test04","realName":"Test04","password":null,"gender":1,"mobile":"13160691004","email":null,"joinTime":"2020-03-03","openId":null,"visible":true,"createTime":"2020-03-10 16:27:06","updateTime":null,"roleName":null},{"id":48,"name":"Test05","realName":"Test05","password":null,"gender":1,"mobile":"13160691005","email":null,"joinTime":"2020-03-03","openId":null,"visible":true,"createTime":"2020-03-10 16:27:06","updateTime":null,"roleName":null},{"id":49,"name":"Test06","realName":"Test06","password":null,"gender":1,"mobile":"13160691006","email":null,"joinTime":"2020-03-03","openId":null,"visible":true,"createTime":"2020-03-10 16:27:06","updateTime":null,"roleName":null},{"id":50,"name":"Test07","realName":"Test07","password":null,"gender":1,"mobile":"13160691007","email":null,"joinTime":"2020-03-03","openId":null,"visible":true,"createTime":"2020-03-10 16:27:06","updateTime":null,"roleName":null},{"id":51,"name":"Test08","realName":"Test08","password":null,"gender":1,"mobile":"13160691008","email":null,"joinTime":"2020-03-03","openId":null,"visible":true,"createTime":"2020-03-10 16:27:06","updateTime":null,"roleName":null},{"id":52,"name":"Test09","realName":"Test09","password":null,"gender":1,"mobile":"13160691009","email":null,"joinTime":"2020-03-03","openId":null,"visible":false,"createTime":"2020-03-10 16:27:06","updateTime":"2020-03-10 18:12:25","roleName":"测试工程师"}],"prePage":0,"nextPage":0,"isFirstPage":true,"isLastPage":true,"hasPreviousPage":false,"hasNextPage":false,"navigatePages":8,"navigatepageNums":[1],"navigateFirstPage":1,"navigateLastPage":1,"firstPage":1,"lastPage":1}
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
         * pageSize : 999
         * size : 52
         * startRow : 1
         * endRow : 52
         * total : 52
         * pages : 1
         * list : [{"id":1,"name":"admin","realName":"系统管理员","password":null,"gender":2,"mobile":"18888888888","email":"lizejin@7tao.net","joinTime":"2019-08-06","openId":null,"visible":true,"createTime":"2019-08-06 00:08:04","updateTime":"2020-01-06 08:07:29","roleName":"系统管理员"},{"id":2,"name":"haiyun","realName":"test","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:31:19","updateTime":"2020-03-03 14:50:36","roleName":"测试工程师"},{"id":3,"name":"luohaiyun","realName":"骆海韵","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:36:15","updateTime":"2019-10-12 15:27:16","roleName":"销售"},{"id":4,"name":"zhangmeiqi","realName":"张美琪","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:36:48","updateTime":"2019-08-25 17:52:42","roleName":"二阶学员"},{"id":5,"name":"liweixian","realName":"李伟贤","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:37:23","updateTime":"2019-08-25 17:52:46","roleName":"二阶学员"},{"id":6,"name":"liudan","realName":"刘丹","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:37:59","updateTime":"2019-08-25 17:52:50","roleName":"二阶学员"},{"id":7,"name":"lizejin","realName":"李泽津","password":null,"gender":2,"mobile":"13000000000","email":"lizejin@7tao.net","joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:38:30","updateTime":"2019-08-25 17:52:55","roleName":"二阶学员"},{"id":8,"name":"guotianliang","realName":"郭天亮","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:38:52","updateTime":"2019-08-25 17:53:00","roleName":"二阶学员"},{"id":9,"name":"zhangxinling","realName":"张昕玲","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:39:17","updateTime":"2019-08-25 17:53:05","roleName":"二阶学员"},{"id":10,"name":"zhaohaoyu","realName":"赵浩宇","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:39:49","updateTime":"2019-10-31 16:23:22","roleName":"二阶学员"},{"id":11,"name":"xiaxiaoyu","realName":"夏啸宇","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:40:20","updateTime":"2019-08-25 17:53:23","roleName":"二阶学员"},{"id":12,"name":"wangchen","realName":"王琛","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:41:02","updateTime":"2019-08-25 17:53:27","roleName":"二阶学员"},{"id":13,"name":"luoyan","realName":"罗妍","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:41:28","updateTime":"2019-08-25 17:53:32","roleName":"二阶学员"},{"id":14,"name":"wuxinxin","realName":"吴鑫鑫","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:42:10","updateTime":"2019-08-25 17:53:35","roleName":"二阶学员"},{"id":15,"name":"duyi","realName":"杜伊","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 17:42:46","updateTime":"2019-08-25 17:53:39","roleName":"二阶学员"},{"id":16,"name":"chenguo","realName":"陈果","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-08-25","openId":null,"visible":true,"createTime":"2019-08-25 20:48:28","updateTime":"2019-08-25 20:48:33","roleName":"二阶学员"},{"id":17,"name":"yangguojiang","realName":"杨国江","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2019-08-26","openId":null,"visible":true,"createTime":"2019-08-26 17:35:21","updateTime":"2019-08-26 17:35:28","roleName":"系统管理员"},{"id":18,"name":"xumengli","realName":"徐梦力","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-08-26","openId":null,"visible":true,"createTime":"2019-08-26 18:01:53","updateTime":"2019-08-26 18:01:59","roleName":"二阶学员"},{"id":19,"name":"pifengyi","realName":"皮凤仪","password":null,"gender":2,"mobile":"13000000000","email":"xx@xx.com","joinTime":"2019-09-23","openId":null,"visible":true,"createTime":"2019-09-23 14:25:58","updateTime":"2019-09-23 14:27:05","roleName":"实习生"},{"id":20,"name":"wangfangzhi","realName":"王方誌","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2019-09-25","openId":null,"visible":true,"createTime":"2019-09-25 10:27:53","updateTime":"2019-09-25 10:28:05","roleName":"合伙人"},{"id":21,"name":"gaoyun","realName":"高云","password":null,"gender":2,"mobile":"15914261436","email":null,"joinTime":"2019-10-13","openId":null,"visible":true,"createTime":"2019-10-13 21:49:54","updateTime":"2019-10-13 21:53:39","roleName":"试用期销售"},{"id":22,"name":"xufeng","realName":"许凤","password":null,"gender":2,"mobile":"15310095434","email":null,"joinTime":"2019-10-13","openId":null,"visible":true,"createTime":"2019-10-13 21:50:55","updateTime":"2019-10-14 10:36:28","roleName":"试用期销售"},{"id":23,"name":"ezongju","realName":"鄂宗菊","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-10-31","openId":null,"visible":true,"createTime":"2019-10-13 21:51:39","updateTime":"2020-03-10 12:31:26","roleName":"产品专员"},{"id":24,"name":"huxiangyu","realName":"胡翔宇","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2019-10-31","openId":null,"visible":true,"createTime":"2019-10-13 21:52:03","updateTime":"2019-10-13 21:53:50","roleName":"试用期销售"},{"id":25,"name":"lihaicheng","realName":"李海城","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2019-10-31","openId":null,"visible":true,"createTime":"2019-10-13 21:52:24","updateTime":"2019-10-13 21:53:54","roleName":"试用期销售"},{"id":26,"name":"zhujiashu","realName":"朱家树","password":null,"gender":1,"mobile":"13000000000","email":"506715722@qq.com","joinTime":"2019-10-25","openId":null,"visible":true,"createTime":"2019-10-25 10:17:32","updateTime":"2019-11-09 15:16:08","roleName":"系统管理员"},{"id":27,"name":"ceshi","realName":"测试删除","password":null,"gender":1,"mobile":"18666666666","email":null,"joinTime":"2019-10-31","openId":null,"visible":false,"createTime":"2019-10-31 16:01:14","updateTime":"2019-10-31 16:30:22","roleName":null},{"id":28,"name":"aaaaa","realName":"aaaaa","password":null,"gender":1,"mobile":"12344566775","email":null,"joinTime":"2019-10-31","openId":null,"visible":false,"createTime":"2019-10-31 16:30:57","updateTime":"2019-10-31 16:31:20","roleName":null},{"id":29,"name":"chenjinling","realName":"陈进玲","password":null,"gender":2,"mobile":"13927357923","email":null,"joinTime":"2019-11-07","openId":null,"visible":true,"createTime":"2019-11-07 15:33:01","updateTime":"2019-11-27 14:41:43","roleName":"销售"},{"id":30,"name":"heyini","realName":"何旖旎","password":null,"gender":2,"mobile":"18565667852","email":null,"joinTime":"2019-11-07","openId":null,"visible":true,"createTime":"2019-11-07 15:34:06","updateTime":"2019-11-07 15:35:43","roleName":"试用期销售"},{"id":31,"name":"wuwenfen","realName":"吴雯芬","password":null,"gender":2,"mobile":"17805803143","email":null,"joinTime":"2019-11-07","openId":null,"visible":true,"createTime":"2019-11-07 15:34:41","updateTime":"2019-11-07 15:35:47","roleName":"试用期销售"},{"id":32,"name":"zhengjinlian","realName":"郑锦链","password":null,"gender":2,"mobile":"17665310554","email":null,"joinTime":"2019-11-07","openId":null,"visible":true,"createTime":"2019-11-07 15:35:30","updateTime":"2019-11-07 15:35:51","roleName":"试用期销售"},{"id":33,"name":"chenlisheng","realName":"陈立生","password":null,"gender":1,"mobile":"13066990542","email":"lizejin@7tao.net","joinTime":"2019-11-09","openId":null,"visible":true,"createTime":"2019-11-09 14:24:34","updateTime":"2020-01-06 08:07:38","roleName":"系统管理员"},{"id":34,"name":"test2","realName":"test2","password":null,"gender":1,"mobile":"13714110178","email":"506715722@qq.com","joinTime":"2019-11-10","openId":null,"visible":true,"createTime":"2019-11-09 16:20:02","updateTime":"2019-11-09 16:28:37","roleName":"test2"},{"id":35,"name":"test1","realName":"体验用户1","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2019-11-18","openId":null,"visible":true,"createTime":"2019-11-18 10:26:33","updateTime":"2019-11-18 10:27:36","roleName":"体验用户"},{"id":36,"name":"sunqihong","realName":"孙绮虹","password":null,"gender":1,"mobile":"13066990000","email":null,"joinTime":"2019-11-25","openId":null,"visible":true,"createTime":"2019-11-25 16:51:54","updateTime":"2019-12-11 14:34:47","roleName":"系统管理员"},{"id":37,"name":"lvao","realName":"吕傲","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2019-11-27","openId":null,"visible":true,"createTime":"2019-11-27 10:51:02","updateTime":"2019-12-11 18:37:03","roleName":"系统管理员"},{"id":38,"name":"minfengfeng","realName":"闵丰丰","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2020-02-27","openId":null,"visible":true,"createTime":"2020-02-27 23:52:33","updateTime":"2020-02-27 23:53:01","roleName":"试用期销售"},{"id":39,"name":"qiaofu","realName":"谯福","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2020-02-27","openId":null,"visible":true,"createTime":"2020-02-27 23:53:39","updateTime":"2020-02-27 23:54:53","roleName":"试用期销售"},{"id":40,"name":"shijing","realName":"石晶","password":null,"gender":2,"mobile":"13000000000","email":null,"joinTime":"2020-02-27","openId":null,"visible":true,"createTime":"2020-02-27 23:54:18","updateTime":"2020-02-27 23:54:58","roleName":"试用期销售"},{"id":41,"name":"ronggengneng","realName":"荣庚能","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2020-02-27","openId":null,"visible":true,"createTime":"2020-02-27 23:54:43","updateTime":"2020-02-27 23:55:07","roleName":"试用期销售"},{"id":42,"name":"liangrongfeng","realName":"梁荣锋","password":null,"gender":1,"mobile":"13000000000","email":null,"joinTime":"2020-03-03","openId":null,"visible":true,"createTime":"2020-03-03 13:54:52","updateTime":"2020-03-03 14:47:16","roleName":"测试工程师"},{"id":43,"name":"carson","realName":"carson","password":null,"gender":1,"mobile":"13160690000","email":null,"joinTime":"2020-03-04","openId":null,"visible":true,"createTime":"2020-03-04 16:47:22","updateTime":"2020-03-04 16:48:47","roleName":"客户关系ALL"},{"id":44,"name":"Test01","realName":"Test01","password":null,"gender":1,"mobile":"13160691001","email":null,"joinTime":"2020-03-03","openId":null,"visible":true,"createTime":"2020-03-10 16:22:43","updateTime":null,"roleName":null},{"id":45,"name":"Test02","realName":"Test02","password":null,"gender":1,"mobile":"13160691002","email":null,"joinTime":"2020-03-03","openId":null,"visible":true,"createTime":"2020-03-10 16:27:06","updateTime":null,"roleName":null},{"id":46,"name":"Test03","realName":"Test03","password":null,"gender":1,"mobile":"13160691003","email":null,"joinTime":"2020-03-03","openId":null,"visible":true,"createTime":"2020-03-10 16:27:06","updateTime":null,"roleName":null},{"id":47,"name":"Test04","realName":"Test04","password":null,"gender":1,"mobile":"13160691004","email":null,"joinTime":"2020-03-03","openId":null,"visible":true,"createTime":"2020-03-10 16:27:06","updateTime":null,"roleName":null},{"id":48,"name":"Test05","realName":"Test05","password":null,"gender":1,"mobile":"13160691005","email":null,"joinTime":"2020-03-03","openId":null,"visible":true,"createTime":"2020-03-10 16:27:06","updateTime":null,"roleName":null},{"id":49,"name":"Test06","realName":"Test06","password":null,"gender":1,"mobile":"13160691006","email":null,"joinTime":"2020-03-03","openId":null,"visible":true,"createTime":"2020-03-10 16:27:06","updateTime":null,"roleName":null},{"id":50,"name":"Test07","realName":"Test07","password":null,"gender":1,"mobile":"13160691007","email":null,"joinTime":"2020-03-03","openId":null,"visible":true,"createTime":"2020-03-10 16:27:06","updateTime":null,"roleName":null},{"id":51,"name":"Test08","realName":"Test08","password":null,"gender":1,"mobile":"13160691008","email":null,"joinTime":"2020-03-03","openId":null,"visible":true,"createTime":"2020-03-10 16:27:06","updateTime":null,"roleName":null},{"id":52,"name":"Test09","realName":"Test09","password":null,"gender":1,"mobile":"13160691009","email":null,"joinTime":"2020-03-03","openId":null,"visible":false,"createTime":"2020-03-10 16:27:06","updateTime":"2020-03-10 18:12:25","roleName":"测试工程师"}]
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
             * id : 1
             * name : admin
             * realName : 系统管理员
             * password : null
             * gender : 2
             * mobile : 18888888888
             * email : lizejin@7tao.net
             * joinTime : 2019-08-06
             * openId : null
             * visible : true
             * createTime : 2019-08-06 00:08:04
             * updateTime : 2020-01-06 08:07:29
             * roleName : 系统管理员
             */

            private int id;
            private String name;
            private String realName;
            private Object password;
            private int gender;
            private String mobile;
            private String email;
            private String joinTime;
            private Object openId;
            private boolean visible;
            private String createTime;
            private String updateTime;
            private String roleName;

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

            public String getRealName() {
                return realName;
            }

            public void setRealName(String realName) {
                this.realName = realName;
            }

            public Object getPassword() {
                return password;
            }

            public void setPassword(Object password) {
                this.password = password;
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

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getJoinTime() {
                return joinTime;
            }

            public void setJoinTime(String joinTime) {
                this.joinTime = joinTime;
            }

            public Object getOpenId() {
                return openId;
            }

            public void setOpenId(Object openId) {
                this.openId = openId;
            }

            public boolean isVisible() {
                return visible;
            }

            public void setVisible(boolean visible) {
                this.visible = visible;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public String getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(String updateTime) {
                this.updateTime = updateTime;
            }

            public String getRoleName() {
                return roleName;
            }

            public void setRoleName(String roleName) {
                this.roleName = roleName;
            }
        }
    }
}
