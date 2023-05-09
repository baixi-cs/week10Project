package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller       //@RestController
@RequestMapping
public class TestController {

	@RequestMapping("/")   //default Endpoint
	public ModelAndView defaultHome() {
		return new ModelAndView("home"); //JSP home.jsp
	}
	
    @ResponseBody
	@RequestMapping("/hi")   //default Endpoint
	public String defaultHome2() {
		return "hi"; //JSP home.jsp
	}
    
    @ResponseBody
   	@RequestMapping("/amanda")   //default Endpoint
   	public String defaultHome3() {
   		return "Amanda finally cracked it"; //JSP home.jsp
   	}

}
