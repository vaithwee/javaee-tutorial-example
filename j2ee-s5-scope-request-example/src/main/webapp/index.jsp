
<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-03-30
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="xyz.vaith.app.domain.Person" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
    Person p1 = (Person) context.getBean("p");
    Person p2 = (Person) context.getBean("p");
    if (p1 == p2){
        out.println("same");
    }
    out.println(p1);
%>
</body>
</html>
