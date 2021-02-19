package com.example.demo.controller.request;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.entity.TestMember;


@Controller
@RequestMapping(value = "/request")
public class RequestTestController {
    private static final Logger log =
            LoggerFactory.getLogger(RequestTestController.class);
    
    @GetMapping("/registerForm")
    public String regiterForm(){
        log.info( "regiterForm()");

        return "spring/request/registerForm";
    }
    @GetMapping("/register")
    public String doRegisterByParameter(
        String userId, String passwd){
        log.info( "doRegisterByParameter()");
        log.info( "userId" + userId);
        log.info( "password" + passwd);

        return "/html_css/success.html";
    }
    @PostMapping(value="/register")
    public String doRegisterWithVoidParameter(
        String userId, String passwd) {
            log.info( "doRegisterWithVoidParameter()");
            log.info( "userId" + userId);
            log.info( "password" + passwd);
        
            return "/html_css/success.html";
    }
    
    @GetMapping("/registerByEntity")
    public String doRegisterByEntity(TestMember tm){

        log.info( "doRegisterByEntity()");
        log.info( "userId" + tm.getUserName());
        log.info( "password" + tm.getPassword());
    
        return "/html_css/success.html";
    }
    @PostMapping("/registerWithEntity")
    public String registerWithEntity(TestMember tm){

        log.info( "doRegisterByEntity()");
        log.info( "userId" + tm.getUserName());
        log.info( "password" + tm.getPassword());
    
        return "/html_css/success.html";
    }

}
