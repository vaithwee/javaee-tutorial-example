<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-25
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:bean name="java.util.Date" var="now">
    <s:param name="nice" value="false" />
    <s:param name="format" value="'dd/MM/yyyy'" />
</s:bean>
<s:date name="#now" format="dd/MM/yyyy" nice="false"/><br />
<s:date name="#now" format="dd/MM/yyyy" nice="true" /><br />
${requestScope.now}
</body>
</html>
