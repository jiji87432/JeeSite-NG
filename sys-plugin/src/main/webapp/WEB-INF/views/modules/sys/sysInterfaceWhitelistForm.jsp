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
        function addRow(list, idx, tpl, row) {
            $(list).append(Mustache.render(tpl, {
                idx: idx, delBtn: true, row: row
            }));
            $(list + idx).find("select").each(function () {
                $(this).val($(this).attr("data-value"));
            });
            $(list + idx).find("input[type='checkbox'], input[type='radio']").each(function () {
                var ss = $(this).attr("data-value").split(',');
                for (var i = 0; i < ss.length; i++) {
                    if ($(this).val() == ss[i]) {
                        $(this).attr("checked", "checked");
                    }
                }
            });
        }
        function delRow(obj, prefix) {
            var id = $(prefix + "_id");
            var delFlag = $(prefix + "_delFlag");
            if (id.val() == "") {
                $(obj).parent().parent().remove();
            } else if (delFlag.val() == "0") {
                delFlag.val("1");
                $(obj).html("&divide;").attr("title", "撤销删除");
                $(obj).parent().parent().addClass("error");
            } else if (delFlag.val() == "1") {
                delFlag.val("0");
                $(obj).html("&times;").attr("title", "删除");
                $(obj).parent().parent().removeClass("error");
            }
        }
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
        <label class="control-label">允许通过的主机IP或地址：</label>
        <div class="controls">
            <form:input path="hosts" htmlEscape="false" maxlength="255" class="form-control "/>
        </div>
    </div>
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
        <label class="control-label">认证方式：</label>
        <div class="controls">
            <form:input path="authway" htmlEscape="false" maxlength="255" class="form-control "/>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label">接口列表：</label>
        <div class="controls">
            <table id="contentTable" class="table table-hover">
                <thead>
                <tr>
                    <td class="hide"></td>
                    <td>接口地址</td>
                    <td>备注信息</td>
                    <shiro:hasPermission name="sys:sysInterfaceWhitelist:edit">
                        <td width="10">&nbsp;</td>
                    </shiro:hasPermission>
                </tr>
                </thead>
                <tbody id="sysInterfaceList">
                </tbody>
                <shiro:hasPermission name="sys:sysInterfaceWhitelist:edit">
                    <tfoot>
                    <tr>
                        <td colspan="4"><a href="javascript:"
                                           onclick="addRow('#sysInterfaceList', sysInterfaceRowIdx, sysInterfaceTpl);sysInterfaceRowIdx = sysInterfaceRowIdx + 1;"
                                           class="btn">新增</a></td>
                    </tr>
                    </tfoot>
                </shiro:hasPermission>
            </table>
            <script type="text/template" id="sysInterfaceTpl">//<!--
						<tr id="sysInterfaceList{{idx}}">
							<td class="hide">
								<input id="sysInterfaceList{{idx}}_id" name="sysInterfaceList[{{idx}}].id" type="hidden" value="{{row.id}}"/>
								<input id="sysInterfaceList{{idx}}_delFlag" name="sysInterfaceList[{{idx}}].delFlag" type="hidden" value="0"/>
							</td>
							<td>
								<input id="sysInterfaceList{{idx}}_interfaceurl" name="sysInterfaceList[{{idx}}].interfaceurl" type="text" value="{{row.interfaceurl}}" maxlength="255" class="form-control "/>
							</td>
							<td>
								<textarea id="sysInterfaceList{{idx}}_remarks" name="sysInterfaceList[{{idx}}].remarks" rows="4" maxlength="255" class="form-control ">{{row.remarks}}</textarea>
							</td>
							<shiro:hasPermission name="sys:sysInterfaceWhitelist:edit"><td class="text-center" width="10">
								{{#delBtn}}<span class="close" onclick="delRow(this, '#sysInterfaceList{{idx}}')" title="删除">&times;</span>{{/delBtn}}
							</td></shiro:hasPermission>
						</tr>//-->
            </script>
            <script type="text/javascript">
                var sysInterfaceRowIdx = 0, sysInterfaceTpl = $("#sysInterfaceTpl").html().replace(/(\/\/\<!\-\-)|(\/\/\-\->)/g, "");
                $(document).ready(function () {
                    var data = ${fns:toJson(sysInterfaceWhitelist.sysInterfaceList)};
                    for (var i = 0; i < data.length; i++) {
                        addRow('#sysInterfaceList', sysInterfaceRowIdx, sysInterfaceTpl, data[i]);
                        sysInterfaceRowIdx = sysInterfaceRowIdx + 1;
                    }
                });
            </script>
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