<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-04-27
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="employee" method="post" action="checkboxForm">
    <form:checkboxes path="depts" items="${deptList}" itemLabel="name" itemValue="id"/>
</form:form>
</body>
</html>
