package com.cogent.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int addid;
	String city;
	String addLine1;
	
//	@OneToOne
//	@MapsId
//	Employee employee;
////	
//	
	public Address() {}
	public Address(int addid, String city, String addLine1) {
		super();
		this.addid = addid;
		this.city = city;
		this.addLine1 = addLine1;
	}
	
	
	
	public int getAddid() {
		return addid;
	}
	public void setAddid(int addid) {
		this.addid = addid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddLine1() {
		return addLine1;
	}
	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}
	
	@Override
	public String toString() {
		return "Address [addid=" + addid + ", city=" + city + ", addLine1=" + addLine1 + "]";
	}
	

	
	
	
	
	

}
