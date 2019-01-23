<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-23
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
本站访问次数为:${applicationScope.counter}<br />
${sessionScope.user}, 您已经登录!<br />
${requestScope.tip}<br />
从系统读取Cookie值: ${cookie.user.value} <br />
</body>
</html>
