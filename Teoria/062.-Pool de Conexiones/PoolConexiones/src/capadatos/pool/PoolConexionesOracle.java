package capadatos.pool;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class PoolConexionesOracle {
    public static DataSource getDataSources(){
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUsername("escuela");
        ds.setPassword("escuela");
        ds.setUrl("jdbc:oracle:thin:@192.168.1.80:1521:charbd");
        //Definimos el tamño del pool de conexiones
        ds.setInitialSize(5);
        return ds;
    }
    
    public static Connection getConnection() throws SQLException{
        return getDataSources().getConnection();
    }
    
}
