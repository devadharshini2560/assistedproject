package com.login;


import java.io.*;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@WebServlet("/LoginServlet1")
public class LoginServlet1 extends HttpServlet {
        private static final long serialVersionUID = 1L;
 
    public LoginServlet1() {
        super();
       
    }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                      PrintWriter out = response.getWriter();
                 out.println("<html><body>");
                    
                 String userId = request.getParameter("userid");
                 //creating a new hidden form field
                out.println("<form action='dashboardlogin' method='post'>");
                out.println("<input type='hidden' name='userid' id='userid' value='"+userId+"'>");
                out.println("<input type='submit' value='submit' >");
                out.println("</form>");
                out.println("<script>document.forms[0].submit();</script>");
              
                
        }
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
               
                doGet(request, response);
        }

}
