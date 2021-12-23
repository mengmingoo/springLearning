package com.meng.config;

import com.meng.dao.AccountDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//标记当前类作为一个配置类，相当于xml配置文件
@Configuration
//设置扫描包的范围
@ComponentScan("com.meng")
public class IocConfig2 {
    //通过@Bean注解的方法，方法的返回值会交给IOC进行维护（返回的AccountDao会交给IOC实例化，也是一个单例）
    //一般用于集成第三方框架或组件，比如：数据源、视图解析器等（只需要实例化一次的bean对象）
    @Bean
    public AccountDao accountDao(){
        return new AccountDao();
    }
}
