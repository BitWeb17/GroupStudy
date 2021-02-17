package com.example.personalproject.controller.login;

import java.util.List;

import com.example.personalproject.entity.TestMember;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value = "personalproject/home")
public class LoginController {
    private static final Logger log =
        LoggerFactory.getLogger(LoginController.class);
    @GetMapping(value="/loginForm")
    public String loginForm(Model model) {
        log.info("loginForm()");
        model.addAttribute("testMember", new TestMember());

        return "spring/login/loginForm";
    }
    @PostMapping ("/login")
    public String doLogin(TestMember testMember) {
        log.info("doLogin()");
        log.info("userId = " + testMember.getUserName());
        log.info("passwd = " + testMember.getPassword());

        return "spring/login/result.html";
    }
    @GetMapping(value="/acceptTermsForm")
    public String acceptTermsForm() {
        log.info("acceptTermsForm()");
        return "spring/login/acceptTermsForm";
    }
    @GetMapping ("/acceptTerms")
    public String doacceptTerms(Model model) {
        log.info("doacceptTerms()");
        model.addAttribute("testMember", new TestMember());
        return "spring/login/phoneAuthentication.html";
    }
    @PostMapping ("/phoneAuthentication")
    public String dophoneAuthentication(TestMember testMember) {
        log.info("dophoneAuthentication()");
        log.info("인증번호 = " + testMember.getPhoneAuthentication());

        return "spring/login/signupForm.html";
    }

    @GetMapping(value="/signupForm")
    public String SignUpForm(TestMember testMember, Model model) {
        log.info("loginForm()");
        log.info("phoneAuthentication = " + testMember.getPhoneAuthentication());
        model.addAttribute("testMember", new TestMember());

        return "spring/login/signupForm";
    }
    @PostMapping ("/signup")
    public String doSignUp(TestMember testMember) {
        log.info("doSignUp()");
        log.info("userId = " + testMember.getUserName());
        log.info("passwd = " + testMember.getPassword());
        log.info("email = " + testMember.getEmail());
        log.info("emailcode = " + testMember.getEmailcode());

        return "spring/login/signupResult.html";
    }
    
    
    
}
