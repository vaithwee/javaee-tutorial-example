<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-12
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name = request.getParameter("name");
    Cookie cookie = new Cookie("username", name);
    cookie.setMaxAge(24 * 600);
    response.addCookie(cookie);
%>
</body>
</html>
