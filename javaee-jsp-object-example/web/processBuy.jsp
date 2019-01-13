<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-13
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Map<String, Integer> itemMap = (Map<String, Integer>)session.getAttribute("itemMap");
    if (itemMap == null) {
        itemMap = new HashMap<>();
        itemMap.put("书籍", 0);
        itemMap.put("电脑", 0);
        itemMap.put("汽车", 0);
    }
    String[] buys = request.getParameterValues("item");
    for (String item : buys) {
        if (item.equals("book")) {
            int num = itemMap.get("书籍").intValue();
            itemMap.put("书籍", ++num);
        } else if (item.equals("car")) {
            int num = itemMap.get("汽车").intValue();
            itemMap.put("汽车", ++num);
        } else if (item.equals("computer")) {
            int num = itemMap.get("电脑").intValue();
            itemMap.put("电脑", ++num);
        }
    }
    session.setAttribute("itemMap", itemMap);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
您所购买的物品:<br />
书籍:<%=itemMap.get("书籍")%><br />
电脑:<%=itemMap.get("电脑")%><br />
汽车:<%=itemMap.get("汽车")%><br />
</body>
</html>
