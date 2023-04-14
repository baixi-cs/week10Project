<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>

</head>
<body bgcolor="#ccccff" >
<div align = "center">
<H1>Header</H1>

	<h1 >Login</h1>
	
		<form  method="post" action="success.jsp">
			
			username: <input type="text" id="username" name="username" placeholder="Enter your username.">
			<br>
			password: <input type="password" id="password" name="password" placeholder="Enter your password">
			<br>
			<input type="submit" value="Login" >
		
			
		</form>
		<%-- <jsp:include page = "getData.jsp" /> --%>
		<%@include file = 'getData.jsp' %>
	</div>
	

<H1>footer</H1>
</body>

</html>