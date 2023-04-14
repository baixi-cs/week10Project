package com.cogent.servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
	
import java.sql.SQLException;

import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addpost")
public class ServletPost extends HttpServlet {

		private static final long serialVersionUID = 1L;
		static final String DB_URL = "jdbc:mysql://localhost/School";
		static final String USER = "root";
		static final String PASS = "ASDF1qazxsw2@@";
		final String DRIVER = "com.mysql.cj.jdbc.Driver";
		Connection conn = null;

		public void init() throws ServletException {

			// Database connection through Driver Manager
			try {
				Class.forName(DRIVER);
				conn = DriverManager.getConnection(DB_URL, USER, PASS);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}

		}
		protected void doPost(HttpServletRequest request,
	            HttpServletResponse response) throws ServletException, IOException {
	         
	        // read form fields
	    	response.setContentType("text/html");
	    	//((ServletResponse) request).setContentType("text/html");
	        String id = request.getParameter("id");
	        String name = request.getParameter("name");
	         
	        System.out.println("username: " + id);
	        System.out.println("password: " + name);
	 
	        // do some processing here...
	         
	        // get response writer
	        PrintWriter writer = response.getWriter();
	         
	        // build HTML code
	        String htmlRespone = "<html>";
	        htmlRespone += "<h2>Your id is: " + id + "<br/>";      
	        htmlRespone += "Your name is: " + name + "</h2>";    
	        htmlRespone += "</html>";
	        
	        //////////////////logic to add to database //////
	        try {
	   
			PreparedStatement stmt=conn.prepareStatement("insert into classmates(sid, sname)values(?,?)");  
			stmt.setInt(1,Integer.parseInt(id));//1 specifies the first parameter in the query  
			stmt.setString(2,name);  
			  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records inserted");  
	        }catch(Exception e) {
	        	System.out.println("something Wrong");
	        }
	        /////////////////////////////////////////////////
	        
	        // return response
	        writer.println(htmlRespone);
	         
	    }

		
//		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//			response.setContentType("text/html");
//			PrintWriter out = response.getWriter();
//			int id = Integer.parseInt(request.getParameter("id"));
//			String name = request.getParameter("sname");
//			System.out.println(" front end +sid"+ id );
//			System.out.println(" front end +sname"+ name );
//
//		
//			
//			response.getWriter().print("response to back end");
//			PreparedStatement pstmt;
//			try {
//				// Set the response content type and
//				// get the PrintWriter object.
//				
//				
//				// Create JDBC statement object, construct
//				// the SQL query and execute the query.
//				pstmt = conn.prepareStatement("insert into classmates(id, name) values(?,?)");
//				pstmt.setInt(1, id);
//				pstmt.setString(2, name);
//				int idx = pstmt.executeUpdate();
//				System.out.println(idx+" records inserted");  
//				 
//				// Loop through the result set to
//				// retrieve the individual data items.
//
//				
//				pstmt.close();
//				out.close();
//
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			response.getWriter().print("success");
//
//		}


		public void destroy() {

			// Close connection object.
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

