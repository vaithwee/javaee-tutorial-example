<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-11
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<s:property value="username" />

<s:form action="myAction">
    <s:textfield name="target" label="target" />
    <s:submit value="Go" />
</s:form>
</body>
</html>
