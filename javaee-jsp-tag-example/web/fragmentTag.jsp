<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-16
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="wee" uri="http://java.vaith.xyz/uri" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<wee:fragment>
    <jsp:attribute name="fragment" >
        <wee:helloWorld/>
    </jsp:attribute>
</wee:fragment>

<wee:fragment>
    <jsp:attribute name="fragment">
        ${pageContext.request.remoteAddr}
    </jsp:attribute>
</wee:fragment>
</body>
</html>
