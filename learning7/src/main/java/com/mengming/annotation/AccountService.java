package com.mengming.annotation;


/*
 * 自动化注入
 *  @Resource   jdk11版本移除了这个属性 需要去学独引入对应的依赖
 *      1.就认会先通过属性/字段的名称匹配bean工厂中实例化后的对象id唯一标识
 *      2.如果名称没有匹配到对应的对象，那么自动换成类型class匹配
 *      3.set方法可有可无
 *      4.将注解放置在对应set上也可以注入
 *      5.如果注解使用配置了name属性，那么会强制用name的值去匹配，id的位，不会走类型lass匹配
 *  @Autowired
 *      1.默认通过类型（Class类型）查找bean对象与属性字段的名称无关
 *      2.属性可以提供set方法，也可以不提供set方法
 *      3.注解可以声明在属性级别或set方法级别
 *      4.可以添加@Qualifier结合使用，通过value属性值查找bean对象（value属性值必须要设置，且值要与bean标签的id属性值对应）
 *
 * */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class AccountService {
//    @Resource
//    @Resource(name = "accountDao")

//    @Autowired

    //    @Autowired
    //    @Qualifier(value = "accountDao")
    private AccountDao accountDao;

//    @Resource

//    @Autowired
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void test() {
        System.out.println("AccountDao test...");
        System.out.println(accountDao);
    }
}
