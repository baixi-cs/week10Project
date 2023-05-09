package procedurecall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Example1 {
	static final String DB_URL = "jdbc:mysql://localhost/Cogent";
	static final String USER = "root";
	static final String PASS = "ASDF1qazxsw2@@";
//	static final String PASS = "1qaz";

//	static final String QUERY = "SELECT * FROM stu";
	static  String QUERY = "call myFirstStoredProduce()";
//	static final String QUERY2 = "SELECT * FROM courses";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		      // Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			conn.setAutoCommit(false);
			stmt.execute("insert into dummy values(16 ,'some info 16')");
			conn.commit();
			
			conn.setAutoCommit(true);
			stmt.execute("insert into dummy values(17 ,'some info 17')");
			
			conn.setAutoCommit(false);
			conn.rollback();
			
			stmt.execute("insert into dummy values(18 ,'some info 18')");
			conn.commit();
			
			
			System.out.println("Batch executed successfully!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

		      
		      
		      
				
			}//main	
//class

