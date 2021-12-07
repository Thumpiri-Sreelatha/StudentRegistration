<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Registration Details</title>
<style type="text/css">
div{
background-color:lightred;
width:100%;
height:1000px;
}


</style>
</head>
<body>

	<div align="center">
	<h3>User ID : ${user.userId}</h3>
	<h3>User Name : ${user.userName}</h3>
	<h3>User Age : ${user.userGender}</h3>
	<h3>User City : ${user.userCity}</h3>
	<h3>User City : ${user.userQualification}</h3>
	<h3>User Photo : <img width="300 height=300" src="data:image/jpg;base64,${user.userPicture}"></img></h3>
	<h3>User Date : ${user.userDate}</h3>
	
	<a href="home">Home Page</a>
	</div>

</body>
</html>