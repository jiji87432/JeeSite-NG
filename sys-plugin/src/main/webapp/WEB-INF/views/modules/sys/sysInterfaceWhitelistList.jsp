<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<html>
<head>
    <title>接口管理白名单管理</title>
    <meta name="decorator" content="default"/>
    <%@include file="/WEB-INF/views/include/adminlte.jsp" %>
    <script type="text/javascript">
        $(document).ready(function () {

        });
        function page(n, s) {
            $("#pageNo").val(n);
            $("#pageSize").val(s);
            $("#searchForm").submit();
            return false;
        }
    </script>
</head>
<body>
<ul class="nav nav-tabs">
    <li class="active"><a href="${ctx}/sys/sysInterfaceWhitelist/">接口管理白名单列表</a></li>
    <shiro:hasPermission name="sys:sysInterfaceWhitelist:edit">
        <li><a href="${ctx}/sys/sysInterfaceWhitelist/form">接口管理白名单添加</a></li>
    </shiro:hasPermission>
</ul>
<sys:message content="${message}"/>
<form:form id="searchForm" modelAttribute="sysInterfaceWhitelist" action="${ctx}/sys/sysInterfaceWhitelist/"
           method="post" class="row form-horizontal well" role="form">
    <input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
    <input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>

    <div class="form-group col-sm-4">
        <label class="col-sm-4 control-label">允许通过的主机IP或地址：</label>
        <div class="col-sm-8">
            <form:input path="hosts" htmlEscape="false" maxlength="255" class="form-control"/>
        </div>
    </div>
    <div class="form-group col-sm-4">
        <label class="col-sm-4 control-label">归属用户：</label>
        <div class="col-sm-8">
            <sys:treeselect id="user" name="user.id" value="${sysInterfaceWhitelist.user.id}" labelName="user.name"
                            labelValue="${sysInterfaceWhitelist.user.name}"
                            title="用户" url="/sys/office/treeData?type=3" cssClass="form-control" allowClear="true"
                            notAllowSelectParent="true"/>
        </div>
    </div>
    <input id="btnSubmit" class="btn btn-primary pull-right" type="submit" value="查询"/>


</form:form>

<table id="contentTable" class="table table-hover">
    <thead>
    <tr>
        <td>允许通过的主机IP或地址</td>
        <td>归属用户</td>
        <td>认证方式</td>
        <td>更新时间</td>
        <shiro:hasPermission name="sys:sysInterfaceWhitelist:edit">
            <td>操作</td>
        </shiro:hasPermission>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${page.list}" var="sysInterfaceWhitelist">
        <tr>
            <td><a href="${ctx}/sys/sysInterfaceWhitelist/form?id=${sysInterfaceWhitelist.id}">
                    ${sysInterfaceWhitelist.hosts}
            </a>
            </td>
            <td>
                    ${sysInterfaceWhitelist.user.name}
            </td>
            <td>
                    ${sysInterfaceWhitelist.authway}
            </td>
            <td>
                <fmt:formatDate value="${sysInterfaceWhitelist.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
            </td>
            <shiro:hasPermission name="sys:sysInterfaceWhitelist:edit">
                <td>
                    <a href="${ctx}/sys/sysInterfaceWhitelist/form?id=${sysInterfaceWhitelist.id}">修改</a>
                    <a href="${ctx}/sys/sysInterfaceWhitelist/delete?id=${sysInterfaceWhitelist.id}"
                       onclick="return confirmx('确认要删除该接口管理白名单吗？', this.href)">删除</a>
                </td>
            </shiro:hasPermission>
        </tr>
    </c:forEach>
    </tbody>
</table>
<div class="box-tools">${page}</div>
</body>
</html>