<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>

<%@ page isELIgnored="false" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Object Details</title>
</head>
<body>
	<!-- JSP Expression -->
	<%= request.getAttribute("employee") %>
	<br />
	Id: <b>${employee.id}</b><br />
	Name: <b>${employee.name}</b><br />
	Salary: <b>${employee.salary}</b>
</body>
</html>