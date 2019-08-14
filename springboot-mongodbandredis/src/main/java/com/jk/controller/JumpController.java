package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Jump")
public class JumpController {

    //跳转测试Jsp
    @RequestMapping("/toList")
    public String toList(){

        return "Testlist.html";
    }
    //跳转权限树
    @RequestMapping("/toTree")
    public String toTree(){

        return "tree.html";
    }
    //跳转角色列表页面
    @RequestMapping("/tojuese")
    public String tojuese(){

        return "jueselist.html";
    }
    //跳转登录页面
    @RequestMapping("/toLogin")
    public String toLogin(){

        return "login.html";
    }
    //跳转联系人列表页面
    @RequestMapping("/toPhone")
    public String toPhone(){

        return "Phonelist.html";
    }
    //跳转用户列表页面
    @RequestMapping("/toUser")
    public String toUser(){

        return "userlist.html";
    }
    //跳转日志列表页面
    @RequestMapping("/toRizhi")
    public String toRizhi(){

        return "rizhilist.html";
    }

}
