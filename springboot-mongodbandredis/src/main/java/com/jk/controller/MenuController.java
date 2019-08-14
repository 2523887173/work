package com.jk.controller;

import com.jk.model.Role;
import com.jk.model.Tree;
import com.jk.service.MenuService;
import com.jk.utils.TreeNoteUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;
    //查询角色列表
    @RequestMapping("queryRoleList")
    @ResponseBody
    public List<Role> queryRoleList(){

        return menuService.queryRoleList();
    }


    //根据登录用户ID查询所有权限树
    @RequestMapping("getTreeId")
    @ResponseBody
    public List<Tree> getTreeId(Integer id){

        List<Tree> list = menuService.getTreeId(id);

        list = TreeNoteUtil.getFatherNode(list);

        return list;

    }
    //修改权限
    @RequestMapping("updateTree")
    @ResponseBody
    public String updateTree(Integer[] ids,Integer id) {
        int i = menuService.updateTree(ids,id);
        if(i<1) {
            return "0";
        }

        return "1";

    }
}
