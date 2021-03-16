package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio03", urlPatterns = {"/Ejercicio03"})
public class Ejercicio03 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJERCICIO 03</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>EJERCICIO Nº 3</h1>");
            out.println("<form action='Ejercicio03' method='post'>");
            out.println("<label>AÑO DE NACIMIENTO:  </label>");
            out.println("<input type='number' min='1900' max='2021' name='nacimiento'>");
            out.println("<br>");
            out.println("<input type='submit' value='PROCESAR'>");
            out.println("</form>");
            out.println("<strong><a href='Main'>Volver al Inicio</a></strong>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nacimiento=request.getParameter("nacimiento");
        int año=Integer.parseInt(nacimiento);
        int edad=2021-año;
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJERCICIO 3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>EJERCICIO Nº 3</h1>");
            out.println("<strong><p>SU EDAD ES DE " +edad+ " AÑOS </p></strong>");
            out.println("<br>");
            out.println("<strong><a href='Ejercicio03'>Volver</a></strong>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
