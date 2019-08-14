package com.jk.mapper;

import com.jk.model.Role;
import com.jk.model.User;
import com.jk.model.UserRole;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

public interface JuriMapper {
    int findUserCount(HashMap<String, Object> params);

    List<User> findUserList(HashMap<String, Object> params);
    @Select("SELECT roleId FROM user_role where userId = #{userId}")
    List<Integer> getRoleByUserId(Integer userId);
    @Select("select * from t_role")
    List<Role> queryRole2();
    @Delete("delete from user_role where userId = #{uidTwo}")
    int deleteRoleById(Integer uidTwo);

    int insert2(UserRole urm);
}
