package top.testops.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonArray;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.testng.Reporter;
import top.testops.my_api_test.dao.been.DataBeen;
import top.testops.my_api_test.dao.been.StandardBeen;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.charset.Charset;

/**
 * @author carson
 * @ClassName APIUtil
 * @Description TODO
 * @date 2020/3/13
 **/
public class APIUtil {
    public static CloseableHttpClient httpClient = HttpUtil.creatClient();
    private static Logger log;
    static {
        Logger mylog = LoggerFactory.getLogger("Log");
        log = (Logger) Proxy.newProxyInstance(mylog.getClass().getClassLoader(), mylog.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Reporter.log(args[0].toString());
                return method.invoke(mylog, args);
            }
        });
    }

    /**
     * 1、创建get请求
     *
     * @param url
     * @return
     */
    public static HttpGet createHttpGet(String url) {
        log.info("GET " + url);
        return new HttpGet(url);
    }

    /**
     * 2、创建post请求
     *
     * @param url
     * @return
     */
    public static HttpPost createHttpPost(String url) {
        log.info("-----------------------------------------------------------");
        log.info("POST " + url);
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Content-Type", "application/json;charset=UTF-8");
        return httpPost;
    }

    /**
     *
     */
    public static HttpPost createUploadFileHttpPost(String url,String filePath,String fileName) {
        log.info("POST " + url);
        HttpPost httpPost = new HttpPost(url);
        MultipartEntityBuilder multipartEntityBuilder = MultipartEntityBuilder.create();
        multipartEntityBuilder.setCharset(Charset.forName("UTF-8"));
        File file = new File(filePath);
        log.info("uploadPath：" + filePath);
        multipartEntityBuilder.addBinaryBody("file",file, ContentType
                .create("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"),fileName);
        HttpEntity httpEntity = multipartEntityBuilder.build();
        httpPost.setEntity(httpEntity);
        return httpPost;
    }
    public static void setBody(String json, HttpPost post) {
        log.info("Body:" + json);
        StringEntity stringEntity = new StringEntity(json, "UTF-8");
        post.setEntity(stringEntity);
    }

    /**
     * 2、发送请求
     *
     * @return
     */
    public static CloseableHttpResponse exec(HttpRequestBase http) {
        try {
            CloseableHttpResponse response = httpClient.execute(http);
            return response;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 3、处理返回值
     *
     * @param response
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T parseResponse(HttpResponse response, Class<T> clazz) {
        String resultJson = null;
        try {
            resultJson = EntityUtils.toString(response.getEntity());
            T object = JSON.parseObject(resultJson, clazz);
            log.info("Response: " + resultJson);
            return object;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }



    public static Object parseExpectedField(String field, Object standardBeen) {
        JSONObject jsonObject = (JSONObject) JSON.toJSON(standardBeen);
        String[] split = field.split("\\.");
        Object result = null;
        JSONArray jsonArrayTemp = null;
//        JSONObject jsonObjectTemp = null;
        if (split.length > 0) {
            for (int i = 1; i < split.length; i++) {
                if ("0123456789".contains(split[i])) {
                    jsonArrayTemp = (JSONArray) jsonObject.get(split[i-1]);
                    jsonObject = (JSONObject) jsonArrayTemp.get(Integer.parseInt(split[i++]));
                }else {
                    jsonObject = (JSONObject) jsonObject.get(split[i-1]);
                }
            }
            result = jsonObject.get(split[split.length - 1]);
        } else {
            result = jsonObject.get(field);
        }
        log.info("expectField: " + field);
        log.info("actualValue: " + result);
        return result;
    }
}
