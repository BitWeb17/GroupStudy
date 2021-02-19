package com.example.study210215.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    final Logger log = LoggerFactory.getLogger(MemberController.class);

    @RequestMapping("/main")
    public String getMain() {
        log.info("enter getMain()");

        return "main.html";
    }

    @GetMapping("/popular")
    public String getPopular() {
        log.info("enter getPopular()");

        return "popular.html";
    }

}
