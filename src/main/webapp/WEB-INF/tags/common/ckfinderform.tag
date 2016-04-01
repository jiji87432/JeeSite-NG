<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<%@ attribute name="label" type="java.lang.String" required="true" description="文本框标签名称" %>
<%@ attribute name="path" type="java.lang.String" required="true" description="实体Path" %>
<%@ attribute name="id" type="java.lang.String" required="true" description="表单ID" %>
<%@ attribute name="htmlEscape" type="java.lang.String" required="true" description="是否转换HTML" %>
<%@ attribute name="cssClass" type="java.lang.String" required="false" description="额外样式" %>
<%@ attribute name="readonly" type="java.lang.String" required="false" description="是否只读" %>
<%@ attribute name="uploadPath" type="java.lang.String" required="true" description="上传路径" %>
<%@ attribute name="selectMultiple" type="java.lang.String" required="true" description="是否多选" %>

<div class="form-group">
    <label class="control-label">${label}:</label>
    <div class="controls">
        <form:hidden id="${id}" path="${path}" htmlEscape="false" maxlength="255" class="input-xlarge"/>
        <sys:ckfinder input="${id}" type="images" uploadPath="${uploadPath}" selectMultiple="${selectMultiple}" maxWidth="100"
                      maxHeight="100"/>
    </div>
</div>