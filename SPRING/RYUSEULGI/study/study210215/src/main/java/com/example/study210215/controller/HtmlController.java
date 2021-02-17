package com.example.study210215.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
    final Logger log = LoggerFactory.getLogger(HtmlController.class);

    @GetMapping("/index")
    public String getStart() {
        log.info("작동");
        return "/index.html";
    }

}
