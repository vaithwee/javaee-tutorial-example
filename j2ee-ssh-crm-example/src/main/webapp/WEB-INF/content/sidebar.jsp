<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-04-13
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<nav class="sidebar sidebar-offcanvas" id="sidebar">
    <ul class="nav">
        <li class="nav-item nav-profile">
            <a href="#" class="nav-link">
                <div class="nav-profile-image">
                    <img src="<s:url value="/images/faces/face1.jpg" />" alt="profile">
                    <span class="login-status online"></span> <!--change to offline or busy as needed-->
                </div>
                <div class="nav-profile-text d-flex flex-column">
                    <span class="font-weight-bold mb-2"><s:property value="#session.user.username" /> </span>
                    <span class="text-secondary text-small">Project Manager</span>
                </div>
                <i class="mdi mdi-bookmark-check text-success nav-profile-badge"></i>
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/index.jsp">
                <span class="menu-title">主面板</span>
                <i class="mdi mdi-home menu-icon"></i>
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#ui-basic" aria-expanded="false" aria-controls="ui-basic">
                <span class="menu-title">客户管理</span>
                <i class="menu-arrow"></i>
                <i class="mdi mdi-account-multiple menu-icon"></i>
            </a>
            <div class="collapse" id="ui-basic">
                <ul class="nav flex-column sub-menu">
                    <li class="nav-item"> <a class="nav-link" href="${pageContext.request.contextPath}/cs/addUI">添加客户</a></li>
                    <li class="nav-item"> <a class="nav-link" href="${pageContext.request.contextPath}/cs/listUI">客户列表</a></li>
                </ul>
            </div>
        </li>

        <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#ui-lm" aria-expanded="false" aria-controls="ui-lm">
                <span class="menu-title">联系人管理</span>
                <i class="menu-arrow"></i>
                <i class="mdi mdi-contacts menu-icon"></i>
            </a>
            <div class="collapse" id="ui-lm">
                <ul class="nav flex-column sub-menu">
                    <li class="nav-item"> <a class="nav-link" href="${pageContext.request.contextPath}/lm/addUI">添加联系人</a></li>
                    <li class="nav-item"> <a class="nav-link" href="${pageContext.request.contextPath}/lm/list">联系人列表</a></li>
                </ul>
            </div>
        </li>
    </ul>
</nav>
