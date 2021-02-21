package com.example.demo.controller.project;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonalProjectMainController {
    private static final Logger log =
            LoggerFactory.getLogger(PersonalProjectMainController.class);

    @GetMapping("/makeUrOwnBlending")
    public String makeUrOwnBlending() {
        log.info("makeUrOwnBlending()");

        return "personal_project/http_method/main.html";
    }
}
