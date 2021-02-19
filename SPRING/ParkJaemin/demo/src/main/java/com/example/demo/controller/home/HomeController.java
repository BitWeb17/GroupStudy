package com.example.demo.controller.home;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    private static final Logger log =
            LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    public String getHome() {
        return "spring/home";
    }
}
