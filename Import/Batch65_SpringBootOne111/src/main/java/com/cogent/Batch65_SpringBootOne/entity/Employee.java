package com.cogent.Batch65_SpringBootOne.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;

//few addtion annotation need to make it
//ORM-object relational mapping

@Entity
@Table //(name = "Emp")
public class Employee {
	
	@Id //primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	@NotBlank(message = "name is mandatory")
	String name;
	
	@NotBlank(message = "dept is mandatory")
	String dept;
	
	@Max(value= 100000)
	float salary;
	
	public Employee() {
	}


	public Employee(int id, String name, String dept, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
	

}
