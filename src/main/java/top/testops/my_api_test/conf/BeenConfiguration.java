package top.testops.my_api_test.conf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.testng.Reporter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author carson
 * @ClassName BeenConfigure
 * @Description TODO
 * @date 2020/3/13
 **/
@Configuration
public class BeenConfiguration {

    @Bean(value = "log")
    public Logger logger() {
        Logger aa = LoggerFactory.getLogger("Log");
        Logger mylog = (Logger) Proxy.newProxyInstance(aa.getClass().getClassLoader(), aa.getClass().getInterfaces(), new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Reporter.log(args[0].toString());
                return method.invoke(aa, args);
            }
        });
        return mylog;
    }
}
