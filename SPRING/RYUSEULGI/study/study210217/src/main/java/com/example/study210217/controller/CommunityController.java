package com.example.study210217.controller;

import com.example.study210217.entity.Community;
import com.example.study210217.service.CommunityService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class CommunityController {
    private static final Logger log = LoggerFactory.getLogger(CommunityController.class);

    @Autowired
    private CommunityService service;

    @RequestMapping(value = "community", method = RequestMethod.GET, params = "write")
    public String getWrite(Community community) {
        log.info("getWrite()");

        return "nav/community/write";
    }

    @RequestMapping(value = "community", method = RequestMethod.POST, params = "write")
    public String doWrite(Community community, Model model) throws Exception {
        log.info("doWrite()");
        service.write(community);
        model.addAttribute("msg", "등록이 완료되었습니다.");

        return "nav/community/success";
    }
}
