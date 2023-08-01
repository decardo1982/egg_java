package Services;

import Entities.Paises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PaisesServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    HashSet<String> Paises = new HashSet();

    public void cargarPaises() {

        String respuesta = "";
        String nombrePais;

        do {

            System.out.print("Ingrese el nombre de un país: ");
            nombrePais = read.next();
            Paises.add(nombrePais);

            System.out.println("Ingrese 'S' para ingresar otro país o cualquier tecla para salir...:");
            respuesta = read.next();

        } while (respuesta.equalsIgnoreCase("s"));
        mostrarPaises();

    }
    
    public void cargarDiezPaises(){
        Paises.add("Argentina");
        Paises.add("Irlanda");
        Paises.add("Zimbabwe");
        Paises.add("Italia");
        Paises.add("Colombia");
        Paises.add("Venezuela");
        Paises.add("Islandia");
        Paises.add("Croacia");
        Paises.add("Grecia");
        Paises.add("Armenia");
        mostrarPaises();
    }
    
    public void mostrarPaises(){
        System.out.println("Países ingresados:");
        for (String country : Paises) {
            System.out.println(country);
        }
    }
    
//    Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar cómo se ordena un conjunto
    public void mostrarPaisesOrdenados() {
        // Copiamos los elementos del conjunto a una lista
        List<String> listaPaises = new ArrayList<>(Paises);

        // Ordenamos la lista alfabéticamente
        Collections.sort(listaPaises);

        // Mostramos los países ordenados
        System.out.println("\nPaíses ordenados alfabéticamente:");
        for (String country : listaPaises) {
            System.out.println(country);
        }
    }
    
    /*
    Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
    */
    
    public void eliminarPais(){
        
        System.out.print("Ingrese el país a buscar y eliminar:");
        String paisEliminar = read.next();
        
        Iterator<String> iterator = Paises.iterator();
        boolean encontrado = false;
        
        while (iterator.hasNext()){
            String pais = iterator.next();
            if (pais.equalsIgnoreCase(paisEliminar)) {
                iterator.remove();
                encontrado = true;
                break;                
            }
        }
        if (encontrado) {
            System.out.println("\nPaís encontrado y eliminado. Lista actualizada:");
            mostrarPaises();
        } else {
            System.out.println("\nEl país no se encontró.");
        }

    }

}
