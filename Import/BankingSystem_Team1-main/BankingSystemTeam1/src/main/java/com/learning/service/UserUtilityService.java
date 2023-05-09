package com.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.entity.Authority;
import com.learning.entity.CustomerInfo;
import com.learning.entity.User;
import com.learning.repo.AuthorityRepository;
import com.learning.repo.CustomerInfoRepository;
import com.learning.repo.UserRepository;



@Service
public class UserUtilityService {

	UserRepository userRepo;
	AuthorityRepository authRepo;
	CustomerInfoRepository customerInfoRepo;
	
	
	@Autowired
	public UserUtilityService(UserRepository userRepo, AuthorityRepository authRepo,
			CustomerInfoRepository customerInfoRepo) {
		super();
		this.userRepo = userRepo;
		this.authRepo = authRepo;
		this.customerInfoRepo = customerInfoRepo;
	}

	public List<User> getUsers() {
		return userRepo.findAll();
	}
	
	public List<Authority> getAuthorities() {
		return authRepo.findAll();
	}
	
	public List<CustomerInfo> getAllCustomerInfo() {
		return customerInfoRepo.findAll();
	}
}
