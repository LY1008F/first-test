package com.yu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class ControllerTest2 {
    @RequestMapping("/t2")
    public String test2(Model model){
      model.addAttribute("op","op2");
        return "test1";
    }
}
