package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;


@CrossOrigin //port 4200 accept
@RestController
public class UserController {
	
	@Autowired
	UserRepository  userRepository;
	

	@GetMapping("/getuser")
	public List<User> getEmployee() {
		
	return userRepository.findAll();    // Select *   ---MySQL JDBC
		
	}
	@PostMapping("/adduser")
	public User addEmployee(@RequestBody User newUser ) {
		System.out.print("add user****************");
		return userRepository.save(newUser);    // Add    ---MySQL JDBC
	}
	


}

