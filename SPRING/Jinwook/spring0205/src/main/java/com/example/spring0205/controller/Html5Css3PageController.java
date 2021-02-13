package com.example.spring0205.controller;

import com.game.DiceGame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Controller는 결국 Event Handler에 해당한다
// 몰컴하다 부모님이 뜨면 자는척 하다가 다시 게임하기 등등
@Controller
public class Html5Css3PageController {
    public static Logger log =
            LoggerFactory.getLogger(Html5Css3PageController.class);

    // 결국 Controller 입장에서 Event는 무엇인가?
    // 사용자가 Web 서버에 URL 요청을 하는 것이다.
            @GetMapping("/first")
    public String getFirst() {
        log.info("Enter getFirst()");

        log.info("여기에 서비스 요청하는 코드를 작성한다.");

        log.info("요청을 처리하고 받아온 결과에 대해 " +
                "어떤 html 파일이 이를 출력할지 작성한다.");

        return "html_css/success.html";
        // 리턴 하면 Spring은 이 파일을 랜더링(뷰)를 한다.
    }

    @GetMapping("/ul_li")
    public String getUlli(){
        log.info("Enter getUlli()");

        return"html_css/ul_li.html";
    }

    @GetMapping("/ol_li")
    public String getOlli(){
        log.info("Enter getOlli()");

        return"html_css/ol_li.html";
    }

    @GetMapping("/img_test")
    public String getImg(){
        log.info("Enter getImg()");

        return"html_css/img_test.html";
    }

    @GetMapping("/p_test")
    public String getPTag(){
        log.info("Enter getPTag()");

        return"html_css/p_test.html";
    }

    @GetMapping("/blockquote_test")
    public String getBlockquote(){
        log.info("Enter getBlockquote()");

        return"html_css/blockquote_test.html";
    }

    @GetMapping("/pre_test")
    public String getPre(){
        log.info("Enter getPre()");

        return"html_css/pre_test.html";
    }

    @GetMapping("/style_page_test")
    public String getStylingTestPage(){
        log.info("Enter getStylingTestPage()");

        return"html_css/style_page_test.html";
    }


    @GetMapping("/p_options_test")
    public String getPOptionsTest(){
        log.info("Enter getPOptionsTest()");

        return"html_css/p_options_test.html";
    }

    @GetMapping("/mark_test")
    public String getMarkTest(){
        log.info("Enter getMarkTest()");

        return"html_css/mark_test.html";
    }

    @GetMapping("/span_color_test")
    public String getSpanColorTest(){
        log.info("Enter getSpanColorTest()");

        return"html_css/span_color_test.html";
    }
    @GetMapping("/ul_ol_li_test")
    public String getUlOlLiTest(){
        log.info("Enter getUlOlLiTest()");

        return"html_css/ul_ol_li_test.html";
    }

