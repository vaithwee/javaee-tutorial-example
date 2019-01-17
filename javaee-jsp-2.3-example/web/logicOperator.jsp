<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-17
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表达式语言-逻辑运算符</title>
</head>
<body>
<h3>表达式语言-逻辑运算符</h3>
<table border="1" bgcolor="aqua">
    <tr>
        <td><b>表达式语言</b></td>
        <td><b>计算结果</b></td>
    </tr>
    <tr>
        <td>\${1 &lt; 2}</td>
        <td>${1 < 2}</td>
    </tr>
    <tr>
        <td>\${1 lt 2}</td>
        <td>${1 lt 2}</td>
    </tr>
    <tr>
        <td>\${1 &gt; (4/2)}</td>
        <td>${1 > (4/2)}</td>
    </tr>
    <tr>
        <td>\${4 >= 3}</td>
        <td>${4 >= 3}</td>
    </tr>
    <tr>
        <td>\${4.0 ge 3}</td>
        <td>${4.0 ge 3}</td>
    </tr>
    <tr>
        <td>\${4 <= 3}</td>
        <td>${4 <= 3}</td>
    </tr>
    <tr>
        <td>\${4 le 3}</td>
        <td>${4 le 3}</td>
    </tr>
    <tr>
        <td>\${100.0 == 100}</td>
        <td>${100.0 == 100}</td>
    </tr>
    <tr>
        <td>\${100.0 eq 100}</td>
        <td>${100.0 eq 100}</td>
    </tr>
    <tr>
        <td>\${(10*10) != 100}</td>
        <td>${(10*10) != 100}</td>
    </tr>
    <tr>
        <td>\${(10*10) ne 100}</td>
        <td>${(10*10) ne 100}</td>
    </tr>
    <tr>
        <td>\${'a' < 'b'}</td>
        <td>${'a' < 'b'}</td>
    </tr>
    <tr>
        <td>\${'hip' > 'hit'}</td>
        <td>${'hip' > 'hit'}</td>
    </tr>
    <tr>
        <td>\${'4' &gt; 3}</td>
        <td>${'4' gt 3}</td>
    </tr>
</table>
</body>
</html>
