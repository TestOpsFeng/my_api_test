package top.testops.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonArray;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.Reporter;
import top.testops.my_api_test.dao.been.StandardBeen;

import java.io.IOException;

/**
 * @author carson
 * @ClassName APIUtil
 * @Description TODO
 * @date 2020/3/13
 **/
public class APIUtil {
    public static CloseableHttpClient httpClient = HttpUtil.creatClient();

    /**
     * 1、创建get请求
     *
     * @param url
     * @return
     */
    public static HttpGet createHttpGet(String url) {
        Reporter.log("GET " + url);
        return new HttpGet(url);
    }

    /**
     * 2、创建post请求
     *
     * @param url
     * @return
     */
    public static HttpPost createHttpPost(String url) {
        Reporter.log("POST " + url);
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Content-Type", "application/json;charset=UTF-8");
        return httpPost;
    }

    public static void setBody(String json, HttpPost post) {
        Reporter.log("Body:" + json);
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
            Reporter.log("Response: " + resultJson);
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
        Reporter.log("expectField: " + field);
        Reporter.log("actualValue: " + result);
        return result;
    }
}
