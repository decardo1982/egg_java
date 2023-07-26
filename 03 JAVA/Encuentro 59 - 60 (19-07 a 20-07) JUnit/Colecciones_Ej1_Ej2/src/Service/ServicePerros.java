package Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ServicePerros {

    ArrayList<String> perros = new ArrayList();
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void cargarRazas() {
        boolean continuar = true;

        while (continuar) {

            System.out.print("Ingrese nombre de raza: ");
            String raza = read.next();
            perros.add(raza);

            System.out.print("Ingrese 'S' para agregar otra raza o cualquier otra tecla para salir: ");
            String opcion = read.next();
            if (opcion.equalsIgnoreCase("S")) {
                continuar = true;
            } else {
                continuar = false;
            }
        }
    }

    public void mostrarRazas() {
        System.out.println("--------------------------");
        System.out.println("Las razas de la lista son:");
        System.out.println("--------------------------");
        for (String raza : perros) {
            System.out.println(raza);
        }
        System.out.println("Cantidad: " + perros.size());
        System.out.println("-----------");
    }

    public void eliminarRaza() {
        System.out.println("Ingrese la raza a eliminar de la lista:");
        String razaEliminar = read.next();
        boolean eliminado = false;

        Iterator<String> it = perros.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(razaEliminar)) {
                it.remove();
                eliminado = true;
            }
        }
        if (eliminado) {
            System.out.println("Se eliminó la raza " + razaEliminar);
        } else {
            System.out.println("No se encontró la raza indicada.");
        }
        Collections.sort(perros);
        
        mostrarRazas();
    }
}
