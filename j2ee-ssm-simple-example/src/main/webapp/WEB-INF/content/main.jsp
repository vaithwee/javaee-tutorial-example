<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-05-03
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <style type="text/css">
        table {
            border-collapse: collapse;border-spacing: 0; border-left: 1px solid #888;border-top: 1px solid #888; background: #efefef;
        }
        th, td {
            border-right: 1px solid #888;border-bottom: 1px solid #888;padding: 5px 15px;
        }
    </style>
</head>
<body>
${sessionScope.user.username}
</body>
</html>
