package conexionesbd;
public class ConexionesBD {

    public static void main(String[] args) {
        BaseDeDatos bd = new BaseDeDatos();
        bd.ConexionOracle();
        //bd.ConexionPostgres();
        //bd.ConexionSQLServer();
    }

}
