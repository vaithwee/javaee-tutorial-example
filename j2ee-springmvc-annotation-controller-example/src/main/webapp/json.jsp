<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-04-27
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.4.0.min.js"></script>
    <script type="text/javascript" src="js/json2.js"></script>
    <script>
        $(function () {
            $.ajax("${pageContext.request.contextPath}/json/testRequestBody",
                {
                    dataType: "json",
                    type:"post",
                    contentType: "application/json",
                    data: JSON.stringify({id: 1, name : "hello, spring mvc"}),
                    async: true,
                    success: function (data) {
                        console.log(data);
                        $("#id").html(data.id);
                        $("#name").html(data.name);
                        $("#author").html(data.author);
                    },
                    error: function () {
                        alert("数据发送失败");
                    }
                });

            $.post("${pageContext.request.contextPath}/json/testResponseBody", null, function (data) {
               $.each(data, function () {
                   var tr = $("<tr align='center' />");
                   $("<td/>").html(this.id).appendTo(tr);
                   $("<td/>").html(this.name).appendTo(tr);
                   $("<td/>").html(this.author).appendTo(tr);
                   $("#booktable").append(tr)
               }) ;
            });

            var xmlData = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<book>\n" +
                "    <id>1</id>\n" +
                "    <name>java ee</name>\n" +
                "    <autho>Wee</autho>\n" +
                "</book>";
            $.ajax("${pageContext.request.contextPath}/json/xml",
                {
                    type: "POST",
                    contentType: "application/xml",
                    data: xmlData,
                    async: true,
                });

            $.ajax("${pageContext.request.contextPath}/json/readxml",
                {
                    dataType: "text",
                    type: "POST",
                    async: true,
                    success: function (xml) {
                        var id = $("id", xml).text();
                        var name = $("name", xml).text();
                        var author = $("author", xml).text();

                        var tr = $("<tr align='center' />");
                        $("<td/>").html(id).appendTo(tr);
                        $("<td/>").html(name).appendTo(tr);
                        $("<td/>").html(author).appendTo(tr);
                        $("#booktable").append(tr)
                    },
                    error: function () {
                        alert("read xml error");
                    }
                });
        })
    </script>
</head>
<body>
<span id="id"></span><br />
<span id="name"></span><br />
<span id="author"></span>


<hr />
<table id="booktable" border="1" style="border-collapse: collapse">
    <tr align="center">
        <th>编号</th>
        <th>书名</th>
        <th>作者</th>
    </tr>
</table>
</body>
</html>
