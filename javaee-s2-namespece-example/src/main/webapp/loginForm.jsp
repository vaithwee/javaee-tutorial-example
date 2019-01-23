<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-23
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function regist() {
            var targetForm = document.forms[0];
            targetForm.action = "register";
        }
    </script>
</head>
<body>
<form action="login" method="post">
    用户名:<input type="text" name="username" /><br />
    密码:<input type="text" name="password" /><br />
    <input type="submit" value="登录" />
    <input type="submit" value="注册" onclick="regist();" />
</form>
</body>
</html>
