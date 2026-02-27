<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Employee</title>

<style>
    body {
        background: linear-gradient(135deg, #4e54c8, #8f94fb);
        font-family: "Poppins", sans-serif;
        min-height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        flex-direction: column;
        padding: 20px;
    }

    .container {
        width: 450px;
        background: white;
        padding: 25px 30px;
        border-radius: 12px;
        box-shadow: 0px 8px 20px rgba(0,0,0,0.2);
        margin-bottom: 30px;
    }

    h2 {
        color: #4e54c8;
        text-align: center;
        margin-bottom: 20px;
    }

    label {
        font-weight: bold;
    }

    input[type="number"],
    input[type="text"],
    input[type="email"],
    input[type="password"] {
        width: 100%;
        padding: 10px;
        margin: 8px 0 15px 0;
        border-radius: 8px;
        border: 1px solid #aaa;
        font-size: 15px;
    }

    input[type="submit"] {
        width: 100%;
        background: #4e54c8;
        color: white;
        padding: 12px;
        border-radius: 8px;
        border: none;
        font-size: 16px;
        cursor: pointer;
        transition: 0.3s;
    }

    input[type="submit"]:hover {
        background: #3c3fa5;
        transform: scale(1.03);
    }

    .details-box {
        width: 450px;
        background: #ffffff;
        padding: 25px 30px;
        border-radius: 12px;
        box-shadow: 0px 8px 20px rgba(0,0,0,0.2);
    }
</style>
</head>

<body>

<!-- SEARCH EMPLOYEE CARD -->
<div class="container">
    <h2>Find Employee</h2>

    <form action="/get-emp" method="GET">
        <label>Enter Employee ID:</label>
        <input type="number" id="eid" name="eid" placeholder="Enter ID" required>
        <input type="submit" value="Get Employee">
    </form>
</div>

<!-- SHOW EMPLOYEE DETAILS ONLY IF FOUND -->
<c:if test="${employee != null}">
<div class="details-box">
    <h2>Employee Details</h2>

    <form>
        <label>ID</label>
        <input type="number" value="${employee.eid}" readonly>

        <label>Name</label>
        <input type="text" value="${employee.name}" readonly>

        <label>Role</label>
        <input type="text" value="${employee.role}" readonly>

        <label>Mobile</label>
        <input type="number" value="${employee.mobile}" readonly>

        <label>Email</label>
        <input type="email" value="${employee.email}" readonly>

        <label>Password</label>
        <input type="password" value="${employee.password}" readonly>
    </form>
</div>
</c:if>

</body>
</html>
