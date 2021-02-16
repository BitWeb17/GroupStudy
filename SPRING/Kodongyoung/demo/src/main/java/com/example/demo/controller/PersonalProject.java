package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonalProject {
    public static Logger log =
            LoggerFactory.getLogger(com.example.demo.controller.Html5Css3PageController.class);

    @GetMapping("/project")
    public String getProject() {
        log.info("Enter getProject()");

        return "html_css/project.html";
    }
}


