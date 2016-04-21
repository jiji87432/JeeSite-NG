<%@ page contentType="text/html;charset=UTF-8" %>
<%@include file="/WEB-INF/views/include/adminlte.jsp" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<html>
<head>
    <title>接口管理白名单管理</title>
    <meta name="decorator" content="default"/>
    <%@include file="/WEB-INF/views/include/adminlte.jsp" %>
    <script type="text/javascript">
        $(document).ready(function () {
            //$("#name").focus();
            $("#inputForm").validate({
                submitHandler: function (form) {
                    loading('正在提交，请稍等...');
                    form.submit();
                },
                errorContainer: "#messageBox",
                errorPlacement: function (error, element) {
                    $("#messageBox").text("输入有误，请先更正。");
                    if (element.is(":checkbox") || element.is(":radio") || element.parent().is(".input-append")) {
                        error.appendTo(element.parent().parent());
                    } else {
                        error.insertAfter(element);
                    }
                }
            });
        });
    </script>
</head>
<body>
<ul class="nav nav-tabs">
    <li><a href="${ctx}/sys/sysInterfaceWhitelist/">接口管理白名单列表</a></li>
    <li class="active"><a
            href="${ctx}/sys/sysInterfaceWhitelist/form?id=${sysInterfaceWhitelist.id}">接口管理白名单<shiro:hasPermission
            name="sys:sysInterfaceWhitelist:edit">${not empty sysInterfaceWhitelist.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission
            name="sys:sysInterfaceWhitelist:edit">查看</shiro:lacksPermission></a></li>
</ul>
<br/>
<form:form id="inputForm" modelAttribute="sysInterfaceWhitelist" action="${ctx}/sys/sysInterfaceWhitelist/save"
           method="post" class="col-md-8" role="form">
    <form:hidden path="id"/>
    <sys:message content="${message}"/>
    <div class="form-group">
        <label class="control-label">归属用户：</label>
        <div class="controls">
            <sys:treeselect id="user" name="user.id" value="${sysInterfaceWhitelist.user.id}" labelName="user.name"
                            labelValue="${sysInterfaceWhitelist.user.name}"
                            title="用户" url="/sys/office/treeData?type=3" cssClass="form-control " allowClear="true"
                            notAllowSelectParent="true"/>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label">允许通过的主机IP或地址：</label>
        <div class="controls">
            <form:input path="hosts" htmlEscape="false" maxlength="255" class="form-control "/>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label">认证方式：</label>
        <div class="controls">
            <form:input path="authway" htmlEscape="false" maxlength="255" class="form-control "/>
        </div>
    </div>
    <div class="form-actions">
        <shiro:hasPermission name="sys:sysInterfaceWhitelist:edit"><input id="btnSubmit" class="btn btn-primary"
                                                                          type="submit"
                                                                          value="保 存"/>&nbsp;</shiro:hasPermission>
        <input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
    </div>
</form:form>
</body>
</html>