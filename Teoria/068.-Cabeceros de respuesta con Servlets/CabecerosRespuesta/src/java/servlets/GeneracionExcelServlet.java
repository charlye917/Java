package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "GeneracionExcelServlet", urlPatterns = {"/GeneracionExcelServlet"})
public class GeneracionExcelServlet extends HttpServlet {

    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try(PrintWriter out = response.getWriter()){
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-Disposition","attachment; filename=excelEjemplo.xls");
            response.setHeader("Pragma","no-cache");
            response.setHeader("Cache-control","no-store");
            response.setDateHeader("Expires",-1);
            
            out.println("\tValores");
            out.println("\t1");
            out.println("\t2");
            out.println("Total\t=SUMA(B2:B3)");
        }
    }

}
