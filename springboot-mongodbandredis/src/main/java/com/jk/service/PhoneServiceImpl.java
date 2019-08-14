package com.jk.service;

import com.jk.mapper.PhoneMapper;
import com.jk.model.PhoneBean;
import com.jk.utils.Easyuipage;
import com.jk.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService{

    @Autowired
    private PhoneMapper phoneMapper;

    @Override
    public Easyuipage queryPagePhoneList(Integer page, Integer rows, PhoneBean phoneBean) {
        Easyuipage result = new Easyuipage();
        HashMap<String,Object> params = new HashMap<>();
//查询总条数
        params.put("phoneBean", phoneBean);
        int count = phoneMapper.findPhoneCount(params);
//将查询出来的总条数放到总返回体中--2
        result.setTotal(count);
//查询分页列表
        PageUtil<PhoneBean> pageUtil = new PageUtil<>(count,page,rows);
        params.put("startIndex", pageUtil.getStartIndex());
        params.put("endIndex", pageUtil.getEndIndex());
        List<PhoneBean> phones = phoneMapper.findPhoneList(params);
        pageUtil.setList(phones);
//将分页查询出来的列表放到总返回体中 --3
        result.setRows(phones);
        return result;
    }
}
