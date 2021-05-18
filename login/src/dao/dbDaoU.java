package dao;
import JPAController.UsuariosJpaController;
import entity.Usuarios;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author jeiss
 */
public class dbDaoU {
    private UsuariosJpaController ujc = new UsuariosJpaController();
    private Usuarios us = new Usuarios();
    
    
    public void insertarUsuario(String usuario, String contraseña){
        try {
            us.setId(Integer.BYTES);
            us.setUsuario(usuario);
            us.setPassword(contraseña);
            ujc.create(us);
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
}
