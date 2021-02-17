package com.example.study210215.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoadingController {
    final Logger log = LoggerFactory.getLogger(LoadingController.class);

    @GetMapping("/index")
    public String getStart() {
        log.info("로딩화면...");
        return "/index.html";
    }

}
