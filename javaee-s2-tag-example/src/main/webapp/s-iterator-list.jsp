<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-16
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" width="200">
    <s:iterator value="{'追风筝的人','天蓝色的彼岸','哈利波特'}" var="name" status="status">
        <tr>
            <td><s:property value="#status.count" /><s:property value="name"/> </td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
