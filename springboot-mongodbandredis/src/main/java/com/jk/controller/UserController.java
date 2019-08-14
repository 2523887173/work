package com.jk.controller;

import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    //登录
    @RequestMapping("denglu")
    @ResponseBody
    public String denglu(String yan, User user, HttpServletRequest request) {
        String ya=(String) request.getSession().getAttribute("checkcode");

        User us =userService.queryUser(user);
        //账号密码
        if(us == null) {
            return "error2";
        }
        request.getSession().setAttribute("user", us);
        return "success";
    }


}
