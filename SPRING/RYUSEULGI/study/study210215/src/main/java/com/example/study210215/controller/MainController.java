package com.example.study210215.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
    final Logger log = LoggerFactory.getLogger(MemberController.class);

    @RequestMapping("/")
    public String getMain(){
        log.info("enter getMain()");

        return "main.html";
    }

}
