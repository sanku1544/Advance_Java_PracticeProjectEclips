<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>${msg}</h1>
	<form action="/login-user" method="POST">
	Enter Username:<input type="text" id="username" name="username"><br><br>
	Enter Password:<input type="password" id="password" name="password"><br><br>
	<input type="submit" value="login">
	</form>
</body>
</html>