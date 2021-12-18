package com.mengming.factory;

//定义bean工厂
public interface MyBeanFactory {

    //    对外围提供获取实网化后对象的方法
    Object getBean(String name);
}
