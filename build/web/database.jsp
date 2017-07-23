<%-- 
    Document   : miscellaneous
    Created on : Apr 4, 2017, 6:16:57 PM
    Author     : Royalty
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!doctype html>
<html>
<head>
    <title>Database::Resume</title>
    <meta charset="utf-8" />
    <meta name="keywords" content="Resume show case, peter eugene mbanda, resume example"/>
    <meta name="description" content="class projects Javascript, HTML, CSS, Java, Jsoup"/>
    <link rel="stylesheet" type="text/css" href="css\stylesch4.css" />
</head>
<body>
    <header>
        <div style="text-align: center">
            <a style="background-color: #f9f5f3" href="resume.jsp"><img src="images\resumeimages.jpg" height="150" width="200" alt="resume logo" style="box-shadow: 10px 10px 15px #888888" /></a>
        </div>
    </header>
    
    
    <br />
    <table class="menu" style="border-style: none">
        <tr>
            <th class="menuicon"><a href="resume.jsp">Home</a></th>
            
            <th class="menuicon"><a href="webexamples.jsp">Web Sites</a></th>
            
            <th class="menuicon"><a href="webscraper.jsp">Web Scraper</a></th>
          
            <th class="menuicon"><a href="#">Database</a></th>
            
            <th class="menuicon"><a href="contact.jsp">Contact</a></th>
        </tr>
    </table>
    
<div id="body">  
    <h3 id="body">Database application page</h3>  
    <p>
        Display database objects.
        
    <pre id="object">
        
    </pre>
    </p>
    
    <table border="1">
        <tr>
            <td style="font-style: normal; color: blueviolet">Name</td>
            <td style="font-style: normal; color: blueviolet">Email</td>
            <td style="font-style: normal; color: blueviolet">Amount</td>
        </tr>
        
        <%
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
                    %>
                    <tr>
                    
                        <td><%=rs.getString("firstname")%> <%=rs.getString("lastname")%></td>
                        <td><%=rs.getString("email")%> </td>
                        <td style="color: green"><%=rs.getString("amount")%></td>
                       
                    </tr>
                    <%
                }
                query = "SELECT sum(amount) AS total FROM members";
                rs = state.executeQuery(query);
                %>
                <tr>
                    <td style="color: red" colspan="2">Total</td>
                    <td style="color: green"><%=rs.getString("total")%></td>
                </tr>
                
                <%
                    
                %>
                <tr>
                    <td style="color: red">Invested</td>
                    <td style="color: red">Investment::Stocks::Chesapeake And Sprint Corp</td>
                    <td style="color: green">700.00</td>
                </tr>
                
                <%
                query = "SELECT sum(amount) AS total FROM members";
                rs = state.executeQuery(query);
                 %>
                <tr>
                    <td style="color: red"colspan="2">Total After Investments</td>
                    <td style="color: green"><%=Double.parseDouble(rs.getString("total")) - 700%></td>
                </tr>
                
                <%
                conn.close();
            } 
            catch ( Exception e ) 
            {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            }

            %>
       
    </table>
    
            <p></p>
            <p></p>
    
</div> 
    <footer id="body" style="text-align: center">
        <small>Copyright &#169; 2017 Mansory Inc. All rights reserved -> No animals were harmed during creation of Website</small>
    </footer>
</body>
</html>
