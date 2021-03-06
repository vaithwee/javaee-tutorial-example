<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-04-27
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="spirng" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3><spirng:message code="title" /></h3>
<form:form modelAttribute="user" method="post" action="login">
    <table>
        <tr>
            <td><spring:message code="loginname" /></td>
            <td><form:input path="loginname" /></td>
        </tr>
        <tr>
            <td><spring:message code="password" /></td>
            <td><form:input path="password" /></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="<spring:message code="sumbit"/>">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
