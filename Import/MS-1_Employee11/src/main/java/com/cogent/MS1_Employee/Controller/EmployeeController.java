package com.cogent.MS1_Employee.Controller;

import java.util.List;


import java.util.Optional;

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

import com.cogent.MS1_Employee.Repo.EmployeeRepository;
import com.cogent.MS1_Employee.Entity.Employee;
import com.cogent.MS1_Employee.Exceptions.ResourceNotFoundException;

import javax.validation.Valid;

@RestController
public class EmployeeController {

	// HTTP Methods
	// GET
	// POST
	// DELETE
	// PUT

	@Autowired
	EmployeeRepository employeeRepository;

	@PostMapping("addemp")      //@Valid activates validation
	public Employee addEmployee(@Valid @RequestBody Employee newEmployee) {
		System.out.println("Adding record to database");
		return employeeRepository.save(newEmployee);

	}

	@GetMapping("getemp")
	public List<Employee> getEmployee() {

		return employeeRepository.findAll();

	}

	@DeleteMapping("deleteemp/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {
		employeeRepository.deleteById(id);
	}


	
	@PutMapping("/updateemp/{id}")
	  public ResponseEntity<Employee> updateTutorial(@PathVariable("id") int id, @RequestBody Employee newEmpupdate) {
	    Optional<Employee> existingEmp = employeeRepository.findById(id); //existing old data

	    if (existingEmp.isPresent()) {   // data not blank  then update with New Data
	    	
	      Employee tempEmp = existingEmp.get();
	      
	      tempEmp.setName(newEmpupdate.getName());
	      tempEmp.setDept(newEmpupdate.getDept());
	      tempEmp.setSalary(newEmpupdate.getSalary());
			return new ResponseEntity<>(employeeRepository.save(tempEmp), HttpStatus.OK);
	      
	    } else {                                //No data with id is Matched
	    	throw new ResourceNotFoundException("Data Not there");
	      //return new ResponseEntity<>( HttpStatus.NOT_FOUND);
	    }
	  }
	
	
	@GetMapping("trygetemp")
	public void tyrgetEmployee() {

		int i = 10;
		if(i == 10) {
			throw new ResourceNotFoundException("Data not there.");
		}

	}

}
