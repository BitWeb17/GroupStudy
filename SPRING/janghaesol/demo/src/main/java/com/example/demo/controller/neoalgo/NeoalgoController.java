package com.example.demo.controller.neoalgo;


 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RequestMapping;

 @Controller
 @RequestMapping(value = "/neoalgo")
 public class NeoalgoController {
     private static final Logger log =
             LoggerFactory.getLogger(NeoalgoController.class);
     @GetMapping("/neoalgohome")
     public String neoalgohome(){
         log.info("getneoalgoHome()");

         return "individual/neoalgo/neoalgo-home.html";
     
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