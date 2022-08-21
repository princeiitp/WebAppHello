package com.prince.gradle;

import java.io.IOException;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class CouponServlet extends HttpServlet {
    

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String username = request.getParameter("hello");
        request.setAttribute("hello", "Hello "+username+", hope you are doing good!" );
        request.getRequestDispatcher("response.jsp").forward(request,response);
     }
}