<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-03-02
  Time: 19:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>上传成功</h2>
文件标题:<s:property value="title" /><br />
文件为:<img src="<s:property value="uploadFileName" />" /><br />
</body>
</html>
