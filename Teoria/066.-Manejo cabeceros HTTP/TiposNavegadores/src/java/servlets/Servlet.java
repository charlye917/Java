package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            String titulo = null, mensaje = null;
            String tipoNavegador = request.getHeader("User-Agent");
            System.out.println("Tipo de navegador" + tipoNavegador);
            
            if(tipoNavegador != null && tipoNavegador.contains("Trident")){
                titulo = "Navegador Internet Explorer";
            } else if(tipoNavegador != null && tipoNavegador.contains("Firefox")){
                titulo = "Navegador Firefox";
                mensaje = "Estas navegando con firefox";
            } else if(tipoNavegador != null && tipoNavegador.contains("Chrome")){
                titulo = "Navegador Chrome";
                mensaje = "Estas navegando con chrome";
            }
            
            out.println("<html>");
            out.println("<header>");
            out.println("<title>" + titulo + "</title>");
            out.println("</header>");
            out.println("<body>");
            out.println("<h1>Tipo de Navegador</h1>");
            out.println("<br>");
            out.println(mensaje);
            out.println("</body>");
            out.println("</html>");
        }
        
    }

    

}
