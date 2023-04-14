<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style = "center">
<form name="loginForm" method="post" action="addpost">
    ID: <input type="text" name="id"/> <br/>
    Name: <input type="text" name="name"/> <br/>
    <input type="submit" value="Login" />
</form>

</div>
<hr>
<form name="loginForm" method="get" action="fetch">
    <input type="submit" value="get" />
</form>
<hr>

</body>
</html>
