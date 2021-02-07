package com.example.study210205.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    public static Logger log = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/team")
    public String getTeam() {
        log.info("getTeam() 작동");

        final int TEAMNUMBER = 4;
        String[] nameA = { "고동영", "장해솔", "류슬기", "박재민", "한다은", "최현정", "오진욱", "조진형", "이정현" };
        String[] nameB = { "이범진", "박소현", "탁성진", "노찬욱", "박기범", "하진주", "이승윤", "최임식" };
        Team team = new Team(nameA, nameB, TEAMNUMBER);
        team.allocRandTeam();
        team.printArrList(team.getAteamArrList());
        team.printArrList(team.getBteamArrList());

        return "Team.html";
    }
}
