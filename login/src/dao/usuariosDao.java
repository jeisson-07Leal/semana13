package dao;
import JPAController.UsuariosJpaController;
import entity.Usuarios;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author jeiss
 */
public class usuariosDao {
    private UsuariosJpaController ujc = new UsuariosJpaController();
    private Usuarios us = new Usuarios();
    
    
    public boolean login(String usuario, String password){
        EntityManager em = ujc.getEntityManager();
        boolean valor;
        try {
            Query query = em.createQuery("SELECT u.usuario, u.password FROM Usuarios u WHERE u.usuario = :usuario AND u.password = :password");
            query.setParameter("usuario", usuario);
            query.setParameter("password", password);
            List result = query.getResultList();
            if(!result.isEmpty()){
                valor = true;
            }else{
                valor = false;
            }
        } catch (Exception e) {
            valor = false;
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return valor;
    }
   
}
