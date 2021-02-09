package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contactus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <link href=\"");
      if (_jspx_meth_css_url_0(_jspx_page_context))
        return;
      out.write("\"/>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("<section class=\"Material-contact-section section-padding section-dark\">\n");
      out.write("    <div class=\"container\" style=\"background-color: white\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("              <!-- Section Titile -->\n");
      out.write("              <div class=\"col-md-12 wow animated fadeInLeft\" data-wow-delay=\".2s\">\n");
      out.write("                  <h1 class=\"section-title\">Love to Hear From You</h1>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"row\">\n");
      out.write("              <!-- Section Titile -->\n");
      out.write("              <div class=\"col-md-6 mt-3 contact-widget-section2 wow animated fadeInLeft\" data-wow-delay=\".2s\">\n");
      out.write("                <p>\n");
      out.write("                    It is a simple web site created by me using Servlet. If you are interested to see what type of technology and \n");
      out.write("                    project I have created Click on my github link given below.\n");
      out.write("                    \n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <div class=\"find-widget\">\n");
      out.write("                 Creator:  <a href=\"#\">Aster</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"find-widget\">\n");
      out.write("                  Phone:  <a href=\"#\">+xxxxxx</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"find-widget\">\n");
      out.write("                  Email:  <a href=\"#\">asterrebeiro69@gmail.com</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"find-widget\">\n");
      out.write("                  Github:  <a href=\"https://github.com/Aster696\">Aster696</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <!-- contact form -->\n");
      out.write("              <div class=\"col-md-6 wow animated fadeInRight\" data-wow-delay=\".2s\">\n");
      out.write("                  <form class=\"shake\" role=\"form\" method=\"post\" id=\"contactForm\" name=\"contact-form\" data-toggle=\"validator\">\n");
      out.write("                      <!-- Name -->\n");
      out.write("                      <div class=\"form-group label-floating\">\n");
      out.write("                        <label class=\"control-label\" for=\"name\">Name</label>\n");
      out.write("                        <input class=\"form-control\" id=\"name\" type=\"text\" name=\"name\" required data-error=\"Please enter your name\">\n");
      out.write("                        <div class=\"help-block with-errors\"></div>\n");
      out.write("                      </div>\n");
      out.write("                      <!-- email -->\n");
      out.write("                      <div class=\"form-group label-floating\">\n");
      out.write("                        <label class=\"control-label\" for=\"email\">Email</label>\n");
      out.write("                        <input class=\"form-control\" id=\"email\" type=\"email\" name=\"email\" required data-error=\"Please enter your Email\">\n");
      out.write("                        <div class=\"help-block with-errors\"></div>\n");
      out.write("                      </div>\n");
      out.write("                      <!-- Subject -->\n");
      out.write("                      <div class=\"form-group label-floating\">\n");
      out.write("                        <label class=\"control-label\">Subject</label>\n");
      out.write("                        <input class=\"form-control\" id=\"msg_subject\" type=\"text\" name=\"subject\" required data-error=\"Please enter your message subject\">\n");
      out.write("                        <div class=\"help-block with-errors\"></div>\n");
      out.write("                      </div>\n");
      out.write("                      <!-- Message -->\n");
      out.write("                      <div class=\"form-group label-floating\">\n");
      out.write("                          <label for=\"message\" class=\"control-label\">Message</label>\n");
      out.write("                          <textarea class=\"form-control\" rows=\"3\" id=\"message\" name=\"message\" required data-error=\"Write your message\"></textarea>\n");
      out.write("                          <div class=\"help-block with-errors\"></div>\n");
      out.write("                      </div>\n");
      out.write("                      <!-- Form Submit -->\n");
      out.write("                      <div class=\"form-submit mt-5\">\n");
      out.write("                          <button class=\"btn btn-primary\" type=\"submit\" id=\"form-submit\"><i class=\"material-icons mdi mdi-message-outline\"></i> <a href=\"https://www.google.com/gmail/\">Send Message</a></button>\n");
      out.write("                          <div id=\"msgSubmit\" class=\"h3 text-center hidden\"></div>\n");
      out.write("                          <div class=\"clearfix\"></div>\n");
      out.write("                      </div>\n");
      out.write("                  </form>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("</section>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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

  private boolean _jspx_meth_css_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  css:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_css_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_css_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_css_url_0.setPageContext(_jspx_page_context);
    _jspx_th_css_url_0.setParent(null);
    _jspx_th_css_url_0.setValue("/css/contactus.css");
    int _jspx_eval_css_url_0 = _jspx_th_css_url_0.doStartTag();
    if (_jspx_th_css_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_css_url_value_nobody.reuse(_jspx_th_css_url_0);
      return true;
    }
    _jspx_tagPool_css_url_value_nobody.reuse(_jspx_th_css_url_0);
    return false;
  }
}
