package com.example.lecture210217.controller.thymeleaf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.lecture210217.entity.TestMember;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/thymeleaf")
public class ThymeLeafTestController {
    private static final Logger log = LoggerFactory.getLogger(ThymeLeafTestController.class);

    @GetMapping("/registerForm001")
    public String registerForm001() {
        log.info("registerForm001()");

        return "spring/thymeleaf/registerForm";
    }

    @GetMapping("/registerForm002")
    public String registerForm002(Model model) {
        log.info("registerForm002()");
        model.addAttribute("testMember", new TestMember());

        return "spring/thymeleaf/registerForm";
    }

    @PostMapping("/register")
    public String doRegister(TestMember testMember, Model model) {
        log.info("doRegister()");
        log.info("userId = " + testMember.getUserName());
        log.info("passwd = " + testMember.getPassword());
        log.info("introduction = " + testMember.getIntroduction());

        List<String> hobbyList = testMember.getHobbyList();

        if (hobbyList != null) {
            log.info("hobbyList != null" + hobbyList.size());

            for (int i = 0; i < hobbyList.size(); i++) {
                log.info("hobbyList(" + i + ")" + hobbyList.get(i));
            }
        } else {
            log.info("hobbyList == null");
        }
        model.addAttribute("hobbyList", hobbyList);

        return "spring/thymeleaf/result.html";
    }

    @GetMapping("/registerForm003")
    public String registerForm003(Model model) {
        log.info("registerForm003()");
        model.addAttribute("testMember", new TestMember());

        return "spring/thymeleaf/introductionForm";
    }

    @GetMapping("/registerForm004")
    public String registerForm004(Model model) {
        log.info("registerForm004()");

        Map<String, String> hobbyMap = new HashMap<>();
        // key, value
        hobbyMap.put("01", "Sports");
        hobbyMap.put("02", "Listening Music");
        hobbyMap.put("03", "Watching Movie");
        hobbyMap.put("04", "D.I.Y");

        model.addAttribute("hobbyMap", hobbyMap);
        model.addAttribute("testMember", new TestMember());

        return "spring/thymeleaf/hobbyForm";
    }

}
