<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<%@ attribute name="id" type="java.lang.String" required="true" description="" %>
<%@ attribute name="dict" type="java.lang.String" required="true" description="" %>
<%@ attribute name="startLabel" type="java.lang.String" required="false" description="" %>
<div class="col-sm-3">
    <select id="${id}" name="${id}" class="form-control">
        <option value="">${startLabel}</option>
        <c:forEach items="${fns:getDictList(dict)}" var="dict">
            <option value="${dict.value}" ${dict.value==category?'selected':''}>${dict.label}</option>
        </c:forEach>
    </select>
</div>