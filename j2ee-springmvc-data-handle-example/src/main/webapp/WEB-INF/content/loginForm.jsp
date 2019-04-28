<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-04-28
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="user" method="post" action="login" >
    <form:input path="loginname" /><form:errors path="loginname" cssStyle="color: red;" /><br />
    <form:input path="password" /><form:errors path="password" cssStyle="color: red;" /><br />
    <input type="submit" value="Login" />
</form:form>
</body>
</html>