    @GetMapping("/ul_ul_li_test")
    public String getUlUlLiTest(){
        log.info("Enter getUlUlLiTest()");

        return"html_css/ul_ul_li_test.html";
    }
    @GetMapping("/diceGame")
    public String getDiceGame() {
        log.info("Enter getDiceGame()");

        DiceGame dg = new DiceGame();
        dg.printWinner();

        return "html_css/success.html";
    }
    @GetMapping("/tableTest")
    public String getTableTest() {
        log.info("Enter getTableTest()");


        return "html_css/tableTest.html";
    }
    @GetMapping("/mat3by3Test")
    public String getMat3by3Test() {
        log.info("Enter getMat3by3Test()");


        return "html_css/mat3by3Test.html";
    }
    @GetMapping("/tableTest2")
    public String getTableTest2() {
        log.info("Enter getTableTest2()");


        return "html_css/tableTest2.html";
    }
    @GetMapping("/captionTest")
    public String getCaptionTest() {
        log.info("Enter getCaptionTest()");


        return "html_css/captionTest.html";
    }
    @GetMapping("/tableTest3")
    public String getTableTest3() {
        log.info("Enter getTableTest3()");


        return "html_css/tableTest3.html";
    }
    @GetMapping("/tableTest4")
    public String getTableTest4() {
        log.info("Enter getTableTest4()");


        return "html_css/tableTest4.html";
    }
    @GetMapping("/tableTest5")
    public String getTableTest5() {
        log.info("Enter getTableTest5()");


        return "html_css/tableTest5.html";
    }
    @GetMapping("/imgAltTest")
    public String getImgAltTest() {
        log.info("Enter getImgAltTest()");


        return "html_css/imgAltTest.html";
    }
    @GetMapping("/imgSizeTest")
    public String getImgSizeTest() {
        log.info("Enter getImgSizeTest()");


        return "html_css/imgSizeTest.html";
    }
    @GetMapping("/imgFigcaptionTest")
    public String getImgFigcaptionTest() {
        log.info("Enter getImgFigcaptionTest()");


        return "html_css/imgFigcaptionTest.html";
    }
    @GetMapping("/imgCompanyProfileTest")
    public String getImgCompanyProfileTest() {
        log.info("Enter getImgCompanyProfileTest()");


        return "html_css/imgCompanyProfileTest.html";
    }
    @GetMapping("/aTagTest")
    public String getATagTest() {
        log.info("Enter getATagTest()");


        return "html_css/aTagTest.html";
    }
    @GetMapping("/aTagStyleTest")
    public String getATagStyleTest() {
        log.info("Enter getATagStyleTest()");


        return "html_css/aTagStyleTest.html";
    }
    @GetMapping("/iFrameTest")
    public String getIFrameTest() {
        log.info("Enter getIFrameTest()");


        return "html_css/iFrameTest.html";
    }
    @GetMapping("/idCheckTest")
    public String getIdCheckTest() {
        log.info("Enter getIdCheckTest()");


        return "html_css/idCheckTest.html";
    }
    @GetMapping("/visitedTest")
    public String getVisitedTest() {
        log.info("Enter getVisitedTest()");


        return "html_css/visitedTest.html";
    }
    @GetMapping("/roiATagTest")
    public String getroiATagTest() {
        log.info("Enter getroiATagTest()");


        return "img/roiATagTest.html";
    }
    @GetMapping("/formTest")
    public String getformTest() {
        log.info("Enter getformTest()");


        return "html_css/formTest.html";
    }
    @GetMapping("/loginFormTest")
    public String getloginformTest() {
        log.info("Enter getloginformTest()");


        return "html_css/loginFormTest.html";
    }
    @GetMapping("/webformTest")
    public String getwebformTest() {
        log.info("Enter getwebformTest()");


        return "form/webformTest.html";
    }
    @GetMapping("/webformTest2")
    public String getwebformTest2() {
        log.info("Enter getwebformTest2())");


        return "form/webformTest2.html";
    }
    @GetMapping("/webformTest3")
    public String getwebformTest3() {
        log.info("Enter getwebformTest3())");


        return "form/webformTest3.html";
    }
    @GetMapping("/webformTest4")
    public String getwebformTest4() {
        log.info("Enter getwebformTest4())");


        return "form/webformTest4.html";
    }
    @GetMapping("/webformTest5")
    public String getwebformTest5() {
        log.info("Enter getwebformTest5())");


        return "form/webformTest5.html";
    }
    @GetMapping("/webformTest6")
    public String getwebformTest6() {
        log.info("Enter getwebformTest6())");


        return "form/webformTest6.html";
    }
    @GetMapping("/webformTest7")
    public String getwebformTest7() {
        log.info("Enter getwebformTest7())");


        return "form/webformTest7.html";
    }
    @GetMapping("/webFormWithSelect")
    public String getwebFormatWithSelect() {
        log.info("Enter getwebFormatWithSelect())");


        return "form/webFormWithSelect.html";
    }
    @GetMapping("/webFromOptGroup")
    public String getwebFromOptGroup() {
        log.info("Enter getwebFromOptGroup())");


        return "form/webFromOptGroup.html";
    }
    @GetMapping("/webFormLegacy")
    public String webFormLegacy() {
        log.info("Enter webFormLegacy())");


        return "form/webFormLegacy.html";
    }
    @GetMapping("/webProgressBarTest")
    public String getwebProgressBarTest() {
        log.info("Enter getwebProgressBarTest())");


        return "progbar/webProgressBarTest.html";
    }
    @GetMapping("/webProgressBarTest2")
    public String getwebProgressBarTest2() {
        log.info("Enter getwebProgressBarTest2()");


        return "progbar/webProgressBarTest2.html";
    }
    @GetMapping("/webCSS3Test")
    public String getwebCSS3Test() {
        log.info("Enter getwebCSS3Test()");


        return "css3basic/webCSS3Test.html";
    }
    @GetMapping("/webCSS3SectionTest")
    public String getwebCSS3SectionTest() {
        log.info("Enter getwebCSS3SectionTest()");


        return "css3basic/webCSS3SectionTest.html";
    }
    @GetMapping("/webCSS3StyleSheetTest")
    public String getwebCSS3StyleSheetTest() {
        log.info("Enter getwebCSS3StyleSheetTest()");


        return "css3basic/webCSS3StyleSheetTest.html";
    }
    @GetMapping("/webBorderStyleSheet")
    public String getwebBorderStyleSheet() {
        log.info("Enter getwebBorderStyleSheet()");


        return "css3basic/webBorderStyleSheet.html";
    }

