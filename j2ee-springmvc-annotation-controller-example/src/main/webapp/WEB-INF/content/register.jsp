<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-04-26
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Register</h1>
<form action="${pageContext.request.contextPath}/user/register" method="post">
    Login Name: <input type="text" id="loginname" name="loginname" /><br />
    User Name: <input type="text" id="username" name="username" /><br />
    Password: <input type="text" id="password" name="password" /><br />
    <input type="submit" value="Register" />
</form>
</body>
</html>
