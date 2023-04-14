package com.cogent.Batch65_SpringBootOne.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //http methods get defined
public class Controller {
	//end points url for REST API
	
	@GetMapping("/hello")//rescous
	public String hello() {
		return "<h1 style=\"background-color:Orange;\">I love Spring boot</h1>" ;
	}
	@GetMapping("/hi")
	public String hi() {
		return "<h1 style=\"background-color:Blue;\">This is Spring Boot</h1>" ;
	}
	
	@GetMapping("/add")
	public String add() {
		int x = 5;
		int y = 10;
		int result = x+y;
		return "result =" + result;
	}


}
