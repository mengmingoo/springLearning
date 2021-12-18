package com.mengming.service;

import com.mengming.dao.UserDao;
import com.mengming.po.User;
import com.mengming.po.vo.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public ResultInfo loginCheck(String uname, String upwd) {
        ResultInfo resultInfo = new ResultInfo();
        if (null == uname || "".equals(uname.trim())) {
            resultInfo.setCode(0);
            resultInfo.setMsg("用户名为空");
            return resultInfo;
        }
        if (null == upwd || "".equals(upwd.trim())) {
            resultInfo.setCode(0);
            resultInfo.setMsg("密码为空");
            return resultInfo;
        }
        User user = userDao.queryUserByUname(uname);
        if (null == user) {
            resultInfo.setCode(0);
            resultInfo.setMsg("用户名不存在，请注册");
            return resultInfo;
        }

        if (!upwd.equals(user.getUpwd())) {
            resultInfo.setCode(0);
            resultInfo.setMsg("密码错误");
            return resultInfo;
        }
        return resultInfo;
    }
}
