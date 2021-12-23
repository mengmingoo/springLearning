package com.meng.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//标记当前类作为一个配置类，相当于xml配置文件
@Configuration
//设置扫描包的范围
@ComponentScan("com.meng")
public class IocConfig {

}
