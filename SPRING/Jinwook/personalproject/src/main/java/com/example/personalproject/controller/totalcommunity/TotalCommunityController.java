package com.example.personalproject.controller.totalcommunity;

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


@Controller
@RequestMapping(value = "/maincommunity")
public class TotalCommunityController {
    private static final Logger log =
            LoggerFactory.getLogger(TotalCommunityController.class);

    @Autowired
    private TotalCommunityService service;

    @GetMapping("/list")
    public String getList(Model model) throws Exception {
        log.info("getList()");

        model.addAttribute("list", service.list());

        return "spring/totalcommunity/list";
    }

    // HTML 처리시 board 정보를 가지고 처리하게됨(주의)
    @GetMapping("/register")
    public String getRegister(TotalCommunity totalcommunity) {
        log.info("getRegister()");

        return "spring/totalcommunity/register";
    }

    @PostMapping("/register")
    public String doRegister(TotalCommunity totalcommunity, Model model)
            throws Exception {

        log.info("doRegister()");

        service.register(totalcommunity);

        model.addAttribute("msg",
                "등록이 완료되었습니다.");

        return "spring/totalcommunity/success";
    }

    @GetMapping("/read")
    public String read(int boardNo, Model model)
            throws Exception {
        log.info("read()");

        model.addAttribute(service.read(boardNo));

        return "spring/totalcommunity/read";
    }

    @PostMapping("/remove")
    public String doRemove(int boardNo, Model model) throws Exception {
        log.info("doRemove()");

        service.remove(boardNo);

        model.addAttribute("msg",
                "성공적으로 지워졌습니다!");

        return "spring/totalcommunity/success";
    }

    @GetMapping("/modify")
    public String getModify(int boardNo, Model model) throws Exception {
        log.info("getModify()");

        model.addAttribute(service.read(boardNo));

        return "spring/totalcommunity/modify";
    }

    @PostMapping("/modify")
    public String doModify(TotalCommunity totalcommunity, Model model) throws Exception {
        log.info("doModify()");

        service.modify(totalcommunity);

        model.addAttribute("msg",
                "성공적으로 변경되었습니다!");

        return "spring/totalcommunity/success";
    }
}