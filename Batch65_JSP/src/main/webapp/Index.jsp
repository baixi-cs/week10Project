<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<H1>Hello World!!!</H1>

<%! int var = 10; 
int n1 =10; int n2 = 20;int var2 = n1+n2; %> <!--declare variables.  -->
<% out.println("var2: "+ var2);%> 
<hr>
<p style="background-color:tomato">
<%! int count =10; %>
<% out.println("The Number is: " +count); %> <br>
<%! String name = "Alan"; %><hr>
<% out.println("Hello " + name); %>
<hr>
<% int count2 =10; 
out.println("The Number2 is " +count2); %> 
<%=21 %><br/>
<%="可以输出字符串" %>
</p>
<%  response.sendRedirect("http://www.google.com");  %> 
<%@ page isErrorPage="true" %>  
     <html>  
     	<body>  
                  		Sorry following exception occurred:<%= exception %>  
     	</body>  
     </html>  

</body>
</html>