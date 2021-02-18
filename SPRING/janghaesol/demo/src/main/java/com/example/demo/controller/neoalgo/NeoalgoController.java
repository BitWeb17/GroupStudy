package com.example.demo.controller.neoalgo;

import com.example.demo.neoalgoEntity.Neoalgouser;

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
    @GetMapping("/Home")
    public String Home(){
        log.info("getHome()");

        return "individual/neoalgo/neoalgo-home";
    }     
    @RequestMapping(value = "/neoalgo",
       method = RequestMethod.GET, params = "register")
    public String getneoalgo-register(Model model) {
        log.info("/Home?register");

        model.addAttribute("neoalgouser", new Neoalgouser());

        return "individual/neoalgo/neoalgo-register";
    }

}
  