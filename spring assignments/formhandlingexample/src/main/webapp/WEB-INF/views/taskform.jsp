<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="TaskModel" method="POST" action="Task" >
	<table>
				<tr>
					<td>task id:</td>
					<td><form:input path="taskid" /></td>
					<td><form:errors path="taskid" cssClass="error" /></td>
				</tr>
				<tr>
					<td>task Name:</td>
					<td><form:input path="taskname" /></td>
					<td><form:errors path="taskname" cssClass="error" /></td>
				</tr>
				<tr>
					<td>description:</td>
					<td><form:input path="description" /></td>
					<td><form:errors path="description" cssClass="error" /></td>
				</tr>
				<tr>
					<td>status:</td>
					<td><form:input path="status" /></td>
					<td><form:errors path="status" cssClass="error" /></td>
				</tr>
				<tr>
				
				<tr>
					<td colspan="3"><input type="submit" value="Submit" /></td>
				</tr>
	</table>
</form:form>

</body>
</html>