package com.qfedu.service.impl;

import com.qfedu.dao.LoginDao;
import com.qfedu.entity.User;
import com.qfedu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * Created by wujun on 2019/6/17.
 */
@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    LoginDao loginDao;

    @Override
    public User selectLogin(User user) {
        User selectlogin = loginDao.selectLogin(user);
        return selectlogin;
    }
}





