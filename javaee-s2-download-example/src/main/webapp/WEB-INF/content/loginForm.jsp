
<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-03-02
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="login">
    <s:textfield name="username" label="用户名" />
    <s:textfield name="password" label="密码" />
    <s:submit value="登录" />
</s:form>
</body>
</html>
