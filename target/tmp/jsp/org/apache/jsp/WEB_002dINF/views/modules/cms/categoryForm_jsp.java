package org.apache.jsp.WEB_002dINF.views.modules.cms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class categoryForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getAdminPath", com.thinkgem.jeesite.common.config.Global.class, "getAdminPath", new Class[] {});
  _jspx_fnmap_1= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getDictList", com.thinkgem.jeesite.modules.sys.utils.DictUtils.class, "getDictList", new Class[] {java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(5);
    _jspx_dependants.add("/WEB-INF/views/include/taglib.jsp");
    _jspx_dependants.add("/WEB-INF/views/include/adminlte.jsp");
    _jspx_dependants.add("/WEB-INF/tags/sys/message.tag");
    _jspx_dependants.add("/WEB-INF/tags/sys/treeselect.tag");
    _jspx_dependants.add("/WEB-INF/tags/sys/ckfinder.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_hasPermission_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_lacksPermission_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_role_modelAttribute_method_id_class_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_hidden_path_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_select_path_class;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_option_value_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_options_items_itemValue_itemLabel_htmlEscape_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_path_maxlength_htmlEscape_class_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_hidden_path_maxlength_htmlEscape_class_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_textarea_rows_path_maxlength_htmlEscape_class_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_radiobuttons_path_items_itemValue_itemLabel_htmlEscape_class_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_radiobuttons_path_items_itemValue_itemLabel_htmlEscape_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_options_items_htmlEscape_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_path_htmlEscape_class_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_shiro_hasPermission_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_shiro_lacksPermission_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_form_role_modelAttribute_method_id_class_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_hidden_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_select_path_class = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_option_value_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_options_items_itemValue_itemLabel_htmlEscape_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_path_maxlength_htmlEscape_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_hidden_path_maxlength_htmlEscape_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_textarea_rows_path_maxlength_htmlEscape_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_radiobuttons_path_items_itemValue_itemLabel_htmlEscape_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_radiobuttons_path_items_itemValue_itemLabel_htmlEscape_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_options_items_htmlEscape_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_path_htmlEscape_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_shiro_hasPermission_name.release();
    _jspx_tagPool_shiro_lacksPermission_name.release();
    _jspx_tagPool_form_form_role_modelAttribute_method_id_class_action.release();
    _jspx_tagPool_form_hidden_path_nobody.release();
    _jspx_tagPool_form_select_path_class.release();
    _jspx_tagPool_form_option_value_label_nobody.release();
    _jspx_tagPool_form_options_items_itemValue_itemLabel_htmlEscape_nobody.release();
    _jspx_tagPool_form_input_path_maxlength_htmlEscape_class_nobody.release();
    _jspx_tagPool_form_hidden_path_maxlength_htmlEscape_class_nobody.release();
    _jspx_tagPool_form_textarea_rows_path_maxlength_htmlEscape_class_nobody.release();
    _jspx_tagPool_form_radiobuttons_path_items_itemValue_itemLabel_htmlEscape_class_nobody.release();
    _jspx_tagPool_form_radiobuttons_path_items_itemValue_itemLabel_htmlEscape_nobody.release();
    _jspx_tagPool_form_options_items_htmlEscape_nobody.release();
    _jspx_tagPool_form_input_path_htmlEscape_class_nobody.release();
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
      out.write("    <title>栏目管理</title>\n");
      out.write("    <meta name=\"decorator\" content=\"default\"/>\n");
      out.write("    ");
      out.write("\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/adminlte/plugins/jQuery/jquery-1.10.2.min.js\"></script>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/2.3.1/awesome/font-awesome.min.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/fontawesome/css/font-awesome.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/adminlte/ionicons.min.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("      href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/adminlte/bootstrap/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("      href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/adminlte/plugins/datatables/dataTables.bootstrap.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/adminlte/dist/css/AdminLTE.min.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("      href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/adminlte/dist/css/skins/_all-skins.min.css\">\n");
      out.write("\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/adminlte/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/adminlte/plugins/datatables/jquery.dataTables.min.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/adminlte/plugins/datatables/dataTables.bootstrap.min.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/adminlte/plugins/slimScroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/adminlte/plugins/fastclick/fastclick.min.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/adminlte/dist/js/app.min.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/underscore-min.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap-typeahead.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/artdialog/dialog-min.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/artdialog/dialog-plus-min.js\"></script>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/artdialog/ui-dialog.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write('\n');
      out.write("\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery-validation/1.15.0/jquery.validate.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery-validation/1.15.0/localization/messages_zh.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/common/mustache.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/common/jeesite.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/common/jeesite.js\" type=\"text/javascript\"></script>\n");
      out.write("<script type=\"text/javascript\">var ctx = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', ctxStatic='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';</script>");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $(\"#name\").focus();\n");
      out.write("            $(\"#inputForm\").validate({\n");
      out.write("                submitHandler: function (form) {\n");
      out.write("                    loading('正在提交，请稍等...');\n");
      out.write("                    form.submit();\n");
      out.write("                },\n");
      out.write("                errorContainer: \"#messageBox\",\n");
      out.write("                errorPlacement: function (error, element) {\n");
      out.write("                    $(\"#messageBox\").text(\"输入有误，请先更正。\");\n");
      out.write("                    if (element.is(\":checkbox\") || element.is(\":radio\") || element.parent().is(\".input-append\")) {\n");
      out.write("                        error.appendTo(element.parent().parent());\n");
      out.write("                    } else {\n");
      out.write("                        error.insertAfter(element);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<ul class=\"nav nav-tabs\">\n");
      out.write("    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/cms/category/\">栏目列表</a></li>\n");
      out.write("    <li class=\"active\"><a\n");
      out.write("            href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/cms/category/form?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&parent.id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.parent.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">栏目");
      if (_jspx_meth_shiro_hasPermission_0(_jspx_page_context))
        return;
      if (_jspx_meth_shiro_lacksPermission_0(_jspx_page_context))
        return;
      out.write("</a></li>\n");
      out.write("</ul>\n");
      out.write("<br/>\n");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_role_modelAttribute_method_id_class_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_form_0.setPageContext(_jspx_page_context);
      _jspx_th_form_form_0.setParent(null);
      _jspx_th_form_form_0.setId("inputForm");
      _jspx_th_form_form_0.setModelAttribute("category");
      _jspx_th_form_form_0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}/cms/category/save", java.lang.String.class, (PageContext)_jspx_page_context, null));
      _jspx_th_form_form_0.setMethod("post");
      _jspx_th_form_form_0.setDynamicAttribute(null, "class", new String("col-md-8"));
      _jspx_th_form_form_0.setDynamicAttribute(null, "role", new String("form"));
      int[] _jspx_push_body_count_form_form_0 = new int[] { 0 };
      try {
        int _jspx_eval_form_form_0 = _jspx_th_form_form_0.doStartTag();
        if (_jspx_eval_form_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("    ");
            if (_jspx_meth_form_hidden_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("    ");
            if (_jspx_meth_sys_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("    <div class=\"form-group\">\n");
            out.write("        <label class=\"control-label\">归属机构:</label>\n");
            out.write("        <div class=\"controls\">\n");
            out.write("            ");
            if (_jspx_meth_sys_treeselect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("        </div>\n");
            out.write("    </div>\n");
            out.write("    <div class=\"form-group\">\n");
            out.write("        <label class=\"control-label\">上级栏目:</label>\n");
            out.write("        <div class=\"controls\">\n");
            out.write("            ");
            if (_jspx_meth_sys_treeselect_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("        </div>\n");
            out.write("    </div>\n");
            out.write("    <div class=\"form-group\">\n");
            out.write("        <label class=\"control-label\">栏目模型:</label>\n");
            out.write("        <div class=\"controls\">\n");
            out.write("            ");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_select_0 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_form_select_path_class.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_select_0.setPageContext(_jspx_page_context);
            _jspx_th_form_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_select_0.setPath("module");
            _jspx_th_form_select_0.setDynamicAttribute(null, "class", new String("form-control"));
            int[] _jspx_push_body_count_form_select_0 = new int[] { 0 };
            try {
              int _jspx_eval_form_select_0 = _jspx_th_form_select_0.doStartTag();
              if (_jspx_eval_form_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("                ");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_0 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_label_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_option_0.setPageContext(_jspx_page_context);
                  _jspx_th_form_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
                  _jspx_th_form_option_0.setValue(new String(""));
                  _jspx_th_form_option_0.setLabel("公共模型");
                  int[] _jspx_push_body_count_form_option_0 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_option_0 = _jspx_th_form_option_0.doStartTag();
                    if (_jspx_th_form_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_option_0[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_option_0.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_option_0.doFinally();
                    _jspx_tagPool_form_option_value_label_nobody.reuse(_jspx_th_form_option_0);
                  }
                  out.write("\n");
                  out.write("                ");
                  if (_jspx_meth_form_options_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_select_0, _jspx_page_context, _jspx_push_body_count_form_select_0))
                    return;
                  out.write("\n");
                  out.write("            ");
                  int evalDoAfterBody = _jspx_th_form_select_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_select_0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_select_0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_select_0.doFinally();
              _jspx_tagPool_form_select_path_class.reuse(_jspx_th_form_select_0);
            }
            out.write("\n");
            out.write("        </div>\n");
            out.write("    </div>\n");
            out.write("    <div class=\"form-group\">\n");
            out.write("        <label class=\"control-label\">栏目名称:</label>\n");
            out.write("        <div class=\"controls\">\n");
            out.write("            ");
            if (_jspx_meth_form_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("        </div>\n");
            out.write("    </div>\n");
            out.write("    <div class=\"form-group\">\n");
            out.write("        <label class=\"control-label\">缩略图:</label>\n");
            out.write("        <div class=\"controls\">\n");
            out.write("            ");
            if (_jspx_meth_form_hidden_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("            ");
            if (_jspx_meth_sys_ckfinder_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("        </div>\n");
            out.write("    </div>\n");
            out.write("    <div class=\"form-group\">\n");
            out.write("        <label class=\"control-label\">链接:</label>\n");
            out.write("        <div class=\"controls\">\n");
            out.write("            ");
            if (_jspx_meth_form_input_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("            <span class=\"help-inline\">栏目超链接地址，优先级“高”</span>\n");
            out.write("        </div>\n");
            out.write("    </div>\n");
            out.write("    <div class=\"form-group\">\n");
            out.write("        <label class=\"control-label\">目标:</label>\n");
            out.write("        <div class=\"controls\">\n");
            out.write("            ");
            if (_jspx_meth_form_input_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("            <span class=\"help-inline\">栏目超链接打开的目标窗口，新窗口打开，请填写：“_blank”</span>\n");
            out.write("        </div>\n");
            out.write("    </div>\n");
            out.write("    <div class=\"form-group\">\n");
            out.write("        <label class=\"control-label\">描述:</label>\n");
            out.write("        <div class=\"controls\">\n");
            out.write("            ");
            if (_jspx_meth_form_textarea_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("        </div>\n");
            out.write("    </div>\n");
            out.write("    <div class=\"form-group\">\n");
            out.write("        <label class=\"control-label\">关键字:</label>\n");
            out.write("        <div class=\"controls\">\n");
            out.write("            ");
            if (_jspx_meth_form_input_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("            <span class=\"help-inline\">填写描述及关键字，有助于搜索引擎优化</span>\n");
            out.write("        </div>\n");
            out.write("    </div>\n");
            out.write("    <div class=\"form-group\">\n");
            out.write("        <label class=\"control-label\">排序:</label>\n");
            out.write("        <div class=\"controls\">\n");
            out.write("            ");
            if (_jspx_meth_form_input_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("            <span class=\"help-inline\">栏目的排列次序</span>\n");
            out.write("        </div>\n");
            out.write("    </div>\n");
            out.write("    <div class=\"form-group\">\n");
            out.write("        <label class=\"control-label\">在导航中显示:</label>\n");
            out.write("        <div class=\"controls\">\n");
            out.write("            ");
            if (_jspx_meth_form_radiobuttons_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("            <span class=\"help-inline\">是否在导航中显示该栏目</span>\n");
            out.write("        </div>\n");
            out.write("    </div>\n");
            out.write("    <div class=\"form-group\">\n");
            out.write("        <label class=\"control-label\">在分类页中显示列表:</label>\n");
            out.write("        <div class=\"controls\">\n");
            out.write("            ");
            if (_jspx_meth_form_radiobuttons_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("            <span class=\"help-inline\">是否在分类页中显示该栏目的文章列表</span>\n");
            out.write("        </div>\n");
            out.write("    </div>\n");
            out.write("    <div class=\"form-group\">\n");
            out.write("        <label class=\"control-label\" title=\"默认展现方式：有子栏目显示栏目列表，无子栏目显示内容列表。\">展现方式:</label>\n");
            out.write("        <div class=\"controls\">\n");
            out.write("            ");
            if (_jspx_meth_form_radiobuttons_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("        </div>\n");
            out.write("    </div>\n");
            out.write("    <div class=\"form-group\">\n");
            out.write("        <label class=\"control-label\">是否允许评论:</label>\n");
            out.write("        <div class=\"controls\">\n");
            out.write("            ");
            if (_jspx_meth_form_radiobuttons_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("        </div>\n");
            out.write("    </div>\n");
            out.write("    <div class=\"form-group\">\n");
            out.write("        <label class=\"control-label\">是否需要审核:</label>\n");
            out.write("        <div class=\"controls\">\n");
            out.write("            ");
            if (_jspx_meth_form_radiobuttons_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("        </div>\n");
            out.write("    </div>\n");
            out.write("    <div class=\"form-group\">\n");
            out.write("        <label class=\"control-label\">自定义列表视图:</label>\n");
            out.write("        <div class=\"controls\">\n");
            out.write("            ");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_select_1 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_form_select_path_class.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_select_1.setPageContext(_jspx_page_context);
            _jspx_th_form_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_select_1.setPath("customListView");
            _jspx_th_form_select_1.setDynamicAttribute(null, "class", new String("form-control"));
            int[] _jspx_push_body_count_form_select_1 = new int[] { 0 };
            try {
              int _jspx_eval_form_select_1 = _jspx_th_form_select_1.doStartTag();
              if (_jspx_eval_form_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("                ");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_1 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_label_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_option_1.setPageContext(_jspx_page_context);
                  _jspx_th_form_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_1);
                  _jspx_th_form_option_1.setValue(new String(""));
                  _jspx_th_form_option_1.setLabel("默认视图");
                  int[] _jspx_push_body_count_form_option_1 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_option_1 = _jspx_th_form_option_1.doStartTag();
                    if (_jspx_th_form_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_option_1[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_option_1.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_option_1.doFinally();
                    _jspx_tagPool_form_option_value_label_nobody.reuse(_jspx_th_form_option_1);
                  }
                  out.write("\n");
                  out.write("                ");
                  if (_jspx_meth_form_options_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_select_1, _jspx_page_context, _jspx_push_body_count_form_select_1))
                    return;
                  out.write("\n");
                  out.write("            ");
                  int evalDoAfterBody = _jspx_th_form_select_1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_select_1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_select_1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_select_1.doFinally();
              _jspx_tagPool_form_select_path_class.reuse(_jspx_th_form_select_1);
            }
            out.write("\n");
            out.write("            <span class=\"help-inline\">自定义列表视图名称必须以\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category_DEFAULT_TEMPLATE}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"开始</span>\n");
            out.write("        </div>\n");
            out.write("    </div>\n");
            out.write("    <div class=\"form-group\">\n");
            out.write("        <label class=\"control-label\">自定义内容视图:</label>\n");
            out.write("        <div class=\"controls\">\n");
            out.write("            ");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_select_2 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_form_select_path_class.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_select_2.setPageContext(_jspx_page_context);
            _jspx_th_form_select_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_select_2.setPath("customContentView");
            _jspx_th_form_select_2.setDynamicAttribute(null, "class", new String("form-control"));
            int[] _jspx_push_body_count_form_select_2 = new int[] { 0 };
            try {
              int _jspx_eval_form_select_2 = _jspx_th_form_select_2.doStartTag();
              if (_jspx_eval_form_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("                ");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_2 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_label_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_option_2.setPageContext(_jspx_page_context);
                  _jspx_th_form_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_2);
                  _jspx_th_form_option_2.setValue(new String(""));
                  _jspx_th_form_option_2.setLabel("默认视图");
                  int[] _jspx_push_body_count_form_option_2 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_option_2 = _jspx_th_form_option_2.doStartTag();
                    if (_jspx_th_form_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_option_2[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_option_2.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_option_2.doFinally();
                    _jspx_tagPool_form_option_value_label_nobody.reuse(_jspx_th_form_option_2);
                  }
                  out.write("\n");
                  out.write("                ");
                  if (_jspx_meth_form_options_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_select_2, _jspx_page_context, _jspx_push_body_count_form_select_2))
                    return;
                  out.write("\n");
                  out.write("            ");
                  int evalDoAfterBody = _jspx_th_form_select_2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_select_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_select_2[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_select_2.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_select_2.doFinally();
              _jspx_tagPool_form_select_path_class.reuse(_jspx_th_form_select_2);
            }
            out.write("\n");
            out.write("            <span class=\"help-inline\">自定义内容视图名称必须以\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${article_DEFAULT_TEMPLATE}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"开始</span>\n");
            out.write("        </div>\n");
            out.write("    </div>\n");
            out.write("    <div class=\"form-group\">\n");
            out.write("        <label class=\"control-label\">自定义视图参数:</label>\n");
            out.write("        <div class=\"controls\" class=\"form-control\">\n");
            out.write("            ");
            if (_jspx_meth_form_input_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("            <span class=\"help-inline\">视图参数例如: {count:2, title_show:\"yes\"}</span>\n");
            out.write("        </div>\n");
            out.write("    </div>\n");
            out.write("    <div class=\"form-actions\">\n");
            out.write("        ");
            if (_jspx_meth_shiro_hasPermission_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("        <input id=\"btnCancel\" class=\"btn\" type=\"button\" value=\"返 回\" onclick=\"history.go(-1)\"/>\n");
            out.write("    </div>\n");
            int evalDoAfterBody = _jspx_th_form_form_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_form_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_form_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_form_0.doFinally();
        _jspx_tagPool_form_form_role_modelAttribute_method_id_class_action.reuse(_jspx_th_form_form_0);
      }
      out.write("\n");
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

  private boolean _jspx_meth_shiro_hasPermission_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_hasPermission_0 = (org.apache.shiro.web.tags.HasPermissionTag) _jspx_tagPool_shiro_hasPermission_name.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_hasPermission_0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasPermission_0.setParent(null);
    _jspx_th_shiro_hasPermission_0.setName("cms:category:edit");
    int _jspx_eval_shiro_hasPermission_0 = _jspx_th_shiro_hasPermission_0.doStartTag();
    if (_jspx_eval_shiro_hasPermission_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty category.id?'修改':'添加'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        int evalDoAfterBody = _jspx_th_shiro_hasPermission_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasPermission_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_0);
      return true;
    }
    _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_0);
    return false;
  }

  private boolean _jspx_meth_shiro_lacksPermission_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:lacksPermission
    org.apache.shiro.web.tags.LacksPermissionTag _jspx_th_shiro_lacksPermission_0 = (org.apache.shiro.web.tags.LacksPermissionTag) _jspx_tagPool_shiro_lacksPermission_name.get(org.apache.shiro.web.tags.LacksPermissionTag.class);
    _jspx_th_shiro_lacksPermission_0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_lacksPermission_0.setParent(null);
    _jspx_th_shiro_lacksPermission_0.setName("cms:category:edit");
    int _jspx_eval_shiro_lacksPermission_0 = _jspx_th_shiro_lacksPermission_0.doStartTag();
    if (_jspx_eval_shiro_lacksPermission_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('查');
        out.write('看');
        int evalDoAfterBody = _jspx_th_shiro_lacksPermission_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_lacksPermission_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_lacksPermission_name.reuse(_jspx_th_shiro_lacksPermission_0);
      return true;
    }
    _jspx_tagPool_shiro_lacksPermission_name.reuse(_jspx_th_shiro_lacksPermission_0);
    return false;
  }

  private boolean _jspx_meth_form_hidden_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_hidden_0 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _jspx_tagPool_form_hidden_path_nobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_hidden_0.setPageContext(_jspx_page_context);
    _jspx_th_form_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_hidden_0.setPath("id");
    int[] _jspx_push_body_count_form_hidden_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_hidden_0 = _jspx_th_form_hidden_0.doStartTag();
      if (_jspx_th_form_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_hidden_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_hidden_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_hidden_0.doFinally();
      _jspx_tagPool_form_hidden_path_nobody.reuse(_jspx_th_form_hidden_0);
    }
    return false;
  }

  private boolean _jspx_meth_sys_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sys:message
    org.apache.jsp.tag.web.sys.message_tag _jspx_th_sys_message_0 = new org.apache.jsp.tag.web.sys.message_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_sys_message_0      );
    }
    _jspx_th_sys_message_0.setJspContext(_jspx_page_context);
    _jspx_th_sys_message_0.setParent(_jspx_th_form_form_0);
    _jspx_th_sys_message_0.setContent((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sys_message_0.doTag();
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
    _jspx_th_sys_treeselect_0.setId("office");
    _jspx_th_sys_treeselect_0.setName("office.id");
    _jspx_th_sys_treeselect_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.office.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sys_treeselect_0.setLabelName("office.name");
    _jspx_th_sys_treeselect_0.setLabelValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.office.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sys_treeselect_0.setTitle("机构");
    _jspx_th_sys_treeselect_0.setUrl("/sys/office/treeData");
    _jspx_th_sys_treeselect_0.setCssClass("form-control required");
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
    _jspx_th_sys_treeselect_1.setId("category");
    _jspx_th_sys_treeselect_1.setName("parent.id");
    _jspx_th_sys_treeselect_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.parent.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sys_treeselect_1.setLabelName("parent.name");
    _jspx_th_sys_treeselect_1.setLabelValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.parent.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sys_treeselect_1.setTitle("栏目");
    _jspx_th_sys_treeselect_1.setUrl("/cms/category/treeData");
    _jspx_th_sys_treeselect_1.setExtId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sys_treeselect_1.setCssClass("form-control required");
    _jspx_th_sys_treeselect_1.doTag();
    return false;
  }

  private boolean _jspx_meth_form_options_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_select_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_select_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_options_0 = (org.springframework.web.servlet.tags.form.OptionsTag) _jspx_tagPool_form_options_items_itemValue_itemLabel_htmlEscape_nobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_options_0.setPageContext(_jspx_page_context);
    _jspx_th_form_options_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
    _jspx_th_form_options_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fns:getDictList('cms_module')}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_1));
    _jspx_th_form_options_0.setItemLabel("label");
    _jspx_th_form_options_0.setItemValue("value");
    _jspx_th_form_options_0.setHtmlEscape(false);
    int[] _jspx_push_body_count_form_options_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_options_0 = _jspx_th_form_options_0.doStartTag();
      if (_jspx_th_form_options_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_options_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_options_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_options_0.doFinally();
      _jspx_tagPool_form_options_items_itemValue_itemLabel_htmlEscape_nobody.reuse(_jspx_th_form_options_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_maxlength_htmlEscape_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_0.setPageContext(_jspx_page_context);
    _jspx_th_form_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_0.setPath("name");
    _jspx_th_form_input_0.setHtmlEscape(false);
    _jspx_th_form_input_0.setMaxlength("50");
    _jspx_th_form_input_0.setDynamicAttribute(null, "class", new String("required form-control"));
    int[] _jspx_push_body_count_form_input_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_0 = _jspx_th_form_input_0.doStartTag();
      if (_jspx_th_form_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_0.doFinally();
      _jspx_tagPool_form_input_path_maxlength_htmlEscape_class_nobody.reuse(_jspx_th_form_input_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_hidden_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_hidden_1 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _jspx_tagPool_form_hidden_path_maxlength_htmlEscape_class_nobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_hidden_1.setPageContext(_jspx_page_context);
    _jspx_th_form_hidden_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_hidden_1.setPath("image");
    _jspx_th_form_hidden_1.setHtmlEscape(false);
    _jspx_th_form_hidden_1.setDynamicAttribute(null, "maxlength", new String("255"));
    _jspx_th_form_hidden_1.setDynamicAttribute(null, "class", new String("form-control"));
    int[] _jspx_push_body_count_form_hidden_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_hidden_1 = _jspx_th_form_hidden_1.doStartTag();
      if (_jspx_th_form_hidden_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_hidden_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_hidden_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_hidden_1.doFinally();
      _jspx_tagPool_form_hidden_path_maxlength_htmlEscape_class_nobody.reuse(_jspx_th_form_hidden_1);
    }
    return false;
  }

  private boolean _jspx_meth_sys_ckfinder_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sys:ckfinder
    org.apache.jsp.tag.web.sys.ckfinder_tag _jspx_th_sys_ckfinder_0 = new org.apache.jsp.tag.web.sys.ckfinder_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_sys_ckfinder_0      );
    }
    _jspx_th_sys_ckfinder_0.setJspContext(_jspx_page_context);
    _jspx_th_sys_ckfinder_0.setParent(_jspx_th_form_form_0);
    _jspx_th_sys_ckfinder_0.setInput("image");
    _jspx_th_sys_ckfinder_0.setType("thumb");
    _jspx_th_sys_ckfinder_0.setUploadPath("/cms/category");
    _jspx_th_sys_ckfinder_0.doTag();
    return false;
  }

  private boolean _jspx_meth_form_input_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_1 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_maxlength_htmlEscape_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_1.setPageContext(_jspx_page_context);
    _jspx_th_form_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_1.setPath("href");
    _jspx_th_form_input_1.setHtmlEscape(false);
    _jspx_th_form_input_1.setMaxlength("200");
    _jspx_th_form_input_1.setDynamicAttribute(null, "class", new String("form-control"));
    int[] _jspx_push_body_count_form_input_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_1 = _jspx_th_form_input_1.doStartTag();
      if (_jspx_th_form_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_1.doFinally();
      _jspx_tagPool_form_input_path_maxlength_htmlEscape_class_nobody.reuse(_jspx_th_form_input_1);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_2 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_maxlength_htmlEscape_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_2.setPageContext(_jspx_page_context);
    _jspx_th_form_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_2.setPath("target");
    _jspx_th_form_input_2.setHtmlEscape(false);
    _jspx_th_form_input_2.setMaxlength("200");
    _jspx_th_form_input_2.setDynamicAttribute(null, "class", new String("form-control"));
    int[] _jspx_push_body_count_form_input_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_2 = _jspx_th_form_input_2.doStartTag();
      if (_jspx_th_form_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_2.doFinally();
      _jspx_tagPool_form_input_path_maxlength_htmlEscape_class_nobody.reuse(_jspx_th_form_input_2);
    }
    return false;
  }

  private boolean _jspx_meth_form_textarea_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_textarea_0 = (org.springframework.web.servlet.tags.form.TextareaTag) _jspx_tagPool_form_textarea_rows_path_maxlength_htmlEscape_class_nobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_textarea_0.setPageContext(_jspx_page_context);
    _jspx_th_form_textarea_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_textarea_0.setPath("description");
    _jspx_th_form_textarea_0.setHtmlEscape(false);
    _jspx_th_form_textarea_0.setRows("4");
    _jspx_th_form_textarea_0.setDynamicAttribute(null, "maxlength", new String("200"));
    _jspx_th_form_textarea_0.setDynamicAttribute(null, "class", new String("form-control"));
    int[] _jspx_push_body_count_form_textarea_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_textarea_0 = _jspx_th_form_textarea_0.doStartTag();
      if (_jspx_th_form_textarea_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_textarea_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_textarea_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_textarea_0.doFinally();
      _jspx_tagPool_form_textarea_rows_path_maxlength_htmlEscape_class_nobody.reuse(_jspx_th_form_textarea_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_3 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_maxlength_htmlEscape_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_3.setPageContext(_jspx_page_context);
    _jspx_th_form_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_3.setPath("keywords");
    _jspx_th_form_input_3.setHtmlEscape(false);
    _jspx_th_form_input_3.setMaxlength("200");
    _jspx_th_form_input_3.setDynamicAttribute(null, "class", new String("form-control"));
    int[] _jspx_push_body_count_form_input_3 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_3 = _jspx_th_form_input_3.doStartTag();
      if (_jspx_th_form_input_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_3.doFinally();
      _jspx_tagPool_form_input_path_maxlength_htmlEscape_class_nobody.reuse(_jspx_th_form_input_3);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_4 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_maxlength_htmlEscape_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_4.setPageContext(_jspx_page_context);
    _jspx_th_form_input_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_4.setPath("sort");
    _jspx_th_form_input_4.setHtmlEscape(false);
    _jspx_th_form_input_4.setMaxlength("11");
    _jspx_th_form_input_4.setDynamicAttribute(null, "class", new String("required digits form-control"));
    int[] _jspx_push_body_count_form_input_4 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_4 = _jspx_th_form_input_4.doStartTag();
      if (_jspx_th_form_input_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_4.doFinally();
      _jspx_tagPool_form_input_path_maxlength_htmlEscape_class_nobody.reuse(_jspx_th_form_input_4);
    }
    return false;
  }

  private boolean _jspx_meth_form_radiobuttons_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:radiobuttons
    org.springframework.web.servlet.tags.form.RadioButtonsTag _jspx_th_form_radiobuttons_0 = (org.springframework.web.servlet.tags.form.RadioButtonsTag) _jspx_tagPool_form_radiobuttons_path_items_itemValue_itemLabel_htmlEscape_class_nobody.get(org.springframework.web.servlet.tags.form.RadioButtonsTag.class);
    _jspx_th_form_radiobuttons_0.setPageContext(_jspx_page_context);
    _jspx_th_form_radiobuttons_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_radiobuttons_0.setPath("inMenu");
    _jspx_th_form_radiobuttons_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fns:getDictList('show_hide')}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_1));
    _jspx_th_form_radiobuttons_0.setItemLabel("label");
    _jspx_th_form_radiobuttons_0.setItemValue("value");
    _jspx_th_form_radiobuttons_0.setHtmlEscape(false);
    _jspx_th_form_radiobuttons_0.setDynamicAttribute(null, "class", new String("required "));
    int[] _jspx_push_body_count_form_radiobuttons_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_radiobuttons_0 = _jspx_th_form_radiobuttons_0.doStartTag();
      if (_jspx_th_form_radiobuttons_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_radiobuttons_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_radiobuttons_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_radiobuttons_0.doFinally();
      _jspx_tagPool_form_radiobuttons_path_items_itemValue_itemLabel_htmlEscape_class_nobody.reuse(_jspx_th_form_radiobuttons_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_radiobuttons_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:radiobuttons
    org.springframework.web.servlet.tags.form.RadioButtonsTag _jspx_th_form_radiobuttons_1 = (org.springframework.web.servlet.tags.form.RadioButtonsTag) _jspx_tagPool_form_radiobuttons_path_items_itemValue_itemLabel_htmlEscape_class_nobody.get(org.springframework.web.servlet.tags.form.RadioButtonsTag.class);
    _jspx_th_form_radiobuttons_1.setPageContext(_jspx_page_context);
    _jspx_th_form_radiobuttons_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_radiobuttons_1.setPath("inList");
    _jspx_th_form_radiobuttons_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fns:getDictList('show_hide')}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_1));
    _jspx_th_form_radiobuttons_1.setItemLabel("label");
    _jspx_th_form_radiobuttons_1.setItemValue("value");
    _jspx_th_form_radiobuttons_1.setHtmlEscape(false);
    _jspx_th_form_radiobuttons_1.setDynamicAttribute(null, "class", new String("required"));
    int[] _jspx_push_body_count_form_radiobuttons_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_radiobuttons_1 = _jspx_th_form_radiobuttons_1.doStartTag();
      if (_jspx_th_form_radiobuttons_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_radiobuttons_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_radiobuttons_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_radiobuttons_1.doFinally();
      _jspx_tagPool_form_radiobuttons_path_items_itemValue_itemLabel_htmlEscape_class_nobody.reuse(_jspx_th_form_radiobuttons_1);
    }
    return false;
  }

  private boolean _jspx_meth_form_radiobuttons_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:radiobuttons
    org.springframework.web.servlet.tags.form.RadioButtonsTag _jspx_th_form_radiobuttons_2 = (org.springframework.web.servlet.tags.form.RadioButtonsTag) _jspx_tagPool_form_radiobuttons_path_items_itemValue_itemLabel_htmlEscape_class_nobody.get(org.springframework.web.servlet.tags.form.RadioButtonsTag.class);
    _jspx_th_form_radiobuttons_2.setPageContext(_jspx_page_context);
    _jspx_th_form_radiobuttons_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_radiobuttons_2.setPath("showModes");
    _jspx_th_form_radiobuttons_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fns:getDictList('cms_show_modes')}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_1));
    _jspx_th_form_radiobuttons_2.setItemLabel("label");
    _jspx_th_form_radiobuttons_2.setItemValue("value");
    _jspx_th_form_radiobuttons_2.setHtmlEscape(false);
    _jspx_th_form_radiobuttons_2.setDynamicAttribute(null, "class", new String("required "));
    int[] _jspx_push_body_count_form_radiobuttons_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_radiobuttons_2 = _jspx_th_form_radiobuttons_2.doStartTag();
      if (_jspx_th_form_radiobuttons_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_radiobuttons_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_radiobuttons_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_radiobuttons_2.doFinally();
      _jspx_tagPool_form_radiobuttons_path_items_itemValue_itemLabel_htmlEscape_class_nobody.reuse(_jspx_th_form_radiobuttons_2);
    }
    return false;
  }

  private boolean _jspx_meth_form_radiobuttons_3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:radiobuttons
    org.springframework.web.servlet.tags.form.RadioButtonsTag _jspx_th_form_radiobuttons_3 = (org.springframework.web.servlet.tags.form.RadioButtonsTag) _jspx_tagPool_form_radiobuttons_path_items_itemValue_itemLabel_htmlEscape_nobody.get(org.springframework.web.servlet.tags.form.RadioButtonsTag.class);
    _jspx_th_form_radiobuttons_3.setPageContext(_jspx_page_context);
    _jspx_th_form_radiobuttons_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_radiobuttons_3.setPath("allowComment");
    _jspx_th_form_radiobuttons_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fns:getDictList('yes_no')}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_1));
    _jspx_th_form_radiobuttons_3.setItemLabel("label");
    _jspx_th_form_radiobuttons_3.setItemValue("value");
    _jspx_th_form_radiobuttons_3.setHtmlEscape(false);
    int[] _jspx_push_body_count_form_radiobuttons_3 = new int[] { 0 };
    try {
      int _jspx_eval_form_radiobuttons_3 = _jspx_th_form_radiobuttons_3.doStartTag();
      if (_jspx_th_form_radiobuttons_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_radiobuttons_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_radiobuttons_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_radiobuttons_3.doFinally();
      _jspx_tagPool_form_radiobuttons_path_items_itemValue_itemLabel_htmlEscape_nobody.reuse(_jspx_th_form_radiobuttons_3);
    }
    return false;
  }

  private boolean _jspx_meth_form_radiobuttons_4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:radiobuttons
    org.springframework.web.servlet.tags.form.RadioButtonsTag _jspx_th_form_radiobuttons_4 = (org.springframework.web.servlet.tags.form.RadioButtonsTag) _jspx_tagPool_form_radiobuttons_path_items_itemValue_itemLabel_htmlEscape_nobody.get(org.springframework.web.servlet.tags.form.RadioButtonsTag.class);
    _jspx_th_form_radiobuttons_4.setPageContext(_jspx_page_context);
    _jspx_th_form_radiobuttons_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_radiobuttons_4.setPath("isAudit");
    _jspx_th_form_radiobuttons_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fns:getDictList('yes_no')}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_1));
    _jspx_th_form_radiobuttons_4.setItemLabel("label");
    _jspx_th_form_radiobuttons_4.setItemValue("value");
    _jspx_th_form_radiobuttons_4.setHtmlEscape(false);
    int[] _jspx_push_body_count_form_radiobuttons_4 = new int[] { 0 };
    try {
      int _jspx_eval_form_radiobuttons_4 = _jspx_th_form_radiobuttons_4.doStartTag();
      if (_jspx_th_form_radiobuttons_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_radiobuttons_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_radiobuttons_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_radiobuttons_4.doFinally();
      _jspx_tagPool_form_radiobuttons_path_items_itemValue_itemLabel_htmlEscape_nobody.reuse(_jspx_th_form_radiobuttons_4);
    }
    return false;
  }

  private boolean _jspx_meth_form_options_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_select_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_select_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_options_1 = (org.springframework.web.servlet.tags.form.OptionsTag) _jspx_tagPool_form_options_items_htmlEscape_nobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_options_1.setPageContext(_jspx_page_context);
    _jspx_th_form_options_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_1);
    _jspx_th_form_options_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listViewList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_form_options_1.setHtmlEscape(false);
    int[] _jspx_push_body_count_form_options_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_options_1 = _jspx_th_form_options_1.doStartTag();
      if (_jspx_th_form_options_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_options_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_options_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_options_1.doFinally();
      _jspx_tagPool_form_options_items_htmlEscape_nobody.reuse(_jspx_th_form_options_1);
    }
    return false;
  }

  private boolean _jspx_meth_form_options_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_select_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_select_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_options_2 = (org.springframework.web.servlet.tags.form.OptionsTag) _jspx_tagPool_form_options_items_htmlEscape_nobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_options_2.setPageContext(_jspx_page_context);
    _jspx_th_form_options_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_2);
    _jspx_th_form_options_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contentViewList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_form_options_2.setHtmlEscape(false);
    int[] _jspx_push_body_count_form_options_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_options_2 = _jspx_th_form_options_2.doStartTag();
      if (_jspx_th_form_options_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_options_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_options_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_options_2.doFinally();
      _jspx_tagPool_form_options_items_htmlEscape_nobody.reuse(_jspx_th_form_options_2);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_5(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_5 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_htmlEscape_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_5.setPageContext(_jspx_page_context);
    _jspx_th_form_input_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_5.setPath("viewConfig");
    _jspx_th_form_input_5.setHtmlEscape(true);
    _jspx_th_form_input_5.setDynamicAttribute(null, "class", new String(" form-control"));
    int[] _jspx_push_body_count_form_input_5 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_5 = _jspx_th_form_input_5.doStartTag();
      if (_jspx_th_form_input_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_5.doFinally();
      _jspx_tagPool_form_input_path_htmlEscape_class_nobody.reuse(_jspx_th_form_input_5);
    }
    return false;
  }

  private boolean _jspx_meth_shiro_hasPermission_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_hasPermission_1 = (org.apache.shiro.web.tags.HasPermissionTag) _jspx_tagPool_shiro_hasPermission_name.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_hasPermission_1.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasPermission_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_shiro_hasPermission_1.setName("cms:category:edit");
    int _jspx_eval_shiro_hasPermission_1 = _jspx_th_shiro_hasPermission_1.doStartTag();
    if (_jspx_eval_shiro_hasPermission_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<input id=\"btnSubmit\" class=\"btn btn-primary\" type=\"submit\"\n");
        out.write("                                                             value=\"保 存\"/>&nbsp;");
        int evalDoAfterBody = _jspx_th_shiro_hasPermission_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasPermission_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_1);
      return true;
    }
    _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_1);
    return false;
  }
}
