<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page import="java.io.*,java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>this is jstl</h1>

<div>
<%-- <c:set var="income" scope="session" value="${4000*4}" />
	<c:if test="${income > 8000}">
		<p>
			My income is:
			<c:out value="${income}" />
		<p>
	</c:if>

<c:forEach var="idx" begin="10" end="20">  
   Item <c:out value="${idx}"/><p>  
</c:forEach>  --%>

<%-- <c:set var="url" value="-10" scope="request"/>  
  <c:if test="${url<1}">  
     <c:redirect url="http://google.com"/>  
  </c:if>  
   <c:if test="${url>1}">  
     <c:redirect url="http://facebook.com"/>  
   </c:if>  
    --%>
   
    <c:set var="String" value="Welcome to JSP programming" />
 
 <c:if test="${fn:endsWith(String, 'programming')}">
 <p> end with programming<p>
</c:if>
<c:if test="${fn:endsWith(String, 'JSP')}">
 <p> end with JSP<p>
 </c:if>
 <p>origin：<c:out value="${String}" /></p>
 <c:set var="text1" value="${fn:split(String,' ')}" />
 <p>change to：<c:out  value="${fn:join(text1,'-')}" /></p>
  
  
  
  
  
  
  
<%--  </c:if>
  <c:set var="text" value="I am a boy" />
    <c:out value="${text}" /><br>
    <c:if test="${fn:containsIgnoreCase(text,'GIRL')}">
        <p><c:out value="has 'GIRL' in it." /></p>
    </c:if>
    <c:if test="${fn:containsIgnoreCase(text,'BOY')}">
        <p><c:out value="has 'BOY' in it." /></p>
    </c:if>



  <c:set var="text" value="I am a boy" />
    <c:out value="${text}" /><br>
    <c:if test="${fn:containsIgnoreCase(text,'GIRL')}">
        <p><c:out value="has 'GIRL' in it." /></p>
    </c:if>
    <c:if test="${fn:containsIgnoreCase(text,'BOY')}">
        <p><c:out value="has 'BOY' in it." /></p>
    </c:if>
    
    <c:set var="text" value="I am a girl" />
    <p>origin：<c:out value="${text}" /></p>
    <c:set var="text1" value="${fn:split(text,' ')}" />
    <p>change to：<c:out  value="${fn:join(text1,'-')}" /></p>
     --%>
    
 
</div>


</body>
</html>