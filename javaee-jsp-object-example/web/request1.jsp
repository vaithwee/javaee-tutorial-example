<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-12
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Enumeration<String> headerNames = request.getHeaderNames();
    while (headerNames.hasMoreElements()) {
        String headerName = headerNames.nextElement();
        out.println(headerName + "-->" + request.getHeader(headerName) + "<br />");

    }
    out.println("<hr />");
    request.setCharacterEncoding("utf-8");
    String name = request.getParameter("name");
    String gender = request.getParameter("gender");
    String[] colors = request.getParameterValues("color");
    String national = request.getParameter("country");

%>
您的名字:<%=name%><hr />
您的性别:<%=gender%><hr />
您的喜欢的颜色:<%
for (String color : colors) {
    out.print(color + " ");
}
%><hr />
您来自的国家:<%=national%><hr />
</body>
</html>
