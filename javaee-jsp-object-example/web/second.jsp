<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-12
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String bal = request.getParameter("balance");
    double qian = Double.parseDouble(bal);
    List<String> info = (List<String>) request.getAttribute("info");
    for (String string : info) {
        out.println(string + "<br />");
    }
    out.println("取钱" + qian + "块");
    out.println("账户减少" + qian);
%>
</body>
</html>
