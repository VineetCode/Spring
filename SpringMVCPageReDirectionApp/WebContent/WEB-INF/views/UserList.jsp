<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">User Management Application</h2>
	<div align="center" >
		<table border="2" cellpadding="5" bordercolor="RED">
			<caption>
				<h3>List of Users</h3>
			</caption>
			<tr color="yellow">
				<th>Name</th>
				<th>Age</th>
				<th>Email</th>
				<th>Country</th>
			</tr>
			<c:forEach var="user" items="${userLists}">
				<tr>
					<th><c:out value="${user.name}" /></th>
					<th><c:out value="${user.age}" /></th>
					<th><c:out value="${user.email}" /></th>
					<th><c:out value="${user.country}" /></th>
				</tr>


			</c:forEach>




		</table>




	</div>
</body>
</html>