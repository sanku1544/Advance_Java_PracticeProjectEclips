<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update page</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<form action="/update-user" method="PUT">
	Enter Id:<input type="number" id="uid" name="uid"><br><br>
	Enter FullName:<input type="text" id="fullname" name="fullname"><br><br>
	Enter Email:<input type="email" id="email" name="email"><br><br>
	Enter Mobile:<input type="number" id="mobile" name="mobile"><br><br>
	Enter Username:<input type="text" id="username" name="username"><br><br>
	Enter Password:<input type="password" id="password" name="password"><br><br>
	<input type="submit" value="Update">
	</form>
</body>
</html>  