<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>小脚本测试</title>
</head>
<body>
<%
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaee","root","abcd1234");
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("select * from news_inf");
%>
<table>

<%
while(rs.next()) {
%>
    <tr>
    <td><%=rs.getString(0)%></td>
    <td><%=rs.getString(1)%></td>
    </tr>
<%    
}
%>
</table>
</body>
</html>
