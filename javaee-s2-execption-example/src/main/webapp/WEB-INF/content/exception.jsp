<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-14
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:debug></s:debug>
<%--<s:property value="exception" />--%>
<%--<s:property value="exceptionStack" />--%>

异常信息:<s:property value="exception.message" />
</body>
</html>
