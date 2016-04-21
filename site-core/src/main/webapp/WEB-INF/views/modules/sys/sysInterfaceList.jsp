<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>接口列表管理</title>
	<meta name="decorator" content="default"/>
	<%@include file="/WEB-INF/views/include/adminlte.jsp" %>
	<script type="text/javascript">
		$(document).ready(function() {
			
		});
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
			$("#searchForm").submit();
        	return false;
        }
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/sys/sysInterface/">接口列表列表</a></li>
		<shiro:hasPermission name="sys:sysInterface:edit"><li><a href="${ctx}/sys/sysInterface/form">接口列表添加</a></li></shiro:hasPermission>
	</ul>
	<sys:message content="${message}"/>
	<form:form id="searchForm" modelAttribute="sysInterface" action="${ctx}/sys/sysInterface/" method="post" class="row form-horizontal well" role="form">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>

			<div class="form-group col-sm-4">
                <label class="col-sm-4 control-label">接口白名单ID：</label>
                <div class="col-sm-8">
				<form:input path="sysInterfaceId" htmlEscape="false" maxlength="64" class="form-control"/>
			    </div>
            </div>
			<input id="btnSubmit" class="btn btn-primary pull-right" type="submit" value="查询"/>


	</form:form>

	<table id="contentTable" class="table table-hover">
		<thead>
			<tr>
				<td>更新时间</td>
				<td>接口白名单ID</td>
				<td>接口类名</td>
				<td>接口函数名</td>
				<shiro:hasPermission name="sys:sysInterface:edit"><td>操作</td></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="sysInterface">
			<tr>
				<td><a href="${ctx}/sys/sysInterface/form?id=${sysInterface.id}">
					<fmt:formatDate value="${sysInterface.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</a></td>
				<td>
					${sysInterface.sysInterfaceId}
				</td>
				<td>
					${sysInterface.classname}
				</td>
				<td>
					${sysInterface.functionname}
				</td>
				<shiro:hasPermission name="sys:sysInterface:edit"><td>
    				<a href="${ctx}/sys/sysInterface/form?id=${sysInterface.id}">修改</a>
					<a href="${ctx}/sys/sysInterface/delete?id=${sysInterface.id}" onclick="return confirmx('确认要删除该接口列表吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="box-tools">${page}</div>
</body>
</html>