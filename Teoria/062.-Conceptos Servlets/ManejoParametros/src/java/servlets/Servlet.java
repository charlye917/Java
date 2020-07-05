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
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("Metodo doGet no soportado en el Servlet");
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        String usuario = req.getParameter("usuario");
        String password = req.getParameter("password");
        
        System.out.println("usuario: " + usuario);
        System.out.println("password: " +password);
        
        PrintWriter out = res.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Servlet Ejemplo</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("El parametro usuario es: " + usuario);
        out.print("<br>");
        out.print("El parametro password es: " + password);
        out.print("</body>");
        out.print("</html>");
        out.close();
        
    }

}
