<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-16
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" width="300">
    <s:iterator value="{'追风筝的人', '天蓝色的彼岸', '哈利波特'}" var="name" status="status">
        <tr <s:if test="#status.odd">style="background-color: #bbbbbb" </s:if> >
            <td><s:property value="name" /> </td>
        </tr>
    </s:iterator>
</table>

<table border="1" width="350">
    <tr>
        <td>书名</td>
        <td>价格</td>
    </tr>
    <s:iterator value="#{'追风筝的人':19.8, '天蓝色的彼岸':20.1, '哈利波特':11.1}" var="price" status="status">
        <tr <s:if test="#status.odd">style="background-color: #bbbbbb" </s:if> >
            <td><s:property value="key" /> </td>
            <td><s:property value="value" /></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
