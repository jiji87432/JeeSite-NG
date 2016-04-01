<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<%@ attribute name="label" type="java.lang.String" required="true" description="" %>
<%@ attribute name="id" type="java.lang.String" required="true" description="" %>
<%@ attribute name="name" type="java.lang.String" required="true" description="" %>
<%@ attribute name="value" type="java.lang.String" required="true" description="" %>
<%@ attribute name="labelName" type="java.lang.String" required="false" description="" %>
<%@ attribute name="labelValue" type="java.lang.String" required="false" description="" %>
<%@ attribute name="title" type="java.lang.String" required="false" description="" %>
<%@ attribute name="url" type="java.lang.String" required="false" description="" %>
<%@ attribute name="allowClear" type="java.lang.String" required="false" description="" %>
<%@ attribute name="notAllowSelectParent" type="java.lang.String" required="false" description="" %>
<div class="col-sm-6">
    <label class="col-sm-4 control-label">${label}：</label>
    <div class="col-sm-8">
        <sys:treeselect id="${id}" name="${name}"
                        value="${value}" labelName="${labelName}"
                        labelValue="${labelValue}"
                        title="${title}" url="${url}" cssClass="form-control"
                        allowClear="${allowClear}" notAllowSelectParent="${notAllowSelectParent}"/>
    </div>
</div>