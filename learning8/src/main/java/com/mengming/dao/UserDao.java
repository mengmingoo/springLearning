package com.mengming.dao;

import com.mengming.po.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    private String UNAME = "admin";
    private String UPWD = "admin";

    public User queryUserByUname(String uname) {
        if (!UNAME.equals(uname)) {
            return null;
        }
        User user = new User();
        user.setUname(UNAME);
        user.setUpwd(UPWD);
        return user;
    }

}
