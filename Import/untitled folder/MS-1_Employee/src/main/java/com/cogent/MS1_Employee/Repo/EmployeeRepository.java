package com.cogent.MS1_Employee.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.MS1_Employee.Entity.Employee;




public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	//by default lots of methods available that will do some
	//magic to deal with database connect and query...by different ways
}
