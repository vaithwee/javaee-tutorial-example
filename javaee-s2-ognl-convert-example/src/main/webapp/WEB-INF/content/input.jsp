<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-27
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="login" >
    <%--<s:textfield name="user.username" label="用户名" />--%>
    <%--<s:textfield name="user.password" label="密码" />--%>

    <%--<s:textfield name="users['one'].username" label="第one个用户名" />--%>
    <%--<s:textfield name="users['one'].password" label="第one个密码" />--%>
    <%--<s:textfield name="users['two'].username" label="第two个用户名" />--%>
    <%--<s:textfield name="users['two'].password" label="第two个密码" />--%>

    <s:textfield name="users[0].username" label="第0个用户名" />
    <s:textfield name="users[0].password" label="第0个密码" />
    <s:textfield name="users[1].username" label="第1个用户名" />
    <s:textfield name="users[1].password" label="第1个密码" />

    <s:reset value="重填" />
    <s:submit value="提交" />
</s:form>
</body>
</html>
