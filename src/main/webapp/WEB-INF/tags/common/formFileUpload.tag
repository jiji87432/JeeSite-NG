<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<%@ attribute name="label" type="java.lang.String" required="true" description="文本框标签名称" %>
<%@ attribute name="id" type="java.lang.String" required="true" description="文本框ID" %>
<%@ attribute name="name" type="java.lang.String" required="false" description="文本框类型" %>
<%@ attribute name="helpText" type="java.lang.String" required="false" description="helpText" %>
<%@ attribute name="isRequire" type="java.lang.Boolean" required="false" description="是否必填项目" %>

<c:if test="${isRequire eq true}">
    <c:set var="required" value="required"></c:set>
</c:if>

<div class="form-group">
    <label class="control-label">${label}：</label>
    <div class="controls">
        <input type="file" id="${id}" name="${name}" class="${required} "/>
        <span class="help-inline">${helpText}</span>
    </div>
</div>