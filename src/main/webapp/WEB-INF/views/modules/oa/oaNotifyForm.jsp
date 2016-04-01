<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<html>
<head>
    <title>通知管理</title>
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
    <li><a href="${ctx}/oa/oaNotify/">通知列表</a></li>
    <li class="active">
        <a href="${ctx}/oa/oaNotify/form?id=${oaNotify.id}">通知
            <shiro:hasPermission name="oa:oaNotify:edit">
                ${oaNotify.status eq '1' ? '查看' : not empty oaNotify.id ? '修改' : '添加'}
            </shiro:hasPermission>
            <shiro:lacksPermission name="oa:oaNotify:edit">查看</shiro:lacksPermission>
        </a>
    </li>
</ul>
<br/>
<form:form id="inputForm" modelAttribute="oaNotify"
           action="${ctx}/oa/oaNotify/save" method="post" class="col-md-8" role="form">
    <form:hidden path="id"/>
    <sys:message content="${message}"/>
    <common:formSelectEnumInput label="类型" path="type" dict="oa_notify_type"
                                isRequire="${true}"></common:formSelectEnumInput>
    <common:forminput label="标题" path="title" isRequire="${true}"></common:forminput>
    <common:formtextare label="内容" path="content" isRequire="${true}"></common:formtextare>
    <c:if test="${oaNotify.status ne '1'}">
        <common:ckfinderform selectMultiple="true" label="附件" path="files" id="files" htmlEscape="false"
                             uploadPath="/oa/notify"></common:ckfinderform>
        <common:formradio label="状态" path="status" dict="oa_notify_status" isRequire="${true}"
                          helptext="发布后不能进行操作"></common:formradio>
        <common:formTreeSelect label="接受人" id="oaNotifyRecord" name="oaNotifyRecordIds"
                               value="${oaNotify.oaNotifyRecordIds}" url="/sys/office/treeData?type=3"
                               notAllowSelectParent="true" checked="true" isRequire="${true}"></common:formTreeSelect>
    </c:if>
    <c:if test="${oaNotify.status eq '1'}">
        <div class="form-group">
            <label class="control-label">附件：</label>
            <div class="controls">
                <form:hidden id="files" path="files" htmlEscape="false" maxlength="255" class="input-xlarge"/>
                <sys:ckfinder input="files" type="files" uploadPath="/oa/notify" selectMultiple="true" readonly="true"/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label">接受人：</label>
            <div class="controls">
                <table id="contentTable" class="table table-hover">
                    <thead>
                    <tr>
                        <td>接受人</td>
                        <td>接受部门</td>
                        <td>阅读状态</td>
                        <td>阅读时间</td>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${oaNotify.oaNotifyRecordList}" var="oaNotifyRecord">
                        <tr>
                            <td>
                                    ${oaNotifyRecord.user.name}
                            </td>
                            <td>
                                    ${oaNotifyRecord.user.office.name}
                            </td>
                            <td>
                                    ${fns:getDictLabel(oaNotifyRecord.readFlag, 'oa_notify_read', '')}
                            </td>
                            <td>
                                <fmt:formatDate value="${oaNotifyRecord.readDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                已查阅：${oaNotify.readNum} &nbsp; 未查阅：${oaNotify.unReadNum} &nbsp;
                总共：${oaNotify.readNum + oaNotify.unReadNum}
            </div>
        </div>
    </c:if>
    <div class="form-actions" style="margin-bottom: 10px">
        <c:if test="${oaNotify.status ne '1'}">
            <shiro:hasPermission name="oa:oaNotify:edit">
                <common:savebutton></common:savebutton>&nbsp;
            </shiro:hasPermission>
        </c:if>
        <common:canclebutton></common:canclebutton>
    </div>
</form:form>
</body>
</html>