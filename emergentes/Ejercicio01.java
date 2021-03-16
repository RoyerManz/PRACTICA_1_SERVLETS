package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio01", urlPatterns = {"/Ejercicio01"})
public class Ejercicio01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJERCICIO 01</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>EJERCICIO Nº 1</h1>");
            out.println("<form action='Ejercicio01' method='post'>");
            out.println("<label>NOMBRE: </label>");
            out.println("<input type='text' name='nombre' >");
            out.println("<br>");
            out.println("<label>AÑO DE NACIMIENTO: </label>");
            out.println("<input type='number' name='nacimiento'  min='1900' value='1900'>");
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
        String nombre,nacimiento;
        int año,edad;
        nombre=request.getParameter("nombre");
        nacimiento=request.getParameter("nacimiento");
        if(nacimiento!=null){
        año=Integer.parseInt(nacimiento);
        edad=2021-año;
        }else{
            edad=0;
        }
        
            response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJERCICIO 01</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>RESULTADOS</h1>");
            out.println("<p><strong>Su nombre es: " +nombre+ "</strong></p>");
            out.println("<p><strong>Su edad es de " +edad+ " años </strong></p>");
            out.println("<strong><a href='Ejercicio01'>Volver</a></strong>");
            out.println("</body>");
            out.println("</html>");   
        }
    }
    
}
