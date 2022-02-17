package com.yu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/user")
    public String test(Model model){
        model.addAttribute("op1","opp");
        return "hello";
    }
}
