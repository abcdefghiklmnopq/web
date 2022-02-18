package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>login Page</title>\n");
      out.write("       \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"colm-form\">\n");
      out.write("                <div class=\"form-container\">\n");
      out.write("                    <form action=\"../login\" method=\"POST\">\n");
      out.write("                       <input type=\"text\" placeholder=\"Email address\" name=\"email\">\n");
      out.write("                         <input type=\"password\" placeholder=\"Password\" name=\"password\">\n");
      out.write("                        <input type=\"submit\" class=\"btn-login\"  value=\"login\"/>\n");
      out.write("                    </form>\n");
      out.write("                    <a href=\"createaccount.jsp\">Forgotten password?</a>\n");
      out.write("                    <a  href=\"createaccount.jsp\" class=\"btn-new\">Create new Account</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("     <style>\n");
      out.write("            * {\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 0;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                font-family: 'Poppins', sans-serif;\n");
      out.write("                background-color: #f0f2f5;\n");
      out.write("                color: #1c1e21;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            main {\n");
      out.write("                height: 90vh;\n");
      out.write("                width: 100vw;\n");
      out.write("                position: relative;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .row {\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: space-around;\n");
      out.write("                align-items: center;\n");
      out.write("                width: 100%;\n");
      out.write("                max-width: 1000px;\n");
      out.write("                position: absolute;\n");
      out.write("                left: 50%;\n");
      out.write("                top: 50%;\n");
      out.write("                transform: translate(-50%, -50%);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .colm-form {\n");
      out.write("                flex: 0 0 40%;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .colm-form .form-container {\n");
      out.write("                background-color: #ffffff;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1), 0 8px 16px rgba(0, 0, 0, 0.1);\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("                padding: 20px;\n");
      out.write("                max-width: 400px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .colm-form .form-container input, .colm-form .form-container .btn-login {\n");
      out.write("                width: 100%;\n");
      out.write("                margin: 5px 0;\n");
      out.write("                height: 45px;\n");
      out.write("                vertical-align: middle;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .colm-form .form-container input {\n");
      out.write("                border: 1px solid #dddfe2;\n");
      out.write("                color: #1d2129;\n");
      out.write("                padding: 0 8px;\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .colm-form .form-container input:focus {\n");
      out.write("                border-color: #1877f2;\n");
      out.write("                box-shadow: 0 0 0 2px #e7f3ff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .colm-form .form-container .btn-login {\n");
      out.write("                background-color: #1877f2;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 6px;\n");
      out.write("                font-size: 20px;\n");
      out.write("                padding: 0 16px;\n");
      out.write("                color: #ffffff;\n");
      out.write("                font-weight: 700;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .colm-form .form-container a {\n");
      out.write("                display: block;\n");
      out.write("                color: #1877f2;\n");
      out.write("                font-size: 14px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                padding: 10px 0 20px;\n");
      out.write("                border-bottom: 1px solid #dadde1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .colm-form .form-container a:hover {\n");
      out.write("                text-decoration: underline;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .colm-form .form-container .btn-new {\n");
      out.write("                background-color: #42b72a;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 6px;\n");
      out.write("                font-size: 17px;\n");
      out.write("                line-height: 48px;\n");
      out.write("                padding: 0 16px;\n");
      out.write("                color: #ffffff;\n");
      out.write("                font-weight: 700;\n");
      out.write("                margin-top: 20px; \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .colm-form p {\n");
      out.write("                font-size: 14px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .colm-form p a {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #1c1e21;\n");
      out.write("                font-weight: 600;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .colm-form p a:hover {\n");
      out.write("                text-decoration: underline;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .footer-contents {\n");
      out.write("                position: relative;\n");
      out.write("                max-width: 1000px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            footer ol {\n");
      out.write("                display: flex;\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("                list-style-type: none;\n");
      out.write("                padding: 10px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            footer ol:first-child {\n");
      out.write("                border-bottom: 1px solid #dddfe2;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            footer ol:first-child li:last-child button {\n");
      out.write("                background-color: #f5f6f7;\n");
      out.write("                border: 1px solid #ccd0d5;\n");
      out.write("                outline: none;\n");
      out.write("                color: #4b4f56;\n");
      out.write("                padding: 0 8px;\n");
      out.write("                font-weight: 700;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
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
}
