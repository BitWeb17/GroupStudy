package com.example.demo.TeamDivide;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReviewTest {
    public static Logger log =
            LoggerFactory.getLogger(ReviewTest.class);

    @GetMapping("/review")
    public String getReview() {
        log.info("Enter getDivideTeam");
        return "html_css/review.html";
    }


}
