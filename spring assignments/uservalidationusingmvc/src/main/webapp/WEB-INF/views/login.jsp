<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="/validate" method = "post">
	enter user name:<input type="text" name="username"><br>
	enter password:<input type="text" name="username"><br>
	<input type="submit" name="submit"><br>
</form>
${msg}
</body>
</html>