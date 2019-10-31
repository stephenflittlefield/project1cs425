package edu.jsu.mcis.cs425;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        try {
            
            PrintWriter out = response.getWriter();
            int sessionid = Integer.parseInt(request.getParameter("sessionid"));
            
            Database db = new Database();
            out.println(db.getRegistrations(sessionid));
            
        }
        catch (Exception e) { e.printStackTrace(); }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //processRequest(request, response);
        
    }

    @Override
    public String getServletInfo() {
        return "Registration Servlet";
    }

}
