package com.cogent.stream;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.List;



public class BusinessLogic {
	
	Connection conn= null;
	PreparedStatement pstmt;
	Statement stmt;
	int idx;
	
	
	    //Insert
	void createData(int id, String name, double cost, double discount, int available, int sold) throws SQLException {	
		conn = ConnectToDB.connectSetUp();
		pstmt=conn.prepareStatement("insert into Products values(?,?,?,?,?,?)");  
		pstmt.setInt(1, id);//1 specifies the first parameter in the query  
		pstmt.setString(2, name);  
		pstmt.setDouble(3, cost);  
		pstmt.setDouble(4, discount); 
		pstmt.setInt(5, available); 
		pstmt.setInt(6, sold); 
		//1 specifies the first parameter in the query  
	 
		idx=pstmt.executeUpdate();  
		System.out.println(idx+" records inserted");  
		
	}
	
	//select
	void readData() throws SQLException {
		conn = ConnectToDB.connectSetUp(); //connection--interface DriverManager-class
        Statement stmt = conn.createStatement(); //Statement--interface
        ResultSet rs = stmt.executeQuery("SELECT * FROM Products"); //ResultSet--interface
     	   
        ArrayList <Products> bkt = new ArrayList<Products>();
        
        while(rs.next()){
        	
           //Display values
//           System.out.print("id: " + rs.getInt("id"));
//           System.out.print(", name: " + rs.getString("name"));
//           System.out.print(", cost: " + rs.getDouble("cost"));
//           System.out.print(", discount: " + rs.getDouble("discount"));
//           System.out.print(", available: " + rs.getInt("available"));
//           System.out.print(", sold: " + rs.getInt("sold"));
//             
           bkt.add(new Products( rs.getInt("id"), 
        		   				 rs.getString("name"), 
        		   				 rs.getDouble("cost"), 
        		   				 rs.getDouble("discount"), 
        		   				 rs.getInt("available"),
        		   				 rs.getInt("sold")));
           
        }
        
        System.out.println("Records are now in Collection");
        System.out.println(bkt);
        System.out.println(":::::::::::::::::::Records are now in Collection");
        bkt.stream().forEach(System.out::println);
        
        
        System.out.println(":::::::::::::::::::show per discount");
        List<Products> discountBkt = bkt.stream()
        		.sorted(Comparator.comparing(Products::getDiscount))
        		.collect(Collectors.toList());
        
        discountBkt.stream().forEach(System.out::println);
        
        System.out.println(":::::::::::::::::::show per item sold");
        List<Products> soldBkt = bkt.stream()
        		.sorted(Comparator.comparing(Products::getSold))
        		.collect(Collectors.toList());
        
        soldBkt.stream().forEach(System.out::println);
        
        System.out.println(":::::::::::::::::::show per item cost");
        List<Products> costBkt = bkt.stream()
        		.sorted(Comparator.comparing(Products::getCost))
        		.collect(Collectors.toList());
        		
        costBkt.stream().forEach(System.out::println);
        
        
        System.out.println(":::::::::::::::::::show increase discount if < 0.1");
        bkt.stream().filter(p->p.sold < 0.1).forEach(System.out::println);
        bkt.stream().filter(p->p.sold < 0.1).forEach(p->p.setDiscount(p.getDiscount()+0.1));
        
        bkt.stream().forEach(System.out::println);
        
        
        
	}


}
