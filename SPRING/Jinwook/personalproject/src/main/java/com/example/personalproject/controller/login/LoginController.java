// package com.example.personalproject.controller.login;

// import java.util.List;

// import com.example.personalproject.entity.Login;
// import com.example.personalproject.service.loginservice.LoginService;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;


// @Controller
// @RequestMapping(value = "personalproject/home")
// public class LoginController {
//     private static final Logger log =
//         LoggerFactory.getLogger(LoginController.class);
        
//     @Autowired 
//     private LoginService service;

//     @GetMapping(value="/loginForm")
//     public String getLoginForm(Model model) {
//         log.info("getLoginForm()");
//         model.addAttribute("login", service.login());

//         return "spring/login/loginForm";
//     }
//     @PostMapping ("/login")
//     public String doLogin(Login login) {
//         log.info("doLogin()");
//         log.info("userId = " + login.getUserName());
//         log.info("passwd = " + login.getPassword());

//         return "spring/login/result.html";
//     }
//     @GetMapping(value="/acceptTermsForm")
//     public String acceptTermsForm() {
//         log.info("acceptTermsForm()");
//         return "spring/login/acceptTermsForm";
//     }
//     @GetMapping ("/acceptTerms")
//     public String doacceptTerms(Model model) {
//         log.info("doacceptTerms()");
//         model.addAttribute("login", new Login());
//         return "spring/login/phoneAuthentication.html";
//     }
//     @PostMapping ("/phoneAuthentication")
//     public String dophoneAuthentication(Login Login) {
//         log.info("dophoneAuthentication()");
//         log.info("인증번호 = " + Login.getPhoneAuthentication());

//         return "spring/login/signupForm.html";
//     }

//     @GetMapping(value="/signupForm")
//     public String SignUpForm(Login login, Model model) {
//         log.info("loginForm()");
//         log.info("phoneAuthentication = " + login.getPhoneAuthentication());
//         model.addAttribute("testMember", new Login());

//         return "spring/login/signupForm";
//     }
//     @PostMapping ("/signup")
//     public String doSignUp(Login login) {
//         log.info("doSignUp()");
//         log.info("userId = " + login.getUserName());
//         log.info("passwd = " + login.getPassword());
//         log.info("email = " + login.getEmail());
//         log.info("emailcode = " + login.getEmailcode());

//         return "spring/login/signupResult.html";
//     }
    
    
    
// }
