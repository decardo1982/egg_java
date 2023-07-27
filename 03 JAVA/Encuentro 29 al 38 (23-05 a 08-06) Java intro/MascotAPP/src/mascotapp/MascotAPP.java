package mascotapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import mascotapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;
import mascotapp.utilidades.Comparadores;

public class MascotAPP {

    public static void main(String[] args) {
        
        
        HashMap<String, Mascota> mascotas = new HashMap();
        mascotas.put("1", new Mascota("Vai", "OtoMoto", "Gato"));
        mascotas.put("23", new Mascota("Piaf", "Godda", "Quokka"));
        mascotas.put("345", new Mascota("Sarah", "Mapupuchu", "Perris"));
        
        
        
        for (Map.Entry<String, Mascota> var : mascotas.entrySet()) {
            String key = var.getKey();
            Mascota value = var.getValue();
            System.out.println("Key: " + key + " Value: " + value);
        }

        mascotas.remove("3");
        
//        HashMap<Integer, String> nombres = new HashMap();
//        nombres.put(1, "Vai");
//        nombres.put(Integer.MAX_VALUE, "Piaf");
//        nombres.put(Integer.MIN_VALUE, "Sarah");
//        for (Map.Entry<Integer, String> aux : nombres.entrySet()) {
//            Integer key = aux.getKey();
//            String value = aux.getValue();
//            System.out.println("Key: " + key + " value: " + value);
//        }
        
        
        
        
        
        
        
        
        
        
        
        
        

//        Set<Mascota> mascotas = new TreeSet();
//        mascotas.add(new Mascota("Piaf", "Godda", "Quokka"));
//        mascotas.add(new Mascota("Piaf", "Godda", "Quokka"));
//        mascotas.add(new Mascota("Piaf", "Godda", "Quokka"));
//        mascotas.add(new Mascota("Piaf", "Godda", "Quokka"));
//        mascotas.add(new Mascota("Piaf", "Godda", "Quokka"));
//        mascotas.add(new Mascota("Piaf", "Godda", "Quokka"));
//        mascotas.add(new Mascota("Vai", "OtoMoto", "Gato"));
//        mascotas.add(new Mascota("Vai", "OtoMoto", "Gato"));
//        mascotas.add(new Mascota("Vai", "OtoMoto", "Gato"));
//        mascotas.add(new Mascota("Vai", "OtoMoto", "Gato"));
//        mascotas.add(new Mascota("Vai", "OtoMoto", "Gato"));
//        mascotas.add(new Mascota("Vai", "OtoMoto", "Gato"));
        
//        Collections.sort(mascotas, Comparadores.ordenarPorNombreDesc);
        
//        Collections.shuffle(mascotas);
        
        

//        
//        String[] nombres = {"Pepe", "Pepa"};
//        List <String> nombresList = new ArrayList(Arrays.asList(nombres));
//        List <String> nombresList2 = new ArrayList();
//        nombresList2.addAll(nombresList2);
//        
//        ServicioMascota sm = new ServicioMascota();
//        sm.fabricaMascota(1);
//        sm.eliminarMascotaPorNombre("Vai");
//        sm.mostrarMascotas();
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
