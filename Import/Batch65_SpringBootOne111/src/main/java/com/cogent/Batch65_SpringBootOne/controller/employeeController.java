package com.cogent.Batch65_SpringBootOne.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import com.cogent.Batch65_SpringBootOne.entity.Employee;
import com.cogent.Batch65_SpringBootOne.exception.ResourceNotFoundException;
import com.cogent.Batch65_SpringBootOne.repo.EmployeeRepository;

import jakarta.validation.Valid;


@RestController
public class employeeController {
	
	@Autowired
	EmployeeRepository employeeRepository; 
//	Http post/get/dele/put
	

	
	@PostMapping("/add")
	 Employee addEmployee(@Valid @RequestBody Employee newEmployee) {
		System.out.println("add emp++++++++++++");
	    return employeeRepository.save(newEmployee);
	  }
	
	@GetMapping("/get")
	List<Employee> getEmployee() {	
		System.out.println("get emp-------------");
		return employeeRepository.findAll();	
	}
	
	@GetMapping("/trygetemp")
	public void trygetEmployee() {	
		System.out.println("try emp-------------");
		int i = 10;
		if (i == 10) {
			throw new ResourceNotFoundException(" try data not here"); 
		}
			
	}



	
	@DeleteMapping("/del/{empid}")
	public void deleteEmployee(@PathVariable("empid") int empid ) {
		System.out.println("dele emp*************"+empid);
		if(! employeeRepository.findById(empid).isPresent()) {
			throw new ResourceNotFoundException(" dele id data not here");
		}
		employeeRepository.deleteById(empid);
	}
	

	
//	@PutMapping("/update/{empid}")
//	public ResponseEntity<Employee> updateEmployee(@PathVariable("empid") int empid, @RequestBody Employee empData) {
//		Optional<Employee> existEmp = employeeRepository.findById(empid);
//		if(existEmp.isPresent()) {
//			Employee tempEmp = existEmp.get();
//			tempEmp.setName (empData.getName());
//			tempEmp.setDept (empData.getDept());
//			tempEmp.setSalary (empData.getSalary());
//			return new ResponseEntity<> (employeeRepository.save(tempEmp), HttpStatus.OK);
//		}else {
//			return new ResponseEntity<> (HttpStatus.NOT_FOUND);
//		}
//	}
	@PutMapping("/updateemp/{id}")
	  public ResponseEntity<Employee> updateTutorial(@PathVariable("id") int id, @RequestBody Employee newEmpupdate) {
	    Optional<Employee> existingEmp = employeeRepository.findById(id); //existind old data

	    if (existingEmp.isPresent()) {   // data not blank  then update with New Data
	    	
	      Employee tempEmp = existingEmp.get();
	      
	      tempEmp.setName(newEmpupdate.getName());
	      tempEmp.setDept(newEmpupdate.getDept());
	      tempEmp.setSalary(newEmpupdate.getSalary());
	      return new ResponseEntity<>(employeeRepository.save(tempEmp), HttpStatus.OK);
	      
	    } else {                                //No data with id is Matched
	    	throw new ResourceNotFoundException("DAta Not Threr");
	      //return new ResponseEntity<>( HttpStatus.NOT_FOUND);
	    }
	  }

	
	
}
