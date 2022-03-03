package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.CEX;
import java.util.ArrayList;
import model.ticker;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>home Page</title>\n");
      out.write("        ");


            ArrayList<ticker> list = (ArrayList<ticker>) request.getAttribute("list");
            CEX x = (CEX) request.getSession().getAttribute("cexs");
            String markettype = x.getName();
            String cex = x.getCexname();
            String cratelv2 = (String) request.getSession().getAttribute("crate");
            String volumelv2 = (String) request.getSession().getAttribute("volume");
            String elastedtime = (String) request.getSession().getAttribute("elastedtime")+"";
            
        
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <style>\n");
      out.write("            .txt{\n");
      out.write("                text-align: right;\n");
      out.write("            }\n");
      out.write("            .center{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .form-container {\n");
      out.write("                background-color: #c8cbcf;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1), 0 8px 16px rgba(0, 0, 0, 0.1);\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                padding: 20px;\n");
      out.write("                max-width: 500px;\n");
      out.write("            }\n");
      out.write("            div{\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("            .form{\n");
      out.write("                border-style:solid;\n");
      out.write("                padding: 1spx;\n");
      out.write("                border-color: #002752;\n");
      out.write("                margin: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input{\n");
      out.write("                margin: 10px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body ");

        String a = (String) request.getAttribute("a")+"";
        if (a.equals("a")) {
      out.write("\n");
      out.write("        onload=\"Stat()\"\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        >\n");
      out.write("\n");
      out.write("        <div class=\"select\">\n");
      out.write("            <form action=\"viewServlet\" method=\"POST\" >\n");
      out.write("                &emsp;&emsp;Market Type:&emsp;\n");
      out.write("                <select name=\"markettype\">\n");
      out.write("\n");
      out.write("                    <option value=\"Spot\" >Spot</option>\n");
      out.write("                    <option value=\"Futures\" \n");
      out.write("                            ");
if (markettype.equals("Futures")) {
      out.write("\n");
      out.write("                            selected=\"selected\" \n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                            >Futures</option>\n");
      out.write("                </select>\n");
      out.write("                &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;CEX:&emsp;\n");
      out.write("                <select name=\"cex\">\n");
      out.write("                    <option value=\"Binance\">Binance</option>\n");
      out.write("                    <option value=\"kukoin\" \n");
      out.write("                            ");
if (cex.equals("kukoin")) {
      out.write("\n");
      out.write("                            selected=\"selected\" \n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                            >kukoin</option>\n");
      out.write("                </select><br>\n");
      out.write("                <br>\n");
      out.write("                &emsp;&emsp;<input type=\"submit\"  value=\"submit\" />\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        ");
if (list.size() != 0) {
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6 col-sm-12\">\n");
      out.write("                <table border=\"1\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th> Name </th>\n");
      out.write("                            <th>&emsp; Price &emsp;</th>\n");
      out.write("                            <th>&ensp;(24h)ChangeRate &ensp;</th>\n");
      out.write("                            <th>&emsp; ChangePrice &emsp;</th>\n");
      out.write("                            <th>&emsp; Volume(USDT)&emsp; </th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");
for (ticker t : list) {
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(t.getName());
      out.write("</td>\n");
      out.write("                            <td > &emsp;");
      out.print(t.getPrice());
      out.write("&emsp;</td>\n");
      out.write("                            <td class=\"center\">");
      out.print(t.getChangerate());
      out.write("&emsp;%</td>\n");
      out.write("                            <td class=\"txt\"> ");
      out.print(t.getChangeprice());
      out.write("&emsp;</td>\n");
      out.write("                            <td class=\"txt\">");
      out.print(t.getVolume());
      out.write("&emsp;M&emsp;</td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6 col-sm-12\" >\n");
      out.write("                <div class=\"form-container\">\n");
      out.write("                    <div class=\"form\" >\n");
      out.write("                        <form action=\"viewServlet\" method=\"POST\"  >\n");
      out.write("                            Alert:<br>\n");
      out.write("                            <input type=\"email\" placeholder=\"Email address\" name=\"email\"><br>\n");
      out.write("                            Do you want to receive emails: <input type=\"radio\" name=\"sendeail\" value=\"yes\"> YES \n");
      out.write("                            <input type=\"radio\" name=\"sendeail\" value=\"No\"/> NO <br>\n");
      out.write("                            <br>\n");
      out.write("                            Confguration<br>\n");
      out.write("                            Lever 1:<br>\n");
      out.write("                            <input type=\"text\" placeholder=\"% Change Rate\" name=\"changerate1\">(%) Change Rate<br>\n");
      out.write("                            <input type=\"text\" placeholder=\" Volume24h\" name=\"vol1\">M&emsp;(USD) Volume 24h <br/>\n");
      out.write("                            <input type=\"submit\"  value=\"Filter\"  />\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form\" >\n");
      out.write("                        <form action=\"list\" method=\"POST\" id=\"searchFrm\"  >\n");
      out.write("                            Lever 2:<br>\n");
      out.write("                            <input type=\"text\" placeholder=\"% Change Rate\" name=\"changerate2\"\n");
      out.write("                                   ");
 if( cratelv2!=null && !cratelv2.trim().isEmpty()){
      out.write("\n");
      out.write("                                   value=\"");
      out.print(cratelv2);
      out.write("\"\n");
      out.write("                                   ");
}
      out.write("\n");
      out.write("                                   >(%) Change Rate<br>\n");
      out.write("                            <input type=\"text\" placeholder=\" Volume24h\" name=\"vol2\"\n");
      out.write("                                   ");
 if( volumelv2!=null && !volumelv2.trim().isEmpty()){
      out.write("\n");
      out.write("                                   value=\"");
      out.print(volumelv2);
      out.write("\"\n");
      out.write("                                   ");
}
      out.write("\n");
      out.write("                                   >M&emsp;(USD) Volume 24h <br>\n");
      out.write("                            &ensp;<select name=\"elastedtime\" id=\"elastedtime\"\n");
      out.write("                                           onchange=\"change()\">\n");
      out.write("                                <option hidden=\"\" value=\"");
      out.print(elastedtime );
      out.write("\"></option>\n");
      out.write("                                <option value=\"1\" >1h</option>\n");
      out.write("                                <option value=\"2\">2h</option>\n");
      out.write("                                <option value=\"5\">5h</option>\n");
      out.write("                                <option value=\"10\">10h</option>\n");
      out.write("                                <option value=\"12\">12h</option>\n");
      out.write("                                <option value=\"24\">24h</option>\n");
      out.write("                            </select> &emsp;Elasted Time <br>\n");
      out.write("                            ");
if( !elastedtime.trim().isEmpty() ){
      out.write("\n");
      out.write("                                    <span > ");
      out.print(elastedtime );
      out.write(" h   \n");
      out.write("                                    </span><br>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                            \n");
      out.write("                            <input type=\"text\"  value=\"0\" id=\"number\" /> so phut troi qua!\n");
      out.write("\n");
      out.write("                            <input type=\"submit\"  value=\"Start\" onclick=\"Stat();\"/>\n");
      out.write("                            <input type=\"button\"  value=\"End\" onclick=\"Stop();\"/>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/homejavascript.js\" type=\"text/javascript\"></script>\n");
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
