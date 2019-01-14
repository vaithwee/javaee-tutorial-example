<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-14
  Time: 22:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<span style="color:red;font-weight: bold;">
    <%
    if (request.getAttribute("err") != null) {
        out.println(request.getAttribute("err") + "<br />");
    }
    %>
</span>

<form action="login" method="post">
    用户名:<input type="text" name="username" /><br />
    密码:<input type="text" name="password" /><br />
    <input type="submit" value="登录" />
</form>
</body>
</html>
