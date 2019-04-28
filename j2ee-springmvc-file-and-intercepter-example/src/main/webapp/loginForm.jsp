<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-04-28
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${requestScope.message}
<form action="login" method="post">
    Username:<input type="text" id="username" name="username" /><br />
    Password:<input type="text" id="password" name="password"><br />
    <input type="submit" value="Login" />
</form>
</body>
</html>
