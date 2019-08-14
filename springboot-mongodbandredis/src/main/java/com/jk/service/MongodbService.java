package com.jk.service;

import com.jk.model.RizhiBean;
import com.jk.utils.PageUtils;

public interface MongodbService {
    PageUtils queryMogoList(RizhiBean rizhiBean, Integer page, Integer rows);
}
