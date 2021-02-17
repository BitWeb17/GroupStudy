package com.example.demo.controller.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("MUOB/menu")
public class PersonalProjectController {
    private static final Logger log =
            LoggerFactory.getLogger(PersonalProjectController.class);

    @RequestMapping(value = "/get", method = RequestMethod.GET, params = "about")
    public String getMenuAbout() {
        log.info("/get?about");

        return "personal_project/menu/about.html";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET, params = "customBlending")
    public String getMenuCustomBlending() {
        log.info("/get?customBlending");

        return "personal_project/menu/customBlending.html";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET, params = "singleOrigin")
    public String getMenuSingleOrigin() {
        log.info("get?singleOrigin");

        return "personal_project/menu/singleOrigin.html";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET, params = "blending")
    public String getMenuBlending() {
        log.info("get?blending");

        return "personal_project/menu/blending.html";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET, params = "equipment")
    public String getMenuEquipment() {
        log.info("get?equipment");

        return "personal_project/menu/equipment.html";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET, params = "notice")
    public String getMenuNotice() {
        log.info("get?notice");

        return "personal_project/menu/notice.html";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET, params = "/notice/{num}")
    public String getMenuNoticeNum(
            @PathVariable("num") int pageNum) {
        log.info("get?NoticeNum: " +
                "페이지번호 = " + pageNum);

        return "personal_project/menu/notice.html";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET, params = "home")
    public String getMenuHome() {
        log.info("get?home");

        return "personal_project/menu/home.html";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET, params = "join")
    public String getMenuJoin() {
        log.info("get?join");

        return "personal_project/menu/join.html";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST, params = "join")
    public String doMenuJoin() {
        log.info("post(join)");

        return "personal_project/menu/home.html";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET, params = "cart")
    public String getMenuCart() {
        log.info("get?cart");

        return "personal_project/menu/cart.html";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST, params = "cart")
    public String doMenuCart() {
        log.info("post(cart)");

        return "personal_project/menu/home.html";
    }



}
