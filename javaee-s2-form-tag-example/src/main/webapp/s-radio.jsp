<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-25
  Time: 22:54
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
    <s:radio list="{'追风筝的人', '天蓝色的彼岸', '麦田里的守望者'}" labelposition="top" label="请选择您喜欢的图书" name="a" />
    <s:radio list="#{'追风筝的人':18.9, '天蓝色的彼岸':15.9, '麦田里的守望者':19.9}" label="请选择图书价格" labelposition="top" name="b" listValue="value" listKey="key" />
    <s:bean name="xyz.vaith.app.service.BookService" var="bs" />
    <s:radio list="#bs.books" name="c" labelposition="top" label="请选择您喜欢的图书" listKey="name" listValue="author" />
</s:form>
</body>
</html>
