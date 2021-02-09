package com.example.lecture210209.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FileController {
    final Logger log = LoggerFactory.getLogger(FileController.class);

    @GetMapping("/form")
    public String getForm() {
        log.info("table 작동");
        return "/formTest.html";
    }

    @GetMapping("/cssTest")
    public String getCssTest() {
        log.info("table 작동");
        return "/cssTest.html";
    }
}