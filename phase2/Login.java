package com.nameservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/Login")
public class Login extends HttpServlet {
        private static final long serialVersionUID = 1L;
  public Login() {
        super();
   }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
            String userId = request.getParameter("userid");
            if (userId == null ) {
                out.println("No UserId was found in the URL.<br>");
            } else {
                out.println("UserId obtained from URL Rewriting:" + userId + "<br>");
            }
            out.println("</body></html>");

        }
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
        }

}
