<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<%@ attribute name="label" type="java.lang.String" required="true" description="" %>
<%@ attribute name="path" type="java.lang.String" required="true" description="" %>
<%@ attribute name="dict" type="java.lang.String" required="true" description="" %>
<div class="form-group col-sm-4">
    <label class="col-sm-4 control-label">${label}：</label>
    <div class="col-sm-8">

        <form:select path="${path}" class="form-control">
            <form:option value="" label=""/>
            <form:options items="${fns:getDictList(dict)}" itemLabel="label" itemValue="value"
                          htmlEscape="false"/>
        </form:select>
    </div>
</div>