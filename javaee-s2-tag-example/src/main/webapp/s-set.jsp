<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-25
  Time: 11:32
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
    <s:param name="name">wee</s:param>
    <s:param name="age">28</s:param>
</s:bean>

<s:set var="pcopy" value="#p" scope="application" />
</body>
</html>
