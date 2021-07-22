<%--
  Created by IntelliJ IDEA.
  User: kuran
  Date: 21.07.2021
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Email</title>
</head>
<body>
<form action="../user/findUserByEmail" method="post">
    <p>Email : <input type="text" name="email"></p>
    <input type="submit" value="Pass data">
</form>

<h3><a href="../user/findUserByEmail">Search new one...</a></h3>
<p><a href="../index.jsp">Go to main...</a></p>
</body>
</html>
