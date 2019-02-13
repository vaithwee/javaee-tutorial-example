<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-13
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="/login" method="POST">
    <s:textfield name="username" label="username" />
    <s:textfield name="password" label="password" />
    <s:submit value="Regist" />
</s:form>
</body>
</html>
