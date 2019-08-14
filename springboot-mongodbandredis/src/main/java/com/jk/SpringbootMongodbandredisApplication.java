package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

@SpringBootApplication
@EnableCaching
@MapperScan("com.jk.mapper")
public class SpringbootMongodbandredisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMongodbandredisApplication.class, args);
    }
    // 这个方法用来注册拦截器，我们自己写好的拦截器需要通过这里添加注册才能生效
    public void addInterceptors(InterceptorRegistry registry) {
    }
}
