<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="s" value="hai iam ganesh"/>
	length: ${fn:length(s)} <br>
	contains: ${fn:contains(s,'iam')} <br>
	<c:if test="${fn:endsWith(s,'ganesh')}">
		i am gansh
	</c:if>
	
	<c:forEach items="${fn:split(s,' ') }" var="st">
	<br> 
	${st}
	</c:forEach>
	
</body>
</html>