package com.nameservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/dashboard")
public class dashboard extends HttpServlet {
        private static final long serialVersionUID = 1L;
    public dashboard() {
        super();
   }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
               String userId = request.getParameter("userid");
             response.sendRedirect("dashboard?userid=" + userId);  
                
        }
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                doGet(request, response);
        }

}
