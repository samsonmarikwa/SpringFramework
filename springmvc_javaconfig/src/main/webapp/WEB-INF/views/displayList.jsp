<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.samsonmarikwa.spring.springmvc.dto.Employee, java.util.List"
	 %>

<%@ page isELIgnored="false" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display List</title>
</head>
<body>
	<%
	List<Employee> employees = (List<Employee>) request.getAttribute("employees");
	for (Employee employee : employees) {
		out.println(employee.getId());
		out.println(employee.getName());
		out.println(employee.getSalary());
		out.println("<br />");
	}
	%>
</body>
</html>