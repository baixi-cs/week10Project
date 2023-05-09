package com.example.springboot.two.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.two.entity.Student;
import com.example.springboot.two.repository.StudentRepo;

import com.example.springboot.two.service.MyServiceClass;

import jakarta.validation.Valid;



@RestController
//@Controller
@RequestMapping(value="api/")
public class Controllers {
	
	
//	@Autowired
//	MyServiceClass msc;
//
//	
//	@GetMapping("/hello")
//	@ResponseBody
//    public String hello() {
//		int res = msc.factorial(5);
//		System.out.print(msc.sayService());
//		
//		return "hi, controller,"  + " factorial = "+ res ;
//    }
//	
//	@Autowired
//	myRepo mr;
//	@GetMapping("/repo" )
//    @ResponseBody
//    public String repo()
//    {
//    	
//    	int res= mr.disp();
//        return "Hello All ,Exporing Stereotype REpo "+ res;
//    }
//	
//	 @RequestMapping(value = "/info", method = RequestMethod.GET)
//	    @ResponseBody
//	    public String getFoosBySimplePath() {
//		 	
//	        return "get some info about http method";
//	    }
	 
//	 @RequestMapping(value = "/hi", method = RequestMethod.GET)
//	    @ResponseBody
//	    public String hello() {
//	        return "hello";
//	    }
//	
	@Autowired
	StudentRepo stuRepo;
//	
//	
	@PostMapping("/addstu")
	public @ResponseBody Student register(@Valid @RequestBody Student student) {
		System.out.println("add student");
		return stuRepo.save(student);
	}

	@GetMapping("/getstu")
	@ResponseBody
	public List<Student> getStudent() {
		System.out.println("get students");
		return stuRepo.findAll();    // Select *   ---MySQL JDBC
		
	}
	
	
	@GetMapping("/getjpql")
	@ResponseBody
	public List<Student> getJPQL() {
		return (List<Student>) stuRepo.findAllActiveStudents();
	}
	
	@GetMapping("/getnative")
	@ResponseBody
	public List<Student> getNative() {
		return (List<Student>) stuRepo.findAllActiveStudentsNative();
	}


}
