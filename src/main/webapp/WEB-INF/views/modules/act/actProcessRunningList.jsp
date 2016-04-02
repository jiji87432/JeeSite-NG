<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<html>
<head>
    <title>运行中的流程</title>
    <meta name="decorator" content="default"/>
</head>
<body>
<ul class="nav nav-tabs">
    <li><a href="${ctx}/act/process/">流程管理</a></li>
    <li><a href="${ctx}/act/process/deploy/">部署流程</a></li>
    <li class="active"><a href="${ctx}/act/process/running/">运行中的流程</a></li>
</ul>
<form id="searchForm" action="${ctx}/act/process/running/" method="post" class="row form-horizontal well" role="form">
    <common:searchTextOriInput label="流程实例ID" id="procInsId" name="procInsId" value="${procInsId}"></common:searchTextOriInput>
    <common:searchTextOriInput label="流程实例ID" id="procDefKey" name="procDefKey" value="${procDefKey}"></common:searchTextOriInput>
    <div class=" col-sm-offset-9">
        <common:searchButton></common:searchButton>
    </div>
</form>
<sys:message content="${message}"/>
<table class="table table-hover">
    <thead>
    <tr>
        <td>执行ID</td>
        <td>流程实例ID</td>
        <td>流程定义ID</td>
        <td>当前环节</td>
        <td>是否挂起</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${page.list}" var="procIns">
        <tr>
            <td>${procIns.id}</td>
            <td>${procIns.processInstanceId}</td>
            <td>${procIns.processDefinitionId}</td>
            <td>${procIns.activityId}</td>
            <td>${procIns.suspended}</td>
            <td>
                <shiro:hasPermission name="act:process:edit">
                    <a href="${ctx}/act/process/deleteProcIns?procInsId=${procIns.processInstanceId}&reason="
                       onclick="return promptx('删除流程','删除原因',this.href);">删除流程</a>
                </shiro:hasPermission>&nbsp;
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<div class="box-tools">${page}</div>
</body>
</html>
