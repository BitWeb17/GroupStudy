package com.example.demo.controller.html_css;

import com.example.demo.game.DiceGame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 결국 Event Handler에 해당한다.
// 몰컴하다 부모님이 뜨면 자는척 하다가 다시 게임하기 등등
@Controller
public class Html5Css3PageController {
    public static Logger log =
            LoggerFactory.getLogger(Html5Css3PageController.class);

    // 결국 Controller 입장에서의 Event는 무엇인가 ?
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

    // 컨트롤러에 새로운 맵핑을 만들어서
    // 사용자가 URL 요청을 하면
    // 주사위 게임이 동작하게 만들어보자!
    // 웹 페이지 출력은 Success로
    // 위에서 만들었던 "html_css/success.html" 를 활용한다.
    // 아직 게임 결과를 출력할 수 없으니
    // 콘솔창에 게임 결과를 출력하도록 한다.
    @GetMapping("/diceGame")
    public String getDiceGame() {
        log.info("Enter getDiceGame()");

        DiceGame dg = new DiceGame();
        dg.printWinner();

        return "html_css/success.html";
    }

    @GetMapping("/tableTest")
    public String gettableTest() {
        log.info("Enter tableTest()");

        return "html_css/tableTest.html";
    }

    @GetMapping("/mat3by3Test")
    public String getmat3by3Test(){
        log.info("Enter mat3by3Test");

        return "html_css/mat3by3Test.html";
    }
    
    @GetMapping("/tableTest2")
    public String gettableTest2() {
        log.info("Enter tableTest2");

        return "html_css/tableTest2.html";
    }

