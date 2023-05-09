package com.example.springboot.two;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springboot.two.controller.Controllers;
import com.example.springboot.two.repository.StudentRepo;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
		
	}
	
	
	@Autowired
	Controllers controllers;
	
	@Test
	void myFirstTestcase() {
		String result = controllers.businessLogic();
		assertEquals("success", result);
		
	}
	
	
//	@Test
//	void myFirstTestcase() {
//		
//		//assertions to mathc with eaxpect ad actual data or result
//		//success---- success
//		assertEquals("successss", "successss");
//	}


}
