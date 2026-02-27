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
	<form action="/register-emp" method="POST">
	<h2>Employee Registration</h2>
	Enter Name:<input type="text" id="name" name="name"><br>
	Enter Role:<input type="text" id="role" name="role"><br>
	Enter Mobile:<input type="number" id="mobile" name="mobile"><br>
	Enter Email:<input type="email" id="email" name="email"><br>
	Enter Password:<input type="password" id="password" name="password"><br>
	<input type="submit" value="Register">
	</form>
</body>
</html>