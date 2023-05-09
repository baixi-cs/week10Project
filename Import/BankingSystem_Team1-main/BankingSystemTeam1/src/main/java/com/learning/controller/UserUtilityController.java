package com.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.entity.Authority;
import com.learning.entity.CustomerInfo;
import com.learning.entity.User;
import com.learning.service.UserUtilityService;



@RestController
@RequestMapping("/api/util")
public class UserUtilityController {
	
	@Autowired
	UserUtilityService userUtilService;
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return userUtilService.getUsers();
	}
	
	@GetMapping("/authorities")
	public List<Authority> geAuthorities() {
		return userUtilService.getAuthorities();
	}
	
	@GetMapping("/customerinfos")
	public List<CustomerInfo> getCustomerInfos() {
		return userUtilService.getAllCustomerInfo();
	}
}
