<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-16
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:set var="age" value="29" />
<s:if test="#age>60">
    老年人
</s:if>
<s:elseif test="#age>35">
    中年人
</s:elseif>
<s:elseif test="#age>15">
    青年人
</s:elseif>
<s:else>
    少年
</s:else>
</body>
</html>
