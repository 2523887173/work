package com.jk.service;

import com.jk.mapper.JuriMapper;
import com.jk.model.Role;
import com.jk.model.User;
import com.jk.model.UserRole;
import com.jk.utils.Easyuipage;
import com.jk.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JuriServiceImpl implements JuriService{

    @Autowired
    private JuriMapper juriMapper;

    @Override
    public Easyuipage queryPageUserList(Integer page, Integer rows, User user) {
        Easyuipage result = new Easyuipage();
        HashMap<String,Object> params = new HashMap<>();
        params.put("user", user);
        int count = juriMapper.findUserCount(params);
        result.setTotal(count);
        PageUtil<User> pageUtil = new PageUtil<>(count,page,rows);
        params.put("startIndex", pageUtil.getStartIndex());
        params.put("endIndex", pageUtil.getEndIndex());
        List<User> users = juriMapper.findUserList(params);
        pageUtil.setList(users);
        result.setRows(users);
        return result;
    }

    @Override
    public List<Role> getRoleByUserId(Integer userId) {
        Map map = new HashMap();
        // 先查 自己的
        List<Integer> list =   juriMapper.getRoleByUserId(userId);

        // 再查所有的 角色
        List<Role> listtwo =   juriMapper.queryRole2();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < listtwo.size(); j++) {


                if(list.get(i) == listtwo.get(j).getId()){

                    listtwo.get(j).setChecked("true");

                }

            }

        }


        return listtwo;
    }

    @Override
    public int updateUserRole(Integer[] roleIds, Integer uidTwo) {
        //先 删除 该用户  原来 有的 角色
        int i = juriMapper.deleteRoleById(uidTwo);
        //再新增 现在 要加的  角色
        if(i >=0){
            for (int j = 0; j < roleIds.length; j++) {
                UserRole urm = new  UserRole();
                urm.setRoleId(roleIds[j]);
                urm.setUserId(uidTwo);
                i = juriMapper.insert2(urm);

            }
        }



        return i;
    }
}
