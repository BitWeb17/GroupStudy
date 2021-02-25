package com.example.study210217.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    private static final Logger log = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/vue/homework")
    private String getHomework(){
        log.info("getHomework()");

        return "vue/homework";
    }
}
