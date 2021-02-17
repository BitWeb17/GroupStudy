package com.example.demo.controller.priproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/pri/privateproject")
public class ProjectController {
    private static final Logger log =
            LoggerFactory.getLogger(ProjectController.class);

    @RequestMapping(value = "/get",
            method = RequestMethod.GET, params = "login")
    public String getLoginForm() {
        log.info("/get?login");

        return "html_css/privateproject/login.html";
    }

    @RequestMapping(value = "/post",
            method = RequestMethod.POST, params = "login")
    public String doLogin() {
        log.info("/post(login)");

        return "spring/parameter/list.html";
    }
}
