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

    @GetMapping(value = {"/","/index"})
    public String index(){
        log.info("hello----------------------");
        return "hello3212231 world1122哈哈哈";
    }
}
