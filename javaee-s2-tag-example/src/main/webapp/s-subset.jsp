<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-02-18
  Time: 23:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table width="300" border="1">
    <s:subset source="{'天蓝色的彼岸', '追风筝的人', '小王子', '麦田里的守望者', '嚣张霸权'}" start="1" count="4">
        <s:iterator status="st">
            <tr <s:if test="#st.odd">style="background-color: #bbb" </s:if> >
                <td><s:property /></td>
            </tr>
        </s:iterator>
    </s:subset>
</table>
</body>
</html>
