<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<%@ attribute name="label" type="java.lang.String" required="true" description="文本框标签名称" %>
<%@ attribute name="path" type="java.lang.String" required="true" description="实体Path" %>
<%@ attribute name="htmlEscape" type="java.lang.String" required="true" description="是否转换HTML" %>
<%@ attribute name="cssClass" type="java.lang.String" required="false" description="额外样式" %>
<%@ attribute name="readonly" type="java.lang.String" required="false" description="是否只读" %>
<div class="form-group">
    <label class="control-label">${label}:</label>
    <div class="controls">
        <form:input path="${path}" htmlEscape="false"
                    class="${cssClass} form-control" readonly="${readonly}"/>
    </div>
</div>