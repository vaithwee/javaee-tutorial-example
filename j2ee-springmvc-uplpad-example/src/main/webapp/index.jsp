<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-04-23
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Common Upload</h3>
<form action="upload/method1" method="post" enctype="multipart/form-data" >
    <input type="file" name="file" />
    <input type="submit" value="Upload" />
</form>
<h3>Spring MVC Upload</h3>
<form action="upload/method2" method="post" enctype="multipart/form-data" >
    <input type="file" name="file" />
    <input type="submit" value="Upload" />
</form>
<h3>Spring MVC Upload To Another Service</h3>
<form action="upload/method3" method="post" enctype="multipart/form-data" >
    <input type="file" name="file" />
    <input type="submit" value="Upload" />
</form>
</body>
</html>
