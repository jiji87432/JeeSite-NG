package org.apache.jsp.tag.web.sys;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tableSort_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getAdminPath", com.thinkgem.jeesite.common.config.Global.class, "getAdminPath", new Class[] {});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/views/include/taglib.jsp");
  }

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String id;
  private java.lang.String name;
  private java.lang.String value;
  private java.lang.String callback;

  public java.lang.String getId() {
    return this.id;
  }

  public void setId(java.lang.String id) {
    this.id = id;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public java.lang.String getValue() {
    return this.value;
  }

  public void setValue(java.lang.String value) {
    this.value = value;
  }

  public java.lang.String getCallback() {
    return this.callback;
  }

  public void setCallback(java.lang.String callback) {
    this.callback = callback;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    _jspInit(config);
    if( getId() != null ) {
      _jspx_page_context.setAttribute("id", getId());
}
    if( getName() != null ) {
      _jspx_page_context.setAttribute("name", getName());
}
    if( getValue() != null ) {
      _jspx_page_context.setAttribute("value", getValue());
}
    if( getCallback() != null ) {
      _jspx_page_context.setAttribute("callback", getCallback());
}

    try {
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<input id=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${value}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\"/>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(document).ready(function() {\n");
      out.write("\t\tvar orderBy = $(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\").val().split(\" \");\n");
      out.write("\t\t$(\".sort-column\").each(function(){\n");
      out.write("\t\t\tif ($(this).hasClass(orderBy[0])){\n");
      out.write("\t\t\t\torderBy[1] = orderBy[1]&&orderBy[1].toUpperCase()==\"DESC\"?\"down\":\"up\";\n");
      out.write("\t\t\t\t$(this).html($(this).html()+\" <i class=\\\"icon icon-arrow-\"+orderBy[1]+\"\\\"></i>\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\t$(\".sort-column\").click(function(){\n");
      out.write("\t\t\tvar order = $(this).attr(\"class\").split(\" \");\n");
      out.write("\t\t\tvar sort = $(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\").val().split(\" \");\n");
      out.write("\t\t\tfor(var i=0; i<order.length; i++){\n");
      out.write("\t\t\t\tif (order[i] == \"sort-column\"){order = order[i+1]; break;}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif (order == sort[0]){\n");
      out.write("\t\t\t\tsort = (sort[1]&&sort[1].toUpperCase()==\"DESC\"?\"ASC\":\"DESC\");\n");
      out.write("\t\t\t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\").val(order+\" DESC\"!=order+\" \"+sort?\"\":order+\" \"+sort);\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\").val(order+\" ASC\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${callback}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>");
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("ctx");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}${fns:getAdminPath()}", java.lang.Object.class, (PageContext)this.getJspContext(), _jspx_fnmap_0));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("ctxStatic");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}/static", java.lang.Object.class, (PageContext)this.getJspContext(), null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }
}
