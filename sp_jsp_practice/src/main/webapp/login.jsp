<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index page</title>
<link rel="stylesheet" type="text/css" href="/style.css">
</head>
<body>
	<h1>${msg}</h1>
	<form action="/login-emp" method="POST">
	<h2>Employee Login</h2>
	Enter Email:<input type="email" id="email" name="email"><br>
	Enter Password:<input type="password" id="password" name="password"><br>
	<input type="submit" value="Login">
	</form>
</body>
</html>