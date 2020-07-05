package test;

import datos.Conexion;
import java.sql.*;
import oracle.jdbc.OracleResultSetMetaData;

public class TestMetadatos {

    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            con = Conexion.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("Select * from employees");
            //obtenemos un objeto de metadatos de oracle
            OracleResultSetMetaData rsOracle = (OracleResultSetMetaData) rs.getMetaData();
            if(rsOracle == null){
                System.out.println("Metadatos no disponibles");
                
            }else{
                //preguntamos cuantas columnas tiene tabla de empleados
                int columnCount = rsOracle.getColumnCount();
                //Desplegamos el no. de columnas
                System.out.println("No columnas: " + columnCount);
                for(int i = 1; i<=columnCount;i++){
                    //Despleegamos el nombre de la columnas
                    System.out.println("Nombre de la columnas: " +rsOracle.getCatalogName(i));
                    //Desplegamos el tipo de la columnas
                    System.out.println("Tipo columnas: " + rsOracle.getColumnTypeName(i));
                    switch(rsOracle.isNullable(i)){
                        case OracleResultSetMetaData.columnNoNulls:
                            System.out.println("No acepta nulos");
                            break;
                        case OracleResultSetMetaData.columnNullable:
                            System.out.println("Si acepta nulos");
                            break;
                        case OracleResultSetMetaData.columnNullableUnknown:
                            System.out.println("valor nulo desconocido");
                    }
                    System.out.println("");
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexion.close(rs);
            Conexion.close(con);
        }
    }
    
}
