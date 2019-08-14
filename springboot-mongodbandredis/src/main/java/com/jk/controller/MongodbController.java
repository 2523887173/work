package com.jk.controller;

import com.jk.model.RizhiBean;
import com.jk.service.MongodbService;
import com.jk.utils.DataGridResult;
import com.jk.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("mongodb")
public class MongodbController {

    @Autowired
    private MongodbService mongodbService;

    //日志查询
    @RequestMapping("queryMogoList")
    @ResponseBody
    public DataGridResult queryMogoList(RizhiBean rizhiBean, Integer page, Integer rows){
        DataGridResult result = new DataGridResult();
        PageUtils pageUtils = mongodbService.queryMogoList(rizhiBean,page,rows);
        result.setRows(pageUtils.getList());
        result.setTotal(pageUtils.getSumSize());
        return result;
    }

}
