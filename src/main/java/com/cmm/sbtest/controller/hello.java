package com.cmm.sbtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class hello {
    @RequestMapping("/index")
    public String hello(Model model){
        model.addAttribute("hello", "你好");
        return "index";
    }
}
