package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
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
      out.write("            <th class=\"menuicon\"><a href=\"#\">Home</a></th>\n");
      out.write("            <td class=\"menupipe\">|</td>\n");
      out.write("            <th class=\"menuicon\"><a href=\"webexamples.jsp\">Web Examples</a></th>\n");
      out.write("            <td class=\"menupipe\">|</td>\n");
      out.write("            <th class=\"menuicon\"><a href=\"webscraper.jsp\">Web Scraper</a></th>\n");
      out.write("            <td class=\"menupipe\">|</td>\n");
      out.write("            <th class=\"menuicon\"><a href=\"miscellaneous.jsp\">Miscellaneous</a></th>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("    \n");
      out.write("<div id=\"body\">    \n");
      out.write("    <p>\n");
      out.write("    As we all know, the web is a pretty fast moving place, where attention spans are short and \n");
      out.write("    patience is limited. A trend that’s become increasing popular is for designers to introduce \n");
      out.write("    themselves on the home page, with more information available on the About page. Or if your \n");
      out.write("    entire website resides one page, then you really have to introduce yourself on that page.\n");
      out.write("    </p>\n");
      out.write("    \n");
      out.write("    <p>\n");
      out.write("    The introductory text needs to be short and to the point, and useful for the reader. \n");
      out.write("    It makes sense that the introduction is (nearly always) at the top of the page where it can \n");
      out.write("    catch the eye. Saying hello in this fashion certainly gives a friendly feel to the site and allows \n");
      out.write("    a designer to expand a bit on the usual tagline and logo combination. To make the introduction stand \n");
      out.write("    out, many designers are using large text and bright colours or strong contrast. Below for your \n");
      out.write("    design inspiration, you’ll find 10 examples of designers saying hello!\n");
      out.write("    </p>\n");
      out.write("    \n");
      out.write("</div>   \n");
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
