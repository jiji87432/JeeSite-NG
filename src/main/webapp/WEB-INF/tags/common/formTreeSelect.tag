<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<%@ attribute name="label" type="java.lang.String" required="true" description="" %>
<%@ attribute name="id" type="java.lang.String" required="true" description="" %>
<%@ attribute name="name" type="java.lang.String" required="true" description="" %>
<%@ attribute name="value" type="java.lang.String" required="false" description="" %>
<%@ attribute name="url" type="java.lang.String" required="true" description="" %>
<%@ attribute name="isRequire" type="java.lang.Boolean" required="false" description="" %>
<%@ attribute name="notAllowSelectParent" type="java.lang.String" required="true" description="" %>
<%@ attribute name="checked" type="java.lang.String" required="true" description="" %>
<%@ attribute name="helptext" type="java.lang.String" required="false" description="" %>

<c:if test="${isRequire eq true}">
    <c:set var="required" value="required"></c:set>
</c:if>

<div class="form-group">
    <label class="control-label">${label}：</label>
    <div class="controls">
        <sys:treeselect id="${id}" name="${name}" value="${value}"
                        labelName="${id}" labelValue="${value}"
                        title="${label}" url="${url}" cssClass="form-control ${required}"
                        notAllowSelectParent="${notAllowSelectParent}" checked="${checked}"/>
         <span class="help-inline">
            <c:if test="${isRequire eq true}">
                <font color="red">*</font>
            </c:if>
            <c:if test="${!empty helptext}">
                ${helptext}
            </c:if>
        </span>
    </div>
</div>

