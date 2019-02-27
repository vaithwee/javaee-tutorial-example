<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-27
  Time: 22:33
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
    <s:textfield name="user.username" />
    <s:textfield name="user.password" />
    <s:textfield name="user.birthday" />
    <s:submit value="Login" />
</s:form>
</body>
</html>
