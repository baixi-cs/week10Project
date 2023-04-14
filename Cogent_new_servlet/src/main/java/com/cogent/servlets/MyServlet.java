package com.cogent.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetch")
public class MyServlet extends HttpServlet {

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
//	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		int id = Integer.parseInt(request.getParameter("id"));
//		String name = request.getParameter("sname");
//		out.println(" front end +sid"+ id + "sname" + name );
//
//		// Set up HTML table formatting for the output
//		out.println("<html><body>");
//		out.println("<h3>Insert classmates :</h3>");
//		
//		response.getWriter().print("response to back end");
//		PreparedStatement pstmt;
//		try {
//			// Set the response content type and
//			// get the PrintWriter object.
//			
//			
//			
//			// Create JDBC statement object, construct
//			// the SQL query and execute the query.
//			pstmt = conn.prepareStatement("insert into classmates(id, name) values(?,?)");
//			pstmt.setInt(1, id);
//			pstmt.setString(2, name);
//			int idx = pstmt.executeUpdate();
//			System.out.println(idx+" records inserted");  
//			 
//			// Loop through the result set to
//			// retrieve the individual data items.
//
//			
//			pstmt.close();
//			out.close();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			// Set the response content type and
			// get the PrintWriter object.
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			// Set up HTML table formatting for the output
			out.println("<html><body>");
			out.println("<h3>Stu Details</h3>");
			out.println("<table border=1><tr>" + "<td><b>id</b></td>" + "<td><b>names</b></td> ");

			// Create JDBC statement object, construct
			// the SQL query and execute the query.
			Statement stmt = conn.createStatement();
			String sql = "select * from classmates";
			ResultSet rs = stmt.executeQuery(sql);

			// Loop through the result set to
			// retrieve the individual data items.
			while (rs.next()) {
				int id = rs.getInt("sid");
				String name = rs.getString("sname");
				
//				String processor = rs.getString("processor");
//				float screenSize = rs.getFloat("screensize");
//				String osystem = rs.getString("operatingsystem");
//				int batteryLife = rs.getInt("batterylife");

				out.println("<tr>" + "<td>" + id + "</td>" + "<td>" + name + "</td>" );

			}
			out.println("</table></body></html>");

			// Close Result set, Statement
			// and PrintWriter objects.
			rs.close();
			stmt.close();
			out.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void destroy() {

		// Close connection object.
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

