package com.mengming;

/*
* 单例化工厂
* 1.定义一个类
* 2.定义一个静态方法，返回实例化对象
*
*
* */
public class BeanFactory1 {
    public static UserService getUserService(){
        return new UserService();
    }
}
