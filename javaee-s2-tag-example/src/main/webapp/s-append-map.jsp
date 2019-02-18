<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-18
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:append var="newList">
    <s:param value="#{'哈尔的移动城堡':91.9, '红猪': 92, '千与千寻': 98}"/>
    <s:param value="#{'听见涛声':89, '我的邻居山田君': 90}" />
</s:append>
<table border="1" width="300">
    <s:iterator value="#newList">
        <tr>
            <td><s:property value="key" /></td>
            <td><s:property value="value" /></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
