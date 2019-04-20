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
                    <div class="col-lg-12">
                        <s:fielderror />
                    </div>
                </div>
                <div class="row">
                    <div class="col-12 grid-margin stretch-card">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">添加联系人</h4>
                                <p class="card-description">
                                    添加联系人
                                </p>
                                <s:form class="forms-sample" action="lm/save" method="POST" enctype="multipart/form-data" theme="simple">
                                    <div class="form-group">
                                        <label for="cid">所属客户</label>
                                        <s:select list="list" name="customer.cid" headerKey="" headerValue="--请选择--" listKey="cid" listValue="name" id="cid" cssClass="form-control form-control-lg"  />
                                    </div>
                                    <div class="form-group">
                                        <label for="name">联系人名称</label>
                                        <s:textfield type="text" class="form-control" id="name" placeholder="客户名称" name="name" />
                                    </div>
                                    <div class="form-group">
                                        <label for="gender">性别</label>
                                        <select class="form-control form-control-lg" id="gender" name="gender">
                                            <option value="">--请选择--</option>
                                            <option value="男">男</option>
                                            <option value="女">女</option>
                                        </select>

                                    </div>


                                    <div class="form-group">
                                        <label for="phone">固定电话</label>
                                        <s:textfield type="text" class="form-control" id="phone" placeholder="固定电话" name="phone" />
                                    </div>
                                    <div class="form-group">
                                        <label for="mobile">移动电话</label>
                                        <s:textfield type="text" class="form-control" id="mobile" placeholder="移动电话" name="mobile" />
                                    </div>
                                    <div class="form-group">
                                        <label for="email">邮箱</label>
                                        <s:textfield type="email" class="form-control" id="email" placeholder="邮箱" name="email" />
                                    </div>
                                    <div class="form-group">
                                        <label for="qq">QQ</label>
                                        <s:textfield type="text" class="form-control" id="qq" placeholder="QQ" name="qq" />
                                    </div>
                                    <div class="form-group">
                                        <label for="position">位置</label>
                                        <s:textfield type="text" class="form-control" id="position" placeholder="位置" name="position" />
                                    </div>
                                    <div class="form-group">
                                        <label for="mone">备注</label>
                                        <s:textfield type="text" class="form-control" id="mone" placeholder="备注" name="mone" />
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
