<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-25
  Time: 22:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <s:head />
</head>
<body>
<s:form>
    <s:checkboxlist list="{'天蓝色的彼岸', '追风筝的人', '麦田里的守望者', '哈利波特与混血王子'}" name="a" label="请选择您喜欢的图书" labelposition="top" />
    <s:checkboxlist list="#{'天蓝色的彼岸':28, '追风筝的人':29, '麦田里的守望者': 18, '哈利波特与混血王子': 55}" name="b" label="请选择价格" labelposition="top" listKey="key" listValue="value" />
    <s:bean name="xyz.vaith.app.service.BookService" var="bs" />
    <s:checkboxlist list="#bs.books" name="c" label="请选择您喜欢的图书" labelposition="top" listKey="name" listValue="author" />

</s:form>
</body>
</html>
