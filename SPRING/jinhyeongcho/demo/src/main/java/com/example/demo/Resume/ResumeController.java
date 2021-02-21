package com.example.demo.Resume;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResumeController {
    public static Logger log =
            LoggerFactory.getLogger(ResumeController.class);

    @GetMapping("/resume")
    public String getResume() {
        log.info("Enter getResume");
        return "html_css/resume/resume.html";
    }

    @GetMapping("/resumeBonobono")
    public String getResumeBonobono() {
        log.info("Enter getResumeBonobono");
        return "html_css/resume/resumeBonobono.html";
    }

}
