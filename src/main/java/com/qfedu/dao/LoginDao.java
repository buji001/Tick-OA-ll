package com.qfedu.dao;

import com.qfedu.entity.User;

/**
 * Created by wujun on 2019/6/17.
 */
public interface LoginDao {
    User selectLogin(User user);
}
