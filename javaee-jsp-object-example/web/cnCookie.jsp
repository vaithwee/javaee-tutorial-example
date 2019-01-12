<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-12
  Time: 22:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Cookie cookie = new Cookie("name", java.net.URLDecoder.decode("孙悟空", "utf-8"));
    cookie.setMaxAge(24 * 36000);
    response.addCookie(cookie);
%>
</body>
</html>
