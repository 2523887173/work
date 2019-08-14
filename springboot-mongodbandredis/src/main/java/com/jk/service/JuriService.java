package com.jk.service;

import com.jk.model.Role;
import com.jk.model.User;
import com.jk.utils.Easyuipage;

import java.util.List;

public interface JuriService {
    Easyuipage queryPageUserList(Integer page, Integer rows, User user);

    List<Role> getRoleByUserId(Integer userId);

    int updateUserRole(Integer[] roleIds, Integer uidTwo);
}
