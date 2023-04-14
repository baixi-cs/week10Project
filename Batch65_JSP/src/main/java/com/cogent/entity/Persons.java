package com.cogent.entity;

public class Persons {
	int id;
	String name;
	
	
	
	public Persons() {}
	public Persons(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	public void showimportants() {
		System.out.println("import");
	}

}
