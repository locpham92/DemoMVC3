<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: phamq
  Date: 4/22/2024
  Time: 2:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HOME</title>
</head>
<body>

<table border="1">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Age</td>
        <td>Score</td>
        <td colspan="2">Action</td>
    </tr>
    <c:forEach items="${list}" var="item">
    <tr>
        <td>${item.id}</td>
        <td>${item.name}</td>
        <td>${item.age}</td>
        <td>${item.score}</td>
        <td>
            <button>Sua</button>
        </td>
        <td>
            <button>Xoa</button>
        </td>
    </tr>
    </c:forEach>
</table>

</body>
</html>
