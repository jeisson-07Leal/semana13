package usoApp;
import dao.usuariosDao;
import semana13.ControladorU;
import semana13.ModeloU;
import semana13.VistaU;

public class UsoAPPU {
       
        public static void main(String[] args) {
            ModeloU modelo =  new ModeloU();
            VistaU vista = new VistaU();
            ControladorU control = new ControladorU(modelo, vista);
           control.ver();
    }
}
