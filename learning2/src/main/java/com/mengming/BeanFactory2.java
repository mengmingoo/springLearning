package com.mengming;

/*
* 实例化工厂
* 1.定义一个普通类
* 2.定义一个普通方法，返回实例化对象
*
*
* */
public class BeanFactory2 {
    public UserService getUserService(){
        return new UserService();
    }
}
