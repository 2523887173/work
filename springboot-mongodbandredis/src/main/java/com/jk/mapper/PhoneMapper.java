package com.jk.mapper;

import com.jk.model.PhoneBean;

import java.util.HashMap;
import java.util.List;

public interface PhoneMapper {
    int findPhoneCount(HashMap<String, Object> params);

    List<PhoneBean> findPhoneList(HashMap<String, Object> params);
}
