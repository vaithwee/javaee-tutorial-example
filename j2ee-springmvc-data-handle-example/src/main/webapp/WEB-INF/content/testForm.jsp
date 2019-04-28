<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-04-28
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="test" method="post">
    <label>Date</label>
    <input type="text" name="birthday" id="birthday" />
    <br />
    <label>Integer</label>
    <input type="text" id="total" name="total" />
    <br />
    <label>Percent</label>
    <input type="text" id="discount" name="discount" />
    <br />
    <label>Money</label>
    <input type="text" id="money" name="money" />
    <br/>
    <input type="submit" value="Submit" />
</form>
</body>
</html>
