<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-04-27
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" action="user/register">
    <table>
        <tr>
            <td>姓名</td>
            <td><form:input path="username" /></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><form:input path="sex" /></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><form:input path="age" /></td>
        </tr>
    </table>
    <input type="submit" value="Register" />
</form:form>
</body>
</html>
