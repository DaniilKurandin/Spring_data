<%--
  Created by IntelliJ IDEA.
  User: Oched
  Date: 07.07.2021
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>
</head>
<body>
<form action="../users/add" method="post" modelAttribute="${user}">
    <p>Login : <input type="text" name="login"></p>
    <p>Email : <input type="text" name="email"></p>
    <p>Password : <input type="text" name="password"></p>
    <input type="submit" value="Pass data">
</form>

<p><a href="../users/all">Get list...</a></p>
<p><a href="../index.jsp">Go to main...</a></p>
</body>
</html>
