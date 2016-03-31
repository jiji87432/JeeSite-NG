<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<html>
<head>
    <title>修改密码</title>
    <meta name="decorator" content="default"/>
    <%@include file="/WEB-INF/views/include/adminlte.jsp" %>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#oldPassword").focus();
            $("#inputForm").validate({
                rules: {},
                messages: {
                    confirmNewPassword: {equalTo: "输入与上面相同的密码"}
                },
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
    <li><a href="${ctx}/sys/user/info">个人信息</a></li>
    <li class="active"><a href="${ctx}/sys/user/modifyPwd">修改密码</a></li>
</ul>
<br/>
<form:form id="inputForm" modelAttribute="user" action="${ctx}/sys/user/modifyPwd"
           method="post" class="col-md-8" role="form">
    <form:hidden path="id"/>
    <sys:message content="${message}"/>
    <common:textinput label="旧密码" id="oldPassword" name="oldPassword" type="password"
                      isRequire="${true}"></common:textinput>
    <common:textinput label="新密码" id="newPassword" name="newPassword" type="password"
                      isRequire="${true}"></common:textinput>
    <common:textinput label="确认新密码" id="confirmNewPassword" name="confirmNewPassword" type="password"
                      isRequire="${true}"></common:textinput>
    <div class="form-actions">
        <common:savebutton></common:savebutton>
    </div>
</form:form>
</body>
</html>