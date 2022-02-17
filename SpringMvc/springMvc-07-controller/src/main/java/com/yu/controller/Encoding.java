package com.yu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Encoding {
    @PostMapping("/test3")
    public String test(Model model,String name){
        System.out.println(name);
        model.addAttribute("op",name);
        return "test1";
    }
}
