<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-17
  Time: 22:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="weef" uri="http://vaith.xyz/weetag" %>
<html>
<head>
    <title>表达式语言-自定义函数</title>
</head>
<body>
<h3>表达式语言-自定义函数</h3>
<form action="useFunctions.jsp" method="post">
    字符串 = <input type="text" name="name" value="${param.name}" />
    <input type="submit" value="提交" />
</form>
<table border="1" bgcolor="aqua">
    <tr>
        <td><b>表达式语言</b></td>
        <td><b>计算结果</b></td>
    </tr>
    <tr>
        <td>\${param.name}</td>
        <td>${param.name}</td>
    </tr>
    <tr>
        <td>\${weef:reverse(param.name)}</td>
        <td>${weef:reverse(param.name)}</td>
    </tr>
    <tr>
        <td>\${weef:count(param.name)}</td>
        <td>${weef:count(param.name)}</td>
    </tr>
</table>
</body>
</html>
