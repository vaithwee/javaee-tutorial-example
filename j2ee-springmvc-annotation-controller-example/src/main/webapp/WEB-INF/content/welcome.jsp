<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-04-26
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Welcome,  ${requestScope.user.username} login!</h3>
<h3>Welcome,  ${sessionScope.user.username} login!</h3>
</body>
</html>
