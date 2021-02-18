package com.example.lecture210215.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
    final Logger log = LoggerFactory.getLogger(HtmlController.class);

    @GetMapping("/navbar")
    public String getNav() {
        log.info("작동");
        return "/navbar.html";
    }

    @GetMapping("/iframe")
    public String getIframe() {
        log.info("작동");
        return "/iframe.html";
    }
}