<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-18
  Time: 20:57
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
    <s:param value="{'天蓝色的彼岸', '追风筝的人', '麦田里的守望者'}" />
    <s:param value="{'梦里花落知多少', '小时代'}" />
</s:append>

<table border="1" width="200">
    <s:iterator value="#newList" status="st" var="ele">
        <tr>
            <td><s:property value="#st.count" /></td>
            <td><s:property value="ele" /></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
