<%-- 
    Document   : contact
    Created on : May 20, 2017, 2:13:50 PM
    Author     : Royalty
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Contact::Resume</title>
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
            <th class="menuicon"><a href="resume.jsp">Resume</a></th>
            <td class="menupipe">|</td>
            <th class="menuicon"><a href="webexamples.jsp">Web Sites</a></th>
            <td class="menupipe">|</td>
            <th class="menuicon"><a href="webscraper.jsp">Web Scraper</a></th>
            <td class="menupipe">|</td>
            <th class="menuicon"><a href="database.jsp">Database</a></th>
            <td class="menupipe">|</td>
            <th class="menuicon"><a href="#">Contact</a></th>
        </tr>
    </table>
        
    
    
<div id="body">       
    <h3 id="body">Contact information page</h3>
    <p>
     
    For more information on my resume please use the link below.<br> 
    <a target="new" style="background-color: #f9f5f3" href="https://www.linkedin.com/in/peter-eugene-mbanda-8bb89baa/"><img src="images\linkedimage.png" width="100" height="100"
    style="background-color:  #f9f5f3"></a></td>
        </tr>
    </table>
    
    <br>
    To send personal mail please fill out the form below<br>
    
    <form method="POST" id="body">
                <label style="margin-right: 48px" id="body"><b>User Name:</b></label>
                <input type="text" name="username" required="" placeholder="User Name*"/><br>
                <br>
                <label style="margin-right: 20px" id="body"><b>Email Address:</b></label>
                <input type="text" name="email" required="" placeholder="Email*"/><br>
                <br>
                <label id="body"><b>Message:</b></label><br>
                <textarea rows="10" cols="40" required="" placeholder="Type message*"></textarea><br>
                <input type="submit" value="Submit" />
                <input type="reset" value="Reset" />
    </form>
    </p>
</div>     
    <footer id="body" style="text-align: center">
        <small>Copyright &#169; 2017 Mansory Inc. All rights reserved</small>
    </footer>
    </body>
</html>
