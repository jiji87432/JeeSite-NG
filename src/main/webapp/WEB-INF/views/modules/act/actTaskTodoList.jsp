<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<html>
<head>
    <title>待办任务</title>
    <meta name="decorator" content="default"/>
    <script type="text/javascript">
        $(document).ready(function () {

        });
        /**
         * 签收任务
         */
        function claim(taskId) {
            $.get('${ctx}/act/task/claim', {taskId: taskId}, function (data) {
                if (data == 'true') {
                    top.alert('签收完成');
                    location = '${ctx}/act/task/todo/';
                } else {
                    top.alert('签收失败');
                }
            });
        }
    </script>
</head>
<body>
<ul class="nav nav-tabs">
    <li class="active"><a href="${ctx}/act/task/todo/">待办任务</a></li>
    <li><a href="${ctx}/act/task/historic/">已办任务</a></li>
    <li><a href="${ctx}/act/task/process/">新建任务</a></li>
</ul>
<form:form id="searchForm" modelAttribute="act" action="${ctx}/act/task/todo/" method="get"
           class="row form-horizontal well" role="form">
    <common:searchSelectEnumInput label="流程类型" path="procDefKey" startLabel="全部流程"
                                  dict="act_type"></common:searchSelectEnumInput>
    <common:searchDatePicker></common:searchDatePicker>
    <div class="form-group col-sm-4">
        <div class="col-sm-8">
            <common:searchButton></common:searchButton>
        </div>
    </div>
</form:form>
<sys:message content="${message}"/>
<table id="contentTable" class="table table-hover">
    <thead>
    <tr>
        <td>标题</td>
        <td>当前环节</td>
        <td>流程名称</td>
        <td>流程版本</td>
        <td>创建时间</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="act">
        <c:set var="task" value="${act.task}"/>
        <c:set var="vars" value="${act.vars}"/>
        <c:set var="procDef" value="${act.procDef}"/><%--
				<c:set var="procExecUrl" value="${act.procExecUrl}" /> --%>
        <c:set var="status" value="${act.status}"/>
        <tr>
            <td>
                <c:if test="${empty task.assignee}">
                    <a href="javascript:claim('${task.id}');"
                       title="签收任务">${fns:abbr(not empty act.vars.map.title ? act.vars.map.title : task.id, 60)}</a>
                </c:if>
                <c:if test="${not empty task.assignee}">
                    <a href="${ctx}/act/task/form?taskId=${task.id}&taskName=${fns:urlEncode(task.name)}&taskDefKey=${task.taskDefinitionKey}&procInsId=${task.processInstanceId}&procDefId=${task.processDefinitionId}&status=${status}">${fns:abbr(not empty vars.map.title ? vars.map.title : task.id, 60)}</a>
                </c:if>
            </td>
            <td>
                <a target="_blank"
                   href="${pageContext.request.contextPath}/act/rest/diagram-viewer?processDefinitionId=${task.processDefinitionId}&processInstanceId=${task.processInstanceId}">${task.name}</a>
            </td>
                <%--
                                    <td>${task.description}</td> --%>
            <td>${procDef.name}</td>
            <td><b title='流程版本号'>V: ${procDef.version}</b></td>
            <td><fmt:formatDate value="${task.createTime}" type="both"/></td>
            <td>
                <c:if test="${empty task.assignee}">
                    <a href="javascript:claim('${task.id}');">签收任务</a>
                </c:if>
                <c:if test="${not empty task.assignee}"><%--
							<a href="${ctx}${procExecUrl}/exec/${task.taskDefinitionKey}?procInsId=${task.processInstanceId}&act.taskId=${task.id}">办理</a> --%>
                    <a href="${ctx}/act/task/form?taskId=${task.id}&taskName=${fns:urlEncode(task.name)}&taskDefKey=${task.taskDefinitionKey}&procInsId=${task.processInstanceId}&procDefId=${task.processDefinitionId}&status=${status}">任务办理</a>
                </c:if>
                <shiro:hasPermission name="act:process:edit">
                    <c:if test="${empty task.executionId}">
                        <a href="${ctx}/act/task/deleteTask?taskId=${task.id}&reason="
                           onclick="return promptx('删除任务','删除原因',this.href);">删除任务</a>
                    </c:if>
                </shiro:hasPermission>
                <a target="_blank"
                   href="${pageContext.request.contextPath}/act/rest/diagram-viewer?processDefinitionId=${task.processDefinitionId}&processInstanceId=${task.processInstanceId}">跟踪1</a>
                <a target="_blank"
                   href="${ctx}/act/task/trace/photo/${task.processDefinitionId}/${task.executionId}">跟踪2</a><%--
						<a target="_blank" href="${ctx}/act/task/trace/info/${task.processInstanceId}">跟踪信息</a> --%>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
