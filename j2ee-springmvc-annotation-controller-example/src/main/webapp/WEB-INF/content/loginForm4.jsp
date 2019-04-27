<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-04-27
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>@ModelAttribute</h3>
<form action="${pageContext.request.contextPath}/modelAttribute/login4">
    LoginName: <input type="text" name="loginname" id="loginname"  /><br />
    Password: <input type="text" name="password" id="password" /><br />
    <input type="submit" value="Login" />
</form>
</body>
</html>
