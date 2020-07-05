package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author charl
 */
@WebServlet(name = "FormularioServlet", urlPatterns = {"/FormularioServlet"})
public class FormularioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        //simulamos valores
        String usuarioCorrecto = "Carlos";
        String passCorrecto = "123";
        
        String pUsuario = request.getParameter("usuario");
        String pPassword = request.getParameter("password");
        
        if(usuarioCorrecto.equals(pUsuario) && passCorrecto.equals(pPassword)){
            out.println("<h1>");
            out.println("Datos correctos");
            out.println("<br>Usuario: " + pUsuario);
            out.println("<br>Password: " + pPassword);
            out.println("</h1>");
        }else{
            response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
        }
        //Listado de codigos de error
        //http://docstore.mik.ua/orelly/java-ent/servlet/appc_01.html
        out.close();
    }

}
