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
                    <div class="col-12 grid-margin stretch-card">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">添加客户</h4>
                                <p class="card-description">
                                    添加客户表格
                                </p>
                                <s:form class="forms-sample" action="cs/add">
                                    <div class="form-group">
                                        <label for="username">客户名称</label>
                                        <input type="text" class="form-control" id="username" placeholder="客户名称">
                                    </div>
                                    <div class="form-group">
                                        <label for="level">客户级别</label>
                                        <input type="text" class="form-control" id="level" placeholder="客户级别">
                                    </div>
                                    <div class="form-group">
                                        <label for="source">信息来源</label>
                                        <input type="text" class="form-control" id="source" placeholder="信息来源">
                                    </div>
                                    <div class="form-group">
                                        <label for="industry">所属行业</label>
                                        <input type="text" class="form-control" id="industry" placeholder="所属行业">
                                    </div>
                                    <div class="form-group">
                                        <label for="phone">固定电话</label>
                                        <input type="text" class="form-control" id="phone" placeholder="固定电话">
                                    </div>
                                    <div class="form-group">
                                        <label for="mobile">移动电话</label>
                                        <input type="text" class="form-control" id="mobile" placeholder="移动电话">
                                    </div>
                                    <button type="submit" class="btn btn-gradient-primary mr-2">添加</button>
                                </s:form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- content-wrapper ends -->
            <!-- partial:../../partials/_footer.html -->
            <footer class="footer">
                <div class="d-sm-flex justify-content-center justify-content-sm-between">
                    <span class="text-muted text-center text-sm-left d-block d-sm-inline-block">Copyright © 2017 <a href="https://www.bootstrapdash.com/" target="_blank">Bootstrap Dash</a>. All rights reserved.</span>
                    <span class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center">Hand-crafted & made with <i class="mdi mdi-heart text-danger"></i></span>
                </div>
            </footer>
            <!-- partial -->
        </div>
        <!-- main-panel ends -->
    </div>
    <!-- page-body-wrapper ends -->
</div>
<jsp:include page="/WEB-INF/content/body-bottom.jsp" />
</body>
</body>
</html>
