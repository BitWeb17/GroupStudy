package com.example.neodemo.controller.board;


import com.example.neodemo.entity.CommunityBoard;
import com.example.neodemo.service.CommunityBoardservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/community_board")
public class CommunityController {
        private static final Logger log =
                LoggerFactory.getLogger(CommunityController.class);
    
    
    @Autowired
    private CommunityBoardservice service;

    
    @GetMapping("/communityList")
    public String getCommunityList(Model model) throws Exception{
        log.info("getCommunityList()");

        return "community_board/CommunityList.html";
    }

    @GetMapping("/register")
    public String getCommunityRegister(CommunityBoard board){
        log.info("getcommunityRegister()");

        return "community_board/CommunityRegister.html";
    }
    @PostMapping("/register")
    public String doCommunityRegister(CommunityBoard board, Model model)throws Exception{
        log.info("doCommunityRegister()");

        service.register(board);

        model.addAttribute("msg", "새글 등록이 완료되었습니다.");
                        //msg형식으로,"새글~다"를 value값으로 표시해줘라.
        return "community_board/CommunitySuccess.html";
    }

    @GetMapping("/read")
    public String read(int boardNo, Model model)
            throws Exception {
        log.info("read()");

        model.addAttribute(service.read(boardNo));

        return "community_board/CommunityRead.html";
    }

    @PostMapping("/remove")
    public String doRemove(int boardNo, Model model) throws Exception {
        log.info("doRemove()");

        service.remove(boardNo);

        model.addAttribute("msg",
                "게시글 삭제가 완료되었습니다!");

        return "community_board/CommunitySuccess.html";
    }

    @GetMapping("/modify")
    public String getModify(int boardNo, Model model) throws Exception {
        log.info("getModify()");

        model.addAttribute(service.read(boardNo));
        
        return "community_board/CommunityModify";
    }

    @PostMapping("/modify")
    public String doModify(CommunityBoard board, Model model) throws Exception {
        log.info("doModify()");

        service.modify(board);

        model.addAttribute("msg", 
                "성공적으로 변경되었습니다!");

        return "community_board/CommunitySuccess";
    }
}
