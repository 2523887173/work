package com.jk.controller;

import com.jk.model.PhoneBean;
import com.jk.service.PhoneService;
import com.jk.utils.Easyuipage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/phone")
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    //联系人分页列表查询
    @RequestMapping("queryPagePhoneList")
    @ResponseBody
    public Easyuipage queryPagePhoneList(Integer page, Integer rows, PhoneBean phoneBean) {
        return phoneService.queryPagePhoneList(page,rows,phoneBean);
    }

}
