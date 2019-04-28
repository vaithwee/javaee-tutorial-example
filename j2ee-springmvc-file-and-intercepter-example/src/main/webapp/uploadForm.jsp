<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-04-28
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="upload" enctype="multipart/form-data" method="post">
    File Desc: <input type="text" name="description" /><br />
    File: <input type="file" name="file" /><br />
    <input type="submit" value="Upload" />
</form>
</body>
</html>
