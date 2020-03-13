package top.testops.utils;

import org.apache.http.HttpHost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;


/**
  * @ClassName HttpUtil
  * @Description TODO
  * @author carson
  * @date 2020/3/12
**/
public class HttpUtil {
    public static Boolean isUseSSR = false;

    public static CloseableHttpClient creatClient() {
        return creatIgnoreVerifyClient();
    }

    public static SSLContext createIgnoreVerifySSL() throws NoSuchAlgorithmException, KeyManagementException {
//        SSLContext sslContext = SSLContext.getInstance("SSLv3");
        SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
        // 实现一个X509TrustManager接口，用于绕过验证，不用修改里面的方法
        X509TrustManager trustManager = new X509TrustManager() {
            @Override
            public void checkClientTrusted(
                    java.security.cert.X509Certificate[] paramArrayOfX509Certificate,
                    String paramString) throws CertificateException {
            }

            @Override
            public void checkServerTrusted(
                    java.security.cert.X509Certificate[] paramArrayOfX509Certificate,
                    String paramString) throws CertificateException {
            }

            @Override
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        };
        sslContext.init(null, new TrustManager[] { trustManager }, null);
        return sslContext;
    }
    public static HttpClientBuilder proxy(String hostOrIP, int port) {
        // 依次是代理地址，代理端口号，协议类型
        HttpHost proxy = new HttpHost(hostOrIP, port, "http");
        DefaultProxyRoutePlanner routePlanner = new DefaultProxyRoutePlanner(proxy);
        return HttpClients.custom().setRoutePlanner(routePlanner);
    }
    public static CloseableHttpClient creatIgnoreVerifyClient() {
        CloseableHttpClient client = null;
        if (isUseSSR) {
            try {
                SSLContext ignoreVerifySSL = null;
                ignoreVerifySSL = createIgnoreVerifySSL();
                Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
                        .register("http", PlainConnectionSocketFactory.INSTANCE)
                        .register("https", new SSLConnectionSocketFactory(ignoreVerifySSL)).build();
                PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
                HttpClients.custom().setConnectionManager(connManager);
                client = proxy("127.0.0.1", 2345).setConnectionManager(connManager).build();
            } catch (NoSuchAlgorithmException | KeyManagementException e) {
                e.printStackTrace();
            }
        } else {
            try {
                SSLContext ignoreVerifySSL = null;
                ignoreVerifySSL = createIgnoreVerifySSL();
                Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
                        .register("http", PlainConnectionSocketFactory.INSTANCE)
                        .register("https", new SSLConnectionSocketFactory(ignoreVerifySSL)).build();
                PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
                client = HttpClients.custom().setConnectionManager(connManager).build();
            }catch (NoSuchAlgorithmException | KeyManagementException e){
                e.printStackTrace();
            }
        }
        return client;
    }
}
