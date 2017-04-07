/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.resumeShowCase;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
        
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        // Declare the variable to hold the document
        Document doc;
        
       	// url for the jsp for message relay
        String url = "/webscraper.jsp";
        
            try
            {
                // Obtain address of the web to be scraped
                doc = Jsoup.connect("https://www.imdb.com/chart/top").get();
			
                String htmlDoc = doc.toString();// Convert the document to string
			
                // Convert the document object to a string using the parser
                Document documentString = Jsoup.parse(htmlDoc);
			
                // Get the movie title
                Elements movieInfo = documentString.getElementsByClass("titleColumn");
             
                // use response for debugging
                response.setContentType("text/html");
                
                ArrayList<String> movies = new ArrayList<>();
                
                for (int i = 0; i < movieInfo.size(); i++) 
                {     
                    //PrintWriter out = response.getWriter();
                    //out.println(movString + "<br>");
                    
                    movies.add(movieInfo.get(i).toString());
                }
               
                request.setAttribute("m", movies);
                getServletContext().getRequestDispatcher(url).forward(request, response);
   
            }
            catch (Exception e) 
            {
		// obtain error if the Web site is not instantiated
		e.printStackTrace();
            }
	
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        doPost(request, response);
    }


}

