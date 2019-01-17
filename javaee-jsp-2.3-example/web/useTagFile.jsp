<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-17
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<html>
<head>
    <title>迭代器 tag file</title>
</head>
<body>
<%
    List<String> a = new ArrayList<String>();
    a.add("疯狂Java讲义");
    a.add("疯狂Ajax讲义");
    a.add("轻量级Java EE企业应用实战");
    request.setAttribute("a", a);
%>

<tags:iterator bgColor="#99d99" cellColor="#9999cc" title="迭代器标签" bean="a" />
</body>
</html>
