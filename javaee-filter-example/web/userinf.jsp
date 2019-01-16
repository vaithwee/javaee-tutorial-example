<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-16
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String username = request.getParameter("username");
%>
<html>
<head>
    <title><%=username%>></title>
</head>
<body>
<%
    out.println("现在的时间是:" + new java.util.Date() + "<br />");
    out.println("用户名:" + username + "<br />");
%>
</body>
</html>
