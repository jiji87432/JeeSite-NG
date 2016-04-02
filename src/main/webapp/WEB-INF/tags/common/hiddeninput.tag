<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<%@ attribute name="name" type="java.lang.String" required="true" description="文本框标签名称" %>
<%@ attribute name="id" type="java.lang.String" required="true" description="文本框ID" %>
<%@ attribute name="value" type="java.lang.String" required="false" description="文本框类型" %>

<input id="${id}" type="hidden" name="${name}" value="${value}"/>