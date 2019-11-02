package com.yundaxue.service.impl;

import com.yundaxue.dao.impl.LoginDaoImpl;
import com.yundaxue.pojo.UserInfo;
import com.yundaxue.service.ILoginService;

public class LoginServiceImpl implements ILoginService {
    @Override
    public String Login(UserInfo ui) {
        LoginDaoImpl ldi = new LoginDaoImpl();
        int count = ldi.login(ui);
        if (count >= 0)
            return "登陆成功";
        else
            return "登陆失败";
    }
}
