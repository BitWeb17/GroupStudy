package com.example.demo.controller;

import com.example.demo.game.DiceGame;
import com.example.demo.randomPick.RandomPick;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class Html5Css3PageController {
    public static Logger log =
            LoggerFactory.getLogger(Html5Css3PageController.class);

    @GetMapping("/first")
    public String getFirst() {
        log.info("Enter getFirst()");

        log.info("여기에 서비스 요청하는 코드를 작성한다.");

        log.info("요청을 처리하고 받아온 결과에 대해 " +
                "어떤 html 파일이 이를 출력할지 작성한다.");

        return "html_css/success.html";
    }

    @GetMapping("/ul_li")
    public String getUlLi() {
        log.info("Enter getUlLi()");

        return "html_css/ul_li.html";
    }

    @GetMapping("/ol_li")
    public String getOlLi() {
        log.info("Enter getOlLi()");

        return "html_css/ol_li.html";
    }

    @GetMapping("/img_test")
    public String getImg() {
        log.info("Enter getImg()");

        return "html_css/img_test.html";
    }

    @GetMapping("/p_test")
    public String getPTag() {
        log.info("Enter getPTag()");

        return "html_css/p_test.html";
    }

    @GetMapping("/blockquote_test")
    public String getBlockquote() {
        log.info("Enter getBlockquote()");

        return "html_css/blockquote_test.html";
    }

    @GetMapping("/pre_test")
    public String getPre() {
        log.info("Enter getPre()");

        return "html_css/pre_test.html";
    }

    @GetMapping("/style_page_test")
    public String getStylingTestPage() {
        log.info("Enter getStylingTestPage()");

        return "html_css/style_page_test.html";
    }

    @GetMapping("/p_options_test")
    public String getPOptionsTest() {
        log.info("Enter getPOptionsTest()");

        return "html_css/p_options_test.html";
    }

    @GetMapping("/mark_test")
    public String getMarkTest() {
        log.info("Enter getMarkTest()");

        return "html_css/mark_test.html";
    }

    @GetMapping("/span_color_test")
    public String getSpanColorTest() {
        log.info("Enter getSpanColorTest()");

        return "html_css/span_color_test.html";
    }

    @GetMapping("/ul_ol_li_test")
    public String getUlOlLiTest() {
        log.info("Enter getUlOlLiTest()");

        return "html_css/ul_ol_li_test.html";
    }

    @GetMapping("/ul_ul_li_test")
    public String getUlUlLiTest() {
        log.info("Enter getUlUlLiTest()");

        return "html_css/ul_ul_li_test.html";
    }

    @GetMapping("/dice_game")
    public String getDiceGame() {
        log.info("Enter getDiceGame()");

        DiceGame dg = new DiceGame();

        dg.printWinner();

        return "html_css/success.html";
    }

    @GetMapping("/random_pick")
    public String getRandomPick() {
        log.info("Enter getRandomPick()");

        String[] java_192_A = {
                "최현정", "장해솔", "박재민", "고동영", "류슬기",
                "조진형", "오진욱", "이정현", "한다은"
        };
        String[] java_192_B = {
                "노찬욱", "박소현", "박기범", "최임식",
                "탁성진", "하진주", "이승윤", "이범진"
        };
        String[] java_192 = {
                "노찬욱", "박소현", "박기범", "최임식",
                "탁성진", "하진주", "이승윤", "이범진",
                "최현정", "장해솔", "박재민", "고동영", "류슬기",
                "조진형", "오진욱", "이정현", "한다은"
        };

        ArrayList<String> java_192_AL = new ArrayList<String>();

        java_192_AL.add("노찬욱");
        java_192_AL.add("박소현");
        java_192_AL.add("박기범");
        java_192_AL.add("최임식");
        java_192_AL.add("탁성진");
        java_192_AL.add("하진주");
        java_192_AL.add("이승윤");
        java_192_AL.add("이범진");
        java_192_AL.add("최현정");
        java_192_AL.add("장해솔");
        java_192_AL.add("박재민");
        java_192_AL.add("고동영");
        java_192_AL.add("류슬기");
        java_192_AL.add("조진형");
        java_192_AL.add("오진욱");
        java_192_AL.add("이정현");
        java_192_AL.add("한다은");

        RandomPick rdp = new RandomPick(2, java_192_AL);

        rdp.rndAlloc(java_192_AL, rdp.getHashSetArr());
        rdp.allocRemain(java_192_AL, rdp.getHashSetArr());
        rdp.print(rdp.getHashSetArr());


        return "html_css/success.html";
    }
}