<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-16
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="wee" uri="http://java.vaith.xyz/uri" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<String> list = new ArrayList<>();
    list.add("疯狂Java");
    list.add("www.crazyit.com");
    list.add("www.fkit.com");
    pageContext.setAttribute("list", list);
%>

<table bgcolor="#faebd7" border="1" width="300">
    <wee:iterator collection="list" item="item">
        <tr>
            <td>${item}</td>
        </tr>
    </wee:iterator>
</table>
</body>
</html>
