<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management System</title>

<link rel="stylesheet" type="text/css" href="/style.css">

<style>
    body {
        background: linear-gradient(135deg, #4e54c8, #8f94fb);
        font-family: "Poppins", sans-serif;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .container {
        background: white;
        width: 450px;
        padding: 30px;
        text-align: center;
        border-radius: 12px;
        box-shadow: 0 8px 20px rgba(0,0,0,0.25);
    }

    h1 {
        color: #4e54c8;
        margin-bottom: 25px;
    }

    .btn {
        display: block;
        background: #4e54c8;
        color: white;
        padding: 14px;
        text-decoration: none;
        margin: 12px 0;
        border-radius: 8px;
        font-size: 18px;
        transition: 0.3s;
    }

    .btn:hover {
        background: #3b3fa5;
        transform: scale(1.05);
        box-shadow: 0 6px 15px rgba(0,0,0,0.2);
    }
</style>

</head>

<body>

<div class="container">
    <h1>Employee Management</h1>

    <a href="login" class="btn">Login Employee</a>
    <a href="register" class="btn">Register Employee</a>
    <a href="update" class="btn">Update Employee</a>
    <a href="delete" class="btn">Delete Employee</a>
    <a href="getEmp" class="btn">Get Employee By ID</a>
    <a href="getAll" class="btn">Get All Employees</a>
</div>

</body>
</html>