<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-25
  Time: 23:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form>
    <s:select list="{'天蓝色的彼岸', '追风筝的人', '麦田里的守望者'}" label="请选择您喜欢的图书" labelposition="top" name="a" />
    <s:select list="#{'天蓝色的彼岸': 18.9, '追风筝的人':12.0, '麦田里的守望者':29.9}" name="c" label="请选择价格" labelposition="top" listKey="key" listValue="value" />
    <s:bean name="xyz.vaith.app.service.BookService" var="bs" />
    <s:select list="#bs.books" name="c" label="请选择您喜欢的图书" listValue="author" listKey="name" labelposition="top" />

</s:form>
</body>
</html>
