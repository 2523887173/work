package com.jk.service;

import com.jk.model.RizhiBean;
import com.jk.utils.PageUtils;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MongodbServiceImpl implements MongodbService{

    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public PageUtils queryMogoList(RizhiBean rizhiBean, Integer page, Integer rows) {
        Criteria c =new Criteria();
        Query query = new Query();
        query.addCriteria(c);
        long sumsize = mongoTemplate.count(query, RizhiBean.class, "rizhi");
        PageUtils pageUtil = new  PageUtils((int)sumsize,page,rows);
        Integer  skip = pageUtil.getFirstResultCount();
        query.skip(skip);
        query.limit(rows);
        List<RizhiBean> list = mongoTemplate.find(query, RizhiBean.class, "rizhi");
        pageUtil.setList(list);
        return pageUtil;
    }
}
