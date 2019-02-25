<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-25
  Time: 23:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="pro">
    <s:textfield name="book" label="书名" />
    <s:token />
    <s:submit value="提交" />
</s:form>
</body>
</html>
