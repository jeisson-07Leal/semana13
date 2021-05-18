//Jeisson David Infante Leal 
package semana13;
import com.sun.jmx.snmp.BerDecoder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class ControladorU implements  ActionListener{
    private ModeloU modelo;
    private VistaU vista;
   
    public ControladorU(ModeloU modelo, VistaU vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.registrar.addActionListener(this);
        this.vista.login.addActionListener(this);
    }
    
    public void ver(){
        vista.setTitle("APLICACIÓN DE REGISTRO DE DATOS ENFOCADO A PQR");
        vista.setBounds(100, 100, 360, 240);
        vista.setVisible(true);
        vista.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(vista.registrar == e.getSource()){
          modelo.datos(vista.usu.getText(), vista.con.getText());
          modelo.da();
       }
       
       if(vista.login == e.getSource()){
           if(vista.usu.getText().equals("") || vista.con.equals("") ){
               JOptionPane.showMessageDialog(null, "Por favor ingrese su usuario y contraseña. Si no posee uno creelo.");
           }else{
               modelo.log(vista.usu.getText(), vista.con.getText());
           }
           
       }
    }
 
    }
 
