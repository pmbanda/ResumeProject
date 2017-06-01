<%-- 
    Document   : webscraper
    Created on : Apr 4, 2017, 6:05:47 PM
    Author     : Peter Eugene Mbanda
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Collection"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!doctype html>
<html>
<head>
    <title>Web-Scraper::Resume</title>
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
            <th class="menuicon"><a href="#">Web Scraper</a></th>
            <td class="menupipe">|</td>
            <th class="menuicon"><a href="database.jsp">Database</a></th>
            <td class="menupipe">|</td>
            <th class="menuicon"><a href="contact.jsp">Contact</a></th>
        </tr>
    </table>
    
<div id="body">   
    <p>
    <h3 id="body">jSoup Web scraping application</h3>  
    </p>    
    
    <p>
        jsoup is a Java library for working with real-world HTML. It provides a very convenient API for extracting 
        and manipulating data, using the best of DOM, CSS, and jquery-like methods.
    </p>
    <p>
        The following web page contains a web scraper that contains information about top movies from the <span style="color: green">IMDB website</span><br>
        Click below to see the web scraper in action.<br>
    </p>

 
    <p>
    <form action="Scraper" method="GET" id="body">
        <!--<input type="hidden" name="action" value="add"> -->
        <input class="button" type="submit" value="Top Movies IMDB"/>
    </form>
    </p>
   
</div>
    <footer id="body" style="text-align: center">
        <small>Copyright &#169; 2017 Mansory Inc. All rights reserved</small>
    </footer>
</body>
</html>
