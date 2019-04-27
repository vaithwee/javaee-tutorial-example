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
<form:form modelAttribute="checkBox" method="post" action="checkboxForm">
    <table>
        <tr>
            <td>
                选择课程:
            </td>
        </tr>
        <tr>
            <td>
                <form:checkboxes path="courses" items="${courseMap}" />
            </td>
        </tr>



    </table>
    <form:checkbox path="reader"/>已阅读相关协议
</form:form>
</body>
</html>
