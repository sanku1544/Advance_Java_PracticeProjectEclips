<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>

<link rel="stylesheet" type="text/css" href="/css/style.css">

<style>
    body {
        background: linear-gradient(135deg, #4e54c8, #8f94fb);
        font-family: "Poppins", sans-serif;
        padding: 30px;
    }

    h1 {
        text-align: center;
        color: white;
        margin-bottom: 20px;
        font-size: 36px;
        letter-spacing: 1px;
    }

    table {
        width: 90%;
        margin: auto;
        border-collapse: collapse;
        background: white;
        border-radius: 12px;
        overflow: hidden;
        box-shadow: 0 6px 15px rgba(0,0,0,0.2);
    }

    th {
        background: #4e54c8;
        color: white;
        padding: 14px;
        font-size: 18px;
        text-align: center;
    }

    td {
        padding: 12px;
        text-align: center;
        font-size: 16px;
        border-bottom: 1px solid #ddd;
    }

    tr:hover {
        background: #f3f3f3;
        transition: 0.2s;
    }
</style>

</head>

<body>

<h1>Employee List</h1>

<table>
    <thead>
        <tr>
            <th>Employee Id</th>
            <th>Name</th>
            <th>Role</th>
            <th>Mobile</th>
            <th>Email</th>
        </tr>
    </thead>

    <tbody>
        <c:forEach var="emp" items="${getAllEmp}">
            <tr>
                <td>${emp.eid}</td>
                <td>${emp.name}</td>
                <td>${emp.role}</td>
                <td>${emp.mobile}</td>
                <td>${emp.email}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>