package com.practice;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

 public class MySevlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        System.out.println("theis is get method.....");
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.print("<h1>this is get method of http servlet</h1>");
        
    }
}
