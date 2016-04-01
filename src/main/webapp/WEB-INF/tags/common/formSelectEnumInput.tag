<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<%@ attribute name="label" type="java.lang.String" required="true" description="" %>
<%@ attribute name="path" type="java.lang.String" required="true" description="" %>
<%@ attribute name="dict" type="java.lang.String" required="true" description="" %>
<%@ attribute name="isRequire" type="java.lang.Boolean" required="false" description="是否必填项目" %>
<c:if test="${isRequire eq true}">
    <c:set var="required" value="required"></c:set>
</c:if>
<div class="form-group ">
    <label class="control-label">${label}：</label>
    <div class="controls">

        <form:select path="${path}" class="form-control ${required}">
            <form:option value="" label=""/>
            <form:options items="${fns:getDictList(dict)}" itemLabel="label" itemValue="value"
                          htmlEscape="false"/>
        </form:select>
    </div>
    <c:if test="${isRequire eq true}">
        <span class="help-inline"><font color="red">*</font> </span>
    </c:if>
</div>
