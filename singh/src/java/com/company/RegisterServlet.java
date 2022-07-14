package com.company;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

 public class RegisterServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String name=request.getParameter("username");
        String password=request.getParameter("password");
        out.print("<h1>WELCOME TO REGISTRATION FORM</h1>" +name);
       out.print("<h1><a href='/verma'>Visit Servlet2</a></h1>");
        
    }
}