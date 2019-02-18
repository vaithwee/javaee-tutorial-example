<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-18
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:debug></s:debug>
<table width="300" border="1">
    <s:generator val="a,b,c,d" separator="," var="book">
        <s:iterator var="n">
            <s:property value="n"/>
            aaa
        </s:iterator>
        <%--<s:iterator value="items" status="st">--%>
            <%--<tr <s:if test="#st.odd">style="background-color: #bbbbbb" </s:if> >--%>
                <%--<td><s:property/></td>--%>
            <%--</tr>--%>
        <%--</s:iterator>--%>

    </s:generator>
</table>
</body>
</html>
