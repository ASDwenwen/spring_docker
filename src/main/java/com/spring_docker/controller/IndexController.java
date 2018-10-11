package com.spring_docker.controller;

import lombok.extern.slf4j.Slf4j;
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
        int a=1;
        log.info("hello----------------------");
        return "hello worl21231";

    }
}
