package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Contact::Resume</title>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Resume show case, peter eugene mbanda, resume example\"/>\n");
      out.write("        <meta name=\"description\" content=\"class projects Javascript, HTML, CSS, Java, Jsoup\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css\\stylesch4.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <header>\n");
      out.write("                <div style=\"text-align: center\">\n");
      out.write("                    <a style=\"background-color: #f9f5f3\" href=\"resume.jsp\"><img src=\"images\\resumeimages.jpg\" height=\"150\" width=\"200\" alt=\"resume logo\" style=\"box-shadow: 10px 10px 15px #888888\" /></a>\n");
      out.write("                </div>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <br />\n");
      out.write("    <table class=\"menu\" style=\"border-style: none\">\n");
      out.write("        <tr>\n");
      out.write("            <th class=\"menuicon\"><a href=\"resume.jsp\">Resume</a></th>\n");
      out.write("            <td class=\"menupipe\">|</td>\n");
      out.write("            <th class=\"menuicon\"><a href=\"webexamples.jsp\">Web Sites</a></th>\n");
      out.write("            <td class=\"menupipe\">|</td>\n");
      out.write("            <th class=\"menuicon\"><a href=\"webscraper.jsp\">Web Scraper</a></th>\n");
      out.write("            <td class=\"menupipe\">|</td>\n");
      out.write("            <th class=\"menuicon\"><a href=\"database.jsp\">Database</a></th>\n");
      out.write("            <td class=\"menupipe\">|</td>\n");
      out.write("            <th class=\"menuicon\"><a href=\"#\">Contact</a></th>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("    \n");
      out.write("<div id=\"body\">       \n");
      out.write("    <h3 id=\"body\">Contact information page</h3>\n");
      out.write("    <p>\n");
      out.write("     \n");
      out.write("    For more information on my resume please use the link below.<br> \n");
      out.write("    <a target=\"new\" style=\"background-color: #f9f5f3\" href=\"https://www.linkedin.com/in/peter-eugene-mbanda-8bb89baa/\"><img src=\"images\\linkedimage.png\" width=\"100\" height=\"100\"\n");
      out.write("    style=\"background-color:  #f9f5f3\"></a></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("    \n");
      out.write("    <br>\n");
      out.write("    To send personal mail please fill out the form below<br>\n");
      out.write("    \n");
      out.write("    <form method=\"POST\" id=\"body\">\n");
      out.write("                <label style=\"margin-right: 27px\"  id=\"body\"><b>User Name:</b></label>\n");
      out.write("                <input type=\"text\" name=\"username\" required=\"\" placeholder=\"User Name*\"/><br>\n");
      out.write("                <br>\n");
      out.write("                <label id=\"body\"><b>Email Address:</b></label>\n");
      out.write("                <input type=\"text\" name=\"email\" required=\"\" placeholder=\"Email*\"/><br>\n");
      out.write("                <br>\n");
      out.write("                <label id=\"body\"><b>Message:</b></label><br>\n");
      out.write("                <textarea rows=\"10\" cols=\"40\" required=\"\" placeholder=\"Type message*\"></textarea><br>\n");
      out.write("                <input  type=\"submit\" value=\"Submit\" style=\"height:30px; width:100px\" />\n");
      out.write("                <input type=\"reset\" value=\"Reset\" style=\"height:30px; width:100px\"/>\n");
      out.write("    </form>\n");
      out.write("    </p>\n");
      out.write("    <p></p>\n");
      out.write("</div>     \n");
      out.write("    <footer id=\"body\" style=\"text-align: center\">\n");
      out.write("        <small>Copyright &#169; 2017 Mansory Inc. All rights reserved</small>\n");
      out.write("    </footer>\n");
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
