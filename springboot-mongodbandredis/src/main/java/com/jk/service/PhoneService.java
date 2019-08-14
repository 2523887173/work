package com.jk.service;

import com.jk.model.PhoneBean;
import com.jk.utils.Easyuipage;

public interface PhoneService {
    Easyuipage queryPagePhoneList(Integer page, Integer rows, PhoneBean phoneBean);
}
