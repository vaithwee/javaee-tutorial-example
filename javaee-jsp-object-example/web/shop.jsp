<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-13
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="processBuy.jsp">
    书籍:<input type="checkbox" name="item" value="book" /><br />
    电脑:<input type="checkbox" name="item" value="computer" /><br />
    汽车:<input type="checkbox" name="item" value="car" /><br />
    <input type="submit" value="购买" />

</form>
</body>
</html>
