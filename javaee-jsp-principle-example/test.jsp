<%@ page contentType="text/html;charset=utf-8" language="java" %>
<html>
    <head>
        <title>第二个JSP页面</title>
    </head>
    <body>
        <%
            for (int i = 0 ; i < 7 ; ++i) {
                out.println("<font size='" + i + "'>");
        %>
        疯狂Java训练营(Wild Java Camp)</font><br />
        <%
            }
        %>
    </body>
</html>