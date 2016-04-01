<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>

<div class="form-group col-sm-4 ">
    <div class="row">
        <label class="col-sm-4 control-label">创建时间：</label>

        <div class="col-sm-4 ">
            <input id="beginDate" name="beginDate" type="text" readonly="readonly" maxlength="20"
                   class=" form-control Wdate"
                   value="<fmt:formatDate value="${act.beginDate}" pattern="yyyy-MM-dd"/>"
                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd'});"/>
        </div>
        <div class="col-sm-4 ">
            <input id="endDate" name="endDate" type="text" readonly="readonly" maxlength="20"
                   class="form-control Wdate"
                   value="<fmt:formatDate value="${act.endDate}" pattern="yyyy-MM-dd"/>"
                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd'});"/>
        </div>
    </div>
</div>