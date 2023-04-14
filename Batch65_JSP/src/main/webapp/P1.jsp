<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <body>
      <table align="center" bgcolor="#faebd7" border="1">
          <tr>
              <td>id</td>
              <td>name</td>
              <td>age</td>
          </tr>
            <!-- list can setAttubute  -->           
          <c:forEach items="${list}" var="stu">
              <tr>
                  <td>${stu.id}</td>
                  <td>${stu.name}</td>
                  <td>${stu.age}</td>
              </tr>
          </c:forEach>
      </table>
  </body>
</html>
