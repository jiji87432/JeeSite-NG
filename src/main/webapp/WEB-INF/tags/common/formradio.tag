<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<%@ attribute name="label" type="java.lang.String" required="true" description="" %>
<%@ attribute name="path" type="java.lang.String" required="true" description="" %>
<%@ attribute name="dict" type="java.lang.String" required="false" description="" %>
<%@ attribute name="isRequire" type="java.lang.Boolean" required="false" description="" %>
<%@ attribute name="helptext" type="java.lang.String" required="false" description="" %>

<c:if test="${isRequire eq true}">
    <c:set var="required" value="required"></c:set>
</c:if>

<div class="form-group">
    <label class="control-label">${label}：</label>
    <div class="controls">
        <form:radiobuttons path="${path}" items="${fns:getDictList(dict)}" itemLabel="label"
                           itemValue="value" htmlEscape="false" class="${required}"/>
        <span class="help-inline">
            <c:if test="${isRequire eq true}">
                <font color="red">*</font>
            </c:if>
            <c:if test="${!empty helptext}">
                ${helptext}
            </c:if>
        </span>
    </div>
</div>
