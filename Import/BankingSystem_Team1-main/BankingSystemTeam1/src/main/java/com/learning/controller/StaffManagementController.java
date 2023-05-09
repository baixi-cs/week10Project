package com.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.entity.Authority;
import com.learning.entity.User;
import com.learning.service.StaffManagementService;



@RestController
@RequestMapping("/api")
public class StaffManagementController {
	
	
	@Autowired
	StaffManagementService staffManagementService;
	
	
	@GetMapping("admin/staff")
	public List<User> getStaff( ) {
		
		return staffManagementService.getStaffUsers();
	}
	
	@PutMapping("admin/staff")
	public ResponseEntity<User> enableOrDisableStaff(@RequestBody User user) {
		
		return staffManagementService.enableOrDisableUserStaff(user.getUsername(), user.isEnabled());
	}

}
