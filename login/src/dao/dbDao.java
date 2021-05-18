package dao;

import JPAController.ContactoJpaController;
import entity.Contacto;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author jeiss
 */
public class dbDao {
    private ContactoJpaController cjc = new ContactoJpaController();
    private Contacto cnt = new Contacto();
    
    
    public void insertarContacto(String nombre, String correo, String telefono, String contact, String mensaje, Date fecha){
        try {
            cnt.setId(Integer.BYTES);
            cnt.setNombre(nombre);
            cnt.setCorreo(correo);
            cnt.setTelefono(telefono);
            cnt.setContact(contact);
            cnt.setMensaje(mensaje);
            cnt.setFecha(fecha);
            cjc.create(cnt);
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
