package com.cogent.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int empid;
//	@Column(name = "name")
	String name;
	String dept;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addid", referencedColumnName = "addid")
//	@JoinColumn(name = "address_id")
	Address address;
	
	public Employee() {}

	public Employee(int empid, String name, String dept, Address address) {
		super();
		this.empid = empid;
		this.name = name;
		this.dept = dept;
		this.address = address;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", dept=" + dept + ", address=" + address + "]";
	}
	

}
