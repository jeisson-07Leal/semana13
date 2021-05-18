//Jeisson David Infante Leal 
package semana13;

import dao.dbDao;
import java.text.ParseException;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Modelo {
   private String nombre,correo,telefono,mensaje,contacto;
   
    
    private dbDao dao = new dbDao();
    Date date = new Date();

        long timeInMilliSeconds = date.getTime();
        java.sql.Date sqlDate = new java.sql.Date(timeInMilliSeconds);

    public void da() {
        dao.insertarContacto(nombre,correo,telefono, mensaje, contacto, sqlDate);
    }

    public void datos(String nom, String corr, String telef, String mensa, String contac) {
        this.nombre = nom;
        this.correo = corr;
        this.telefono = telef;
        this.mensaje = mensa;
        this.contacto = contac;
    }

    
}
