package com.mengming;

import com.mengming.factory.MyClassPathXmlApplicationContext;
import com.mengming.service.UserService;

public class App {
    public static void main(String[] args) {
        MyClassPathXmlApplicationContext applicationContext = new MyClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService)applicationContext.getBean("userService");
        userService.test();
    }
}
