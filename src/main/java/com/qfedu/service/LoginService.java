package com.qfedu.service;

import com.qfedu.entity.User;

/**
 * Created by wujun on 2019/6/17.
 */
public interface LoginService {
    User selectLogin(User user);
}
