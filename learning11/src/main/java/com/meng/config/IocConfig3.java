package com.meng.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//标记当前类作为一个配置类，相当于xml配置文件
@Configuration
//设置扫描包的范围
@ComponentScan("com.meng")
//通过@PropertySource加载配冒文件，结合@value注解获取指定key的value
@PropertySource({"classpath:jdbc.properties", "classpath:user.properties"})
public class IocConfig3 {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String name;
    @Value("${jdbc.password}")
    private String pwd;
    @Value("${user.username}")
    private String userName;
    @Value("${user.password}")
    private String userPwd;

    public void test() {
        System.out.println(driver + " " + url);
        System.out.println(name + " " + pwd);
        System.out.println(userName + " " + userPwd);
    }
}
