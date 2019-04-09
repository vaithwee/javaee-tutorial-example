<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-04-09
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:form action="login" method="POST">
        <s:textfield label="用户名" name="username" />
        <s:textfield label="密码" name="password" />
        <s:reset value="重置" />
        <s:submit value="登录" />
    </s:form>
</body>
</html>
