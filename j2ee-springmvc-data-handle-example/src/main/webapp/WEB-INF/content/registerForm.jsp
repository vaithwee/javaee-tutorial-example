<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-04-28
  Time: 09:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Register Page</h3>
<form action="register" method="post">
    <table>
        <tr>
            <td><label>登录名:</label></td>
            <td><input type="text" id="loginname" name="loginname"/></td>
        </tr>
        <tr>
            <td><label>生日:</label></td>
            <td><input type="text" id="birthday" name="birthday"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Register" /></td>
        </tr>
    </table>
</form>
</body>
</html>
