package com.mengming;

public class UserService {
    private String serviceName;

    public UserService() {
    }

    public UserService(String serviceName) {
        this.serviceName = serviceName;
    }

    public void test(){
        System.out.println("Userservice test...");
    }
}
