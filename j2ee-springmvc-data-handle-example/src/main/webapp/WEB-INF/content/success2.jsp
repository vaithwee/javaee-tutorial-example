<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-04-28
  Time: 09:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Success</h3>
${requestScope.account.username}<br />
${requestScope.account.password}<br />
${requestScope.account.nickname}<br />
${requestScope.account.age}<br />
${requestScope.account.email}<br />
${requestScope.account.phone}<br />
${requestScope.account.birthday}<br />

</body>
</html>
