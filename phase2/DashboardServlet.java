package com.httpsessiondemo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/DashboardServlet")
public class DashboardServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;
     public DashboardServlet() {
        super();
        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
            HttpSession session=request.getSession(false);  
            String userId = null;
            if (session.getAttribute("userid") != null)
                userId =(String)session.getAttribute("userid");  
            if (userId == null ) {
                out.println("No UserId was found in session.<br>");
            } else {
                out.println("UserId obtained from session :" + userId + "<br>");
            }
            out.println("</body></html>");

        }
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                
                doGet(request, response);
        }

}
