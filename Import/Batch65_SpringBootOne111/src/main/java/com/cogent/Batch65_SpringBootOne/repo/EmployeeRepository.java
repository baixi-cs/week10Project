package com.cogent.Batch65_SpringBootOne.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.Batch65_SpringBootOne.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	//by default Lots of Methods Available that will do Some 
	//Magic to deal with database Connect and Query....by differen ways

}
