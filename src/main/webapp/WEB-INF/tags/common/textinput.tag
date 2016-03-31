<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<%@ attribute name="label" type="java.lang.String" required="true" description="文本框标签名称" %>
<%@ attribute name="id" type="java.lang.String" required="true" description="文本框ID" %>
<%@ attribute name="name" type="java.lang.String" required="true" description="文本框Name" %>
<%@ attribute name="type" type="java.lang.String" required="false" description="文本框类型" %>
<%@ attribute name="value" type="java.lang.String" required="false" description="文本框的值" %>
<%@ attribute name="isRequire" type="java.lang.Boolean" required="false" description="是否必填项目" %>
<div class="form-group">
    <label class="control-label">${label}:</label>
    <div class="controls">
        <input id="${id}" name="${name}" value="${value}"
               class="form-control
               <c:if test="${isRequire eq true}">required</c:if> "
               <c:if test="${!empty type}">type="${type}"</c:if>
        />
        <c:if test="${isRequire eq true}">
            <span class="help-inline"><font color="red">*</font> </span>
        </c:if>
    </div>
</div>