<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-12
  Time: 22:24
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
    if (qian < 500) {
        out.println("给你"+ qian + "块");
        out.println("账户减少" + qian);
    } else  {
        List<String> list = new ArrayList<>();
        list.add("111111");
        list.add("222222");
        list.add("333333");
        request.setAttribute("info", list);
        %>
<jsp:forward page="second.jsp" />
<%
    }

%>
</body>
</html>
