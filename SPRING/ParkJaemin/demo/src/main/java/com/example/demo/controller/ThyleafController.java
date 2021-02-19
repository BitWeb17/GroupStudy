package com.example.demo.controller;


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
@RequestMapping(value = "/proj")
public class ThyleafController {
    private static final Logger log =
            LoggerFactory.getLogger(ThyleafController.class);

    @GetMapping("/home")
    public String getHome() {
        log.info("getHome()");

        return "proj/projectPage.html";
    }


    @RequestMapping(value = "/home",
            method = RequestMethod.GET, params = "register")
    public String getRegisterForm(Model model) {
        log.info("/get?register()");

        model.addAttribute("testMember", new TestMember());

        return "proj/registerForm.html";
    }

    @PostMapping("/register")
    public String doRegister(TestMember testMember) {
        log.info("doRegister()");
        log.info("userId = " + testMember.getUserName());
        log.info("passwd = " + testMember.getPassword());
        log.info("passwd = " + testMember.getPasswordiden());
        log.info("passwd = " + testMember.getPhoneNum());
        log.info("passwd = " + testMember.getEmail());

        return "proj/complete.html";
    }

    @RequestMapping(value = "/home",
            method = RequestMethod.GET, params = "login")
    public String getLoginForm(Model model) {
        log.info("/get?login");

        model.addAttribute("testMember", new TestMember());

        return "proj/login.html";
    }

    @PostMapping("/login")
    public String doLogin(TestMember testMember) {
        log.info("doLogin()");
        log.info("userId = " + testMember.getUserName());
        log.info("passwd = " + testMember.getPassword());

        return "proj/logincomplete.html";
    }

    // <form action="result.html" th:action="@{/proj/register}" 역할은 result.html

}
