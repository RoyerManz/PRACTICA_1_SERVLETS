package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio05", urlPatterns = {"/Ejercicio05"})
public class Ejercicio05 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJERCICIO 5</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>EJERCICIO Nº 5</h1>");
            out.println("<form action='Ejercicio05' method='post'>");
            out.println("<label>PRIMER NUMERO:  </label>");
            out.println("<input type='number' name='uno'>");
            out.println("<br>");
            out.println("<label>SEGUNDO NUMERO:  </label>");
            out.println("<input type='number' name='dos'>");
            out.println("<br>");
            out.println("<label> OPERADOR:  </label>");
            out.println("<select name='select'>");
            out.println("<option value='Suma'>Suma</option>");
            out.println("<option value='Resta'>Resta</option>");
            out.println("<option value='Multiplicacion'>Multiplicacion</option>");
            out.println("<option value='Division'>Division</option>");
            out.println("</select>");
            out.println("<br>");
            out.println("<input type='submit' value='PROCCESAR'>");
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
        
        String uno,dos,operacion;
        uno=request.getParameter("uno");
        dos=request.getParameter("dos");
        operacion=request.getParameter("select");
        int n1,n2;
        float res;
        n1=Integer.parseInt(uno);
        n2=Integer.parseInt(dos);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJERCICIO 5</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>EJERCICIO Nº 5</h1>");
            if("Suma".equals(operacion)){
                res=n1+n2;
                out.println("<strong><p>EL RESULTADO DE LA SUMA DE " +n1+ " + " +n2+ " ES IGUAL A  " +res+ " </p></strong>");
            }else if("Resta".equals(operacion)){
                res=n1-n2;
                out.println("<strong><p>EL RESULTADO DE LA RESTA DE " +n1+ " - " +n2+ " ES IGUAL A  " +res+ " </p></strong>");
            }else if("Multiplicacion".equals(operacion)){
                res=n1*n2;
                out.println("<strong><p>EL RESULTADO DE LA MULTIPLICACION DE " +n1+ " * " +n2+ " ES IGUAL A  " +res+ " </p></strong>");
            }else{
                res=n1/n2;
                out.println("<strong><p>EL RESULTADO DE LA DIVISION DE " +n1+ " / " +n2+ " ES IGUAL A  " +res+ " </p></strong>");
            }
            out.println("<br>");
            out.println("<strong><a href='Ejercicio05'>Volver</a></strong>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
