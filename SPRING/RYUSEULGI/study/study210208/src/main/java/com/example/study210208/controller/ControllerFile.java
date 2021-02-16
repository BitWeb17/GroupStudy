package com.example.study210208.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerFile {
    public static final Logger log = LoggerFactory.getLogger(ControllerFile.class);

    @GetMapping("/main")
    public String getMain() {
        log.info("메인페이지");
        return "main.html";
    }
}
