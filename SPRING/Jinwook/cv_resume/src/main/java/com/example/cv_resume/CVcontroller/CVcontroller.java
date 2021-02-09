package com.example.cv_resume.CVcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CVcontroller{
    public static Logger log = 
    LoggerFactory.getLogger(CVcontroller.class);
    @GetMapping("/cv_resume")
    public String getCV_resume() {
            log.info("Enter getCV_resume()");

            return "html_css/cv_resume.html";
    }
}


