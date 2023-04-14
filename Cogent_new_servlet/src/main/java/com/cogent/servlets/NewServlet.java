package com.cogent.servlets;

import javax.servlet.*;

import javax.servlet.annotation.WebServlet;

import java.io.*;
@WebServlet("/lifecycle")   //Annotation- used to configure some setting
                           //they start with @ symbol
// now creating a servlet by implementing Servlet interface
public class NewServlet implements Servlet {

	ServletConfig config = null;
	
	
	// init method
	public void init(ServletConfig sc)
	{
		config = sc;
		System.out.println("in init() method");
		
	}

	// service method
	public void service(ServletRequest req, ServletResponse res)
		throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<h2>hello from life cycle servlet</h2>");
		System.out.println("in service");
	}

	// destroy method
	public void destroy()
	{
		System.out.println("in destroy");
	}
	public String getServletInfo()
	{
		return "LifeCycleServlet";
	}
	public ServletConfig getServletConfig()
	{
		return config; // getServletConfig
	}

	
}

