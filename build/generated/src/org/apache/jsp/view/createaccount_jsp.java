package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createaccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>create account</title>\r\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("            .signin {\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                font-size: 30px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <form class=\"well form-horizontal\" action=\"../createaccount\" method=\"POST\"  id=\"contact_form\">\r\n");
      out.write("                <!-- Form Name -->\r\n");
      out.write("                <legend><center><h2><b>Registration</b></h2></center></legend><br>\r\n");
      out.write("                <!-- Text input-->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                    <label class=\"col-md-4 control-label\">E-Mail</label>  \r\n");
      out.write("                    <div class=\"col-md-4 inputGroupContainer\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <input name=\"email\" placeholder=\"E-Mail Address\" class=\"form-control\"  type=\"text\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                    <label class=\"col-md-4 control-label\">phone number</label>  \r\n");
      out.write("                    <div class=\"col-md-4 inputGroupContainer\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("\r\n");
      out.write("                            <input name=\"phone\" placeholder=\"your phone\" class=\"form-control\" type=\"text\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                    <label class=\"col-md-4 control-label\">First Name</label>  \r\n");
      out.write("                    <div class=\"col-md-4 inputGroupContainer\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\"></i></span>\r\n");
      out.write("                            <input  name=\"firstname\" placeholder=\"First Name\" class=\"form-control\"  type=\"text\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                    <label class=\"col-md-4 control-label\" >Last Name</label> \r\n");
      out.write("                    <div class=\"col-md-4 inputGroupContainer\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\"></i></span>\r\n");
      out.write("                            <input name=\"lastname\" placeholder=\"Last Name\" class=\"form-control\"  type=\"text\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                    <label class=\"col-md-4 control-label\" >Gender </label> \r\n");
      out.write("                    <div class=\"col-md-4 inputGroupContainer\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            &nbsp&nbsp<input type=\"radio\" name=\"gender\" value=\"male\"/> Male\r\n");
      out.write("                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp              \r\n");
      out.write("                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\r\n");
      out.write("                            <input type=\"radio\" name=\"gender\" value=\"female\"/> Female\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                    <label class=\"col-md-4 control-label\" >Date of birth</label> \r\n");
      out.write("                    <div class=\"col-md-4 inputGroupContainer\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <input type=\"date\" name=\"dob\"/> <br/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                    <label class=\"col-md-4 control-label\" >Password</label> \r\n");
      out.write("                    <div class=\"col-md-4 inputGroupContainer\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <input name=\"password\" placeholder=\"Password\" class=\"form-control\"  type=\"password\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                    <label class=\"col-md-4 control-label\" >Confirm Password</label> \r\n");
      out.write("                    <div class=\"col-md-4 inputGroupContainer\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <input name=\"confirm_password\" placeholder=\"Confirm Password\" class=\"form-control\"  type=\"password\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Button -->\r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4\"><br>\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-warning\" >SUBMIT </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            <div class=\"signin\">\r\n");
      out.write("                <p>Already have an account? <a href=\"login.jsp\">Sign in</a>.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
