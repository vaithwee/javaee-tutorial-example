<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-04-21
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="param/user" method="post">
    name:<input type="text" name="name" /><br />
    age:<input type="text" name="age" /><br />
    birthday:<input type="text" name="birthday" /><br />
    <input type="submit" value="Sumbit" />
</form>

<form action="anno/modelAttribute" method="post">
    name:<input type="text" name="name" /><br />
    age:<input type="text" name="age" /><br />
    <input type="submit" value="Sumbit" />
</form>
</body>
</html>
