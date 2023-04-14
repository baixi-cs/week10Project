<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import = "com.cogent.entity.Persons"  %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#ccccff" align = "center">
<h1>
<%   
String name=request.getParameter("username");  
out.print("welcome your registration on Going "+name);  
////// session obj come form HttpSession
session.setAttribute("cogentname", name);


//////

//create Objects of some user defined -- JAVA files 

Persons persons= new Persons();
persons.showimportants();
persons.setId(10023);
persons.setName("Zack");
%>
</h1>

<p>

<%= session.getAttribute("cogentname")%>
</p>



</body>
</html>