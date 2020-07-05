package manejousuarios;

import datos.UsuariosJDBC;
import domain.Usuarios;
import java.util.List;

public class ManejoUsuarios {

    public static void main(String[] args) {
        UsuariosJDBC user = new UsuariosJDBC();
        
        //user.insert(4,"carmen","carmenLira");
        //user.update(4, "maria_carmen", "momyshark");
       user.delete(4);
        
        List<Usuarios> usuarios = user.select();
        for(Usuarios usuario : usuarios){
            System.out.println(usuario);
        }
    }
    
}
