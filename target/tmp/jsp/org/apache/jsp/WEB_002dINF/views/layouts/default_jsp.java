package org.apache.jsp.WEB_002dINF.views.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class default_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getAdminPath", com.thinkgem.jeesite.common.config.Global.class, "getAdminPath", new Class[] {});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/views/include/taglib.jsp");
    _jspx_dependants.add("/WEB-INF/views/include/head.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sitemesh_title_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sitemesh_head_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sitemesh_body_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_principal_property_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sitemesh_title_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sitemesh_head_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sitemesh_body_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_shiro_principal_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_sitemesh_title_nobody.release();
    _jspx_tagPool_sitemesh_head_nobody.release();
    _jspx_tagPool_sitemesh_body_nobody.release();
    _jspx_tagPool_shiro_principal_property_nobody.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html style=\"overflow-x:auto;overflow-y:auto;\">\n");
      out.write("<head>\n");
      out.write("\t<title>");
      if (_jspx_meth_sitemesh_title_0(_jspx_page_context))
        return;
      out.write(" - Powered By JeeSite</title>\n");
      out.write("\t");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\"/>\n");
      out.write("<meta name=\"author\" content=\"http://jeesite.com/\"/>\n");
      out.write("<meta name=\"renderer\" content=\"webkit\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=8,IE=9,IE=10\"/>\n");
      out.write("<meta http-equiv=\"Expires\" content=\"0\">\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-cache\">\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-store\">\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/adminlte/plugins/jQuery/jquery-1.10.2.min.js\"></script>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery-select2/3.4/select2.min.css\" rel=\"stylesheet\"/>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery-select2/3.4/select2.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery-validation/1.11.0/jquery.validate.min.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery-validation/1.11.0/jquery.validate.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery-jbox/2.3/Skins/Bootstrap/jbox.min.css\" rel=\"stylesheet\"/>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery-jbox/2.3/jquery.jBox-2.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/My97DatePicker/WdatePicker.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/common/mustache.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/common/jeesite.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/common/jeesite.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
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
      out.write("/adminlte/plugins/jQuery/jquery-1.10.2.min.js\"></script>\n");
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
      out.write("<script type=\"text/javascript\">var ctx = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', ctxStatic = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';</script>");
      out.write("\t\t\n");
      out.write("\t<!-- Baidu tongji analytics --><script>var _hmt=_hmt||[];(function(){var hm=document.createElement(\"script\");hm.src=\"//hm.baidu.com/hm.js?82116c626a8d504a5c0675073362ef6f\";var s=document.getElementsByTagName(\"script\")[0];s.parentNode.insertBefore(hm,s);})();</script>\n");
      out.write("\t");
      if (_jspx_meth_sitemesh_head_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      if (_jspx_meth_sitemesh_body_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t<script type=\"text/javascript\">//<!-- 无框架时，左上角显示菜单图标按钮。\n");
      out.write("\t\tif(!(self.frameElement && self.frameElement.tagName==\"IFRAME\")){\n");
      out.write("\t\t\t$(\"body\").prepend(\"<i id=\\\"btnMenu\\\" class=\\\"icon-th-list\\\" style=\\\"cursor:pointer;float:right;margin:10px;\\\"></i><div id=\\\"menuContent\\\"></div>\");\n");
      out.write("\t\t\t$(\"#btnMenu\").click(function(){\n");
      out.write("\t\t\t\ttop.$.jBox('get:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sys/menu/treeselect;JSESSIONID=");
      if (_jspx_meth_shiro_principal_0(_jspx_page_context))
        return;
      out.write("', {title:'选择菜单', buttons:{'关闭':true}, width:300, height: 350, top:10});\n");
      out.write("\t\t\t\t//if ($(\"#menuContent\").html()==\"\"){$.get(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sys/menu/treeselect\", function(data){$(\"#menuContent\").html(data);});}else{$(\"#menuContent\").toggle(100);}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}//-->\n");
      out.write("\t</script>\n");
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

  private boolean _jspx_meth_sitemesh_title_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sitemesh:title
    com.opensymphony.module.sitemesh.taglib.decorator.TitleTag _jspx_th_sitemesh_title_0 = (com.opensymphony.module.sitemesh.taglib.decorator.TitleTag) _jspx_tagPool_sitemesh_title_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.TitleTag.class);
    _jspx_th_sitemesh_title_0.setPageContext(_jspx_page_context);
    _jspx_th_sitemesh_title_0.setParent(null);
    int _jspx_eval_sitemesh_title_0 = _jspx_th_sitemesh_title_0.doStartTag();
    if (_jspx_th_sitemesh_title_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sitemesh_title_nobody.reuse(_jspx_th_sitemesh_title_0);
      return true;
    }
    _jspx_tagPool_sitemesh_title_nobody.reuse(_jspx_th_sitemesh_title_0);
    return false;
  }

  private boolean _jspx_meth_sitemesh_head_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sitemesh:head
    com.opensymphony.module.sitemesh.taglib.decorator.HeadTag _jspx_th_sitemesh_head_0 = (com.opensymphony.module.sitemesh.taglib.decorator.HeadTag) _jspx_tagPool_sitemesh_head_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.HeadTag.class);
    _jspx_th_sitemesh_head_0.setPageContext(_jspx_page_context);
    _jspx_th_sitemesh_head_0.setParent(null);
    int _jspx_eval_sitemesh_head_0 = _jspx_th_sitemesh_head_0.doStartTag();
    if (_jspx_th_sitemesh_head_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sitemesh_head_nobody.reuse(_jspx_th_sitemesh_head_0);
      return true;
    }
    _jspx_tagPool_sitemesh_head_nobody.reuse(_jspx_th_sitemesh_head_0);
    return false;
  }

  private boolean _jspx_meth_sitemesh_body_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sitemesh:body
    com.opensymphony.module.sitemesh.taglib.decorator.BodyTag _jspx_th_sitemesh_body_0 = (com.opensymphony.module.sitemesh.taglib.decorator.BodyTag) _jspx_tagPool_sitemesh_body_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.BodyTag.class);
    _jspx_th_sitemesh_body_0.setPageContext(_jspx_page_context);
    _jspx_th_sitemesh_body_0.setParent(null);
    int _jspx_eval_sitemesh_body_0 = _jspx_th_sitemesh_body_0.doStartTag();
    if (_jspx_th_sitemesh_body_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sitemesh_body_nobody.reuse(_jspx_th_sitemesh_body_0);
      return true;
    }
    _jspx_tagPool_sitemesh_body_nobody.reuse(_jspx_th_sitemesh_body_0);
    return false;
  }

  private boolean _jspx_meth_shiro_principal_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:principal
    org.apache.shiro.web.tags.PrincipalTag _jspx_th_shiro_principal_0 = (org.apache.shiro.web.tags.PrincipalTag) _jspx_tagPool_shiro_principal_property_nobody.get(org.apache.shiro.web.tags.PrincipalTag.class);
    _jspx_th_shiro_principal_0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_principal_0.setParent(null);
    _jspx_th_shiro_principal_0.setProperty("sessionid");
    int _jspx_eval_shiro_principal_0 = _jspx_th_shiro_principal_0.doStartTag();
    if (_jspx_th_shiro_principal_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_principal_property_nobody.reuse(_jspx_th_shiro_principal_0);
      return true;
    }
    _jspx_tagPool_shiro_principal_property_nobody.reuse(_jspx_th_shiro_principal_0);
    return false;
  }
}
