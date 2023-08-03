/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Services;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    HashMap<String, Integer> productosTienda = new HashMap();

    public void mainMenu() {
        String opcion = "";
        boolean opcionValida = true;
        System.out.println("==========");
        System.out.println("|TiendApp|");
        System.out.println("==========");
        do {

            System.out.println("----------------------");
            System.out.println("    Menú principal");
            System.out.println("Seleccione una opción:");
            System.out.println("----------------------");
            System.out.println("1. Cargar un producto");
            System.out.println("2. Modificar precio de producto");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. SALIR");
            opcion = read.next();

            switch (opcion) {
                case "1":
                    cargarProducto();
                    break;
                case "2":
                    modificarPrecio();
                    break;
                case "3":
                    eliminarProducto();
                    break;
                case "4":
                    mostrarProductos();
                    break;
                case "5":
                    opcionValida = false;
                    System.out.println("");
                    System.out.println("¡Gracias, vuelva prontos!");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Intente una opción válida:");
            }
        } while (opcionValida);

    }

    private void cargarProducto() {
        System.out.println("++++++++++++++++");
        System.out.println("Cargar producto:");
        System.out.println("++++++++++++++++");
        System.out.println("Ingresar nombre del producto:");
        String nombreProd = read.next();
        System.out.println("Ingresar el precio del producto:");
        int precioProd = read.nextInt();
        productosTienda.put(nombreProd, precioProd);
        System.out.println("Producto ingresado con éxito.");
        System.out.println("");

    }

    private void modificarPrecio() {
        System.out.println("--------------------");
        System.out.println("Modificar un precio:");
        System.out.println("--------------------");
        System.out.println("Ingrese el producto a modificar:");
        String modificarProducto = read.next();

        if (productosTienda.containsKey(modificarProducto)) {
            System.out.println("Ingrese el nuevo precio:");
            int nuevoPrecio = read.nextInt();
            productosTienda.put(modificarProducto, nuevoPrecio);
            System.out.println("El precio se modificó correctamente.");
        } else {
            System.out.println("El producto indicado no existe.");
        }

    }

    private void eliminarProducto() {
        

    }

    private void mostrarProductos() {
        System.out.println("--------------------------------");
        System.out.println("Listado de productos ingresados:");
        System.out.println("--------------------------------");
        for (Map.Entry<String, Integer> entry : productosTienda.entrySet()) {
            System.out.println("Producto: " + entry.getKey() + " / Precio: " + entry.getValue());
        }
        System.out.println("");

    }

    public void testProducto() {
        productosTienda.put("Plato", 1200);
        productosTienda.put("Vaso", 650);
        productosTienda.put("Cuchillo", 300);
        productosTienda.put("Tenedor", 300);
        productosTienda.put("Cuchara", 300);
        productosTienda.put("Olla Grande", 5500);
        productosTienda.put("Olla chica", 3000);
        productosTienda.put("Repasador", 1100);
        productosTienda.put("Esponja", 200);
        productosTienda.put("Servilletas", 500);
    }

}
