package mascotapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mascotapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;

public class MascotAPP {

    public static void main(String[] args) {
//        
//        String[] nombres = {"Pepe", "Pepa"};
//        List <String> nombresList = new ArrayList(Arrays.asList(nombres));
//        List <String> nombresList2 = new ArrayList();
//        nombresList2.addAll(nombresList2);
        

        ServicioMascota sm = new ServicioMascota();
        sm.fabricaMascota(2);
        sm.mostrarMascotas();
        sm.actualizarMascota(0);
        sm.mostrarMascotas();
        sm.eliminarMascota(3);
        sm.mostrarMascotas();
    }

}
