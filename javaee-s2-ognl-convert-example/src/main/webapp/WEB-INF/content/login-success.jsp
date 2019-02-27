<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-27
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:debug />
<s:actionmessage />
<s:property value="users['one'].username" />
<s:property value="users['one'].password" />
<s:property value="users['two'].username" />
<s:property value="users['two'].password" />
</body>
</html>
