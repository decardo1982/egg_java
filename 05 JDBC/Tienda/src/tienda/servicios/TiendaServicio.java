package tienda.servicios;

import java.util.Scanner;

public class TiendaServicio {
    
    
    
    public void mainMenu() {
        
        Scanner read = new Scanner(System.in).useDelimiter("\n")
                ;
        String opcion = "";
        boolean opcionValida = true;
        System.out.println("========");
        System.out.println("|Tienda|");
        System.out.println("========");
        do {

            System.out.println("----------------------");
            System.out.println("    Menú principal");
            System.out.println("Seleccione una opción:");
            System.out.println("----------------------");
            System.out.println("(a) Lista el nombre de todos los productos que hay en la tabla producto");
            System.out.println("(b) Lista los nombres y los precios de todos los productos de la tabla producto.");
            System.out.println("(c) Listar aquellos productos que su precio esté entre 120 y 202");
            System.out.println("(d) Buscar y listar todos los Portátiles de la tabla producto");
            System.out.println("(e) Listar el nombre y el precio del producto más barato");
            System.out.println("(f) Ingresar un producto a la base de datos");
            System.out.println("(g) Ingresar un fabricante a la base de datos");
            System.out.println("(h) Editar un producto con datos a elección");
            System.out.println("(S) SALIR");
            opcion = read.next().toLowerCase();

            switch (opcion) {
                case "a":
                    System.out.println("a");
                    break;
                case "b":
                    System.out.println("b");
                    break;
                case "c":
                    System.out.println("c");
                    break;
                case "d":
                    System.out.println("d");
                    break;
                case "e":
                    System.out.println("e");
                    break;
                case "f":
                    System.out.println("f");
                    break;
                case "g":
                    System.out.println("g");
                    break;
                case "h":
                    System.out.println("h");
                    break;
                case "s":
                    opcionValida = false;
                    System.out.println("");
                    System.out.println("¡Gracias, vuelva prontos!");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Ingrese una opción válida:");
            }
        } while (opcionValida);

    }
    
}
