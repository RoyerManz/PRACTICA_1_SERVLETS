package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio02", urlPatterns = {"/Ejercicio02"})
public class Ejercicio02 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJERCICIO 02</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>EJERCICIO Nº 2</h1>");
            out.println("<form action='Ejercicio02' method='post'>");
            out.println("<label> INGRESE UN NUMERO:  </label>");
            out.println("<input type='number' min='0' name='numero'>");
            out.println("<br>");
            out.println("<input type='submit' value='SACAR FACTORIAL'>");
            out.println("</form>");
            out.println("<strong><a href='Main'>Volver al Inicio</a></strong>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String numero=request.getParameter("numero");
        int n=Integer.parseInt(numero);
        int r=Factorial(n);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJERCICIO 02</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>EJERCICIO Nº 2</h1>");
            out.println("<p><strong>EL FACTORIAL DEL NUMERO "+n+" ES "+r+"</strong></p>");
            out.println("<strong><a href='Ejercicio02'>Volver</a></strong>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    public static int Factorial(int num){
        int resultado;
        if(num>0){
            resultado=1;
            for(int i=1;i<=num;i++){
                resultado*=i;
            }
        }else{
            resultado=1;
        }
        return resultado;
    }
            
}
