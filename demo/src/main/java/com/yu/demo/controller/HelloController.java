package com.yu.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/test")
    public String hello(){
        //调用业务，接受前端参数
        return "helllo,world";
    }
}

