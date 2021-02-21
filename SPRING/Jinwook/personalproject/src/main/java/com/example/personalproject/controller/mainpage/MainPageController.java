package com.example.personalproject.controller.mainpage;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController {
    private static final Logger log =
        LoggerFactory.getLogger(MainPageController.class);
        @GetMapping("/")
        public String getHome(){
            log.info("getHome()");

            return "main/indiedog.html";
        }
}
