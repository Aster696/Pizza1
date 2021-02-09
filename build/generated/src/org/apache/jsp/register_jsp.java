package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_css_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_css_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_css_url_value_nobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"");
      if (_jspx_meth_css_url_0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        ");

            String errorMessage = "";
            if(session.getAttribute("Error") != null){
                errorMessage = (String)session.getAttribute("Error");
                
                session.removeAttribute("Error");          
            }
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <div class=\"formcontainer\">\n");
      out.write("            <h3>Sign up</h3>\n");
      out.write("            <div>\n");
      out.write("                <form action=\"RegistryController\" method=\"post\">\n");
      out.write("                    <div>\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><input type=\"text\" name=\"username\" placeholder=\"Enter your Name\" minlength=\"3\" maxlength=\"15\" size=\"54\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><input type=\"email\" name=\"email\" placeholder=\"Enter your Email\" required size=\"54\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><input type=\"number\" name=\"contact\" required min=\"10\" placeholder=\"Enter your Phone no.\" size=\"54\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><textarea name=\"address\" style=\"resize: none\" rows=\"3\" required cols=\"57\" placeholder=\"Enter your Address\"></textarea></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><input type=\"password\" name=\"password\" minlength=\"8\" maxlength=\"18\" required placeholder=\"Create your password\" size=\"54\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <div>                       \n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><a><input type=\"submit\" value=\"Sign in\" class=\"btn btn-primary\"/></a>\n");
      out.write("                                    <a href=\"index.jsp\"><input value=\"Log in\" class=\"btn btn-success\"/></a></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    ");
if(errorMessage != "") {
      out.write("\n");
      out.write("                                    <div class=\"alert alert-danger\" role=\"alert\">\n");
      out.write("                                        ");
      out.print( errorMessage );
      out.write(" <br> <a class=\"btn btn-primary d-flex justify-content-center\" href=\"register.jsp\">OK</a>\n");
      out.write("                                    </div>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_css_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  css:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_css_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_css_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_css_url_0.setPageContext(_jspx_page_context);
    _jspx_th_css_url_0.setParent(null);
    _jspx_th_css_url_0.setValue("/css/formcontainer.css");
    int _jspx_eval_css_url_0 = _jspx_th_css_url_0.doStartTag();
    if (_jspx_th_css_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_css_url_value_nobody.reuse(_jspx_th_css_url_0);
      return true;
    }
    _jspx_tagPool_css_url_value_nobody.reuse(_jspx_th_css_url_0);
    return false;
  }
}
