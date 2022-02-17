package com.yu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {
    @RequestMapping("/t1/{a}/{b}")
    public String test1(@PathVariable int a,@PathVariable int b, Model model){
        int result=a+b;
        model.addAttribute("op",result);
        return "test1";
    }
    //映射访问路径,必须是POST请求
    @RequestMapping(value = "/2",method = {RequestMethod.POST})
    public String index2(Model model){
        model.addAttribute("msg", "hello!");
        return "test";
    }
}
