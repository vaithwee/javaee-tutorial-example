<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-23
  Time: 09:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title><s:text name="loginPage" /></title>
</head>
<body>
<s:form action="login">
    <s:textfield name="username" key="user" />
    <s:textfield name="password" key="pass" />
    <s:submit key="login" />
</s:form>
</body>
</html>
