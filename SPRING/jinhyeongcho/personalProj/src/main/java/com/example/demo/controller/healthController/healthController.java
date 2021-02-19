package com.example.demo.controller.healthController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
public class healthController {
    private static final Logger log =
            LoggerFactory.getLogger(healthController.class);

    @GetMapping("/home")
    public String HomePage(){
        log.info("홈페이지에 접속하였습니다.");
        return "project/home/home";
    }

}
