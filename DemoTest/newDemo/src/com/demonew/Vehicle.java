package com.demonew;



public class Vehicle {
	private String color;
	private String brand;
	private int year;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String color, String brand, int year) {

		this.color = color;
		this.brand = brand;
		this.year = year;
	}
	
	public void process() {
		System.out.println("Vehicle");
		int [] arr = {5, 4, 3, 2, 1};
		
		for (int i= 0; i< 5; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("Vehicle");
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}

