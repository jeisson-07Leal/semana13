package usoApp;
import dao.usuariosDao;
import semana13.Controlador;
import semana13.Modelo;
import semana13.Vista;
import semana13.VistaU;

public class UsoAPP {
        public void entro() {
            Modelo modelo =  new Modelo();
            Vista vista = new Vista();
            Controlador control = new Controlador(modelo, vista);
           control.ver();
    }
}
