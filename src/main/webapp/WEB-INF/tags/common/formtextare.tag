<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<%@ attribute name="label" type="java.lang.String" required="true" description="文本框标签名称" %>
<%@ attribute name="path" type="java.lang.String" required="true" description="文本框ID" %>
<%@ attribute name="type" type="java.lang.String" required="false" description="文本框类型" %>
<%@ attribute name="isRequire" type="java.lang.Boolean" required="false" description="是否必填项目" %>

<c:if test="${isRequire eq true}">
    <c:set var="required" value="required"></c:set>
</c:if>

<div class="form-group">
    <label class="control-label">${label}：</label>
    <div class="controls">
        <form:textarea path="${path}" htmlEscape="false" rows="6"  class="form-control ${required}"/>
        <c:if test="${isRequire eq true}">
            <span class="help-inline"><font color="red">*</font> </span>
        </c:if>
    </div>
</div>