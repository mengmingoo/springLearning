package com.mengming.service;


import com.mengming.dao.UserDao;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserDao userDao;

    public UserService() {
    }

    public UserService(UserDao userDao, int age) {
        this.userDao = userDao;
    }

    public void test() {
        System.out.println("UserService test...");
    }
}
