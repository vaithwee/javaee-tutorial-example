<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-19
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="upload" enctype="multipart/form-data">
    文件名:<input type="text" name="name" id="name" /><br />
    选择文件:<input type="file" name="file" id="file" /><br />
    <input type="submit" value="上传" />
</form>
</body>
</html>
