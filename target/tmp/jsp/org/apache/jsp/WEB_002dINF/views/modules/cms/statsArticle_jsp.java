package org.apache.jsp.WEB_002dINF.views.modules.cms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class statsArticle_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getAdminPath", com.thinkgem.jeesite.common.config.Global.class, "getAdminPath", new Class[] {});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/WEB-INF/views/include/taglib.jsp");
    _jspx_dependants.add("/WEB-INF/tags/sys/treeselect.tag");
    _jspx_dependants.add("/WEB-INF/tags/sys/message.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_modelAttribute_method_id_class_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_type_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_form_modelAttribute_method_id_class_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_value_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_form_form_modelAttribute_method_id_class_action.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_fmt_formatDate_value_type_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>信息量统计</title>\n");
      out.write("\t<meta name=\"decorator\" content=\"default\"/>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\tfunction autoRowSpan(tb,row,col){\n");
      out.write("\t        var lastValue=\"\",value=\"\",pos=1;  \n");
      out.write("\t        for(var i=row;i<tb.rows.length;i++){\n");
      out.write("\t            value = tb.rows[i].cells[col].innerText;  \n");
      out.write("\t            if(lastValue == value){\n");
      out.write("\t                tb.rows[i].deleteCell(col); \n");
      out.write("\t                tb.rows[i-pos].cells[col].rowSpan = tb.rows[i-pos].cells[col].rowSpan+1;\n");
      out.write("\t                pos++;\n");
      out.write("\t            }else{\n");
      out.write("\t                lastValue = value;\n");
      out.write("\t                pos=1;\n");
      out.write("\t            }\n");
      out.write("\t        }\n");
      out.write("\t    }\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("\t\t\tautoRowSpan(contentTable,0,0);\n");
      out.write("\t        $(\"td,th\").css({\"text-align\":\"center\",\"vertical-align\":\"middle\"});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<ul class=\"nav nav-tabs\">\n");
      out.write("\t\t<li class=\"active\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/cms/stats/article\">信息量统计</a></li>\n");
      out.write("\t</ul>\n");
      out.write("\t");
      if (_jspx_meth_form_form_0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('	');
      if (_jspx_meth_sys_message_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t<table id=\"contentTable\" class=\"table table-striped table-bordered table-condensed\">\n");
      out.write("\t\t<thead><tr><th>父级栏目</th><th>栏目名称</th><th>信息量</th><th>点击量</th><th>最后更新时间</th><th>归属机构</th>\n");
      out.write("\t\t<tbody>\n");
      out.write("\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</tbody>\n");
      out.write("\t</table>\n");
      out.write("\t<div class=\"pagination\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("ctx");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}${fns:getAdminPath()}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("ctxStatic");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}/static", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_form_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_modelAttribute_method_id_class_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_form_0.setPageContext(_jspx_page_context);
    _jspx_th_form_form_0.setParent(null);
    _jspx_th_form_form_0.setId("searchForm");
    _jspx_th_form_form_0.setModelAttribute("article");
    _jspx_th_form_form_0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}/cms/stats/article", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_form_form_0.setMethod("post");
    _jspx_th_form_form_0.setDynamicAttribute(null, "class", new String("breadcrumb form-search"));
    int[] _jspx_push_body_count_form_form_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_form_0 = _jspx_th_form_form_0.doStartTag();
      if (_jspx_eval_form_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t<div>\n");
          out.write("\t\t\t<label>归属栏目：</label>");
          if (_jspx_meth_sys_treeselect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("\t\t\t<label>归属机构：</label>");
          if (_jspx_meth_sys_treeselect_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("\t\t\t<label>开始日期：</label><input id=\"beginDate\" name=\"beginDate\" type=\"text\" readonly=\"readonly\" maxlength=\"20\" class=\"input-small Wdate\"\n");
          out.write("\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paramMap.beginDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" onclick=\"WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:false});\"/>\n");
          out.write("\t\t\t<label>结束日期：</label><input id=\"endDate\" name=\"endDate\" type=\"text\" readonly=\"readonly\" maxlength=\"20\" class=\"input-small Wdate\"\n");
          out.write("\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paramMap.endDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" onclick=\"WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:false});\"/>&nbsp;&nbsp;\n");
          out.write("\t\t\t<input id=\"btnSubmit\" class=\"btn btn-primary\" type=\"submit\" value=\"查询\"/>\n");
          out.write("\t\t</div>\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_form_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_form_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_form_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_form_0.doFinally();
      _jspx_tagPool_form_form_modelAttribute_method_id_class_action.reuse(_jspx_th_form_form_0);
    }
    return false;
  }

  private boolean _jspx_meth_sys_treeselect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sys:treeselect
    org.apache.jsp.tag.web.sys.treeselect_tag _jspx_th_sys_treeselect_0 = new org.apache.jsp.tag.web.sys.treeselect_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_sys_treeselect_0      );
    }
    _jspx_th_sys_treeselect_0.setJspContext(_jspx_page_context);
    _jspx_th_sys_treeselect_0.setParent(_jspx_th_form_form_0);
    _jspx_th_sys_treeselect_0.setId("category");
    _jspx_th_sys_treeselect_0.setName("categoryId");
    _jspx_th_sys_treeselect_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paramMap.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sys_treeselect_0.setLabelName("categoryName");
    _jspx_th_sys_treeselect_0.setLabelValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paramMap.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sys_treeselect_0.setTitle("栏目");
    _jspx_th_sys_treeselect_0.setUrl("/cms/category/treeData");
    _jspx_th_sys_treeselect_0.setModule("article");
    _jspx_th_sys_treeselect_0.setCssClass("input-small");
    _jspx_th_sys_treeselect_0.setAllowClear(new Boolean(true));
    _jspx_th_sys_treeselect_0.doTag();
    return false;
  }

  private boolean _jspx_meth_sys_treeselect_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sys:treeselect
    org.apache.jsp.tag.web.sys.treeselect_tag _jspx_th_sys_treeselect_1 = new org.apache.jsp.tag.web.sys.treeselect_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_sys_treeselect_1      );
    }
    _jspx_th_sys_treeselect_1.setJspContext(_jspx_page_context);
    _jspx_th_sys_treeselect_1.setParent(_jspx_th_form_form_0);
    _jspx_th_sys_treeselect_1.setId("office");
    _jspx_th_sys_treeselect_1.setName("officeId");
    _jspx_th_sys_treeselect_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paramMap.office.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sys_treeselect_1.setLabelName("officeName");
    _jspx_th_sys_treeselect_1.setLabelValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paramMap.office.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sys_treeselect_1.setTitle("机构");
    _jspx_th_sys_treeselect_1.setUrl("/sys/office/treeData");
    _jspx_th_sys_treeselect_1.setCssClass("input-small");
    _jspx_th_sys_treeselect_1.setAllowClear(new Boolean(true));
    _jspx_th_sys_treeselect_1.doTag();
    return false;
  }

  private boolean _jspx_meth_sys_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sys:message
    org.apache.jsp.tag.web.sys.message_tag _jspx_th_sys_message_0 = new org.apache.jsp.tag.web.sys.message_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_sys_message_0      );
    }
    _jspx_th_sys_message_0.setJspContext(_jspx_page_context);
    _jspx_th_sys_message_0.setContent((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sys_message_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("stats");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t\t<td><a href=\"javascript:\" onclick=\"$('#categoryId').val('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stats.parent.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("');$('#categoryName').val('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stats.parent.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("');$('#searchForm').submit();return false;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stats.parent.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></td>\n");
          out.write("\t\t\t\t<td><a href=\"javascript:\" onclick=\"$('#categoryId').val('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stats.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("');$('#categoryName').val('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stats.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("');$('#searchForm').submit();return false;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stats.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></td>\n");
          out.write("\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stats.cnt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stats.hits}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t<td>");
          if (_jspx_meth_fmt_formatDate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("\t\t\t\t<td><a href=\"javascript:\" onclick=\"$('#officeId').val('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stats.office.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("');$('#officeName').val('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stats.office.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("');$('#searchForm').submit();return false;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stats.office.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stats.updateDate}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_0.setType("both");
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }
}
