<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-27
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@  taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="login" >
    <s:textfield name="user" label="请输入字符串" />
    <s:submit value="装换" />
</s:form>
</body>
</html>
