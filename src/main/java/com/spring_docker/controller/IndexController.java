package com.spring_docker.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by leung on 2018/9/29.
 */
@RestController
@Slf4j
public class IndexController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping(value = {"/","/index"})
    public String index(){
        log.info("hello----------------------");
        //stringRedisTemplate.opsForValue().set("hello","体育个偶尔温柔群殴批娃儿");
        return "hello world";
    }
}
