package con.cogen.connectmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectMysql {
	static final String DB_URL = "jdbc:mysql://localhost/cogent65";
	static final String USER = "root";
	static final String PASS = "ASDF1qazxsw2@@";
//	static final String PASS = "1qaz";

//	static final String QUERY = "SELECT * FROM stu";
	static  String QUERY = "SELECT * FROM stu";
//	static final String QUERY2 = "SELECT * FROM courses";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		      // Open a connection
		      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); //connection--interface DriverManager-class
		         Statement stmt = conn.createStatement(); //Statement--interface
		         ResultSet rs = stmt.executeQuery(QUERY); //ResultSet--interface
//		         ResultSet rs2 = stmt.executeQuery(QUERY2);
		    	
		      ) {		      
		         while(rs.next()){
		            //Display values
		            System.out.print("id: " + rs.getInt("id"));
		            System.out.print(", Name: " + rs.getString("name"));
		            System.out.println(", age: " + rs.getInt("age"));   
		            
		         }
			     
		      }catch (SQLException e) {
		         e.printStackTrace();
		      } 
		      
		      //insert
		      try {
		  		
					Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
					Statement stmt = conn.createStatement();
					QUERY="INSERT INTO stu(id, name, age) values (65, \"CICI\", 90)"; //Statement Or Prepared Statement
	  				boolean rs = stmt.execute(QUERY);
				} catch (SQLException e) {
					e.printStackTrace();
				}	
		      //insert 2
		      try {
		  		
					Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
					PreparedStatement stmt=conn.prepareStatement("insert into stu(id, name, age) values(?,?,?)");  
					stmt.setInt(1,118);//1 specifies the first parameter in the query  
					stmt.setString(2,"Le Cai");  
					stmt.setInt(3,19);//1 specifies the first parameter in the query  
				 
					int i=stmt.executeUpdate();  
					System.out.println(i+" records inserted");  

				
				} catch (SQLException e) {
					e.printStackTrace();
				}
		      
		      
				
			}//main	
}//class

