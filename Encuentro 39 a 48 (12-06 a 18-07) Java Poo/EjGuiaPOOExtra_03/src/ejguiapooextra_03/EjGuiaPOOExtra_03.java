package ejguiapooextra_03;

import Servicio.RaicesServicio;

public class EjGuiaPOOExtra_03 {

    public static void main(String[] args) {
        
        RaicesServicio numeritos = new RaicesServicio();
        
        numeritos.cargarValores();
        numeritos.getDiscriminante();
        numeritos.tieneRaices();
        numeritos.tieneRaiz();
        numeritos.obtenerRaices();

    }
    
}
