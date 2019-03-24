<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-03-24
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<s:debug />--%>
<s:form action="save">
    <s:textfield name="name" label="User Name: " />
    <s:textfield name="age" label="User Age: " />
    <s:submit value="Create" />
</s:form>
</body>
</html>
