package com.demonew;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle("white", "Van", 2008);
		int year = v.getYear();
		System.out.println(year);
		Car c = new Car("red","Honda",2003 );
		c.process();
		
		v.process();

	}

}
