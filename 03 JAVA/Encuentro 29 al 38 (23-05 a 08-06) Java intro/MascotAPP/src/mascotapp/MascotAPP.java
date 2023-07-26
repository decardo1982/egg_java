package mascotapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
//        
        ServicioMascota sm = new ServicioMascota();
        sm.fabricaMascota(1);
        sm.eliminarMascotaPorNombre("Vai");
        sm.mostrarMascotas();
//        sm.fabricaMascota(2);
//        sm.mostrarMascotas();
//        sm.actualizarMascota(0);
//        sm.mostrarMascotas();
//        sm.eliminarMascota(3);
//        sm.mostrarMascotas();

//        List<String> nombres = new ArrayList();
//        nombres.add("Vai");
//        nombres.add("Piaf");
//        nombres.add("Sarah");
//        
//        Iterator<String> it = nombres.iterator();
//        
//        while (it.hasNext()) {
//            String aux = it.next();
//            if (aux.equals("Vai")) {
//                it.remove();
//            }
//
    }
//        for (String var : nombres) {
//            System.out.println(var);
//        }
//        for (int i = 0; i < nombres.size(); i++) {
//            String m = nombres.get(i);
//            if (m.equals("Vai")) {
//                nombres.remove(m);
//            }
//        }
//        nombres.forEach((e) -> System.out.println(e));
}