package com.jk.mapper;

import com.jk.model.User;

import java.util.List;

public interface OpiMapper {
    List<User> queryUserOpi();

    void addUserOpi(List<User> list);
}
