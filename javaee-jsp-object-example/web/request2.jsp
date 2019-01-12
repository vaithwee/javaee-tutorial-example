<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-12
  Time: 22:12
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
    String gender = request.getParameter("gender");
%>

您的名字:<%=name%>;
你的性别:<%=gender%>;
</body>
</html>
