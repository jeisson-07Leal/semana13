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
import javax.swing.table.DefaultTableModel;
import usoApp.UsoAPPU;

public class Controlador implements  ActionListener{
    private Modelo modelo;
    private Vista vista;
    
   
    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.registrar.addActionListener(this);
    }
    
    public void ver(){
        vista.setTitle("APLICACIÓN DE REGISTRO DE DATOS ENFOCADO A PQR");
        vista.setBounds(100, 100, 520, 440);
        vista.setVisible(true);
        vista.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(vista.registrar == e.getSource()){
           modelo.datos(vista.nom.getText(),vista.ema.getText(),vista.tel.getText(),vista.men.getText(),vista.con.getText());
           modelo.da();
           vista.fec.setText(modelo.sqlDate+"");
           vista.nom.setText("");
           vista.ema.setText("");
           vista.tel.setText("");
           vista.men.setText("");
           vista.con.setText("");
       }
    }
 
    }
 
