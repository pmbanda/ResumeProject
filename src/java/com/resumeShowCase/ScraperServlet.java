/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.resumeShowCase;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Royalty
 */
public class ScraperServlet extends HttpServlet 
{
    /*
    *********Debugging Scripts **************
    // use response for debugging
                response.setContentType("text/html");
    //PrintWriter out = response.getWriter();
                    //out.println(movString + "<br>");
    */
        

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        doGet(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         // Declare the variable to hold the document
        Document doc;
        
       	// url for the jsp for message relay
        String pageUrl = "/scraperaction.jsp";
        
        
        try
        {
            // Obtain address of the web to be scraped
            doc = Jsoup.connect("https://www.imdb.com/chart/top").get();
			
            String htmlDoc = doc.toString();// Convert the document to string
			
            // Convert the document object to a string using the parser
            Document documentString = Jsoup.parse(htmlDoc);
			
            // Get the movie title
            Elements movieInfo = documentString.getElementsByClass("titleColumn");
                
            ArrayList<String> moviesCollection = new ArrayList<>(); // Array list of movies in the collection
                
            // loop through the movie elements 
            for (int i = 0; i < movieInfo.size(); i++) 
            {       
                moviesCollection.add(movieInfo.get(i).toString());
                if(i > 98)
                    break;
              
            }
               
            request.setAttribute("movies", moviesCollection);
                
            getServletContext().getRequestDispatcher(pageUrl).forward(request, response);
   
        }
        catch (IOException | ServletException e) 
        {
            request.setAttribute("exception", e);

        }
      }

    }



