<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-25
  Time: 11:29
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
<s:bean name="xyz.vaith.app.model.Person" var="p">
    <s:param name="name" value="'wee'" />
    <s:param name="age" value="28" />
</s:bean>
<s:push value="#p">
    <s:property value="name" />
    <s:property value="age" />
</s:push>
</body>
</html>
