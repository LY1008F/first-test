package com.yu.controller;

import com.yu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerTest3 {
    @RequestMapping("/test3")
      public String test3(@RequestParam("username") String name, Model model){
          System.out.println(name);
          model.addAttribute("op",name);
          return "test1";
      }
    @RequestMapping("/user")
    public String user( User user){
        System.out.println(user);
        return "test1";
    }
}
