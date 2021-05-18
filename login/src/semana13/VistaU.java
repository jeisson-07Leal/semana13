//Jeisson David Infante Leal
package semana13;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class VistaU extends JFrame{
    
    JPanel p1; 
    
    JTextField  usu,con;
    JLabel usuario,contraseña;
    JButton registrar, login;
    
   
  public VistaU(){
      p1= new JPanel();
      p1.setLayout(null);
      
     usuario = new JLabel("Usuario:");
     usuario.setBounds(20, 10, 120, 20);
     usu = new JTextField();
     usu.setBounds(145, 10, 180, 25);
     
     
     contraseña = new JLabel("Contraseña:");
     contraseña.setBounds(20, 60, 120, 20);
     con = new JTextField();
     con.setBounds(145, 60, 180, 25);
     
    
     
     registrar = new JButton("Crear usuario");
     registrar.setBounds(20, 110, 130, 60);
     registrar.setBackground(Color.GREEN);
     
      login = new JButton("Ingresar");
     login.setBounds(205, 110, 130, 60);
     login.setBackground(Color.GREEN);
      
      
      //añadir al panel
      add(p1);
      p1.add(usuario);
      p1.add(contraseña);
      p1.add(usu);
      p1.add(con);
      p1.add(registrar);
     p1.add(login);
  }
   
}
