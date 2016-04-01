<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<%@ attribute name="label" type="java.lang.String" required="true" description="文本框标签名称" %>
<%@ attribute name="id" type="java.lang.String" required="false" description="Label ID" %>
<%@ attribute name="name" type="java.lang.String" required="false" description="Label Name" %>
<%@ attribute name="value" type="java.lang.String" required="false" description="文本框的值" %>
<div class="form-group">
    <label class="control-label">${label}:</label>
    <div class="controls">
        <label class="lbl " id="${id}" name="${name}">${value}</label>
    </div>
</div>