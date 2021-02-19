package com.example.demo.controller.exercise;

import com.example.demo.controller.entity.TestMember;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/exercise")
public class SignUpController {
    private static final Logger log =
            LoggerFactory.getLogger(SignUpController.class);

    @GetMapping("/menubar")
    public String getMenubar() {
        log.info("Enter getMenubar");
        return "spring/exercise/menubar.html";
    }


    @RequestMapping(value = "/menubar",
            method = RequestMethod.GET, params = "signUp")
    public String getSignUpForm(TestMember testMember, Model model) {
        log.info("/menubar?signUp 누군가 회원가입을 하러 들어왔습니다.");

        model.addAttribute("testMember", new TestMember());

        return "spring/exercise/signUp";
    }

    @PostMapping("/signUp")
    public String getSignUp(TestMember testMember, Model model){
        log.info("신규 호갱님이 왔다!");
        log.info("userId = " + testMember.getUserName());
        log.info("passwd = " + testMember.getPassword());

        return "spring/exercise/result";
    }

}
