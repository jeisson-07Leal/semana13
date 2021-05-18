//Jeisson David Infante Leal
package semana13;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Vista extends JFrame{
    
    JPanel p1; 
    
    JTextField  nom,ema,tel,men,con,fec;
    JLabel nombre,email,telefono,mensaje,contac,fecha;
    JButton registrar;
    
   
  public Vista(){
      p1= new JPanel();
      p1.setLayout(null);
      
     nombre = new JLabel("Nombre completo:");
     nombre.setBounds(20, 10, 120, 20);
     nom = new JTextField();
     nom.setBounds(145, 10, 180, 25);
     
     
     email = new JLabel("E-mail de contacto:");
     email.setBounds(20, 60, 120, 20);
     ema = new JTextField();
     ema.setBounds(145, 60, 180, 25);
     
     telefono = new JLabel("Telefono de contacto:");
     telefono.setBounds(20, 110, 130, 20);
     tel = new JTextField();
     tel.setBounds(145, 110, 120, 25);
     
     mensaje= new JLabel("Escribe tu mensaje:");
     mensaje.setBounds(20, 160, 120, 20);
     men = new JTextField();
     men.setBounds(145, 160, 180, 25);
     
     contac = new JLabel("¿Como quieres ser contactado por Telefono ó Correo?:");
     contac.setBounds(20, 210, 360, 20);
     con = new JTextField();
     con.setBounds(350, 210, 120, 25);
     
     fecha = new JLabel("Usted realizo el registro de los datos en la fecha:");
     fecha.setBounds(20, 260, 300, 20);
     fec = new JTextField();
     fec.setEditable(false);
     fec.setBounds(350, 260, 120, 25);
     fec.setBackground(Color.WHITE);
     
     registrar = new JButton("Registrar datos");
     registrar.setBounds(355, 110, 130, 60);
     registrar.setBackground(Color.GREEN);
      
      
      //añadir al panel
      add(p1);
      p1.add(nombre);
      p1.add(email);
      p1.add(telefono);
      p1.add(mensaje);
      p1.add(contac);
      p1.add(nom);
      p1.add(ema);
      p1.add(tel);
      p1.add(men);
      p1.add(con);
      p1.add(registrar);
      p1.add(fecha);
      p1.add(fec);
  }
   
}
