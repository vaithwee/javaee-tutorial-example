<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-26
  Time: 00:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:component template="mytemplate.jsp" >
    <s:param name="list" value="{'天蓝色的彼岸', '追风筝的人', '小王子'}" />
</s:component>
</body>
</html>
