package com.jk.service;

import com.jk.model.User;

import java.util.List;

public interface OpiService {
    List<User> queryUserOpi();

    void addUserOpi(List<User> list);
}
