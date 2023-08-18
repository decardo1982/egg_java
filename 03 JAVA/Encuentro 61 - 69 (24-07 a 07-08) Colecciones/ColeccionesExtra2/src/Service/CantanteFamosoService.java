package Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CantanteFamosoService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, String> cantantes = new HashMap();

    public void crearLista() {

        cantantes.put("Sarah McLachlan", "Surfacing");
        cantantes.put("David Bowie", "Hunky Dory");
        cantantes.put("Bryan Adams", "Reckless");
        cantantes.put("Michael Jackson", "Thriller");
        cantantes.put("Steve Vai", "Passion & Warfare");

    }

    public void agregarCantante() {
        System.out.println("Ingresar cantante:");
        String nombre = read.next();
        System.out.println("Disco más vendido:");
        String discoMasVendido = read.next();
        cantantes.put(nombre, discoMasVendido);

    }
    
    public void eliminarCantante(){
        System.out.print("Ingrese el nombre del cantante a eliminar: ");
        String eliminar = read.next();
        boolean encontrado = false;
        
        if (cantantes.containsKey(eliminar)) {
            encontrado = true;
        }
        
        if (encontrado) {
            cantantes.remove(eliminar);
            System.out.println("Se eliminó el cantante indicado.");
        }
        if (!encontrado) {
            System.out.println("El cantante indicado no existe.");
        }
    }

    public void mostrarLista() {
        for (Map.Entry<String, String> entry : cantantes.entrySet()) {
            System.out.println("Solista: " + entry.getKey() + " / Disco más vendido: " + entry.getValue());
        }

    }

    /*Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios*/
    public void menu() {
        String opcion = "";
        boolean opcionValida = true;

        System.out.println("------");
        System.out.println("|MENU|");
        System.out.println("------");
        System.out.println("");
        do {

            System.out.println("Ingrese la opción deseada:");
            System.out.println("1. Agregar un cantante");
            System.out.println("2. Mostrar todos los cantantes");
            System.out.println("3. Eliminar un cantante");
            System.out.println("4. SALIR");
            opcion = read.next();

            switch (opcion) {
                case "1":
                    agregarCantante();
                    break;
                case "2":
                    mostrarLista();
                    break;
                case "3":
                    eliminarCantante();
                    break;
                case "4":
                    opcionValida = false;
                    System.out.println("");
                    System.out.println("Gracias, vuelva prontos.");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
        } while (opcionValida);

    }

}
