<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<html>
<head>
    <title>新建模型 - 模型管理</title>
    <meta name="decorator" content="default"/>
    <%@include file="/WEB-INF/views/include/adminlte.jsp" %>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#inputForm").validate({
                submitHandler: function (form) {
                    loading('正在提交，请稍等...');
                    form.submit();
                    setTimeout(function () {
                        location = '${ctx}/act/model/'
                    }, 1000);
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
        function page(n, s) {
            location = '${ctx}/act/model/?pageNo=' + n + '&pageSize=' + s;
        }
    </script>
</head>
<body>
<ul class="nav nav-tabs">
    <li><a href="${ctx}/act/model/">模型管理</a></li>
    <li class="active"><a href="${ctx}/act/model/create">新建模型</a></li>
</ul>
<br/>
<sys:message content="${message}"/>
<form id="inputForm" action="${ctx}/act/model/create" target="_blank" method="post"
      class="col-md-8" role="form">
    <common:formOriSelectEnumInput isRequire="${true}" label="流程分类" id="category" name="category"
                                   dict="act_category"></common:formOriSelectEnumInput>
    <common:textinput label="模块名称" id="name" name="name" isRequire="${true}"></common:textinput>
    <common:textinput label="模块标识" id="key" name="key" isRequire="${true}"></common:textinput>
    <common:textinput label="模块描述" id="description" name="description" isRequire="${true}"></common:textinput>
    <div class="form-actions">
        <common:savebutton></common:savebutton>
        <common:canclebutton></common:canclebutton>
    </div>
</form>
</body>
</html>
