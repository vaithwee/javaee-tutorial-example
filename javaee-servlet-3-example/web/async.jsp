<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-19
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<ul>
    <c:forEach items="${books}" var="book">
        <li>${book}</li>
    </c:forEach>
    <%
    out.println("业务调用时间结束:" + new java.util.Date());
    if (request.isAsyncStarted()) {
        request.getAsyncContext().complete();
    }
    %>
</ul>