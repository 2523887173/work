package com.jk.mapper;

import com.jk.model.Role;
import com.jk.model.RoleTree;
import com.jk.model.Tree;

import java.util.List;

public interface MenuMapper {
    List<String> getTreeId(Integer id);

    List<Tree> getTreeAll();

    int deleteRoleTree(Integer id);

    int insert(RoleTree re);

    List<Role> queryRoleList();
}
