package com.example.personalproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class personalprojectcontoller {
    public static Logger log =
    LoggerFactory.getLogger(personalprojectcontoller.class);
    @GetMapping("/indiedog")
    public String getIndiedog() {
        log.info("Enter getIndiedog()");
        return "html_css/indiedog.html";
    }
    
    
}
