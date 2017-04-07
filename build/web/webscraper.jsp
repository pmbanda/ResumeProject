<%-- 
    Document   : webscraper
    Created on : Apr 4, 2017, 6:05:47 PM
    Author     : Royalty
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<html>
<head>
    <title>Resume Show Case</title>
    
    <meta charset="utf-8" />
    <meta name="keywords" content="Resume show case, peter eugene mbanda, resume example"/>
    <meta name="description" content="class projects Javascript, HTML, CSS, Java, Jsoup"/>
    <link rel="stylesheet" type="text/css" href="css\stylesch4.css" />
    
</head>
<body>
    
    <header>
        <div style="text-align: center">
            <img src="oceansidelogo.jpg" width="866" height="259" alt="oceanside logo" style="box-shadow: 10px 10px 15px #888888" />
        </div>
    </header>
    
    
    <br />
    <table class="menu" style="border-style: none">
        <tr>
            <th class="menuicon"><a href="index.jsp">Home</a></th>
            <td class="menupipe">|</td>
            <th class="menuicon"><a href="webexamples.jsp">Web Examples</a></th>
            <td class="menupipe">|</td>
            <th class="menuicon"><a href="#">Web Scraper</a></th>
            <td class="menupipe">|</td>
            <th class="menuicon"><a href="miscellaneous.jsp">Miscellaneous</a></th>
        </tr>
    </table>
<div id="body">    
    <p>Web Scraper    
    
        The following web page contains a web scraper that contains information about top movies from the <span style="color: red">IMDB website</span><br>
    Click below to see the web scraper in action.<br>
    
    <p></p>
    
    <form action="/Scraper" method="POST" id="body">
        <input type="submit" value="Top Movies"/>
    </form>
    
    <p></p>
    
    <span id="body"> 
        <%
            //String movie = (String)request.getAttribute("movies");
            ArrayList<String> movies = (ArrayList<String>)(request.getAttribute("m"));
        
            for(String movie : movies) 
            {%>
                <%=movie%>
            <%}

        %> 
    </span><br>

    </p>
</div>
</body>
</html>
