<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
   
<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   page--object  language content attributes.
     --%>

<%@page import = "com.cogent.entity.Persons"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
</head>
<body>
	<h1> Add Something</h1>
	<%@page import = "java.util.Date"; %>
	<%= session.getAttribute("cogentname")%>
	<form  method="post" action="getData.jsp">
	Today is:<%=new Date() %>
	<hr>
	
	

</body>
</html>