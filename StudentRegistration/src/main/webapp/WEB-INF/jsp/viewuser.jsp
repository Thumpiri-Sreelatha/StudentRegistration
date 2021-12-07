<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Details</title>


<style type="text/css">
div{
background-color:lightblue;
width:100%;
height:1000px;
}


</style>
</head>
<body>

<div align="center">
		<h2 style="color: green">${msg}</h2>
		<table border="1">
			<tr>
				<td>User ID</td>
				<td>User Name</td>
				<td>User Password</td>
				<td>user Gender</td>
				<td>user City</td>
				<td>user Qualification</td>
				<td>Photo</td>
				<td>user Date</td>
				<td>Edit</td>
				<td>Delete</td>
			</tr>



			<c:forEach items="${users}" var="u">
				<tr>
					<td>${u.userId}</td>
					<td>${u.userName}</td>
					<td>${u.userPassword}</td>
					<td>${u.userGender}</td>
					<td>${u.userCity}</td>
					<td>${u.userQualification}</td>
					<td><img alt="No Photo" width="100 height=300" src="data:image/jpg;base64,${u.userPicture}"></img></td>
					<td>${u.userDate}</td>
					<td><a href="updateuser/${u.userId}">Edit</a></td>
					<td><a href="deleteuser/${u.userId}">Delete</a></td>
				</tr>
			</c:forEach>



		</table>
		<a href="home">Home Page</a>
	</div>

</body>
</html>