<%--
  Created by IntelliJ IDEA.
  User: phamq
  Date: 4/22/2024
  Time: 5:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EDIT</title>
</head>
<body>
<form action="/students/add" method="post">
    <input type="number" name="id" placeholder="ID">
    <input type="text" name="name" placeholder="Name">
    <input type="number" name="age" placeholder="AGE">
    <input type="number" name="score" placeholder="SCORE">
    <button type="submit">ENTER</button>
</form>
</body>
</html>
