package com.mengming.cglibproxy;

import com.mengming.jdkproxy.JdkProxy;
import com.mengming.jdkproxy.RentHouse;
import com.mengming.jdkproxy.User;

public class CglibProxyTest {
    public static void main(String[] args) {
        //目标对象
        RentHouse user = new User();
        //获取代理类
        CglibProxy proxy = new CglibProxy(user);
        //调用代理类中的方法，得到代理对象
        RentHouse rentHouse = (RentHouse) proxy.getProxy();
        rentHouse.rentHouse();
        System.out.println(rentHouse.getValue());
        System.out.println(rentHouse.add(13, 30));
    }
}
