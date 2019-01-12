<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>小脚本测试</title>
</head>
<body>
<table bgcolor="#9999dd" border="1" width="300px">
<%-- Java脚本,这些脚本会对HTML的标签产生作用 --%>
<% for (int i = 0; i < 10; ++i) {%>
<%-- 上面的循环将控制<tr>标签循环 --%>
<tr>
    <td>循环值:</td>
    <td><%=i%></td>
</tr>
<%} %>
</table>
</body>
</html>
