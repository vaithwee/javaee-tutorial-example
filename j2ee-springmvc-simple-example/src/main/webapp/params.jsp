<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-04-21
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="param/save" method="post">
    Username:<input type="text" name="username" /><br />
    Password:<input type="text" name="password" /><br />
    Money:<input type="text" name="money" /><br />
    TrueName:<input type="text" name="user.name" /><br />
    Age:<input type="text" name="user.age" /><br />
    TrueName:<input type="text" name="list[0].name" /><br />
    Age:<input type="text" name="list[0].age" /><br />
    TrueName:<input type="text" name="map['mapkey'].name" /><br />
    Age:<input type="text" name="map['mapkey'].age" /><br />
    <input type="submit" value="Sumbit" />
</form>
</body>
</html>
