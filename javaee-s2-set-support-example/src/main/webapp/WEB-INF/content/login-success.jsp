<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-27
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:debug />
<s:property value="users" />
<s:property value="users('wee').username" />
<s:property value="users('vaith').username" />
</body>
</html>
