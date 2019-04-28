<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-04-28
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="account" method="post" action="register2">
    <table>
        <tr>
            <td>username</td>
            <td><form:input path="username" /></td>
            <td><form:errors path="username" cssStyle="color:red" /></td>
        </tr>
        <tr>
            <td>password</td>
            <td><form:input path="password" /></td>
            <td><form:errors path="password" cssStyle="color:red" /></td>
        </tr>
        <tr>
            <td>nickname</td>
            <td><form:input path="nickname" /></td>
            <td><form:errors path="nickname" cssStyle="color:red" /></td>
        </tr>
        <tr>
            <td>age</td>
            <td><form:input path="age" /></td>
            <td><form:errors path="age" cssStyle="color:red" /></td>
        </tr>
        <tr>
            <td>birthday</td>
            <td><form:input path="birthday" /></td>
            <td><form:errors path="birthday" cssStyle="color:red" /></td>
        </tr>
        <tr>
            <td>email</td>
            <td><form:input path="email" /></td>
            <td><form:errors path="email" cssStyle="color:red" /></td>
        </tr>
        <tr>
            <td>phone</td>
            <td><form:input path="phone" /></td>
            <td><form:errors path="phone" cssStyle="color:red" /></td>
        </tr>
    </table>
    <input type="submit" value="Register" />
</form:form>
</body>
</html>
