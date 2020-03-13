package top.testops.my_api_test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@SpringBootApplication
@MapperScan(basePackages = "top.testops.my_api_test.dao")
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class MyApiTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApiTestApplication.class, args);
    }

}
