<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="demo.jsp" %><br>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%!int a =10; %>
</head>
<body>
 	<%out.println(a);%><br>
 	my fav no is <%=a/0 %>
</body>
</html>