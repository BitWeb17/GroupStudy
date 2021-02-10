package com.example.demo.controller;

import com.example.demo.createteam.Randomteam;
import com.example.demo.game.DiceGame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 결국 Event Handler에 해당한다.
// 몰컴하다 부모님이 뜨면 자는 척 하다가 다시 게임하기 등등
@Controller
public class Html5Css3PageController {
    public static Logger log =
            LoggerFactory.getLogger(Html5Css3PageController.class);

    // 결국 Controller 입장에서의 Event는 무엇인가?
    // 사용자가 Web 서버에 URL 요청을 하는 것이다.
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

        return "html_css/text/ul_li.html";
    }

    @GetMapping("/ol_li")
    public String getOlLi() {
        log.info("Enter getOlLi");

        return "html_css/text/ol_li.html";
    }

    @GetMapping("/img_test")
    public String getImg() {
        log.info("Enter getImg");

        return "html_css/img_test.html";
    }

    @GetMapping("/p_test")
    public String getPTag() {
        log.info("Enter getPTag()");

        return "html_css/text/p_test.html";
    }

    @GetMapping("/blockquote_test")
    public String getBlockquote() {
        log.info("Enter getBlockquote()");

        return "html_css/text/blockquote_test.html";
    }

    @GetMapping("/pre_test")
    public String getPre() {
        log.info("Enter getPre()");

        return "html_css/text/pre_test.html";
    }

    @GetMapping("/style_page_test")
    public String getStylePageTest() {
        log.info("Enter getStylePageTes()");

        return "html_css/text/style_page_test.html";
    }

    @GetMapping("/p_options_test")
    public String getPOptionsTest() {
        log.info("Enter getPOtionsTest()");

        return "html_css/text/p_options_test.html";
    }

    @GetMapping("/mark_test")
    public String getMarkTest() {
       log.info("Enter getMarkTest()");

       return "html_css/text/mark_test.html";
    }

    @GetMapping("/span_color_test")
    public String getSpanColorTest() {
        log.info("Enter getSpanColorTest()");

        return "html_css/text/span_color_test.html";
    }

    @GetMapping("/ul_ol_li_test")
    public String getUlOlLiTest() {
        log.info("Enter getUlOlLiTest()");

        return "html_css/text/ul_ol_li_test.html";
    }

    @GetMapping("/diceGame")
    public String getDiceGame() {
        log.info("Enter getDiceGame()");

        DiceGame dg = new DiceGame();
        dg.printWinner();

        return "html_css/success.html";
    }

    @GetMapping("/randomTeam")
    public String getRandomTeam() {
        log.info("Enter getRandomTeam()");
        final int NUMBEROFJO = 2;
        String[] joA = {
                "고동영", "장해솔", "류슬기", "박재민", "한다은",
                "최현정", "오진욱", "조진형", "이정현"
        };
        String[] joB = {
                "이범진", "박소현", "탁성진", "노찬욱",
                "박기범", "하진주", "이승윤", "최임식"
        };


        Randomteam rt1 = new Randomteam(joA, NUMBEROFJO);
        Randomteam rt2 = new Randomteam(joB, NUMBEROFJO);

        rt1.setRandomJo();
        rt2.setRandomJo();

        rt1.printArraylist(rt1.getJoArraylist());
        rt2.printArraylist(rt2.getJoArraylist());

        return "html_css/success.html";
    }

    @GetMapping("/tableTest")
    public String getTableTest() {
        log.info("Enter getTableTest()");

        return "html_css/table/TableTest.html";
    }

    @GetMapping("/mat3by3Test")
    public String getMat3by3Test() {
        log.info("Enter getMat3by3Test()");

        return "html_css/table/mat3by3Test.html";
    }

    @GetMapping("/tableTest2")
    public String getTableTest2() {
        log.info("Enter getTableTest2()");

        return "html_css/table/TableTest2.html";
    }

    @GetMapping("captionTest")
    public String getCaptionTest() {
        log.info("Enter getCaptionTest()");

        return "html_css/table/captionTest.html";
    }

    @GetMapping("/tableTest3")
    public String getTableTest3() {
        log.info("Enter getTableTest3()");

        return "html_css/table/TableTest3.html";
    }

    @GetMapping("/tableTest4")
    public String getTableTest4() {
        log.info("Enter getTableTest4()");

        return "html_css/table/TableTest4.html";
    }

    @GetMapping("/tableTest5")
    public String getTableTest5() {
        log.info("Enter getTableTest5()");

        return "html_css/table/TableTest5.html";
    }

    @GetMapping("/imgAltTest")
    public String getImgAltTest() {
        log.info("Enter getImgAltTest()");

        return "html_css/image/imgAltTest.html";
    }

    @GetMapping("/imgSizeTest")
    public String getImgSizeTest() {
        log.info("Enter getImgSizeTest()");

        return "html_css/image/imgSizeTest.html";
    }

    @GetMapping("/imgFigcaptionTest")
    public String getImgFigcaptionTest() {
        log.info("Enter getIimgFigcaptionTest()");

        return "html_css/image/imgFigcaptionTest.html";
    }

    @GetMapping("/imgCompanyProfileTest")
    public String getImgCompanyProfileTest() {
        log.info("Enter getImgCompanyProfileTest()");

        return "html_css/image/imgCompanyProfileTest.html";
    }

    @GetMapping("/aTagTest")
    public String getATagTest() {
        log.info("Enter getATagTest()");

        return "html_css/text/aTagTest.html";
    }

    @GetMapping("/aTagStyleTest")
    public String getATagStyleTest() {
        log.info("Enter getATagStyleTest()");

        return "html_css/text/aTagStyleTest.html";
    }

    @GetMapping("/iFrameTest")
    public String getIFrameTest() {
        log.info("Enter getIFrameTest()");

        return "html_css/image/iFrameTest.html";
    }

    @GetMapping("/idCheckTest")
    public String getIdCheckTest() {
        log.info("Enter getIdCheckTest()");

        return "html_css/text/aidCheckTest.html";
    }

    @GetMapping("/visitedTest")
    public String getVisitedTest() {
        log.info("Enter getVisitedTest()");

        return "html_css/text/avisitedTest.html";
    }

    @GetMapping("/roiATagTest")
    public String getRoiATagTest() {
        log.info("Enter getRoiATagTest()");

        return "html_css/image/roiATagTest.html";
    }

    @GetMapping("/formTest")
    public String getFormTest() {
        log.info("Enter getFormTest()");

        return "html_css/form/formTest.html";
    }

    @GetMapping("/loginFormTest")
    public String getLoginFormTest() {
        log.info("Enter getLogFormTest()");

        return "html_css/form/loginFormTest.html";
    }

    @GetMapping("/CVLetter")
    public String getCVLetter() {
        log.info("Enter getCVLetter()");

        return "html_css/homework/coverLetter.html";
    }

    @GetMapping("/webFormTest")
    public String getWebFormTest() {
        log.info("Enter getWebFormTest()");

        return "html_css/form/webFormTest.html";
    }

    @GetMapping("/webFormTest2")
    public String getWebFormTest2() {
        log.info("Enter getWebFormTest2()");

        return "html_css/form/webFormTest2.html";
    }

    @GetMapping("/webFormTest3")
    public String getWebFormTest3() {
        log.info("Enter getWebFormTest3()");

        return "html_css/form/webFormTest3.html";
    }

    @GetMapping("/webFormTest4")
    public String getWebFormTest4() {
        log.info("Enter getWebFormTest4()");

        return "html_css/form/webFormTest4.html";
    }

    @GetMapping("/webFormTest5")
    public String getWebFormTes5() {
        log.info("Enter getWebFormTest5()");

        return "html_css/form/webFormTest5.html";
    }

    @GetMapping("/webFormTest6")
    public String getWebFormTest6() {
        log.info("Enter getWebFormTest6()");

        return "html_css/form/webFormTest6.html";
    }

    @GetMapping("/webFormTest7")
    public String getWebFormTest7() {
        log.info("Enter getWebFormTest7()");

        return "html_css/form/webFormTest7.html";
    }

    @GetMapping("/webFormOptGroup")
    public String getWebFormOptGroup() {
        log.info("Enter getWebFormOptGroup()");

        return "html_css/form/webFormOptGroup.html";
    }

    @GetMapping("/webFormWithSelect")
    public String getWebFormWithSelect() {
        log.info("Enter getWebFormWithSelect()");

        return "html_css/form/webFormWithSelect.html";
    }

    @GetMapping("/webBorderStyleTest")
    public String getWebBorderStyleTest() {
        log.info("Enter getWebBorderStyleTest()");

        return "html_css/css3basic/webBorderStyleTest.html";
    }

    @GetMapping("/webCSS3SectionTest")
    public String getWebCSS3SectionTest() {
        log.info("Enter getWebCSS3SectionTest()");

        return "html_css/css3basic/webCSS3SectionTest.html";
    }

    @GetMapping("/webCSS3StyleSheetTest")
    public String getWebCSS3StyleSheetTest() {
        log.info("Enter getWebCSS3StyleSheetTest()");

        return "html_css/css3basic/webCSS3StyleSheetTest.html";
    }

    @GetMapping("/webCSS3Test")
    public String getWebCSS3Test() {
        log.info("Enter getWebCSS3Test()");

        return "html_css/css3basic/webCSS3Test.html";
    }

    @GetMapping("/webFontTest")
    public String getWebFontTest() {
        log.info("Enter getWebFontTest()");

        return "html_css/css3basic/webFontTest.html";
    }

    @GetMapping("/webHow2AvoidTest")
    public String getWebHow2AvoidTest() {
        log.info("Enter getWebHow2AvoidTest()");

        return "html_css/css3basic/webHow2AvoidTest.html";
    }

    @GetMapping("/webRotationTransformTest")
    public String getWebRotationTransformTest() {
        log.info("Enter getWebRotationTransformTest()");
        return "html_css/css3basic/webRotationTransformTest.html";
    }
}
