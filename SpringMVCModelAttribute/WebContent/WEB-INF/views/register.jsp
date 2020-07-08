<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration Page :</title>
</head>
<body>
	<form:form action="/SpringMVCModelAttribute/registerSuccess"
		method="post" modelAttribute="user">
		<table>

			<tr>
				<td>User Name</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><form:input path="age" /></td>
			</tr>

			<tr>
				<td>Email</td>
				<td><form:input path="email" /></td>
			</tr>

			<tr>
				<td>Country</td>
				<td><form:select path="country">
						<form:option value="India">India</form:option>
						<form:option value="US">US</form:option>
						<form:option value="Other">Other</form:option>
					</form:select></td>
			</tr>

			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form:form>


</body>
</html>

	<!-- <form action="/SpringMVCPageReDirectionApp/registerSuccess" method="post">
		<table>

			<tr>
				<td>User Name :</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>User age :</td>
				<td><input type="text" name="age" /></td>
			</tr>
			<tr>
				<td>User email :</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>User Country :</td>
				<td><select name="country">
						<option value="India">India</option>
						<option value="USA">USA</option>
						<option value="others">Others</option>

				</select></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>


	</form>
 -->

