<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-12
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    int i;
%>

<%
    application.setAttribute("counter", String.valueOf(++i));
%>

<%=i%>
</body>
</html>
