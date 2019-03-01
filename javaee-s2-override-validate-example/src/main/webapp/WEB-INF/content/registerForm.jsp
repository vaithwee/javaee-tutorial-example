<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-03-01
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:fielderror />
<s:form action="register">
    <s:textfield name="name" label="用户名" />
    <s:textfield name="pass" label="密码" />
    <s:textfield name="age" label="年龄" />
    <s:textfield name="birth" label="生日" />
    <s:submit value="注册"  />
</s:form>
</body>
</html>
