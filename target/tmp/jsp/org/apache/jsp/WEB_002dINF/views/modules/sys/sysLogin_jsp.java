package org.apache.jsp.WEB_002dINF.views.modules.sys;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

public final class sysLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getAdminPath", com.thinkgem.jeesite.common.config.Global.class, "getAdminPath", new Class[] {});
  _jspx_fnmap_1= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getConfig", com.thinkgem.jeesite.common.config.Global.class, "getConfig", new Class[] {java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/views/include/taglib.jsp");
    _jspx_dependants.add("/WEB-INF/tags/sys/validateCode.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fns:getConfig('productName')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_1));
      out.write(" | 登录</title>\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/adminlte/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/adminlte/dist/css/AdminLTE.min.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/adminlte/plugins/iCheck/square/blue.css\">\n");
      out.write("</head>\n");
      out.write("<body class=\"hold-transition login-page\">\n");
      out.write("\n");
      out.write("<!--[if lte IE 6]><br/>\n");
      out.write("<div class='alert alert-block' style=\"text-align:left;padding-bottom:10px;\"><a class=\"close\" data-dismiss=\"alert\">x</a>\n");
      out.write("    <h4>温馨提示：</h4>\n");
      out.write("    <p>你使用的浏览器版本过低。为了获得更好的浏览体验，我们强烈建议您 <a href=\"http://browsehappy.com\" target=\"_blank\">升级</a> 到最新版本的IE浏览器，或者使用较新版本的\n");
      out.write("        Chrome、Firefox、Safari 等。</p></div><![endif]-->\n");
      out.write("\n");
      out.write("<div class=\"header\">\n");
      out.write("    <div id=\"messageBox\" class=\"alert alert-error ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty message ? 'hide' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("        <button data-dismiss=\"alert\" class=\"close\">×</button>\n");
      out.write("        <label id=\"loginError\" class=\"error\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"login-box\">\n");
      out.write("    <div class=\"login-logo\">\n");
      out.write("        <a href=\"#\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fns:getConfig('productName')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_1));
      out.write("</b></a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"login-box-body\">\n");
      out.write("        <p class=\"login-box-msg\">登陆</p>\n");
      out.write("        <form id=\"loginForm\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/login\" method=\"post\">\n");
      out.write("            <div class=\"form-group has-feedback\">\n");
      out.write("                <input name=\"username\" id=\"username\" class=\"form-control\" placeholder=\"用户名\">\n");
      out.write("                <span class=\"glyphicon glyphicon-envelope form-control-feedback\"></span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group has-feedback\">\n");
      out.write("                <input type=\"password\" name=\"password\" id=\"password\" class=\"form-control\"\n");
      out.write("                       placeholder=\"密码\">\n");
      out.write("                <span class=\"glyphicon glyphicon-lock form-control-feedback\"></span>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-8\">\n");
      out.write("                    <div class=\"checkbox icheck\" style=\"margin-left: 20px\">\n");
      out.write("                        <label>\n");
      out.write("                            <input type=\"checkbox\" id=\"rememberMe\" name=\"rememberMe\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rememberMe ? 'checked' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/>\n");
      out.write("                            记住我\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("                </div><!-- /.col -->\n");
      out.write("                <div class=\"col-xs-4\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary btn-block btn-flat\">登陆</button>\n");
      out.write("                </div><!-- /.col -->\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div><!-- /.login-box-body -->\n");
      out.write("</div><!-- /.login-box -->\n");
      out.write("\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/adminlte/plugins/jQuery/jQuery-2.1.4.min.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/adminlte/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/adminlte/plugins/iCheck/icheck.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("    $(function () {\n");
      out.write("        $('input').iCheck({\n");
      out.write("            checkboxClass: 'icheckbox_square-blue',\n");
      out.write("            radioClass: 'iradio_square-blue',\n");
      out.write("            increaseArea: '20%' // optional\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(\"#loginForm\").validate({\n");
      out.write("            rules: {\n");
      out.write("                validateCode: {remote: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/servlet/validateCodeServlet\"}\n");
      out.write("            },\n");
      out.write("            messages: {\n");
      out.write("                username: {required: \"请填写用户名.\"}, password: {required: \"请填写密码.\"},\n");
      out.write("                validateCode: {remote: \"验证码不正确.\", required: \"请填写验证码.\"}\n");
      out.write("            },\n");
      out.write("            errorLabelContainer: \"#messageBox\",\n");
      out.write("            errorPlacement: function (error, element) {\n");
      out.write("                error.appendTo($(\"#loginError\").parent());\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("    // 如果在框架或在对话框中，则弹出提示并跳转到首页\n");
      out.write("    if (self.frameElement && self.frameElement.tagName == \"IFRAME\" || $('#left').length > 0 || $('.jbox').length > 0) {\n");
      out.write("        alert('未登录或登录超时。请重新登录，谢谢！');\n");
      out.write("        top.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("    }\n");
      out.write("    })\n");
      out.write("    ;\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${isValidateCodeLogin}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <div class=\"validateCode\">\n");
        out.write("                    <label class=\"input-label mid\" for=\"validateCode\">验证码</label>\n");
        out.write("                    ");
        if (_jspx_meth_sys_validateCode_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                </div>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_sys_validateCode_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sys:validateCode
    org.apache.jsp.tag.web.sys.validateCode_tag _jspx_th_sys_validateCode_0 = new org.apache.jsp.tag.web.sys.validateCode_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_sys_validateCode_0      );
    }
    _jspx_th_sys_validateCode_0.setJspContext(_jspx_page_context);
    _jspx_th_sys_validateCode_0.setParent(_jspx_th_c_if_0);
    _jspx_th_sys_validateCode_0.setName("validateCode");
    _jspx_th_sys_validateCode_0.setInputCssStyle("margin-bottom:0;");
    _jspx_th_sys_validateCode_0.doTag();
    return false;
  }
}
