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
                                <form name="form" id="form" class="form-inline" action="${pageContext.request.contextPath}/lm/list">
<%--                                    <label for="username">客户名称</label>--%>
<%--                                    <input type="text" class="form-control mb-2 mr-sm-2" id="username"--%>
<%--                                           placeholder="客户名称" name="name" value="<s:property value="model.name" />">--%>


<%--                                    <label for="level">客户级别</label>--%>
<%--                                    <select class="form-control mb-2 mr-sm-2" id="level"--%>
<%--                                            name="level.did">--%>
<%--                                        <option value="">--请选择--</option>--%>

<%--                                    </select>--%>


<%--                                    <label for="source">信息来源</label>--%>
<%--                                    <select class="form-control mb-2 mr-sm-2" id="source" name="source.did">--%>
<%--                                        <option value="">--请选择--</option>--%>

<%--                                    </select>--%>


<%--                                    <label for="industry">所属行业</label>--%>
<%--                                    <select class="form-control mb-2 mr-sm-2" id="industry" name="industry.did">--%>
<%--                                        <option value="">--请选择--</option>--%>

<%--                                    </select>--%>

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
                                <h4 class="card-title">联系人列表</h4>
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
                                            联系人名称
                                        </th>
                                        <th>
                                            联系人性别
                                        </th>
                                        <th>
                                            联系人电话
                                        </th>
                                        <th>
                                            联系人手机
                                        </th>
                                        <th>
                                            联系人邮箱
                                        </th>
                                        <th>
                                            联系人QQ
                                        </th>
                                        <th>
                                            联系人位置
                                        </th>
                                        <th>
                                            备注
                                        </th>
                                        <th>

                                            所属客户
                                        </th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <s:iterator value="list">
                                        <tr>

                                            <td>
                                                <s:property value="lid"/>
                                            </td>
                                            <td>
                                                <s:property value="name"/>
                                            </td>
                                            <td>
                                                <s:property value="gender"/>
                                            </td>
                                            <td>
                                                <s:property value="phone"/>
                                            </td>
                                            <td>
                                                <s:property value="mobile"/>
                                            </td>
                                            <td>
                                                <s:property value="email"/>
                                            </td>
                                            <td>
                                                <s:property value="qq"/>
                                            </td>
                                            <td>
                                                <s:property value="position"/>
                                            </td>
                                            <td>
                                                <s:property value="mone"/>
                                            </td>
                                            <td>
                                                <s:property value="customer.name"/>
                                            </td>

                                            <td>
                                                    <%--                                               <a href="${pageContext.request.contextPath}/cs/delete?cid=<s:property value="cid" />" class="btn-link">删除</a>--%>
                                                <a href="${pageContext.request.contextPath}/lm/editUI?lid=<s:property value="lid" />"
                                                   class="btn-link">编辑</a>
                                                        <a href="${pageContext.request.contextPath}/lm/delete?lid=<s:property value="lid" />"
                                                   class="btn-link">删除</a>
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
