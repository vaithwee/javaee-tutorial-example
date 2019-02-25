<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-25
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>使用s:include标签包含的界面</h2>
<s:include value="include-file.jsp"/>
<hr/>
<s:include value="include-file.jsp">
    <s:param name="author" value="'wee'" />
</s:include>
</body>
</html>
