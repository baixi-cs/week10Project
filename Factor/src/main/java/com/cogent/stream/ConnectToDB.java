package com.cogent.stream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;





public class ConnectToDB {
	
	static final String DB_URL = "jdbc:mysql://localhost/Factory";
	static final String USER = "root";
	static final String PASS = "ASDF1qazxsw2@@";
	static Connection conn = null;
	


	public static Connection connectSetUp() {

		try {

			conn = DriverManager.getConnection(DB_URL, USER, PASS);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}


	
	

}