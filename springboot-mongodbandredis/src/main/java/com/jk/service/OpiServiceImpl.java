package com.jk.service;

import com.jk.mapper.OpiMapper;
import com.jk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpiServiceImpl implements OpiService{

    @Autowired
    private OpiMapper opiMapper;

    @Override
    public List<User> queryUserOpi() {
        return opiMapper.queryUserOpi();
    }

    @Override
    public void addUserOpi(List<User> list) {
        opiMapper.addUserOpi(list);
    }
}
