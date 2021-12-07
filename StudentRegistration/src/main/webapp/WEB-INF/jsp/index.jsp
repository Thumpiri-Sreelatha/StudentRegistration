<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>

<style type="text/css">
div{
background-color:lightgreen;
width:100%;
height:1000px;
}
</style>




</head>
<body>
	
	<div align="center">
		<h2 style="color: green">Login Form</h2>
		<h1 style="color: blue">${msg}</h1>
		<form:form action="validate" modelAttribute="user">
			<table>
				<tr>
					<td>User Name :</td>
					<td><form:input path="userName" /></td>
				</tr>

				<tr>
					<td>User Password :</td>
					<td><form:password path="userPassword" /></td>
				</tr>

				<tr>
					<td><input type="submit" value="Login"></td>
					<td><input type="reset" value="Clear"></td>
				</tr>
			</table>
		</form:form>

		<a href="Registration">New User Register Here</a> 
		
		
	</div>

</body>
</html>
