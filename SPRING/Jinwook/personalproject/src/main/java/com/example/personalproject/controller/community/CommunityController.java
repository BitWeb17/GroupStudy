package com.example.personalproject.controller.community;

import com.example.personalproject.entity.TotalCommunity;
import com.example.personalproject.service.TotalCommunityService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("personalproject/home/maincommunity")
public class CommunityController {
    private static final Logger log =
            LoggerFactory.getLogger(CommunityController.class);

    @Autowired
    private TotalCommunityService service;

    @GetMapping("/totallist")
    public String getTotalList(Model model) throws Exception {
        log.info("getTotalList");

        model.addAttribute("totallist", service.totallist());

        return "spring/community/totallist.html";
    }
        // HTML 처리시 board 정보를 가지고 처리하게됨(주의)
        @GetMapping("/register")
        public String getRegister(TotalCommunity totalcommnuity) {
            log.info("getRegister()");
    
            return "spring/community/register.html";
        }
    
        @PostMapping("/register")
        public String doRegister(TotalCommunity totalcommnuity, Model model)
                throws Exception {
    
            log.info("doRegister()");
    
            service.register(totalcommnuity);
    
            model.addAttribute("msg",
                    "등록이 완료되었습니다.");
    
            return "spring/community/success.html";
        }
    
        @GetMapping("/read")
        public String read(int boardNo, Model model)
                throws Exception {
            log.info("read()");
    
            model.addAttribute(service.read(boardNo));
    
            return "spring/community/read.html";
        }
    }