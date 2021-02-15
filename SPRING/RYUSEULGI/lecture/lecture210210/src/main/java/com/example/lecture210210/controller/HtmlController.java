package com.example.lecture210210.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
    final Logger log = LoggerFactory.getLogger(HtmlController.class);

    @GetMapping("/index")
    public String getForm() {
        log.info("table 작동");
        return "/index.html";
    }

    @GetMapping("/index2")
    public String getIndex() {
        log.info("table 작동");
        return "/index2.html";
    }
}