<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<%@ attribute name="label" type="java.lang.String" required="true" description="" %>
<%@ attribute name="id" type="java.lang.String" required="true" description="" %>
<%@ attribute name="name" type="java.lang.String" required="true" description="" %>
<%@ attribute name="dict" type="java.lang.String" required="true" description="" %>
<%@ attribute name="isRequire" type="java.lang.Boolean" required="false" description="是否必填项目" %>

<div class="form-group">
    <label class="control-label">流程分类：</label>
    <div class="controls">
        <select id="category" name="category" class="required form-control">
            <c:forEach items="${fns:getDictList('act_category')}" var="dict">
                <option value="${dict.value}">${dict.label}</option>
            </c:forEach>
        </select>
    </div>
</div>

<c:if test="${isRequire eq true}">
    <c:set var="required" value="required"></c:set>
</c:if>
<div class="form-group ">
    <label class="control-label">${label}：</label>
    <div class="controls">
        <select id="${id}" name="${name}" class="${required} form-control">
            <c:forEach items="${fns:getDictList(dict)}" var="dict">
                <option value="${dict.value}">${dict.label}</option>
            </c:forEach>
        </select>
    </div>
    <c:if test="${isRequire eq true}">
        <span class="help-inline"><font color="red">*</font> </span>
    </c:if>
</div>
