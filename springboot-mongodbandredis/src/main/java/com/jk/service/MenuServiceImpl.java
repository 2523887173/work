package com.jk.service;

import com.jk.mapper.MenuMapper;
import com.jk.model.Role;
import com.jk.model.RoleTree;
import com.jk.model.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;
    //查询角色列表
    @Override
    public List<Role> queryRoleList() {
        return menuMapper.queryRoleList();
    }
    @Override
    public List<Tree> getTreeId(Integer id) {
        List<String> list = menuMapper.getTreeId(id);

        List<Tree>  listTwo = menuMapper.getTreeAll();

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < listTwo.size(); j++) {
                if(list.get(i).equals(listTwo.get(j).getId().toString())){
                    listTwo.get(j).setChecked("true");
                }


            }

        }


        return listTwo;
    }

    @Override
    public int updateTree(Integer[] ids, Integer id) {
        int i = menuMapper.deleteRoleTree(id);
        if(i>=0) {
            for (int j = 0; j < ids.length; j++) {
                RoleTree re = new RoleTree();
                re.setTreeid(ids[j]);
                re.setRoleid(id);
                i=menuMapper.insert(re);
            }

        }

        return i;
    }



}
