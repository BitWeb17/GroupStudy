package com.example.lecture210208.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
    final Logger log = LoggerFactory.getLogger(HtmlController.class);

    // getMapping은 컨트롤러 기준에서 이벤트
    @GetMapping("/table")
    public String getTest() {
        log.info("table 작동");
        return "/htmlTest.html";
    }

    @GetMapping("/imgTest")
    public String getTest2() {
        log.info("imgTest 작동");
        return "/htmlImgTest.html";
    }

    @GetMapping("/test")
    public String getTest3() {
        log.info("test 작동");
        return "/visitedTest.html";
    }

    @GetMapping("/formTest")
    public String getTest4() {
        log.info("formTest 작동");
        return "/formTest.html";
    }
}