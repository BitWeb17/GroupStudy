package com.example.homwork.controller;

import com.example.homwork.randteam.RandomTeam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeworkController {
    public static Logger log = 
    LoggerFactory.getLogger(HomeworkController.class);
    @GetMapping("/rand_team")
    public String getRandomTeam(){
        log.info("Enter getRandomTeam()");
        String [] name = {
            "최현정", "장해솔", "박재민", "고동영", "이정현", "류슬기",
            "조진형", "한다은", "오진욱", "노찬욱", "박소현", "박기범",
            "최임식", "탁성진", "하진주", "이승윤", "이범진"
        };
        RandomTeam rt = new RandomTeam(name,4);
        rt.allocRandTeam();
        rt.printArr();
        return "html_css/img_test.html";
    }
}