    @GetMapping("/captionTest")
    public String getcaptionTest() {
        log.info("Enter captionTest");

        return "html_css/captionTest.html";
    }
    @GetMapping("/tableTest3")
    public String gettableTest3() {
        log.info("Enter tableTest3");

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
    public String getImgTest() {
        log.info("Enter getImgSizeTest()");

        return "html_css/imgSizeTest.html";
    }

    @GetMapping("/imgFigcaptionTest")
    public String getFigcaptionTest() {
        log.info("Enter getFigcaptionTest()");

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

    /* iframe 부분에 예상치 못한 오류가 발생중
       스펙 사항이 바뀌었는지 체크할 필요가 있음 */
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
    public String getvisitedTest() {
        log.info("Enter getvisitedTest()");

        return "html_css/visitedTest.html";
    }
    @GetMapping("/roiATagTest")
    public String getRoiATagTest() {
        log.info("Enter getRoiATagTest()");

        return "html_css/roiATagTest.html";
    }

    @GetMapping("/formTest")
    public String getFormTest() {
        log.info("Enter getFormTest()");

        return "html_css/form/formTest.html";
    }

    @GetMapping("/loginFormTest")
    public String getLoginFormTest() {
        log.info("Enter getLoginFormTest()");

        return "html_css/form/loginFormTest.html";
    }

    @GetMapping("/resumeHomework")
    public String getresumeHomework() {
        log.info("Enter getresumeHomework()");

        return "html_css/resume/resumeHomework.html";
    }

    @GetMapping("webFormTest")
    public String getwebFormTest(){
        log.info("Enter webFormTest()");

        return "html_css/form/webFormTest.html";
    }
    @GetMapping("webFormTest2")
    public String getwebFormTest2(){
        log.info("Enter webFormTest2()");

        return "html_css/form/webFormTest2.html";
    }
    @GetMapping("webFormTest3")
    public String getwebFormTest3(){
        log.info("Enter webFormTest3()");

        return "html_css/form/webFormTest3.html";
    }
    @GetMapping("webFormTest4")
    public String getwebFormTest4(){
        log.info("Enter webFormTest4()");

        return "html_css/form/webFormTest4.html";
    }
    @GetMapping("webFormTest5")
    public String getwebFormTest5(){
        log.info("Enter webFormTest5()");

        return "html_css/form/webFormTest5.html";
    }
    @GetMapping("webFormTest6")
    public String getwebFormTest6(){
        log.info("Enter webFormTest6()");

        return "html_css/form/webFormTest6.html";
    }
    @GetMapping("webFormTest7")
    public String getwebFormTest7(){
        log.info("Enter webFormTest7()");

        return "html_css/form/webFormTest7.html";
    }
    @GetMapping("webFormWithSelect")
    public String getwebFormWithSelect(){
        log.info("Enter webFormWithSelect()");

        return "html_css/form/webFormWithSelect.html";
    }
    @GetMapping("webFormOptGroup")
    public String getwebFormOptGroup(){
        log.info("Enter webFormOptGroup()");

        return "html_css/form/webFormOptGroup.html";
    }

    @GetMapping("webFormLegacy")
    public String getwebFormLegacy(){
        log.info("Enter webFormLegacy()");

        return "html_css/form/webFormLegacy.html";
    }
    @GetMapping("webProgressBarTest")
    public String getwebProgressBarTest(){
        log.info("Enter webProgressBarTest()");

        return "html_css/progbar/webProgressBarTest.html";
    }
    @GetMapping("webProgressBarTest2")
    public String getwebProgressBarTest2(){
        log.info("Enter webProgressBarTest2()");

        return "html_css/progbar/webProgressBarTest2.html";
    }
    @GetMapping("spamSampleTest")
    public String getspamSampleTest(){
        log.info("Enter spamSampleTest()");

        return "html_css/css3basic/spamSampleTest.html";
    }

    @GetMapping("/webCSS3Test")
    public String getWebCSS3Test() {
        log.info("Enter getWebCSS3Test()");

        return "html_css/css3basic/webCSS3Test.html";
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

    @GetMapping("/webBorderStyleTest")
    public String getWebBorderStyleTest() {
        log.info("Enter getWebBorderStyleTest()");

        return "html_css/css3basic/webBorderStyleTest.html";
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
    @GetMapping("/webFontTest")
    public String getWebFontTest() {
        log.info("Enter getWebFontTest()");

        return "html_css/css3basic/webFontTest.html";
    }
    @GetMapping("/myFirstPage")
    public String getWmyFirstPage() {
        log.info("Enter getmyFirstPage()");

        return "html_css/css3basic/myFirstPage.html";
    }

    @GetMapping("/webOverflowTest")
    public String getWebOverflowTest() {
        log.info("Enter getWebOverflowTest()");

        return "html_css/overflow/webOverflowTest.html";
    }

    @GetMapping("/webTextBorderTest")
    public String getWebTextBorderTest() {
        log.info("Enter getWebTextBorderTest()");

        return "html_css/border/webTextBorderTest.html";
    }

    @GetMapping("/webCustomUlTest")
    public String getWebCustomUlTest() {
        log.info("Enter getWebCustomUlTest()");

        return "html_css/custom/webCustomUlTest.html";
    }

    @GetMapping("/webBoxTest")
    public String getWebBoxTest() {
        log.info("Enter getWebBoxTest()");

        return "html_css/box/webBoxTest.html";
    }

    @GetMapping("/webBlockInlineTest")
    public String getWebBlockInlineTest() {
        log.info("Enter getWebBlockInlineTest()");

        return "html_css/box/webBlockInlineTest.html";
    }

    @GetMapping("/webNavUlLiBoxTest")
    public String getWebNavUlLiBoxTest() {
        log.info("Enter getWebNavUlLiBoxTest()");

        return "html_css/box/webNavUlLiBoxTest.html";
    }

    @GetMapping("/webNavUlLiBoxTest2")
    public String getWebNavUlLiBoxTest2() {
        log.info("Enter getWebNavUlLiBoxTest2()");

        return "html_css/box/webNavUlLiBoxTest2.html";
    }

    @GetMapping("/webInlineBlockTest")
    public String getWebInlineBlockTest() {
        log.info("Enter getWebInlineBlockTest()");

        return "html_css/box/webInlineBlockTest.html";
    }

    @GetMapping("/webBoxBorderStyleTest")
    public String getWebBoxBorderStyleTest() {
        log.info("Enter getWebBoxBorderStyleTest()");

        return "html_css/box/webBoxBorderStyleTest.html";
    }

    @GetMapping("/webBoxBorderStyleTest2")
    public String getWebBoxBorderStyleTest2() {
        log.info("Enter getWebBoxBorderStyleTest2()");

        return "html_css/box/webBoxBorderStyleTest2.html";
    }

    @GetMapping("/webBoxRoundTest")
    public String getWebBoxRoundTest() {
        log.info("Enter getWebBoxRoundTest()");

        return "html_css/box/webBoxRoundTest.html";
    }

    @GetMapping("/webBoxEllipseTest")
    public String getWebBoxEllipseTest() {
        log.info("Enter getWebBoxEllipseTest()");

        return "html_css/box/webBoxEllipseTest.html";
    }

    @GetMapping("/webBoxSubRoundTest2")
    public String getWebBoxSubRoundTest2() {
        log.info("Enter getWebBoxSubRoundTest2()");

        return "html_css/box/webBoxSubRoundTest2.html";
    }

    @GetMapping("/webBoxMarginTest")
    public String getWebBoxMarginTest() {
        log.info("Enter getWebBoxMarginTest()");

        return "html_css/box/webBoxMarginTest.html";
    }

    @GetMapping("/webBoxPaddingTest")
    public String getWebBoxPaddingTest() {
        log.info("Enter getWebBoxPaddingTest()");

        return "html_css/box/webBoxPaddingTest.html";
    }

    @GetMapping("/webBoxSizingTest")
    public String getWebBoxSizingTest() {
        log.info("Enter getWebBoxSizingTest()");

        return "html_css/box/webBoxSizingTest.html";
    }

    @GetMapping("/webBoxLayoutTest")
    public String getWebBoxLayoutTest() {
        log.info("Enter getWebBoxLayoutTest()");

        return "html_css/box/webBoxLayoutTest.html";
    }

    @GetMapping("/webBoxLayoutTest2")
    public String getWebBoxLayoutTest2() {
        log.info("Enter getWebBoxLayoutTest2()");

        return "html_css/box/webBoxLayoutTest2.html";
    }

    @GetMapping("/webBoxOutlineTest")
    public String getWebBoxOutlineTest() {
        log.info("Enter getWebBoxOutlineTest()");

        return "html_css/box/webBoxOutlineTest.html";
    }

    @GetMapping("/webBoxPositionRelativeTest")
    public String getWebBoxPositionRelativeTest() {
        log.info("Enter getWebBoxPositionRelativeTest()");

        return "html_css/box/webBoxPositionRelativeTest.html";
    }
    @GetMapping("/inAboutme")
    public String getinAboutme() {
        log.info("Enter inAboutme()");

        return "html_css/css3basic/inAboutme.html";
    }
    @GetMapping("/inProblemSolving")
    public String getinProblemSolving() {
        log.info("Enter inProblemSolving()");

        return "html_css/css3basic/inProblemSolving.html";
    }
    @GetMapping("/inCareer")
    public String getinCareer() {
        log.info("Enter inCareer()");

        return "html_css/css3basic/inCareer.html";
    }
    @GetMapping("/inProject")
    public String getinProject() {
        log.info("Enter inProject()");

        return "html_css/css3basic/inProject.html";
    }
    @GetMapping("/boxPractice")
    public String getboxPractice() {
        log.info("Enter boxPractice()");

        return "html_css/css3basic/boxPractice.html";
    }
    @GetMapping("/webMenuDropDownTest")
    public String getwebMenuDropDownTest() {
        log.info("Enter webMenuDropDownTest()");

        return "html_css/Menubar/webMenuDropDownTest.html";
    }
    @GetMapping("/webColumnRuleTest")
    public String getwebColumnRuleTest() {
        log.info("Enter webColumnRuleTest()");

        return "html_css/column-rule/webColumnRuleTest.html";
    }
    @GetMapping("/webCustomTableBorderTest")
    public String getwebCustomTableBorderTest() {
        log.info("Enter webCustomTableBorderTest()");

        return "html_css/border/webCustomTableBorderTest.html";
    }
    @GetMapping("/webCustomTableBorderTest2")
    public String getwebCustomTableBorderTest2() {
        log.info("Enter webCustomTableBorderTest2()");

        return "html_css/border/webCustomTableBorderTest2.html";
    }
    @GetMapping("/webCustomTableBorderTest3")
    public String getwebCustomTableBorderTest3() {
        log.info("Enter webCustomTableBorderTest3()");

        return "html_css/border/webCustomTableBorderTest3.html";
    }
    @GetMapping("/webCustomTableBorderTest4")
    public String getwebCustomTableBorderTest4() {
        log.info("Enter webCustomTableBorderTest4()");

        return "html_css/border/webCustomTableBorderTest4.html";
    }
    @GetMapping("/webCustomTableBorderTest5")
    public String getwebCustomTableBorderTest5() {
        log.info("Enter webCustomTableBorderTest5()");

        return "html_css/border/webCustomTableBorderTest5.html";
    }
    @GetMapping("/webCustomTableBorderTest6")
    public String getwebCustomTableBorderTest6() {
        log.info("Enter webCustomTableBorderTest6()");

        return "html_css/border/webCustomTableBorderTest6.html";
    }
    @GetMapping("/webCustomTableBorderTest7")
    public String getwebCustomTableBorderTest7() {
        log.info("Enter webCustomTableBorderTest7()");

        return "html_css/border/webCustomTableBorderTest7.html";
    }
    @GetMapping("/webPlayMP3Test")
    public String getwebPlayMP3Test() {
        log.info("Enter webPlayMP3Test()");

        return "html_css/multimedia/webPlayMP3Test.html";
    }
    @GetMapping("/webPlayMP4Test")
    public String getwebPlayMP4Test() {
        log.info("Enter webPlayMP4Test()");

        return "html_css/multimedia/webPlayMP4Test.html";
    }
    @GetMapping("/webSelectTest")
    public String getwebSelectTest() {
        log.info("Enter webSelectTest()");

        return "html_css/selector/webSelectTest.html";
    }
    @GetMapping("/webSelectTest2")
    public String getwebSelectTest2() {
        log.info("Enter webSelectTest2()");

        return "html_css/selector/webSelectTest2.html";
    }
    @GetMapping("/webSelectTest3")
    public String getwebSelectTest3() {
        log.info("Enter webSelectTest3()");

        return "html_css/selector/webSelectTest3.html";
    }
    @GetMapping("/webSelectTest4")
    public String getwebSelectTest4() {
        log.info("Enter webSelectTest4()");

        return "html_css/selector/webSelectTest4.html";
    }
    @GetMapping("/webSelectTest5")
    public String getwebSelectTest5() {
        log.info("Enter webSelectTest5()");

        return "html_css/selector/webSelectTest5.html";
    }
    @GetMapping("/webSelectTest6")
    public String getwebSelectTest6() {
        log.info("Enter webSelectTest6()");

        return "html_css/selector/webSelectTest6.html";
    }
    @GetMapping("/webSelectTest7")
    public String getwebSelectTest7() {
        log.info("Enter webSelectTest7()");

        return "html_css/selector/webSelectTest7.html";
    }
    @GetMapping("/webSelectTest8")
    public String getwebSelectTest8() {
        log.info("Enter webSelectTest8()");

        return "html_css/selector/webSelectTest8.html";
    }
   
}