<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-04-28
  Time: 09:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Success</h3>
${requestScope.user.birthday}

<hr />
<form:form modelAttribute="user" method="post" action="">
    <form:input path="birthday" /><br />
    <form:input path="total" /><br />
    <form:input path="discount" /><br />
    <form:input path="money" /><br />
</form:form>
</body>
</html>
