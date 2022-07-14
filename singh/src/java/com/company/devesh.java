
package com.company;

 
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

 public class devesh extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        PrintWriter out=response.getWriter();
        out.print("<h1>WELCOME TO REGISTRATION FORM</h1>");
       
        
    }
}
 
