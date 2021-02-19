package com.example.neodemo.controller.neoalgo;

import com.example.neodemo.entity.TestMember;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

 @Controller
 @RequestMapping(value = "/neoalgo")
 public class NeoalgoController {
     private static final Logger log =
             LoggerFactory.getLogger(NeoalgoController.class);
     @GetMapping("/neoalgohome")
     public String neoalgohome(){
         log.info("getneoalgoHome()");

         return "neoalgo/neoalgo-home.html";
     
    }
    @RequestMapping(value = "/neoalgohome",
            method = RequestMethod.GET, params = "register")
    public String getRegisterForm(Model model) {
        log.info("/neoalgohome?register");

        model.addAttribute("testMember", new TestMember());

        return "thyme/registerForm";
    }
}



     /*
     @GetMapping("/neoalgoForm01")
     public String neoalgoForm01() {
     log.info("neoalgoForm01()");
     
     return "spring/neoalgo/neoalgo-main";
     }
     @GetMapping("/neoalgo-main02")
     public String registerForm002(Model model) { 
     log.info("registerForm002()");
     model.addAttribute("neoalgouser", new Neoalgouser());
     
     return "spring/neoalgo/neoalgo-main";
     }*/