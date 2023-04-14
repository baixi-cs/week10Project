package com.example.springboot.two.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.two.entity.Student;


public interface StudentRepo extends JpaRepository<Student, Integer> {}
