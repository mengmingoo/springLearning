package com.mengming.dao;

import org.springframework.beans.factory.InitializingBean;

public class TestDao implements InitializingBean {
    public void test(){
        System.out.println("TestDao test...");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("TestDao init...");
    }
}
