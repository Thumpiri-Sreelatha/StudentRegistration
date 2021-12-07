<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title> Student Registration </title>
<style type="text/css">
div{
background-color:lightblue;
width:100%;
height:1000px;
}


</style>

</head>
<body>
	<div align ="center">
		<h2 style="color: green">User Registration Form</h2>
		<h1 style="color: blue">${msg}</h1>
		<form:form action="submitform" modelAttribute="user" enctype="multipart/form-data">
		<table>
			<tr>
				<td>User Id :</td>
				<td><form:input path="userId" /></td>
			</tr>

			<tr>
				<td>User Name :</td>
				<td><form:input path="userName" /></td>
			</tr>
			
			<tr>
				<td>User Password :</td>
				<td><form:input path="userPassword" /></td>
			</tr>

			<tr>
				<td> Gender :</td>
				<td><form:radiobutton path="userGender" value="Male" />Male
					<form:radiobutton path="userGender" value="Female" />Female
					<form:radiobutton path="userGender" value="Other" />Other
				</td>
			</tr>
			<tr>
				<td> City :</td>
				<td><form:select path="userCity">
						<option value="">Choose a city..</option>
						<option value="HYB">Hyderabad</option>
						<option value="BLR">Bangalore</option>
						<option value="CHENNAI">Chennai</option>
						<option value="ATP">Anantapur</option>
						<option value="OTHER">Other</option>
				</form:select>
				</td>
			</tr>

			<tr>
				<td> Qualification :</td>
				<td><form:checkbox path="userQualification" value="Diploma" />Diploma
					<form:checkbox path="userQualification" value="UG" />UG 
					<form:checkbox path="userQualification" value="PG" />PG</td>
			</tr>

			<tr>
				<td>Photo :</td>
				<td><input type="file" name="pic"></td>
			</tr>
			<tr>
				<td>Date :</td>
				<td><form:input type="date" path="userDate" />
				
			</tr>

			<tr>
				<td><input type="submit" value="Register User"></td>
				<td><input type="reset" value="Clear"></td>
			</tr>



			</table>
		</form:form>

		<a href="/">Home Page</a>

	</div>

</body>
</html>
