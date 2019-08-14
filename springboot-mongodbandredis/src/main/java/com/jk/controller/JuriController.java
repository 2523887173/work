package com.jk.controller;

import com.jk.model.Role;
import com.jk.model.User;
import com.jk.service.JuriService;
import com.jk.utils.Easyuipage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("juri")
public class JuriController {

    @Autowired
    private JuriService juriService;

    //用户列表分页查询
    @RequestMapping("queryPageUserList")
    @ResponseBody
    public Easyuipage queryPageUserList(Integer page, Integer rows, User user) {
        return juriService.queryPageUserList(page,rows,user);
    }
    //绑定角色
    @RequestMapping("getRoleByUserId")
    @ResponseBody
    public List<Role> getRoleByUserId(Integer userId){
        List<Role> list = juriService.getRoleByUserId(userId);
        return list;


    }
    @RequestMapping("updateUserRole")
    @ResponseBody
    public int  updateUserRole(Integer[]  roleIds, Integer uidTwo){
        int i =  juriService.updateUserRole(roleIds,uidTwo);

        return i;


    }
}
