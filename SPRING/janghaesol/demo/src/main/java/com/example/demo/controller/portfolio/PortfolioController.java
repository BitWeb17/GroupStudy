package com.example.demo.controller.portfolio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/param/board")
public class PortfolioController {
    private static final Logger log =
    LoggerFactory.getLogger(PortfolioController.class);

        @RequestMapping(value = "/get",
                    method = RequestMethod.GET, params = "inAboutme")
        public String getinAboutmeForm(){
            log.info("/get?inAboutme");

            return "individual/portfolio/inAboutme.html";
        }   

        @RequestMapping(value = "/get",
        method = RequestMethod.GET, params = "myFirstPage")
        public String getmyFirstPageForm(){
        log.info("/get?myFirstPage");

        return "individual/portfolio/myFirstPage.html";
        }   
        
        @RequestMapping(value = "/get",
        method = RequestMethod.GET, params = "inCareer")
        public String getinCareerForm(){
        log.info("/get?inCareer");

        return "individual/portfolio/inCareer.html";
        }  

        @RequestMapping(value = "/get",
        method = RequestMethod.GET, params = "inProblemSolving")
        public String getinProblemSolvingForm(){
        log.info("/get?inProblemSolving");

        return "individual/portfolio/inProblemSolving.html";
        }  

        @RequestMapping(value = "/get",
        method = RequestMethod.GET, params = "inProject")
        public String getinProjectForm(){
        log.info("/get?inProject");

        return "individual/portfolio/inProject.html";
        }  
    
         


        @RequestMapping(value ="/post",
                    method = RequestMethod.POST, params = "inAboutme")
        public String doinAboutme(){
            log.info("/post(inAboutme");

            return "individual/portfolio/myFirstPage.html";
        }
}