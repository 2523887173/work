package com.jk.service;

import com.jk.model.Role;
import com.jk.model.Tree;

import java.util.List;

public interface MenuService {
    List<Tree> getTreeId(Integer id);

    int updateTree(Integer[] ids, Integer id);

    List<Role> queryRoleList();
}
