package com.example.lecture210222.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
    private static final Logger log = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/vue/main")
    private String getMain(){
        log.info("getMain()");

        return "vue/main";
    }

    @GetMapping("/vue/game")
    private String getGame(){
        log.info("getGame()");

        return "vue/game";
    }

    @GetMapping("/vue/gameStart")
    private String getGameStart(){
        log.info("getGameStart()");

        return "vue/gameStart";
    }
    
}
