<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register page</title>
<link rel="stylesheet" type="text/css" href="/style.css">
</head>
<body>
	<form action="/update-emp" method="PUT">
	<h2>Employee Update</h2>
	Enter Id:<input type="number" id="eid" name="eid"><br>
	Enter Name:<input type="text" id="name" name="name"><br>
	Enter Role:<input type="text" id="role" name="role"><br>
	Enter Mobile:<input type="number" id="mobile" name="mobile"><br>
	Enter Email:<input type="email" id="email" name="email"><br>
	Enter Password:<input type="password" id="password" name="password"><br>
	<input type="submit" value="Update">
	</form>
</body>
</html>