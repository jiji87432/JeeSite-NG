<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<html>
<head>
    <title>个人信息</title>
    <meta name="decorator" content="default"/>
    <%@include file="/WEB-INF/views/include/adminlte.jsp" %>
    <script type="text/javascript">
        $(document).ready(function () {
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
    <li class="active"><a href="${ctx}/sys/user/info">个人信息</a></li>
    <li><a href="${ctx}/sys/user/modifyPwd">修改密码</a></li>
</ul>
<br/>
<form:form id="inputForm" modelAttribute="user" action="${ctx}/sys/user/info"
           method="post" class="col-md-8" role="form">
    <sys:message content="${message}"/>
    <common:ckfinderform label="头像" path="photo" id="nameImage" htmlEscape="false"></common:ckfinderform>
    <common:labelgroup label="归属公司" value="${user.company.name}"></common:labelgroup>
    <common:labelgroup label="归属部门" value="${user.office.name}"></common:labelgroup>
    <common:formtextinput label="姓名" path="name" htmlEscape="false" readonly="true"></common:formtextinput>
    <common:formtextinput label="邮箱" path="email" htmlEscape="false" readonly="false"
                          cssClass="email"></common:formtextinput>
    <common:formtextinput label="电话" path="phone" htmlEscape="false" readonly="false"></common:formtextinput>
    <common:formtextinput label="手机" path="mobile" htmlEscape="false" readonly="false"></common:formtextinput>
    <common:formtextinput label="备注" path="remarks" htmlEscape="false" readonly="false"></common:formtextinput>
    <common:labelgroup label="用户类型"
                       value="${fns:getDictLabel(user.userType, 'sys_user_type', '无')}"></common:labelgroup>
    <common:labelgroup label="用户角色" value="${user.roleNames}"></common:labelgroup>

    <fmt:formatDate
            value="${user.oldLoginDate}" type="both" dateStyle="full" var="oldLogin"/>
    <common:labelgroup label="上次登录"
                       value="IP: ${user.oldLoginIp}<br/>时间：${oldLogin}"></common:labelgroup>
    <div class="form-actions" style="margin-bottom: 10px">
        <common:savebutton></common:savebutton>
    </div>
</form:form>
</body>
</html>