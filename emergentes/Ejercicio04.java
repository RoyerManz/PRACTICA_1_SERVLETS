package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio04", urlPatterns = {"/Ejercicio04"})
public class Ejercicio04 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJERCICIO 4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>EJERCICIO Nº 4</h1>");
            out.println("<form action='Ejercicio04' method='post'>");
            out.println("<label>MONTO: </label>");
            out.println("<input type='number' min='1' name='monto'>");
            out.println("<label>CAMBIO:  </label>");
            out.println("<select name='select'>");
            out.println("<option value='Bolivianos a Dolares'>Bolivianos a Dolares</option>");
            out.println("<option value='Dolares a Bolivianos'>Dolares a Bolivianos</option>");
            out.println("</select>");
            out.println("<br>");
            out.println("<input type='submit' value='CAMBIAR'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<strong><a href='Main' > Volver al Inicio</a></strong>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String monto=request.getParameter("monto");
        int num = Integer.parseInt(monto);
        String cambio=request.getParameter("select");
        float resultado;
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJERCICIO 4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>EJERCICIO Nº 4</h1>");
            if("Bolivianos a Dolares".equals(cambio)){
                resultado=(float) (num/6.96);
                out.println("<strong><p>EL CAMBIO DE " +num+ " BOLIVIANOS ES " +resultado+ " DOLARES</p></strong>");
            }else if("Dolares a Bolivianos".equals(cambio)){
                resultado=(float) (num*6.96);
                out.println("<strong><p>EL CAMBIO DE " +num+ " DOLARES ES " +resultado+ " BOLIVIANOS</p></strong>");
            } 
            out.println("<br>");
            out.println("<strong><a href='Ejercicio04'>Volver</a></strong>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
