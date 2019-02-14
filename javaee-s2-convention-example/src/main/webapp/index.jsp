<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-14
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="user/login" method="POST" >
    <s:textfield name="username" label="Username" />
    <s:password name="password" label="Password" />
    <s:submit value="Login" />
</s:form>
</body>
</html>
