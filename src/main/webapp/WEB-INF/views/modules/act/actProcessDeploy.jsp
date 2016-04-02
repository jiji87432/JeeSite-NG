<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<html>
<head>
    <title>部署流程 - 流程管理</title>
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
    <li><a href="${ctx}/act/process/">流程管理</a></li>
    <li class="active"><a href="${ctx}/act/process/deploy/">部署流程</a></li>
    <li><a href="${ctx}/act/process/running/">运行中的流程</a></li>
</ul>
<br/>
<sys:message content="${message}"/>
<form id="inputForm" action="${ctx}/act/process/deploy" method="post" enctype="multipart/form-data"
      class="col-md-8" role="form">
    <common:formOriSelectEnumInput label="流程分类" id="category" name="category" dict="act_category"></common:formOriSelectEnumInput>
    <common:formFileUpload label="流程文件" id="file" name="file" isRequire="${true}" helpText="支持文件格式：zip、bar、bpmn、bpmn20.xml"></common:formFileUpload>
    <div class="form-actions">
        <common:savebutton></common:savebutton>
        <common:canclebutton></common:canclebutton>
    </div>
</form>
</body>
</html>
