package com.example.employee.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseBody;


import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepo;



import jakarta.validation.Valid;



//@RestController
@Controller
//@RequestMapping(value="api/")
public class Controllers {
	
	@Autowired
	EmployeeRepo empRepo;
//	
//	
	@PostMapping("/add")
	public @ResponseBody Employee register(@Valid @RequestBody Employee student) {
		System.out.println("add student");
		return empRepo.save(student);
	}

	@GetMapping("/get")
	@ResponseBody
	public List<Employee> getStudent() {
		System.out.println("get students");
		return empRepo.findAll();    // Select *   ---MySQL JDBC
		
	}
	
	



}
