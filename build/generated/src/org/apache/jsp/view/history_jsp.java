package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class history_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js\"></script>\n");
      out.write("        <canvas id=\"myChart\" width=\"500\" height=\"200\" style=\"border:1px solid #d3d3d3;\">\n");
      out.write("            Your browser does not support the HTML canvas tag.</canvas>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            var ctx = document.getElementById('myChart').getContext('2d');\n");
      out.write("            var chart = new Chart(ctx, {\n");
      out.write("                // The type of chart we want to create\n");
      out.write("                type: 'line',\n");
      out.write("\n");
      out.write("                // The data for our dataset\n");
      out.write("                data: {\n");
      out.write("                    labels: [\"January\", \"February\", \"March\", \"April\", \"May\", \"June\", \"July\"],\n");
      out.write("                    datasets: [{\n");
      out.write("                            label: \"My First dataset\",\n");
      out.write("                            backgroundColor: 'rgb(255, 99, 132)',\n");
      out.write("                            borderColor: 'rgb(255, 99, 132)',\n");
      out.write("                            data: [0, 10, 5, 2, 20, 30, 45],\n");
      out.write("                        }]\n");
      out.write("                },\n");
      out.write("\n");
      out.write("                // Configuration options go here\n");
      out.write("                options: {}\n");
      out.write("            });\n");
      out.write("        </script>\n");
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
}
