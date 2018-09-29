package com.spring_docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by leung on 2018/9/29.
 */
@RestController
public class IndexController {
    @GetMapping(value = {"/","/index"})
    public String index(){
        return "hello1112";
    }
}
