<%--
  Created by IntelliJ IDEA.
  User: kuran
  Date: 21.07.2021
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Email Result</title>
</head>
<body>
<c:forEach items="${list}" var="user">
    <h1>${user.id} | ${user.login} | ${user.password} | ${user.email}</h1>
</c:forEach>

<p><a href="../index.jsp">Go to main...</a></p>
</body>
</html>
