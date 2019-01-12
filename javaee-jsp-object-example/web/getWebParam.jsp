<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-12
  Time: 21:25
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
    String driver = application.getInitParameter("driver");
    String url = application.getInitParameter("url");
    String user = application.getInitParameter("user");
    String pwd = application.getInitParameter("pwd");

    Class.forName(driver);
    Connection connection = DriverManager.getConnection(url, user, pwd);
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("select  * from news_inf");
%>
<table>
    <%
        while (resultSet.next()) {
    %>
        <tr>
            <td><%=resultSet.getInt("id")%></td>
            <td><%=resultSet.getString("content")%></td>
        </tr>
    <%
        }
    %>
</table>

</body>
</html>
