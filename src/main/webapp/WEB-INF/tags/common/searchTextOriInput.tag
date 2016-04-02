<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<%@ attribute name="label" type="java.lang.String" required="true" description="文本框标签名称" %>
<%@ attribute name="id" type="java.lang.String" required="true" description="文本框PATH" %>
<%@ attribute name="name" type="java.lang.String" required="true" description="文本框PATH" %>
<%@ attribute name="value" type="java.lang.String" required="true" description="文本框PATH" %>

<div class="form-group col-sm-5">
    <label class="col-sm-4 control-label">${label}：</label>
    <div class="col-sm-8">
        <input type="text" id="${id}" name="${name}" value="${value}" class="form-control"/>
    </div>
</div>