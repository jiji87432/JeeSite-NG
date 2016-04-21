<%@ page contentType="text/html;charset=UTF-8" %>
<%@include file="/WEB-INF/views/include/adminlte.jsp" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>接口列表管理</title>
	<meta name="decorator" content="default"/>
	<%@include file="/WEB-INF/views/include/adminlte.jsp" %>
	<script type="text/javascript">
		$(document).ready(function() {
			//$("#name").focus();
			$("#inputForm").validate({
				submitHandler: function(form){
					loading('正在提交，请稍等...');
					form.submit();
				},
				errorContainer: "#messageBox",
				errorPlacement: function(error, element) {
					$("#messageBox").text("输入有误，请先更正。");
					if (element.is(":checkbox")||element.is(":radio")||element.parent().is(".input-append")){
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
		<li><a href="${ctx}/sys/sysInterface/">接口列表列表</a></li>
		<li class="active"><a href="${ctx}/sys/sysInterface/form?id=${sysInterface.id}">接口列表<shiro:hasPermission name="sys:sysInterface:edit">${not empty sysInterface.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="sys:sysInterface:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="sysInterface" action="${ctx}/sys/sysInterface/save" method="post"  class="col-md-8" role="form">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>		
		<div class="form-group">
			<label class="control-label">备注信息：</label>
			<div class="controls">
				<form:textarea path="remarks" htmlEscape="false" rows="4" maxlength="255" class="form-control "/>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label">接口白名单ID：</label>
			<div class="controls">
				<form:input path="sysInterfaceId" htmlEscape="false" maxlength="64" class="form-control "/>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label">接口类名：</label>
			<div class="controls">
				<form:input path="classname" htmlEscape="false" maxlength="255" class="form-control "/>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label">接口函数名：</label>
			<div class="controls">
				<form:input path="functionname" htmlEscape="false" maxlength="255" class="form-control "/>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="sys:sysInterface:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>