package com.example.study210215.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
    final Logger log = LoggerFactory.getLogger(MemberController.class);

    @GetMapping("/members/login")
    public String getLogin() {
        log.info("enter getLogin()");
        return "/members/login.html";
    }

    @GetMapping("/members/new")
    public String getCreateForm() {
        log.info("enter getCreateForm()");
        return "/members/createMemberForm.html";
    }

    @GetMapping("/members/out")
    public String getMemberOut() {
        log.info("enter getCreateForm()");
        return "/members/memberOut.html";
    }

    @GetMapping("/members/myPage")
    public String getMyPage() {
        log.info("enter getMyPage()");
        return "/members/myPage.html";
    }

}
