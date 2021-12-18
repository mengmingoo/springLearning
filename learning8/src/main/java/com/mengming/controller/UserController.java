package com.mengming.controller;

import com.mengming.po.vo.ResultInfo;
import com.mengming.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public ResultInfo login(String uname, String upwd) {
        return userService.loginCheck(uname, upwd);
    }
}
