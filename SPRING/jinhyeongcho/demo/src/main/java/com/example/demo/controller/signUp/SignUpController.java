package com.example.demo.controller.signUp;

import com.example.demo.entity.TestMember;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/menu")
public class SignUpController {
    private static final Logger log =
            LoggerFactory.getLogger(SignUpController.class);

    @GetMapping("/menubar")
    public String getMenubar() {
        log.info("Enter getMenubar");
        return "spring/signup/menubar";
    }


    @RequestMapping(value = "/menubar",
            method = RequestMethod.GET, params = "signUp")
    public String deSignUp(Model model) {
        log.info("/menubar?signUp");

        model.addAttribute("testMember", new TestMember());

        return "spring/signup/signUp";
    }

}
