package com.example.demo.TeamDivide;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeamDivideController {
    public static Logger log =
            LoggerFactory.getLogger(TeamDivideController.class);

    @GetMapping("/divideteam")
    public String getDivideTeam() {

        TeamDivide dt = new TeamDivide();
        dt.printTeam(dt.getAteamArrayList());
        dt.printTeam(dt.getBteamArrayList());
        log.info("Enter getDivideTeam");
        return "html_css/divideteam.html";
    }
}
