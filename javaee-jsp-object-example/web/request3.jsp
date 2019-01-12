<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-12
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String rawQueryStr = request.getQueryString();
    out.println("原始查询字符串为:" + rawQueryStr + "<hr />");
    String queryStr = java.net.URLDecoder.decode(rawQueryStr, "UTF-8");
    out.println("解码后查询字符串为:" + queryStr + "<hr />");
    String[] paramPairs = queryStr.split("&");
    for (String param : paramPairs) {
        out.println("每个请求参数名|值对为:" + param + "<br />");
        String[] nameValue = param.split("=");
        out.println(nameValue[0] +"参数的值是:" + nameValue[1] + "<hr />");
    }
%>
</body>
</html>
