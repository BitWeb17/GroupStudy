package com.example.demo.controller;

import com.example.demo.TeamDivide.TeamDivide;
import com.example.demo.game.DiceGame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


// 결국 Event Handler에 해당한다.
// 몰컴하다 부모님이 뜨면 자는척 하다가 다시 게임하기 등등..
@Controller
public class Html5Css3PageController {
    public static Logger log =
            LoggerFactory.getLogger(Html5Css3PageController.class);

    // 결국 Controller 입장에서의 Event는 무엇인가?
    // 사용자가 Web 서버에 URL 요청을 하는것이다.
    @GetMapping("/first")
    public String getFirst() {
        log.info("Enter getFirst");

        log.info("여기에 서비스 요청하는 코드를 작성한다.");

        log.info("요청을 처리하고 받아온 결과에 대해" +
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
        log.info("Enter getUlLi()");

        return "html_css/ol_li.html";
    }

    @GetMapping("/img_test")
    public String getImg(){
        log.info("Enter getImg()");

        return "html_css/img_test.html";
    }

    @GetMapping("/p_test")
    public String getPTag(){
        log.info("Enter getPTag()");

        return "html_css/p_test.html";
    }

    @GetMapping("/blockqoute_test")
    public String getBlockqoute(){
        log.info("Enter getBlockqoute()");

        return "html_css/blockqoute_test.html";
    }

    @GetMapping("/pre_test")
    public String getPre(){
        log.info("Enter pre_test()");

        return "html_css/pre_test.html";
    }

    @GetMapping("/style_page_test")
    public String getStylingTestPage(){
        log.info("Enter getStylingTestPage()");

        return "html_css/style_page_test.html";
    }

    @GetMapping("/p_options_test")
    public String getPOptionsTest(){
        log.info("Enter getPOptionsTest()");

        return "html_css/p_options_test.html";
    }

    @GetMapping("/mark_test")
    public String getMarkTest(){
        log.info("Enter getMarkTest()");

        return "html_css/mark_test.html";
    }

    @GetMapping("/span_color_test")
    public String getSpanColorTest(){
        log.info("Enter getSpanColorTest()");

        return "html_css/span_color_test.html";
    }

    @GetMapping("/ul_ol_li_test")
    public String getUlOlTest(){
        log.info("Enter getUlOlTest()");

        return "html_css/ul_ol_li_test.html";
    }

    @GetMapping("/ul_ul_li_test")
    public String getUlUlTest(){
        log.info("Enter getUlUlTest()");

        return "html_css/ul_ul_li_test.html";
    }

    @GetMapping("/dice_test")
    public String getDiceGame(){
        DiceGame dg =new DiceGame();
        dg.printWinner();
        log.info("Enter getDiceGame");
        return "html_css/success.html";
    }
    /*0208 수업내용*/
    @GetMapping("/tableTest")
    public String getTableTest(){
        log.info("Enter getTableTest");
        return "html_css/tableTest.html";
    }

    @GetMapping("/mat3by3Test")
    public String getMat3by3Test(){
        log.info("Enter getMat3by3Test");
        return "html_css/mat3by3Test.html";
    }

    @GetMapping("/tableTest2")
    public String getTableTest2(){
        log.info("Enter getTableTest2");
        return "html_css/tableTest2.html";
    }

    @GetMapping("/captionTest")
    public String getCaptionTest(){
        log.info("Enter getCaptionTest");
        return "html_css/captionTest.html";
    }

    @GetMapping("/tableTest3")
    public String getTableTest3(){
        log.info("Enter getTableTest3");
        return "html_css/tableTest3.html";
    }

    @GetMapping("/tableTest4")
    public String getTableTest4(){
        log.info("Enter getTableTest4");
        return "html_css/tableTest4.html";
    }

    @GetMapping("/tableTest5")
    public String getTableTest5(){
        log.info("Enter getTableTest5");
        return "html_css/tableTest5.html";
    }

    @GetMapping("/imgAltTest")
    public String getImgAltTest(){
        log.info("Enter getImgAltTest");
        return "html_css/imgAltTest.html";
    }
    @GetMapping("/imgSizeTest")
    public String getImgTest(){
        log.info("Enter getImgTest");
        return "html_css/imgSizeTest.html";
    }

    @GetMapping("/imgFigCaptionTest")
    public String getImgFigCaptionTest(){
        log.info("Enter getImgFigCaptionTest");
        return "html_css/imgFigCaptionTest.html";
    }

    @GetMapping("/imgCompanyProfileTest")
    public String getImgCompanyProfileTest(){
        log.info("Enter getImgCompanyProfileTest");
        return "html_css/imgCompanyProfileTest.html";
    }

    @GetMapping("/aTagTest")
    public String getATagTest(){
        log.info("Enter getATagTest");
        return "html_css/aTagTest.html";
    }
    @GetMapping("/aTagStyleTest")
    public String getATagStyleTest(){
        log.info("Enter getATagStyleTest");
        return "html_css/aTagStyleTest.html";
    }

    @GetMapping("/iframeTest")
    public String getIFrameTest(){
        log.info("Enter getIFrameTest");
        return "html_css/iframeTest.html";
    }

    @GetMapping("/idCheckTest")
    public String getIdCheckTest(){
        log.info("Enter getIdCheckTest");
        return "html_css/idCheckTest.html";
    }

    @GetMapping("/visitedTest")
    public String getVisitedTest(){
        log.info("Enter getVisitedTest");
        return "html_css/visitedTest.html";
    }

    @GetMapping("/roiATagTest")
    public String getRoiATagTest(){
        log.info("Enter getRoiATagTest");
        return "html_css/roiATagTest.html";
    }
    @GetMapping("/formTest")
    public String getFormTest(){
        log.info("Enter getFormTest");
        return "html_css/form/formTest.html";
    }

    @GetMapping("/loginForm")
    public String getLoginFormTest(){
        log.info("Enter getLoginFormTest");
        return "html_css/form/loginForm.html";
    }
}
