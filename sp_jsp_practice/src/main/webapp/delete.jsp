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
	
	<form action="/delete-emp" method="DELETE">
	<h2>Employee Delete</h2>
	Enter Id:<input type="number" id="eid" name="eid"><br>
	<input type="submit" value="Delete">
	</form>
</body>
</html>