    @GetMapping("/webHow2AvoidTest")
    public String getwebHow2AvoidTest() {
        log.info("Enter getwebHow2AvoidTest()");


        return "css3basic/webHow2AvoidTest.html";
    }
    @GetMapping("/webRotationTransformTest")
    public String getwebRotationTransformTest() {
        log.info("Enter getwebRotationTransformTest()");


        return "css3basic/webRotationTransformTest.html";
    }
    @GetMapping("/webFontTest")
    public String getwebFontTest() {
        log.info("Enter getwebFontTest()");


        return "css3basic/webFontTest.html";
    }

    @GetMapping("/webOverFlowTest")
    public String getwebOverFlowTest() {
        log.info("Enter getwebOverFlowTest()");

        return "overflow/webOverFlowTest.html";
    }
    @GetMapping("/webTextBorderTest")
    public String getwebTextBorderTest() {
        log.info("Enter getwebTextBorderTest()");

        return "border/webTextBorderTest.html";
    }
    @GetMapping("/webCustomUlTest")
    public String getwebCustomULTest() {
        log.info("Enter getwebCustomULTest()");

        return "custom/webCustomUlTest.html";
    }
    @GetMapping("/webBoxTest")
    public String getwebBoxTest() {
        log.info("Enter getwebBoxTest()");

        return "box/webBoxTest.html";
    }
    @GetMapping("/webBlockInlineTest")
    public String getwebBoxTest2() {
        log.info("Enter getwebBoxTest2()");

        return "box/webBlockInlineTest.html";
    }
    @GetMapping("/webNavUlLiBoxTest")
    public String getwebNavUlLiBoxTest() {
        log.info("Enter getwebNavUlLiBoxTest()");

        return "box/webNavUlLiBoxTest.html";
    }

    @GetMapping("/webNavUlLiBoxTest2")
    public String getwebNavUlLiBoxTest2() {
        log.info("Enter getwebNavUlLiBoxTest2()");

        return "box/webNavUlLiBoxTest2.html";
    }
    @GetMapping("/webInlineBlockTest")
    public String getwebInlineBlockTest() {
        log.info("Enter getwebInlineBlockTest()");

        return "box/webInlineBlockTest.html";
    }
    @GetMapping("/webBoxBorderStyleTest")
    public String getwebBoxBorderStyleTest() {
        log.info("Enter getwebBoxBorderStyleTest()");

        return "box/webBoxBorderStyleTest.html";
    }
    @GetMapping("/webBoxBorderStyleTest2")
    public String getwebBoxBorderStyleTest2() {
        log.info("Enter getwebBoxBorderStyleTest2()");

        return "box/webBoxBorderStyleTest2.html";
    }
    @GetMapping("/webBoxRoundTest")
    public String getwebBoxRoundTest() {
        log.info("Enter getwebBoxRoundTest()");

        return "box/webBoxRoundTest.html";
    }
    @GetMapping("/webBoxEllipseTest")
    public String getwebBoxEllipseTest() {
        log.info("Enter getwebBoxEllipseTest()");

        return "box/webBoxEllipseTest.html";
    }
    @GetMapping("/webBoxSubRoundTest2")
    public String getwebBoxSubRoundTest2() {
        log.info("Enter getwebBoxSubRoundTest2()");

        return "box/webBoxSubRoundTest2.html";
    }

    @GetMapping("/webBoxMarginTest")
    public String getwebBoxMarginTest() {
        log.info("Enter getwebBoxMarginTest()");

        return "box/webBoxMarginTest.html";
    }
    @GetMapping("/webBoxPaddingTest")
    public String getwebBoxPaddingTest() {
        log.info("Enter getwebBoxPaddingTest()");

        return "box/webBoxPaddingTest.html";
    }
    @GetMapping("/webBoxSizingTest")
    public String getwebBoxSizingTest() {
        log.info("Enter getwebBoxSizingTest()");

        return "box/webBoxSizingTest.html";
    }
    @GetMapping("/webBoxLayoutTest")
    public String getwebBoxLayoutTest() {
        log.info("Enter getwebBoxLayoutTest()");

        return "box/webBoxLayoutTest.html";
    }
    @GetMapping("/webBoxLayoutTest2")
    public String getwebBoxLayoutTest2() {
        log.info("Enter getwebBoxLayoutTest2()");

        return "box/webBoxLayoutTest2.html";
    }
    @GetMapping("/webBoxOutlineTest")
    public String getwebBoxOutlineTest() {
        log.info("Enter webBoxOutlineTest()");

        return "box/webBoxOutlineTest.html";
    }
    @GetMapping("/webBoxPositionRelativeTest")
    public String getwebBoxPositionRelativeTest() {
        log.info("Enter webBoxPositionRelativeTest()");

        return "box/webBoxPositionRelativeTest.html";
    }
    
}

