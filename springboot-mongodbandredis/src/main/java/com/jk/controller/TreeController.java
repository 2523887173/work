package com.jk.controller;

import com.jk.model.Tree;
import com.jk.model.User;
import com.jk.service.TreeService;
import com.jk.utils.TreeNoteUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping("/tree")
public class TreeController {

    @Autowired
    private TreeService treeService;

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    //查询缓存树
    @RequestMapping("getTreeAll")
    @ResponseBody
    public List<Tree> getTreeAll(HttpServletRequest request){
        List<Tree> list = new ArrayList<>();
        User user = (User) request.getSession().getAttribute("user");
        String key = "tree"+user.getId();
        if(redisTemplate.hasKey(key)) {
            System.out.println("---tree走缓存---");
            list = (List<Tree>) redisTemplate.opsForValue().get(key);
        }else {
            System.out.println("---tree走数据库---");
            list = treeService.getTreeAll(user.getId());
            list = TreeNoteUtil.getFatherNode(list);
            redisTemplate.opsForValue().set(key, list);
            redisTemplate.expire(key, 30, TimeUnit.MINUTES);
        }
        return list;
    }
}
