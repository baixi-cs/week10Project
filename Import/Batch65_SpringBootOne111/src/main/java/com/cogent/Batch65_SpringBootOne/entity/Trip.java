package com.cogent.Batch65_SpringBootOne.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table
public class Trip {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	int id;
	
	@NotBlank(message = "name is mandatory")
	String name;
	
	@NotBlank(message = "veg is mandatory")
	boolean veg;
	
//	@Max(value = 10)
	int kids;

	public Trip() {
		
	}
	
	
	public Trip(int id,  String name, boolean veg, int kids) {
		super();
		this.id = id;
		this.name = name;
		this.veg = veg;
		this.kids = kids;
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
	public boolean isVeg() {
		return veg;
	}
	public void setVeg(boolean veg) {
		this.veg = veg;
	}
	public int getKids() {
		return kids;
	}
	public void setKids(int kids) {
		this.kids = kids;
	}


	@Override
	public String toString() {
		return "Trip [id=" + id + ", name=" + name + ", veg=" + veg + ", kids=" + kids + "]";
	}
	
	

}
