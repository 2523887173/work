package com.jk.service;

import com.jk.mapper.UserMapper;
import com.jk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @Override
    public User queryUser(User user) {
        List<User> list = new ArrayList<>();
        String key = "userlog";
        if(redisTemplate.hasKey(key)) {
            System.out.println("----loguser走缓存");
            redisTemplate.opsForValue().get(key);
        }else {
            System.out.println("----loguser走数据库");
            redisTemplate.opsForValue().set(key, list);
            redisTemplate.expire(key, 2, TimeUnit.MINUTES);

        }
        return userMapper.queryUser(user);
    }
}
