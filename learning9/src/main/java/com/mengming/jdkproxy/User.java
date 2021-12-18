package com.mengming.jdkproxy;

public class User implements RentHouse {
    public int add(int a, int b) {
        return a + b;
    }

    public String getValue() {
        return "value...";
    }

    public void rentHouse() {
        System.out.println("我要租房...");
    }
}
