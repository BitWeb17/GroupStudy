package com.example.lecture210205.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlCssController {
    public static Logger log = LoggerFactory.getLogger(HtmlCssController.class);

    // getMapping은 컨트롤러 기준에서 이벤트
    @GetMapping("/first")
    public String getFirst() {
        log.info("Enter getFirst()");
        log.info("서비스에 요청하는 코드");
        log.info("요청을 처리하고 받아온 결과에 대해 어떤 html 파일이 이를 출력할지 작성한다.");
        return "html_css/success.html";
    }

    @GetMapping("test")
    public String getUlLi() {
        log.info("enter getUlLi");
        return "html_css/test.html";
    }

    @GetMapping("test2")
    public String getPage() {
        log.info("enter getPage");
        return "html_css/test2.html";
    }

    @GetMapping("/dice")
    public String getDice() {
        Dice dg = new Dice();
        log.info("Enter getDice()");
        dg.random();
        return "html_css/success.html";
    }
}
