<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-18
  Time: 23:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:bean name="xyz.vaith.app.util.MyComparator" var="comparator" />

<s:sort comparator="#comparator" source="{'天蓝色的彼岸', '追风筝的人', '麦田里的守望者','掘墓人','哈利波特'}" var="sortedList" />
${pageScope.sortedList}
<table border="1" width="300">
    <s:iterator status="st" value="#attr.sortedList">
        <tr <s:if test="#st.odd">style="background-color: #bbb" </s:if> >
            <td><s:property /></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
