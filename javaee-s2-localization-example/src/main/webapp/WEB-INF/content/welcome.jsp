<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-15
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="d" class="java.util.Date" scope="page" />
<s:property value="tip" />
<h2><s:text name="welcomeMessage">
    <s:param><s:property value="username" /></s:param>
    <s:param>${d}</s:param>
</s:text></h2>
</body>
</html>
