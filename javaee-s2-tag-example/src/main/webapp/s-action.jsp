<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-19
  Time: 00:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:action name="tag1" executeResult="true" namespace="/" />
<hr />
<s:action name="tag2" executeResult="true" ignoreContextParams="true" namespace="/" />
<hr />
<s:action name="tag2" executeResult="false" namespace="/" />
<s:property value="author" />
</body>
</html>
