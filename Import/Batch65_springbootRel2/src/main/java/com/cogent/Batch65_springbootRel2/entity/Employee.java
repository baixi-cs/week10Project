package com.cogent.Batch65_springbootRel2.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee_Dtls")

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
	@SequenceGenerator(initialValue = 1, name = "emp_seq", sequenceName = "employee_sequence")
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	  
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	@JsonIgnore  
	   
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL) //added here Amit
	@JoinColumn(foreignKey = @ForeignKey(name = "dept_id"), name = "dept_id")
	private Department department;
	   
	public Employee() {}

	public Employee(Integer id, String name, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	   
	   
	
	   
}
