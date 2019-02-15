<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-15
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%--<s:i18n name="loginForm">--%>
<html>
<head>
    <title><s:text name="loginPage" /></title>
</head>
<body>
<s:property value="tip" />
<s:form action="login" method="POST">
    <s:textfield name="username" key="user" />
    <s:password name="password" key="pass" />
    <s:submit key="login" />
</s:form>


</body>
</html>
<%--</s:i18n>--%>
