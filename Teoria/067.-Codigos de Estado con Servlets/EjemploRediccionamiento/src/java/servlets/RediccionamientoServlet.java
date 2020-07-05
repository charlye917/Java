package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "RediccionamientoServlet", urlPatterns = {"/RediccionamientoServlet"})
public class RediccionamientoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        //YA NO USAREMOS EL OBJETO PRINTWRITER PARA MANDAR LA RESPUESTA, YA QUE HAREMOS REDICCIONAMIENTO A OTRA PAGINA
        String url = null;
        String tipoNavegador = request.getHeader("User-Agent");
        System.out.println("tipoNavegador" + tipoNavegador);
        if(tipoNavegador != null && tipoNavegador.contains("Trident")){
            url = "http://www.microsoft.com";
        }else if(tipoNavegador != null && tipoNavegador.contains("Chrome")){
            url = "http://www.google.com";
        }
        
        response.sendRedirect(url);
        
    }
}
