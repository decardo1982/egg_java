package Services;

import java.util.Scanner;

public class ProductoService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void mainMenu() {
        String opcion = "";

        do {
            System.out.println("SELECCIONE UNA OPCIÓN");
            System.out.println("---------------------");
            System.out.println("1. Cargar un producto");
            System.out.println("2. Modificar precio de producto");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Mostrar productos");
            opcion = read.next();
            
            switch(opcion){
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
                default:
                    
                    
            }
        } while (true);

    }
    
    public void cargarProducto(){
        
    }
    
    public void modificarPrecio(){
    
    }
    
    public void eliminarProducto(){
        
    }
    
    public void mostrarProductos(){
        
    }

}
