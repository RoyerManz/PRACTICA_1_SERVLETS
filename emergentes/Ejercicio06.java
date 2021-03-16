package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio06", urlPatterns = {"/Ejercicio06"})
public class Ejercicio06 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJERCICIO 6</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>EJERCICIO Nº 6</h1>");
            out.println("<form action='Ejercicio06' method='post'>");
            out.println("<label>JUEGO DE DADOS</label>");
            out.println("<br>");
            out.println("<input type='submit' value='LANZAR DADOS'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<strong><a href='Main'>Volver al Inicio</a></strong>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int dado1,dado2,res;
        dado1=(int)(Math.random()*6+1);
        dado2=(int)(Math.random()*6+1);
        res=dado1+dado2;
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJERCICIO 6</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>EJERCICIO Nº 6</h1>");
            out.println("<p>EL VALOR DEL PRIMER DADO ES <strong> " +dado1+ " </strong></p>");
            out.println("<p>EL VALOR DEL SEGUNDO DADO ES <strong> " +dado2+ " </strong></p>");
            out.println("<p>LA SUMA ES <strong> " +res+ " </strong></p>");
            out.println("<br>");
            if(res==7 || res==11){
                out.println("<strong><h3>GANASTE</h3></strong>");
            }else{
                out.println("<strong><h3>PERDISTE</h3></strong>");
            }
            out.println("<br>");
            out.println("<strong><a href='Ejercicio06'>Volver</a></strong>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}