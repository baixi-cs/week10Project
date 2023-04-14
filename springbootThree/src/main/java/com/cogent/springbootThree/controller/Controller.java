package com.cogent.springbootThree.controller;




import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.springbootThree.Entity.Employee;


@RestController
public class Controller {
	
	@GetMapping("/helloh2")
	String hello() {
		System.out.println("succ****************");
		return"helloh2";
	}


}
