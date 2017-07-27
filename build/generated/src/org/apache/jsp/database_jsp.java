package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class database_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Database::Resume</title>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"keywords\" content=\"Resume show case, peter eugene mbanda, resume example\"/>\n");
      out.write("    <meta name=\"description\" content=\"class projects Javascript, HTML, CSS, Java, Jsoup\"/>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css\\stylesch4.css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <div style=\"text-align: center\">\n");
      out.write("            <a style=\"background-color: #f9f5f3\" href=\"resume.jsp\"><img src=\"images\\resumeimages.jpg\" height=\"150\" width=\"200\" alt=\"resume logo\" style=\"box-shadow: 10px 10px 15px #888888\" /></a>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <br />\n");
      out.write("    <table class=\"menu\" style=\"border-style: none\">\n");
      out.write("        <tr>\n");
      out.write("            <th class=\"menuicon\"><a href=\"resume.jsp\">Home</a></th>\n");
      out.write("            \n");
      out.write("            <th class=\"menuicon\"><a href=\"webexamples.jsp\">Web Sites</a></th>\n");
      out.write("            \n");
      out.write("            <th class=\"menuicon\"><a href=\"webscraper.jsp\">Web Scraper</a></th>\n");
      out.write("          \n");
      out.write("            <th class=\"menuicon\"><a href=\"#\">Database</a></th>\n");
      out.write("            \n");
      out.write("            <th class=\"menuicon\"><a href=\"contact.jsp\">Contact</a></th>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("    \n");
      out.write("<div id=\"body\">  \n");
      out.write("    <h3 id=\"body\">Pitch Investors Data</h3>  \n");
      out.write("    <p>\n");
      out.write("    Pitch Investors is a company comprising several individuals with the aim of executing business strategies\n");
      out.write("    based on logistics. Investors can all contribute several ideas and come to conclusion on the best idea based\n");
      out.write("    on assessment by the committee members in the group. Assessment also includes calculated risks on the venture.    \n");
      out.write("    </p>\n");
      out.write("    \n");
      out.write("    <p>\n");
      out.write("    Below is a sample database displaying each member's stake in the company. Equity is calculated based on\n");
      out.write("    individual's stake divided by the total to obtain an individuals percentage ownership.\n");
      out.write("    </p>\n");
      out.write("    \n");
      out.write("    <table border=\"1\">\n");
      out.write("        <tr>\n");
      out.write("            <td style=\"font-style: normal; color: blueviolet\">Name</td>\n");
      out.write("            <td style=\"font-style: normal; color: blueviolet\">Email</td>\n");
      out.write("            <td style=\"font-style: normal; color: blueviolet\">Amount</td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        ");

            ServletContext sPath = request.getServletContext();
            String dbPath = sPath.getRealPath("investors.db");

            try 
            {
                Class.forName("org.sqlite.JDBC");
                Connection conn = DriverManager.getConnection("jdbc:sqlite:" + dbPath);
                
                System.out.println("Opened database successfully");
                
                Statement state = conn.createStatement();
                
                String query = "SELECT * FROM members ORDER BY amount DESC";
                
                ResultSet rs = state.executeQuery(query);
     
                while(rs.next())
                {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                    \n");
      out.write("                        <td>");
      out.print(rs.getString("firstname"));
      out.write(' ');
      out.print(rs.getString("lastname"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("email"));
      out.write(" </td>\n");
      out.write("                        <td style=\"color: green\">");
      out.print(rs.getString("amount"));
      out.write("</td>\n");
      out.write("                       \n");
      out.write("                    </tr>\n");
      out.write("                    ");

                }
                query = "SELECT sum(amount) AS total FROM members";
                rs = state.executeQuery(query);
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"color: red\" colspan=\"2\">Total</td>\n");
      out.write("                    <td style=\"color: green\">");
      out.print(rs.getString("total"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                ");

                    
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"color: red\">Invested</td>\n");
      out.write("                    <td style=\"color: red\">Investment::Stocks::Chesapeake And Sprint Corp</td>\n");
      out.write("                    <td style=\"color: green\">700.00</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                ");

                query = "SELECT sum(amount) AS total FROM members";
                rs = state.executeQuery(query);
                 
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"color: red\"colspan=\"2\">Total After Investments</td>\n");
      out.write("                    <td style=\"color: green\">");
      out.print(Double.parseDouble(rs.getString("total")) - 700);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                ");

                conn.close();
            } 
            catch ( Exception e ) 
            {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            }

            
      out.write("\n");
      out.write("       \n");
      out.write("    </table>\n");
      out.write("    \n");
      out.write("            <p></p>\n");
      out.write("            <h3  id=\"body\">Rules and Regulations</h3>\n");
      out.write("            <p>\n");
      out.write("            To review the policies and regulations for the group please click the link below\n");
      out.write("            <br>\n");
      out.write("            <a href=\"Pitch Investors Membership.pdf\">Pitch Investors Rules</a>\n");
      out.write("            </p>\n");
      out.write("    \n");
      out.write("</div> \n");
      out.write("    <footer id=\"body\" style=\"text-align: center\">\n");
      out.write("        <small>Copyright &#169; 2017 Mansory Inc. All rights reserved -> No animals were harmed during creation of Website</small>\n");
      out.write("    </footer>\n");
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
