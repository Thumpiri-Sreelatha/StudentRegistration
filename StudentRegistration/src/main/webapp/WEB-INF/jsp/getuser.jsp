<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
<style type="text/css">
div{
background-color:lightred;
width:100%;
height:1000px;
}


</style>
</head>
<body>

<div>
	<h3>${msg}</h3>
	<form action="getbyid" method="post">
		User ID : <input type="text" name="userId">
		<input type="submit" value="Get User">
	</form>
</div>

</body>
</html>