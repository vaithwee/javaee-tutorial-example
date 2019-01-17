<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-17
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表达式语言-内置对象</title>
</head>
<body>
<h2>表达式语言-内置对象</h2>
<form action="implicit-objects.jsp" method="post">
    你的名字 = <input type="text" name="name" value="${param['name']}" />
    <input type="submit" value="提交" />
</form>
<%
    session.setAttribute("user", "abc");
    Cookie c = new Cookie("name", "yeeku");
    c.setMaxAge(24 * 3600);
    response.addCookie(c);
%>
<table border="1" bgcolor="aqua">
    <tr>
        <td width="170"><b>功能</b></td>
        <td width="200"><b>表达语言</b></td>
        <td width="300"><b>计算结果</b></td>
    </tr>

    <tr>
        <td>取得请求参数</td>
        <td>\${param.name}</td>
        <td>${param.name}</td>
    </tr>
    <tr>
        <td>取得请求参数</td>
        <td>\${param["name"]}</td>
        <td>${param["name"]}</td>
    </tr>
    <tr>
        <td>取得请求头</td>
        <td>\${header.host}</td>
        <td>${header.host}</td>
    </tr>
    <tr>
        <td>取得请求头</td>
        <td>\${header["accept"]}</td>
        <td>${header.accept}</td>
    </tr>
    <tr>
        <td>取得初始化参数</td>
        <td>\${initParam["author"}</td>
        <td>${initParam["author"]}</td>
    </tr>
    <tr>
        <td>取得session的属性值</td>
        <td>\${sessionScope.user}</td>
        <td>${sessionScope.user}</td>
    </tr>
    <tr>
        <td>取得cookie值</td>
        <td>\${cookie["name"].value}</td>
        <td>${cookie["name"].value}</td>
    </tr>
</table>

</body>
</html>
