<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-05-03
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<h3>登录界面</h3>
<form action="login" method="post">
    <span style="color: red;">${requestScope.message}</span>
    <table>
        <tr>
            <td><label>登录名:</label></td>
            <td><input type="text" name="loginname" id="loginname" /></td>
        </tr>
        <tr>
            <td><label>密码:</label></td>
            <td><input type="text" name="password" id="password" /></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="登录" />
            </td>
        </tr>
    </table>
</form>
</body>
</html>
