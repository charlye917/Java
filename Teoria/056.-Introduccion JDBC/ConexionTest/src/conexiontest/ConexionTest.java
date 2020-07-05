package conexiontest;

public class ConexionTest {

    public static void main(String[] args) {
        ConexionesBD bd = new ConexionesBD();
        //bd.ConexionOracle();
        bd.ConexionSQLServer();
    }
    
}
