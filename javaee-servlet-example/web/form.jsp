<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-13
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="firstServlet" method="post">
    用户名:<input type="text" name="name" /><br />
    性别:<br />
    男:<input type="radio" name="gender" value="男" />
    女:<input type="radio" name="gender" value="女" /><br />
    喜欢的颜色:
    红:<input type="checkbox" name="color" value="红" />
    绿:<input type="checkbox" name="color" value="绿" />
    蓝:<input type="checkbox" name="color" value="蓝" /><br />
    来自的国家:<br />
    <select name="country">
        <option value="中国">🇨🇳</option>
        <option value="美国">🇺🇸</option>
        <option value="俄罗斯">🇷🇺</option>
    </select><br />
    <input type="submit" value="提交" />
    <input type="reset" value="重置"/>

</form>
</body>
</html>
