<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-28
  Time: 09:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:debug />
<s:fielderror />

<s:form action="login" validate="true">
    <s:textfield name="user" label="用户名" />
    <s:textfield name="pass" label="密码" />
    <s:textfield name="age" label="年龄" />
    <s:textfield name="birth" label="生日" />
    <s:submit value="注册" />
</s:form>
</body>
</html>
