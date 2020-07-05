package cs;

import datos.Conexion;
import java.sql.*;


public class TestProcedimientos {

    public static void main(String[] args) {
        int empleadoId = 100;
        //la formula que aplica el store procedure es
        //salario = salario*incremento
        
        double incrementoSalario = 1.1;//incremento del 10%
        Connection con;
        try{
            con = Conexion.getConnection();
           Statement stmt = null;
           ResultSet rset = null;
           CallableStatement cstmt = null;
           
           stmt = con.createStatement();
           
           //llamamos al sp para incrementar el salario
            System.out.println("Aumento del 10% al empleado: " + empleadoId);
            cstmt = con.prepareCall("{call set_employee_salary(?,?)}");
            cstmt.setInt(1,empleadoId);
            cstmt.setDouble(2,incrementoSalario);
            cstmt.execute();
            cstmt.close();
            
            String query = "Select first_name, salary FROM employees "+
                    "where employee_id = " + empleadoId;
            rset = stmt.executeQuery(query);
            rset.next();
            System.out.println("Nombre: " + rset.getString(1));
            System.out.println("Salario nuevo: " + rset.getFloat(2));
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
