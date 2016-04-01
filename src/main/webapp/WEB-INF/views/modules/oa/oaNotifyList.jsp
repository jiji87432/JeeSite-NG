<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<html>
<head>
    <title>通知管理</title>
    <meta name="decorator" content="default"/>
    <script type="text/javascript">
        $(document).ready(function () {

        });
        function page(n, s) {
            $("#pageNo").val(n);
            $("#pageSize").val(s);
            $("#searchForm").submit();
            return false;
        }
    </script>
</head>
<body>
<ul class="nav nav-tabs">
    <li class="active"><a href="${ctx}/oa/oaNotify/${oaNotify.self?'self':''}">通知列表</a></li>
    <c:if test="${!oaNotify.self}"><shiro:hasPermission name="oa:oaNotify:edit">
        <li><a href="${ctx}/oa/oaNotify/form">通知添加</a></li>
    </shiro:hasPermission></c:if>
</ul>
<form:form id="searchForm" modelAttribute="oaNotify"
           action="${ctx}/oa/oaNotify/${oaNotify.self?'self':''}" method="post"
           class="row form-horizontal well" role="form">
    <common:pagehiddeninfo></common:pagehiddeninfo>
    <common:searchtextinput label="标题" path="title"></common:searchtextinput>
    <common:searchSelectEnumInput label="类型" path="type" dict="oa_notify_type"></common:searchSelectEnumInput>
    <c:if test="${!requestScope.oaNotify.self}">
        <common:searchRadioEnumInput label="状态" path="status" dict="oa_notify_status"></common:searchRadioEnumInput>
    </c:if>
    <common:searchButton></common:searchButton>

</form:form>
<sys:message content="${message}"/>
<table id="contentTable" class="table table-hover">
    <thead>
    <tr>
        <td>标题</td>
        <td>类型</td>
        <td>状态</td>
        <td>查阅状态</td>
        <td>更新时间</td>
        <c:if test="${!oaNotify.self}">
            <shiro:hasPermission name="oa:oaNotify:edit">
                <td>操作</td>
            </shiro:hasPermission>
        </c:if>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${page.list}" var="oaNotify">
        <tr>
            <td><a href="${ctx}/oa/oaNotify/${requestScope.oaNotify.self?'view':'form'}?id=${oaNotify.id}">
                    ${fns:abbr(oaNotify.title,50)}
            </a></td>
            <td>
                    ${fns:getDictLabel(oaNotify.type, 'oa_notify_type', '')}
            </td>
            <td>
                    ${fns:getDictLabel(oaNotify.status, 'oa_notify_status', '')}
            </td>
            <td>
                <c:if test="${requestScope.oaNotify.self}">
                    ${fns:getDictLabel(oaNotify.readFlag, 'oa_notify_read', '')}
                </c:if>
                <c:if test="${!requestScope.oaNotify.self}">
                    ${oaNotify.readNum} / ${oaNotify.readNum + oaNotify.unReadNum}
                </c:if>
            </td>
            <td>
                <fmt:formatDate value="${oaNotify.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
            </td>
            <c:if test="${!requestScope.oaNotify.self}"><shiro:hasPermission name="oa:oaNotify:edit">
                <td>
                    <a href="${ctx}/oa/oaNotify/form?id=${oaNotify.id}">修改</a>
                    <a href="${ctx}/oa/oaNotify/delete?id=${oaNotify.id}"
                       onclick="return confirmx('确认要删除该通知吗？', this.href)">删除</a>
                </td>
            </shiro:hasPermission></c:if>
        </tr>
    </c:forEach>
    </tbody>
</table>
<div class="box-tools">${page}</div>
</body>
</html>