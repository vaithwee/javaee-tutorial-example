<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-04-13
  Time: 19:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <s:include value="/WEB-INF/content/header.jsp"></s:include>
    <script>
        function toPage(page) {
            // alert(page);
            if (page == $("#pageIndex").valueOf()) {
                return;
            }
            $("#pageIndex").val(page);
            document.form.submit();
        }
    </script>


    <script>
        $(function () {
            $.post("<s:url value="/bd/getDictByTypeCode" />", {"typeCode": "002"}, function (data) {
                console.log(data);
                $(data).each(function (index, item) {
                    console.log("item:" + item);
                    $("#source").append("<option value=\"" + item.did + "\">" + item.itemName + "</option>");
                    $("#source option[value='${model.source.did}']").prop("selected", "selected");
                });
            }, "json");

            $.post("<s:url value="/bd/getDictByTypeCode" />", {"typeCode": "001"}, function (data) {
                console.log(data);
                $(data).each(function (index, item) {
                    console.log("item:" + item);
                    $("#industry").append("<option value=\"" + item.did + "\">" + item.itemName + "</option>");
                    $("#industry option[value='${model.industry.did}']").prop("selected", "selected");
                });
            }, "json");

            $.post("<s:url value="/bd/getDictByTypeCode" />", {"typeCode": "006"}, function (data) {
                console.log(data);
                $(data).each(function (index, item) {
                    console.log("item:" + item);
                    $("#level").append("<option value=\"" + item.did + "\">" + item.itemName + "</option>");
                    $("#level option[value='${model.level.did}']").prop("selected", "selected");
                });
            }, "json");
        });
    </script>
</head>
<body>
<div class="container-scroller">
    <!-- partial:partials/_navbar.html -->
    <jsp:include page="/WEB-INF/content/nav-bar.jsp"></jsp:include>

    <!-- partial -->
    <div class="container-fluid page-body-wrapper">
        <!-- partial:partials/_sidebar.html -->
        <jsp:include page="/WEB-INF/content/sidebar.jsp"></jsp:include>
        <!-- partial -->
        <div class="main-panel">
            <div class="content-wrapper">
                <div class="row">
                    <div class="col-lg-12 grid-margin stretch-card">
                        <div class="card">
                            <div class="card-body">
                                <h5 class="card-title">条件</h5>
                                <form class="form-inline" action="${pageContext.request.contextPath}/cs/listUI">
                                    <label for="username">客户名称</label>
                                    <input type="text" class="form-control mb-2 mr-sm-2" id="username"
                                           placeholder="客户名称" name="name" value="<s:property value="model.name" />">


                                    <label for="level">客户级别</label>
                                    <select class="form-control mb-2 mr-sm-2" id="level"
                                            name="level.did">
                                        <option value="">--请选择--</option>

                                    </select>


                                    <label for="source">信息来源</label>
                                    <select class="form-control mb-2 mr-sm-2" id="source" name="source.did">
                                        <option value="">--请选择--</option>

                                    </select>


                                    <label for="industry">所属行业</label>
                                    <select class="form-control mb-2 mr-sm-2" id="industry" name="industry.did">
                                        <option value="">--请选择--</option>

                                    </select>

                                    <input type="hidden" value="0" name="pageIndex"
                                           id="pageIndex"/>

                                    <button class="btn btn-gradient-primary mr-2" type="submit">查询</button>

                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-12 grid-margin stretch-card">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">客户列表</h4>
                                <p class="card-description">
                                    Add class <code>.table-striped</code>
                                </p>
                                <table class="table table-striped">
                                    <thead>
                                    <tr>
                                        <th>
                                            ID
                                        </th>
                                        <th>
                                            客户名称
                                        </th>
                                        <th>
                                            客户级别
                                        </th>
                                        <th>
                                            客户来源
                                        </th>
                                        <th>
                                            客户所属行业
                                        </th>
                                        <th>
                                            电话
                                        </th>
                                        <th>
                                            手机
                                        </th>
                                        <th>

                                            操作
                                        </th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <s:iterator value="list">
                                        <tr>

                                            <td>
                                                <s:property value="cid"/>
                                            </td>
                                            <td>
                                                <s:property value="name"/>
                                            </td>
                                            <td>
                                                <s:property value="level.itemName"/>
                                            </td>
                                            <td>
                                                <s:property value="source.itemName"/>
                                            </td>
                                            <td>
                                                <s:property value="industry.itemName"/>
                                            </td>
                                            <td>
                                                <s:property value="phone"/>
                                            </td>
                                            <td>
                                                <s:property value="mobile"/>
                                            </td>
                                            <td>
                                                    <%--                                               <a href="${pageContext.request.contextPath}/cs/delete?cid=<s:property value="cid" />" class="btn-link">删除</a>--%>
                                                <a href="${pageContext.request.contextPath}/cs/editUI?cid=<s:property value="cid" />"
                                                   class="btn-link">编辑</a>
                                            </td>

                                        </tr>
                                    </s:iterator>


                                    </tbody>
                                    <tfoot>
                                    </tfoot>
                                </table>
                            </div>
                            <div class="col-md-8 offset-2">


                                <div class="btn-group" role="group" aria-label="Basic example">
                                    <button type="button"
                                            class="btn btn-primary <s:if test="pageIndex==0">disabled</s:if>"
                                            onclick="toPage(0)">首页
                                    </button>
                                    <s:iterator begin="0" end="totalPage-1" var="pn">
                                        <button onclick="toPage(<s:property value="pn"/>)"
                                                type="button"
                                                class="btn btn-outline-secondary <s:if test="#pn==pageIndex">active</s:if> ">
                                            <s:property value="#pn+1"/></button>
                                    </s:iterator>
                                    <button type="button"
                                            class="btn btn-primary <s:if test="pageIndex==totalPage-1">disabled</s:if>"
                                            onclick="toPage(
                                            <s:property value="totalPage-1"/> )">末页
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- content-wrapper ends -->
            <!-- partial:../../partials/_footer.html -->
            <footer class="footer">
                <div class="d-sm-flex justify-content-center justify-content-sm-between">
                                <span class="text-muted text-center text-sm-left d-block d-sm-inline-block">Copyright © 2017 <a
                                        href="https://www.bootstrapdash.com/" target="_blank">Bootstrap Dash</a>. All rights reserved.</span>
                    <span class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center">Hand-crafted & made with <i
                            class="mdi mdi-heart text-danger"></i></span>
                </div>
            </footer>
            <!-- partial -->
        </div>
        <!-- main-panel ends -->
    </div>
    <!-- page-body-wrapper ends -->
</div>
<jsp:include page="/WEB-INF/content/body-bottom.jsp"/>
</body>
</html>
