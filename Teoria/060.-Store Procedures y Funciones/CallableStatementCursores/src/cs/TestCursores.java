package cs;

import datos.Conexion;
import java.sql.*;
import oracle.jdbc.*;


public class TestCursores {

    public static void main(String[] args) {
        //utilizamos una clase de oracle para poder procesar el
        //cursor que regresa la funcion Oracle
        OracleCallableStatement oraCallStmt = null;
        OracleResultSet deptResultSet = null;
        
        try{
            Connection conn = Conexion.getConnection();
            oraCallStmt = (OracleCallableStatement)conn.prepareCall("{? = call ref_cursor_package.get_dept_ref_cursor(?)}");
            oraCallStmt.registerOutParameter(1,OracleTypes.CURSOR);
            oraCallStmt.setInt(2,200);
            oraCallStmt.execute();
            //recuperamos el resultset y lo convertimos a un tipo oracle
            deptResultSet = (OracleResultSet)oraCallStmt.getCursor(1);
            while(deptResultSet.next()){
                System.out.println("id_departamento" + deptResultSet.getInt(1));
                System.out.println(", nombre_departamento: " + deptResultSet.getString(2));
                System.out.println(", ubicacion_id" + deptResultSet.getString(3));
                System.out.println();
            }
            oraCallStmt.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
