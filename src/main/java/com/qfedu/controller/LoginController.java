package com.qfedu.controller;

import com.qfedu.entity.User;
import com.qfedu.service.LoginService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by wujun on 2019/6/17.
 */

@Controller
@ResponseBody
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping("/login.do")
    public JsonBean selectLogin(User user, HttpSession session){
        User selectLogin = loginService.selectLogin(user);

        if (selectLogin.equals("")){
            return new JsonBean(0,"该账号不存在，请注册后登录");
        }else if (!selectLogin.getPassword().equals(user.getPassword()) ){
            return new JsonBean(0,"账号或密码错误，请重新登录");
        }else if (selectLogin.getFlag()==0){
            return new JsonBean(0,"账号无效，请重新登录");
        }
        session.setAttribute("selectlogin",selectLogin);
        return new JsonBean(1,"登录成功");
    }
}





