//Jeisson David Infante Leal 
package semana13;

import dao.dbDaoU;
import dao.usuariosDao;
import java.text.ParseException;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import usoApp.UsoAPP;

public class ModeloU {
   private String usuario,contraseña;
   private dbDaoU dao = new dbDaoU();
   private usuariosDao udao = new usuariosDao();
   private boolean valor;
   private UsoAPP up = new UsoAPP();
    public void da() {
        dao.insertarUsuario(usuario,contraseña);
    }

    public void datos(String usu, String con) {
        this.usuario = usu;
        this.contraseña = con;
        
    }

    public void log(String usua, String cont) {
       valor = udao.login(usua, cont);
       if(valor == true){
           up.entro();
       }
    }

    
}
