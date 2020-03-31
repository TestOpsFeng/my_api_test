package top.testops.my_api_test;

import cn.binarywang.tools.generator.ChineseMobileNumberGenerator;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.apache.commons.lang3.RandomUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import top.testops.my_api_test.dao.AppDao;
import top.testops.my_api_test.dao.been.*;
import top.testops.my_api_test.dao.been.body.*;
import top.testops.my_api_test.listen.ExtentTestNGIReporterListener;
import top.testops.utils.APIUtil;
import top.testops.utils.POIUtils;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author carson
 * @ClassName TestNGDemo
 * @Description TODO
 * @date 2020/3/12
 **/
@SpringBootTest
@Listeners(ExtentTestNGIReporterListener.class)
public class TestNGDemo extends AbstractTestNGSpringContextTests {


    @Autowired
    private AppDao appDao;

    @Test(description = "登录测试")
    public void login_test() {
        DataBeen login = appDao.findByTag("login");
        HttpPost httpPost = APIUtil.createHttpPost(login.getUrl());
        APIUtil.setBody(login.getBody(), httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        StandardBeen standardBeen = APIUtil.parseResponse(httpResponse, StandardBeen.class);
        Object Actual = APIUtil.parseExpectedField(login.getExpectedField(), standardBeen);
        Assert.assertEquals(Actual, login.getExpectedValue());
    }


    @Test(description = "获取员工列表")
    public void listPageEmployees_test() {
        DataBeen listPageEmployees = appDao.findByTag("listPageEmployees");
        HttpPost httpPost = APIUtil.createHttpPost(listPageEmployees.getUrl());
        APIUtil.setBody(listPageEmployees.getBody(), httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        PageEmployeesBeen pageEmployeesBeen = APIUtil.parseResponse(httpResponse, PageEmployeesBeen.class);
        Object Actual = APIUtil.parseExpectedField(listPageEmployees.getExpectedField(), pageEmployeesBeen);
        Assert.assertEquals(Actual, listPageEmployees.getExpectedValue());
    }
    // 添加保险产品
    // 添加投保渠道
    // 添加流量渠道
    // 添加员工日程

    @Test(description = "获取用户列表")
    public void listPageUserInfo_test() {
        DataBeen listPageUserInfo = appDao.findByTag("listPageUserInfo");
        HttpPost httpPost = APIUtil.createHttpPost(listPageUserInfo.getUrl());
        APIUtil.setBody(listPageUserInfo.getBody(), httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        PageUserInfo pageUserInfo = APIUtil.parseResponse(httpResponse, PageUserInfo.class);
        Object Actual = APIUtil.parseExpectedField(listPageUserInfo.getExpectedField(), pageUserInfo);
        Assert.assertEquals(Actual, listPageUserInfo.getExpectedValue());
    }

    @Test(description = "FNS手动创建预约及后续场景")
    public void main_FNS_Scenes() {
        // 手动创建预约接口
        manualAddAppointment();

        // 最近一条新增的预约记录
        PageAppointmentRecordResponse pageAppointmentRecordResponse = listPageAppointmentRecord();
        int appointmentId = pageAppointmentRecordResponse.getData().getList().get(0).getId();
        int userId = pageAppointmentRecordResponse.getData().getList().get(0).getUserId();

        // 分配规划师
        assignPlanner(appointmentId);

        //编辑约定FNA时间
        updateFnaTime(appointmentId);

        // 流转至待一促
        AddFollowUpRecordBody addFollowUpRecordBody = new AddFollowUpRecordBody();

        addFollowUpRecordBody.setPlannerId(42);
        addFollowUpRecordBody.setUserId(userId);
        addFollowUpRecordBody.setAppointmentId(appointmentId);
        addFollowUpRecordBody.setRecordState("3");
        addFollowUpRecordBody.setUserLevel("A");
        addFollowUpRecordBody.setRemark("脚本自动流转跟进记录至『待一促』");

        addFollowUpRecord(addFollowUpRecordBody);

        //添加员工日程
        addPlanSchedule(userId);

        // 流转至待成交
        addFollowUpRecordBody.setRemark("脚本自动流转跟进记录至『待成交』");
        addFollowUpRecordBody.setRecordState("4");
        addFollowUpRecordBody.setUserLevel("A+");

        addFollowUpRecord(addFollowUpRecordBody);

        //保险规划 - 添加家庭成员（先生：1，太太：2，儿子：3）
        Integer fatherId = generateFamilyMember(userId, 1);
        Integer motherId = generateFamilyMember(userId, 2);
        Integer sonId = generateFamilyMember(userId, 3);

        //保存家庭成员信息
        saveFamilyMember(userId, fatherId, motherId, sonId);

        //保存家庭财务信息
        saveFinanceInfo(userId, sonId);

        //创建方案
        addInsurancePlan(userId);

        //查询定制方案，planId
        Integer planId = listUserInsurancePlan(userId);

        //编辑方案（添加产品）
//        "insuranceType": "1"：寿险
//        "insuranceType": "2"：重疾险
//        "insuranceType": "3"：医疗险
//        "insuranceType": "4"：意外险
        //丈夫
        addUserInsurancePlanDetail(userId, fatherId, planId, 1);
        addUserInsurancePlanDetail(userId, fatherId, planId, 2);
        addUserInsurancePlanDetail(userId, fatherId, planId, 3);
        //太太
        addUserInsurancePlanDetail(userId, motherId, planId, 1);
        addUserInsurancePlanDetail(userId, motherId, planId, 2);

        //儿子
        addUserInsurancePlanDetail(userId, sonId, planId, 4);

        //分享保险方案
        shareUserInsurancePlan(planId);

        //批量导入投保订单
        String policyNo = batchOrder();

        //查询『我的成单』
        String orderNo = listMyInsuranceOrder(policyNo);
        //确认对应的客户
        confirmUser(orderNo, userId);


        // 流转至完全成交
        addFollowUpRecordBody.setRemark("脚本自动流转跟进记录至『完全成交』");
        addFollowUpRecordBody.setRecordState("6");
        addFollowUpRecordBody.setUserLevel("S");

        addFollowUpRecord(addFollowUpRecordBody);

    }

    private void shareUserInsurancePlan(Integer planId) {
        DataBeen dataBeen = appDao.findByTag("shareUserInsurancePlan");
        HttpPost httpPost = APIUtil.createHttpPost(dataBeen.getUrl());
        String body = dataBeen.getBody();
        ShareUserInsurancePlanBody shareUserInsurancePlanBody = JSON.parseObject(body, ShareUserInsurancePlanBody.class);

        shareUserInsurancePlanBody.setId(planId);
        Object json = JSON.toJSONString(shareUserInsurancePlanBody, SerializerFeature.WriteMapNullValue);
        APIUtil.setBody(json.toString(), httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        ShareUserInsurancePlanResponse shareUserInsurancePlanResponse = APIUtil.parseResponse(httpResponse, ShareUserInsurancePlanResponse.class);
        Object Actual = APIUtil.parseExpectedField(dataBeen.getExpectedField(), shareUserInsurancePlanResponse);
        Assert.assertEquals(Actual.toString(), dataBeen.getExpectedValue());
        Assert.assertNotNull(shareUserInsurancePlanResponse.getData().getUrl());
        Assert.assertNotNull(shareUserInsurancePlanResponse.getData().getQrImg());
    }

    private void addPlanSchedule(Integer userId) {
        DataBeen dataBeen = appDao.findByTag("addPlanSchedule");
        HttpPost httpPost = APIUtil.createHttpPost(dataBeen.getUrl());
        String body = dataBeen.getBody();
        AddPlanScheduleBody addPlanScheduleBody = JSON.parseObject(body, AddPlanScheduleBody.class);
        addPlanScheduleBody.setStartTime(radomDate());
        addPlanScheduleBody.setRemark("脚本自动添加");
        addPlanScheduleBody.setUserId(userId);
        Object json = JSON.toJSONString(addPlanScheduleBody, SerializerFeature.WriteMapNullValue);
        APIUtil.setBody(json.toString(), httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        StandardBeen standardBeen = APIUtil.parseResponse(httpResponse, StandardBeen.class);
        Object Actual = APIUtil.parseExpectedField(dataBeen.getExpectedField(), standardBeen);
        Assert.assertEquals(Actual.toString(), dataBeen.getExpectedValue());
    }

    //获取最近一年的随机时间
    private String radomDate() {
        long time = RandomUtils.nextLong(1552807590000l, 1584429990073l);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        return df.format(time);// new Date()为获取当前系统时间，也可使用当前时间戳
    }

    /**
     * 添加保险产品
     */
    private void addUserInsurancePlanDetail(Integer userId, Integer familyId, Integer planId, Integer insuranceType) {
        DataBeen dataBeen = appDao.findByTag("addUserInsurancePlanDetail");
        HttpPost httpPost = APIUtil.createHttpPost(dataBeen.getUrl());
        String body = dataBeen.getBody();
        AddUserInsurancePlanDetailBody addUserInsurancePlanDetailBody = JSON.parseObject(body, AddUserInsurancePlanDetailBody.class);
        setInsurancePlan(addUserInsurancePlanDetailBody, userId, familyId, planId, insuranceType);
        Object json = JSON.toJSONString(addUserInsurancePlanDetailBody, SerializerFeature.WriteMapNullValue);
        APIUtil.setBody(json.toString(), httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        StandardBeen standardBeen = APIUtil.parseResponse(httpResponse, StandardBeen.class);
        Object Actual = APIUtil.parseExpectedField(dataBeen.getExpectedField(), standardBeen);
        Assert.assertEquals(Actual.toString(), dataBeen.getExpectedValue());
    }

    /**
     * 配置AddUserInsurancePlanDetailBody
     *
     * @param addUserInsurancePlanDetailBody
     * @param userId
     * @param fatherId
     * @param planId
     */
    private void setInsurancePlan(AddUserInsurancePlanDetailBody addUserInsurancePlanDetailBody, Integer userId,
                                  Integer fatherId, Integer planId, Integer insuranceType) {
        List<ListPageProductResponse.DataBean.ListBean> list = listPageProduct(String.valueOf(insuranceType)).getData().getList();

        int i = RandomUtils.nextInt(0, list.size() - 1);
        addUserInsurancePlanDetailBody.setPlanId(planId);
        addUserInsurancePlanDetailBody.setFamilyId(fatherId);
        addUserInsurancePlanDetailBody.setUserId(userId);
        addUserInsurancePlanDetailBody.setName(list.get(i).getName());
        addUserInsurancePlanDetailBody.setProductId(list.get(i).getId());
        addUserInsurancePlanDetailBody.setInsuranceType(list.get(i).getInsuranceType());
        addUserInsurancePlanDetailBody.setFeature(list.get(i).getFeature());
        addUserInsurancePlanDetailBody.setPurchaseLink(list.get(i).getPurchaseLink());

        switch (insuranceType) {
            case 1:
                addUserInsurancePlanDetailBody.setAnnualPremium("20000");
                addUserInsurancePlanDetailBody.setInsuranceAmount(500);
                addUserInsurancePlanDetailBody.setInsurancePeriod("至70岁");
                addUserInsurancePlanDetailBody.setPaymentPeriod("30年");
                return;
            case 2:
                addUserInsurancePlanDetailBody.setAnnualPremium("30000");
                addUserInsurancePlanDetailBody.setInsuranceAmount(200);
                addUserInsurancePlanDetailBody.setInsurancePeriod("至70岁");
                addUserInsurancePlanDetailBody.setPaymentPeriod("30年");
                return;
            case 3:
                addUserInsurancePlanDetailBody.setAnnualPremium("5000");
                addUserInsurancePlanDetailBody.setInsuranceAmount(50);
                addUserInsurancePlanDetailBody.setInsurancePeriod("1年");
                addUserInsurancePlanDetailBody.setPaymentPeriod("1年");
                return;
            case 4:
                addUserInsurancePlanDetailBody.setAnnualPremium("1000");
                addUserInsurancePlanDetailBody.setInsuranceAmount(200);
                addUserInsurancePlanDetailBody.setInsurancePeriod("1年");
                addUserInsurancePlanDetailBody.setPaymentPeriod("1年");
                return;
            default:
        }


    }

    private Integer listUserInsurancePlan(Integer userId) {
        DataBeen dataBeen = appDao.findByTag("listUserInsurancePlan");
        HttpPost httpPost = APIUtil.createHttpPost(dataBeen.getUrl());
        String body = dataBeen.getBody();
        ListUserInsurancePlanBody listUserInsurancePlanBody = JSON.parseObject(body, ListUserInsurancePlanBody.class);
        listUserInsurancePlanBody.setUserId(userId);
        Object json = JSON.toJSONString(listUserInsurancePlanBody, SerializerFeature.WriteMapNullValue);
        APIUtil.setBody(json.toString(), httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        ListUserInsurancePlanResponse listUserInsurancePlanResponse = APIUtil.parseResponse(httpResponse, ListUserInsurancePlanResponse.class);
        Object Actual = APIUtil.parseExpectedField(dataBeen.getExpectedField(), listUserInsurancePlanResponse);
        Assert.assertEquals(Actual.toString(), dataBeen.getExpectedValue());
        return listUserInsurancePlanResponse.getData().get(listUserInsurancePlanResponse.getData().size() - 1).getId();
    }

    private ListPageProductResponse listPageProduct(String insuranceType) {
        DataBeen dataBeen = appDao.findByTag("listPageProduct");
        HttpPost httpPost = APIUtil.createHttpPost(dataBeen.getUrl());
        String body = dataBeen.getBody();
        ListPageProductBody listPageProductBody = JSON.parseObject(body, ListPageProductBody.class);
        listPageProductBody.setInsuranceType(insuranceType);
        Object json = JSON.toJSONString(listPageProductBody, SerializerFeature.WriteMapNullValue);
        APIUtil.setBody(json.toString(), httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        ListPageProductResponse listPageProductResponse = APIUtil.parseResponse(httpResponse, ListPageProductResponse.class);
        Object Actual = APIUtil.parseExpectedField(dataBeen.getExpectedField(), listPageProductResponse);
        Assert.assertEquals(Actual.toString(), dataBeen.getExpectedValue());
        return listPageProductResponse;
    }

    private void addInsurancePlan(Integer userId) {
        DataBeen dataBeen = appDao.findByTag("addInsurancePlan");
        HttpPost httpPost = APIUtil.createHttpPost(dataBeen.getUrl());
        String body = dataBeen.getBody();
        AddInsurancePlanBody addInsurancePlanBody = JSON.parseObject(body, AddInsurancePlanBody.class);
        addInsurancePlanBody.setUserId(userId);
        Object json = JSON.toJSONString(addInsurancePlanBody, SerializerFeature.WriteMapNullValue);
        APIUtil.setBody(json.toString(), httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        StandardBeen standardBeen = APIUtil.parseResponse(httpResponse, StandardBeen.class);
        Object Actual = APIUtil.parseExpectedField(dataBeen.getExpectedField(), standardBeen);
        Assert.assertEquals(Actual.toString(), dataBeen.getExpectedValue());
    }

    private void saveFinanceInfo(Integer userId, Integer sonId) {
        DataBeen dataBeen = appDao.findByTag("saveFinanceInfo");
        HttpPost httpPost = APIUtil.createHttpPost(dataBeen.getUrl());
        String body = dataBeen.getBody();
        System.out.println("saveFinanceInfoBody:" + body);
        SaveFinanceInfoBody saveFinanceInfoBody = JSON.parseObject(body, SaveFinanceInfoBody.class);
//        familyFinanceInfo.userId
        saveFinanceInfoBody.getFamilyFinanceInfo().setUserId(userId);
//        educationInfos[0].userId
        saveFinanceInfoBody.getEducationInfos().get(0).setUserId(userId);
//        insuranceProposal.userId
        saveFinanceInfoBody.getInsuranceProposal().setUserId(userId);
//        educationInfos[0].familyId
        saveFinanceInfoBody.getEducationInfos().get(0).setFamilyId(sonId);

        Object json = JSON.toJSONString(saveFinanceInfoBody, SerializerFeature.WriteMapNullValue);
        APIUtil.setBody(json.toString(), httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        StandardBeen standardBeen = APIUtil.parseResponse(httpResponse, StandardBeen.class);
        Object Actual = APIUtil.parseExpectedField(dataBeen.getExpectedField(), standardBeen);
        Assert.assertEquals(Actual.toString(), dataBeen.getExpectedValue());
    }


    private void saveFamilyMember(Integer userId, Integer fatherId, Integer motherId, Integer sonId) {
        DataBeen dataBeen = appDao.findByTag("saveFamilyMember");
        HttpPost httpPost = APIUtil.createHttpPost(dataBeen.getUrl());
        String body = dataBeen.getBody();
        SaveFamilyMemberBody saveFamilyMemberBody = JSON.parseObject(body, SaveFamilyMemberBody.class);
        saveFamilyMemberBody.setUserId(userId);
        saveFamilyMemberBody.getFamilyMembers().get(0).setId(fatherId);
        saveFamilyMemberBody.getFamilyMembers().get(1).setId(motherId);
        saveFamilyMemberBody.getFamilyMembers().get(2).setId(sonId);
        Object json = JSON.toJSONString(saveFamilyMemberBody, SerializerFeature.WriteMapNullValue);
        APIUtil.setBody(json.toString(), httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        StandardBeen standardBeen = APIUtil.parseResponse(httpResponse, StandardBeen.class);
        Object Actual = APIUtil.parseExpectedField(dataBeen.getExpectedField(), standardBeen);
        Assert.assertEquals(Actual.toString(), dataBeen.getExpectedValue());
    }

    private Integer generateFamilyMember(Integer userId, Integer role) {
        DataBeen dataBeen = appDao.findByTag("generateFamilyMember");
        HttpPost httpPost = APIUtil.createHttpPost(dataBeen.getUrl());
        String body = dataBeen.getBody();
        GenerateFamilyMemberBody generateFamilyMemberBody = JSON.parseObject(body, GenerateFamilyMemberBody.class);
        generateFamilyMemberBody.setUserId(userId);
        generateFamilyMemberBody.setRole(role);
        Object json = JSON.toJSONString(generateFamilyMemberBody, SerializerFeature.WriteMapNullValue);
        APIUtil.setBody(json.toString(), httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        GenerateFamilyMemberResponse generateFamilyMemberResponse = APIUtil.parseResponse(httpResponse, GenerateFamilyMemberResponse.class);
        Object Actual = APIUtil.parseExpectedField(dataBeen.getExpectedField(), generateFamilyMemberResponse);
        Assert.assertEquals(Actual.toString(), dataBeen.getExpectedValue());
        return generateFamilyMemberResponse.getData().getId();
    }

    /**
     * 查询我的成单
     *
     * @param policyNo
     * @return
     */
    private String listMyInsuranceOrder(String policyNo) {
        DataBeen dataBeen = appDao.findByTag("listMyInsuranceOrder");
        HttpPost httpPost = APIUtil.createHttpPost(dataBeen.getUrl());
        String body = dataBeen.getBody();
        ListMyInsuranceOrderBody listMyInsuranceOrderBody = JSON.parseObject(body, ListMyInsuranceOrderBody.class);
        listMyInsuranceOrderBody.setPolicyNo(policyNo);
        Object json = JSON.toJSONString(listMyInsuranceOrderBody, SerializerFeature.WriteMapNullValue);
        APIUtil.setBody(json.toString(), httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        ListMyInsuranceOrderResponse listMyInsuranceOrderResponse = APIUtil.parseResponse(httpResponse, ListMyInsuranceOrderResponse.class);
        Object Actual = APIUtil.parseExpectedField(dataBeen.getExpectedField(), listMyInsuranceOrderResponse);
        Assert.assertEquals(Actual, dataBeen.getExpectedValue());
        return listMyInsuranceOrderResponse.getData().getList().get(0).getOrderNo();

    }

    /**
     * 确认客户
     *
     * @param orderNo
     * @param userId
     */
    private void confirmUser(String orderNo, int userId) {
        DataBeen dataBeen = appDao.findByTag("confirmUser");
        HttpPost httpPost = APIUtil.createHttpPost(dataBeen.getUrl());
        String body = dataBeen.getBody();
        ConfirmUserBody confirmUserBody = JSON.parseObject(body, ConfirmUserBody.class);
        confirmUserBody.setOrderNo(orderNo);
        confirmUserBody.setUserId(userId);
        Object json = JSON.toJSONString(confirmUserBody, SerializerFeature.WriteMapNullValue);
        APIUtil.setBody(json.toString(), httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        StandardBeen standardBeen = APIUtil.parseResponse(httpResponse, StandardBeen.class);
        Object Actual = APIUtil.parseExpectedField(dataBeen.getExpectedField(), standardBeen);

        Assert.assertEquals(Actual, dataBeen.getExpectedValue());
    }

    /**
     * &#x6279;&#x91cf;&#x4e0a;&#x4f20;&#x6295;&#x4fdd;&#x8ba2;&#x5355;
     *
     * @return
     */
    private String batchOrder() {
        String fileName = "ready.xlsx";
        DataBeen dataBeen = appDao.findByTag("batchOrder");
        String filePath = this.getClass().getClassLoader().getResource("excel/" + fileName).getPath();
        HttpPost httpPost = APIUtil.createUploadFileHttpPost(dataBeen.getUrl(), filePath, fileName);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        String orderNumber = POIUtils.getOrderNumber();
        StandardBeen standardBeen = APIUtil.parseResponse(httpResponse, StandardBeen.class);
        Object Actual = APIUtil.parseExpectedField(dataBeen.getExpectedField(), standardBeen);
        Assert.assertEquals(Actual, dataBeen.getExpectedValue());
        POIUtils.setOrderNumber(String.valueOf(RandomUtils.nextInt(1000000000, 1999999999)));
        return orderNumber;
    }

    // 添加跟进记录
    private void addFollowUpRecord(AddFollowUpRecordBody addFollowUpRecordBody) {
        DataBeen dataBeen = appDao.findByTag("addFollowUpRecord");
        HttpPost httpPost = APIUtil.createHttpPost(dataBeen.getUrl());
        Object json = JSON.toJSONString(addFollowUpRecordBody, SerializerFeature.WriteMapNullValue);
        APIUtil.setBody(json.toString(), httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        StandardBeen standardBeen = APIUtil.parseResponse(httpResponse, StandardBeen.class);
        Object Actual = APIUtil.parseExpectedField(dataBeen.getExpectedField(), standardBeen);
        Assert.assertEquals(Actual, dataBeen.getExpectedValue());
    }

    /**
     * 编辑约定FNA时间
     *
     * @param appointmentId 预约池Id
     */
    private void updateFnaTime(int appointmentId) {
        DataBeen dataBeen = appDao.findByTag("updateFnaTime");
        HttpPost httpPost = APIUtil.createHttpPost(dataBeen.getUrl());
        String body = dataBeen.getBody();
        UpdateFnaTimeBody updateFnaTimeBody = JSON.parseObject(body, UpdateFnaTimeBody.class);
        updateFnaTimeBody.setId(appointmentId);
        updateFnaTimeBody.setFnaTime("2020-03-15 12:00:00");
        Object json = JSON.toJSONString(updateFnaTimeBody, SerializerFeature.WriteMapNullValue);
        APIUtil.setBody(json.toString(), httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        StandardBeen standardBeen = APIUtil.parseResponse(httpResponse, StandardBeen.class);
        Object Actual = APIUtil.parseExpectedField(dataBeen.getExpectedField(), standardBeen);
        Assert.assertEquals(Actual, dataBeen.getExpectedValue());
    }

    /**
     * 分配规划师
     */
    private void assignPlanner(int appointmentId) {
        DataBeen dataBeen = appDao.findByTag("assignPlanner");
        HttpPost httpPost = APIUtil.createHttpPost(dataBeen.getUrl());
        String body = dataBeen.getBody();
        AssignPlannerBody assignPlannerBody = JSON.parseObject(body, AssignPlannerBody.class);
        assignPlannerBody.setId(appointmentId);
        assignPlannerBody.setPlannerId(42);
        Object json = JSON.toJSONString(assignPlannerBody, SerializerFeature.WriteMapNullValue);
        APIUtil.setBody(json.toString(), httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        StandardBeen standardBeen = APIUtil.parseResponse(httpResponse, StandardBeen.class);
        Object Actual = APIUtil.parseExpectedField(dataBeen.getExpectedField(), standardBeen);
        Assert.assertEquals(Actual, dataBeen.getExpectedValue());
    }

    /**
     * 查询预约池记录
     *
     * @return
     */
    private PageAppointmentRecordResponse listPageAppointmentRecord() {
        DataBeen dataBeen = appDao.findByTag("listPageAppointmentRecord");
        HttpPost httpPost = APIUtil.createHttpPost(dataBeen.getUrl());
        String body = dataBeen.getBody();
        PageAppointmentRecordBody pageAppointmentRecordBody = JSON.parseObject(body, PageAppointmentRecordBody.class);
        pageAppointmentRecordBody.setState("1");
        pageAppointmentRecordBody.setPageSize(10);
        pageAppointmentRecordBody.setPageNum(1);
        Object json = JSON.toJSONString(pageAppointmentRecordBody, SerializerFeature.WriteMapNullValue);
        APIUtil.setBody(json.toString(), httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        PageAppointmentRecordResponse pageAppointmentRecordResponse = APIUtil.parseResponse(httpResponse, PageAppointmentRecordResponse.class);
        Object Actual = APIUtil.parseExpectedField(dataBeen.getExpectedField(), pageAppointmentRecordResponse);
        Assert.assertEquals(Actual, dataBeen.getExpectedValue());

        return pageAppointmentRecordResponse;
    }

    /**
     * 手动创建预约接口
     */
    private void manualAddAppointment() {
        DataBeen dataBeen = appDao.findByTag("manualAddAppointment");
        HttpPost httpPost = APIUtil.createHttpPost(dataBeen.getUrl());
        String body = dataBeen.getBody();
        ManualAddAppointmentBeen manualAddAppointmentBeen = JSON.parseObject(body, ManualAddAppointmentBeen.class);
        manualAddAppointmentBeen.setMobile(ChineseMobileNumberGenerator.getInstance().generate());
//        manualAddAppointmentBeen.setMobile("18565667852");
        Object json = JSON.toJSONString(manualAddAppointmentBeen, SerializerFeature.WriteMapNullValue);
        APIUtil.setBody(json.toString(), httpPost);
        CloseableHttpResponse httpResponse = APIUtil.exec(httpPost);
        StandardBeen standardBeen = APIUtil.parseResponse(httpResponse, StandardBeen.class);
        Object Actual = APIUtil.parseExpectedField(dataBeen.getExpectedField(), standardBeen);
        Assert.assertEquals(Actual, dataBeen.getExpectedValue());
    }

    @BeforeClass
    private void login() {
        DataBeen login = appDao.findByTag("login");
        HttpPost httpPost = APIUtil.createHttpPost(login.getUrl());
        APIUtil.setBody(login.getBody(), httpPost);
        APIUtil.exec(httpPost);
    }
}
