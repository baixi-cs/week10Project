package com.example.springboot.two.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springboot.two.entity.Student;


@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	@Query("SELECT u FROM Student u WHERE u.id = 1")
	Collection<Student> findAllActiveStudents();
	
	@Query(
	value = "SELECT * FROM Student u WHERE u.id = 1", 
			  nativeQuery = true)
			Collection<Student> findAllActiveStudentsNative();
	
	

}
