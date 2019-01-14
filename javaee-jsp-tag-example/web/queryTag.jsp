<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-14
  Time: 23:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="wee" uri="http://java.vaith.xyz/uri" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table bgcolor="aqua" border="1" width="480">
    <wee:query driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/javaee" username="root" password="abcd1234" sql="select * from news_inf" />
</table>

</body>
</html>
