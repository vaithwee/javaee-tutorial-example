<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-17
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表达式语言-算数运算符</title>
</head>
<body>
<h2>表达式语言-算数运算符</h2>
<table border="1" bgcolor="#aaaabb">
    <tr>
        <td><b>表达式语言</b></td>
        <td><b>计算结果</b></td>
    </tr>
    <tr>
        <td>\${1}</td>
        <td>${1}</td>
    </tr>
    <tr>
        <td>\${1.2 + 2.3}</td>
        <td>${1.2 + 2.3}</td>
    </tr>
    <tr>
        <td>\${1.2e4 + 1.4}</td>
        <td>${1.2e4 + 1.4}</td>
    </tr>
    <tr>
        <td>\${-4-2}</td>
        <td>${-4-2}</td>
    </tr>
    <tr>
        <td>\${21 * 2}</td>
        <td>${21 * 2}</td>
    </tr>
    <tr>
        <td>\${3 / 4}}</td>
        <td>${3 / 4}}</td>
    </tr>
    <tr>
        <td>\${3 div 4}</td>
        <td>${3 div 4}</td>
    </tr>
    <tr>
        <td>\${3/0}</td>
        <td>${3/0}</td>
    </tr>
    <tr>
        <td>\${10%4}</td>
        <td>${10%4}</td>
    </tr>
    <tr>
        <td>\${10 mod 4}</td>
        <td>${10 mod 4}</td>
    </tr>
    <tr>
        <td>\${(1==2)?3:4}</td>
        <td>${(1==2)?3:4}</td>
    </tr>
</table>
</body>
</html>
