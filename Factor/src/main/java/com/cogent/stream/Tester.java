package com.cogent.stream;
import java.sql.SQLException;

public class Tester {

	public static void main(String[] args) throws SQLException  {
		
		// TODO Auto-generated method stub
		BusinessLogic bl = new BusinessLogic();
		bl.createData(1020, "TV", 299.99, 0.08, 560, 450);
		bl.readData();
		
	

	}

}
