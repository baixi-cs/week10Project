package com.cogent.springbootThree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.springbootThree.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
