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
        $(function () {
            $.post("<s:url value="/bd/getDictByTypeCode" />", {"typeCode":"002"}, function(data){
                console.log(data);
                $(data).each(function (index, item) {
                    console.log("item:" + item);
                   $("#source").append("<option value=\"" + item.did + "\">" + item.itemName + "</option>");
                   $("#source option[value='${source.did}']").prop("selected", "selected");
                });
            }, "json");

            $.post("<s:url value="/bd/getDictByTypeCode" />", {"typeCode":"001"}, function(data){
                console.log(data);
                $(data).each(function (index, item) {
                    console.log("item:" + item);
                    $("#industry").append("<option value=\"" + item.did + "\">" + item.itemName + "</option>");
                    $("#industry option[value='${industry.did}']").prop("selected", "selected");
                });
            }, "json");

            $.post("<s:url value="/bd/getDictByTypeCode" />", {"typeCode":"006"}, function(data){
                console.log(data);
                $(data).each(function (index, item) {
                    console.log("item:" + item);
                    $("#level").append("<option value=\"" + item.did + "\">" + item.itemName + "</option>");
                    $("#level option[value='${level.did}']").prop("selected", "selected");
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
                    <div class="col-lg-12">
                        <s:fielderror />
                    </div>
                </div>
                <div class="row">
                    <div class="col-12 grid-margin stretch-card">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">编辑客户</h4>
                                <p class="card-description">
                                    >编辑客户表格
                                </p>
                                <s:form class="forms-sample" action="update" namespace="/cs" method="POST" enctype="multipart/form-data">
                                    <input type="hidden" value="<s:property value="cid" />" name="cid" />
                                    <input type="hidden" value="<s:property value="image" />" name="image" />
                                    <div class="form-group">
                                        <label for="username">客户名称</label>
                                        <input type="text" class="form-control" id="username" placeholder="客户名称" name="name" value="<s:property value="name" />">
                                    </div>
                                    <div class="form-group">
                                        <label for="level">客户级别</label>
                                        <select class="form-control form-control-lg" id="level" name="level.did">
                                            <option value="">--请选择--</option>

                                        </select>

                                    </div>
                                    <div class="form-group">
                                        <label for="source">信息来源</label>
                                        <select class="form-control form-control-lg" id="source" name="source.did">
                                            <option value="">--请选择--</option>

                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label for="industry">所属行业</label>
                                        <select class="form-control form-control-lg" id="industry" name="industry.did">
                                            <option value="">--请选择--</option>

                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label for="phone">固定电话</label>
                                        <input type="text" class="form-control" id="phone" placeholder="固定电话" name="phone" value="<s:property value="phone" />">
                                    </div>
                                    <div class="form-group">
                                        <label for="mobile">移动电话</label>
                                        <input type="text" class="form-control" id="mobile" placeholder="移动电话" name="mobile" value="<s:property value="mobile" />">
                                    </div>

                                    <div class="form-group">
                                        <label>资质照片</label>
                                        <input type="file" name="upload" class="file-upload-default">
                                        <div class="input-group col-xs-12">
                                            <input type="text" class="form-control file-upload-info" disabled="" placeholder="资质照片">
                                            <span class="input-group-append">
                                                 <button class="file-upload-browse btn btn-gradient-primary" type="button">上传资质照片</button>
                                             </span>
                                        </div>
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
