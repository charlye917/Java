package cs;

import datos.Conexion;
import java.sql.*;


public class TestFunciones {

    public static void main(String[] args) {
        int empleadoId = 100;
        try{
            Connection con = Conexion.getConnection();
            CallableStatement cstmt = null;
            double salarioMensual;
            
            cstmt = con.prepareCall("{ ? = call get_employee_salary(?) }");
            cstmt.registerOutParameter(1,java.sql.Types.INTEGER);
            cstmt.setInt(2, empleadoId);
            cstmt.execute();
            salarioMensual = cstmt.getDouble(1);
            cstmt.close();
            System.out.println("Empleado con id: " + empleadoId);
            System.out.println("Salario $ " + salarioMensual);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
