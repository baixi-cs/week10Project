package com.cogent.systematic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class BusinessLogic {
	
	Connection conn= null;
	PreparedStatement pstmt;
	Statement stmt;
	int idx;
	
	
	
	    //Insert
	void createData() throws SQLException {	
		conn = ConnectToDB.connectSetUp();
		pstmt=conn.prepareStatement("insert into classmates(sid, sname) values(?,?)");  
		pstmt.setInt(1,81);//1 specifies the first parameter in the query  
		pstmt.setString(2,"Nanna");  
		;//1 specifies the first parameter in the query  
	 
		idx=pstmt.executeUpdate();  
		System.out.println(idx+" records inserted");  
		
	}
	
	//select
	void readData() throws SQLException {
		conn = ConnectToDB.connectSetUp(); //connection--interface DriverManager-class
        Statement stmt = conn.createStatement(); //Statement--interface
        ResultSet rs = stmt.executeQuery("SELECT * FROM classmates"); //ResultSet--interface
     	   
        ArrayList <classmates> bkt = new ArrayList<classmates>();
        
        while(rs.next()){
           //Display values
           System.out.print("id: " + rs.getInt("sid"));
           System.out.print(", Name: " + rs.getString("sname"));
             
//           bkt.add(new classmates(rs.getInt("sid"), rs.getString("sname"));
           System.out.println("Records are now in Collection");
           System.out.println(bkt);
           System.out.println(":::::::::::::::::::");
           bkt.stream().limit(3).forEach(System.out::println);
           
        }
	}
	
	void updateData()throws SQLException {
		conn = ConnectToDB.connectSetUp();
		pstmt=conn.prepareStatement("update classmates set name = ? where sid = 102 ");
		pstmt.setString(1, "XXXXX");
		
		
		idx = pstmt.executeUpdate();  
		System.out.println(idx+" records update"); 
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM classmates"); 
		while(rs.next()){
	           //Display values
	           System.out.print("id: " + rs.getInt("sid"));
	           System.out.print(", Name: " + rs.getString("sname"));
	             
	        }
	        
		
		
	}
	void deleteData()throws SQLException {
		conn = ConnectToDB.connectSetUp();
		pstmt=conn.prepareStatement("DELETE FROM classmates where sid = ?");
		pstmt.setInt(1, 105);
		
		
		idx = pstmt.executeUpdate();  
		System.out.println(idx+" records delete"); 
		
	}


}
