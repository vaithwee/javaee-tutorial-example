<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-12
  Time: 21:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaee", "root", "abcd1234");
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("select * from news_inf");
%>
<table bgcolor="#9999dd" border="1" width="400">
<%
    while (resultSet.next()){
        out.println("<tr>");
        out.println("<td>");
        out.println(resultSet.getInt("id"));
        out.println("</td>");
        out.println("<td>");
        out.println(resultSet.getString("content"));
        out.println("</td>");
        out.println("</tr>");
    }
%>
</table>
</body>
</html>
