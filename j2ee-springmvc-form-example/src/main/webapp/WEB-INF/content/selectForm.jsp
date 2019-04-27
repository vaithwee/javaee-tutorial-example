<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-04-27
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="user">
    <form:select path="deptId">
        <form:option value="1">财务部</form:option>
        <form:option value="2">开发部</form:option>
        <form:option value="3">销售部</form:option>
    </form:select>
</form:form>
</body>
</html>
