/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab1.controller;

import com.lab1.model.User;
import com.lab1.service.Authenticate;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ramesh
 */
public class LoginServlet extends HttpServlet {
    
    public LoginServlet() {
        super();
    }
    
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String username = request.getParameter("username");
        String password = request.getParameter("password"); 
        
        User user = new User(username, password);
        Authenticate auth = new Authenticate();
        String result = auth.checkAuthenticate(user.getUsername(), user.getPassword());
        
        HttpSession session = request.getSession();
        
        if(result.equalsIgnoreCase("SUCCESS")) {
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            RequestDispatcher rd = request.getRequestDispatcher("/welcome.jsp");
            rd.forward(request, response);
        
        } else  {
           session.setAttribute("errorMessage", "Invalid username or password");
           RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
           rd.forward(request, response);
        }
        
    }

}
