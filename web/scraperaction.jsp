<%-- 
    Document   : scraperaction.jsp
    Created on : May 18, 2017, 11:01:22 PM
    Author     : Royalty
--%>

<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="org.jsoup.select.Elements"%>
<%@page import="org.jsoup.nodes.Document"%>
<%@page import="org.jsoup.Jsoup"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Database::Resume</title>
        <meta charset="utf-8" />
        <meta name="keywords" content="Resume show case, peter eugene mbanda, resume example"/>
        <meta name="description" content="class projects Javascript, HTML, CSS, Java, Jsoup"/>
        <style>
            #body
            {
                width: 75%;
                margin-left: auto;
                margin-right: auto;
            }
        </style>
    </head>
    
    <body id="body">
        <%!
            public int count = 0;
        %>
        <% 
            ArrayList<String> movie = (ArrayList<String>)(request.getAttribute("movies"));
            LocalDate d = LocalDate.now();
        %>
    <header>
        <div style="text-align: center" id="body">
            <a style="background-color: #f9f5f3" href="resume.jsp"><img src="images\resumeimages.jpg" height="150" width="200" alt="resume logo" style="box-shadow: 10px 10px 15px #888888" /></a>
        </div>
    </header>
        
        <h2 id="body">Web Scraper Action</h2>
        
        
        <div id="body">
            <p style="color: black">
                <b>Date:: <%= d %></b><br>  
                <b>Page Visits:: <%= ++count %></b> <br>  
                <b>Movies Total:: <%= movie.size() %></b>
            </p>
        <a href="#top" id="bottom">Bottom</a><br>
        <% 
                for (int i = 0; i < movie.size(); i++) 
                { %>   
                    <span id="body" style="color: green"> <%=movie.get(i).toString() + "<br>"%></span>
                <% } 
        %>
        <a href="#bottom" id="top">Top</a>
            
        </div> 
        
    <footer id="body" style="text-align: center">
        <small>Copyright &#169; 2017 Mansory Inc. All rights reserved</small>
    </footer>
    </body>
</html>
