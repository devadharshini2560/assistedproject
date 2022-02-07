package com.login;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@WebServlet("/Dashboardlogin")
public class Dashboardlogin extends HttpServlet {
        private static final long serialVersionUID = 1L;
 
    public Dashboardlogin() {
        super();
      
    }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
               
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            String userId = request.getParameter("userid");
            if (userId == null) {
                out.println("No UserId was found in hidden form field.<br>");
            } else {
                out.println("UserId found in hidden form field: " + userId + "<br>");
                
            }
            out.println("</body></html>");

        }

      
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
               
                doGet(request, response);
        }

}
