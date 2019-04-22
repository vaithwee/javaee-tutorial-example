<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-04-22
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.4.0.min.js"></script>
    <script type="text/javascript">
        $(function () {
            console.log("enter page");
            $("#btn").click(function () {
              $.ajax({
                  url:"testAjax",
                  contentType:"application/json;charset=UTF-8",
                  data: '{"username":"hehe","password":"123","age":18}',
                  dataType: "json",
                  type: "post",
                  success: function (data) {
                      console.log(data);
                  }
              })
            });
        });
    </script>
</head>
<body>
<h3>Index</h3>
<a href="testString">TestString</a>
<a href="testVoid">TestVoid</a>
<a href="testModelAndView">TestModelAndView</a>
<a href="testForwardAndRedirect">TestForwardAndRedirect</a>
<button id="btn">Ajax Get Data</button>
</body>
</html>
