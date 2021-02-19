package com.example.neodemo.controller.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
    private static final Logger log = LoggerFactory.getLogger(MainController.class);
    
    //메인 페이지로 가게 하는 것
    @GetMapping("/")//주소창에뜨게한다
    public String getHome(){

        return "neoalgo/neoalgo-home";//보여줄페이지
    }
}
