<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-12
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Cookie[] cookies = request.getCookies();
    for (Cookie c : cookies) {
        if (c.getName().equals("username")) {
            out.println(c.getValue());
        }
    }
%>
</body>
</html>
