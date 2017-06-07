/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.resumeShowCase;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Royalty
 */
@WebServlet(name = "MailSent", urlPatterns = {"/SentMail"})
public class MailSent extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        // name of the jsp for the message to be forwarded
        String url = "/sentmail.jsp";
        
        // obtain the parameters from the jsp requested
        String name = request.getParameter("username");
        String email = request.getParameter("email");
        String message = request.getParameter("message");
        
        User user = new User(name, email, message);
        
        // obtain servlet context for this instance
        ServletContext sc = getServletContext();
        String fullPath = sc.getRealPath("WEB-INF/info.txt");
                
        UserIo.add(user, fullPath);
        
        RequestDispatcher dispatcher = sc.getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
        doPost(req, resp);
    }
    
    

}
