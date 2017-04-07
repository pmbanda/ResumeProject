package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class webexamples_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Resume Show Case</title>\n");
      out.write("    \n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"keywords\" content=\"Resume show case, peter eugene mbanda, resume example\"/>\n");
      out.write("    <meta name=\"description\" content=\"class projects Javascript, HTML, CSS, Java, Jsoup\"/>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css\\stylesch4.css\" />\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <div style=\"text-align: center\">\n");
      out.write("            <img src=\"oceansidelogo.jpg\" width=\"866\" height=\"259\" alt=\"oceanside logo\" style=\"box-shadow: 10px 10px 15px #888888\" />\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <br />\n");
      out.write("    <table class=\"menu\" style=\"border-style: none\">\n");
      out.write("        <tr>\n");
      out.write("            <th class=\"menuicon\"><a href=\"index.jsp\">Home</a></th>\n");
      out.write("            <td class=\"menupipe\">|</td>\n");
      out.write("            <th class=\"menuicon\"><a href=\"#\">Web Examples</a></th>\n");
      out.write("            <td class=\"menupipe\">|</td>\n");
      out.write("            <th class=\"menuicon\"><a href=\"webscraper.jsp\">Web Scraper</a></th>\n");
      out.write("            <td class=\"menupipe\">|</td>\n");
      out.write("            <th class=\"menuicon\"><a href=\"miscellaneous.html\">Miscellaneous</a></th>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("    \n");
      out.write("    <p>Web Example </p>\n");
      out.write("    \n");
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
}
