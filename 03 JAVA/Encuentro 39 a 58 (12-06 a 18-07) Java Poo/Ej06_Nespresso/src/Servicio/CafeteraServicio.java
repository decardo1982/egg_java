package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

//llenarCafetera hace que la cantidad actual sea igual a la capacidad máxima
    public Cafetera llenarCafetera() {

        Cafetera cafetera = new Cafetera();

        System.out.print("Ingresar la capacidad máxima de la cafetera (c.c.): ");
        cafetera.setCapacidadMaxima(read.nextInt());
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());

        return cafetera;
    }

    /* servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño y simula la acción de servir la taza con la capacidad indicada.
Si la cantidad actual de café "no alcanza" para llenar la taza, se sirve lo que quede. El método le informará al usuario si se
llenó o no la taza, y de no haberse llenado, en cuánto quedó la taza.*/
    public void servirTaza(Cafetera cafetera) {
        System.out.print("Ingrese el tamaño de la taza a servir: ");
        int capacidadTaza = read.nextInt();
        int cafeteraActualizada;

        if (cafetera.getCantidadActual() < capacidadTaza) {
            capacidadTaza = cafetera.getCantidadActual();
            cafeteraActualizada = 0;
            cafetera.setCantidadActual(cafeteraActualizada);
            System.out.println("No alcanza para llenar la taza, la misma solo tiene " + capacidadTaza + " c.c. de café y la cafetera está vacía.");
            System.out.println("-----");
            System.out.println("Cantidad en cafetera: " + cafetera.getCantidadActual());
        } else {
            cafeteraActualizada = cafetera.getCantidadActual() - capacidadTaza;
            cafetera.setCantidadActual(cafeteraActualizada);
            System.out.println("La taza se sirvió correctamente. Queda " + cafetera.getCantidadActual() + " c.c. en la cafetera.");
            System.out.println("-----");
            System.out.println("Cantidad en cafetera: " + cafetera.getCantidadActual());
        }
    }

//vaciarCafetera pone la cantidad actual de café en cero    
    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
        System.out.println("Se procede a vaciar la cafetera.");
        System.out.println("Cantidad en cafetera: " + cafetera.getCantidadActual());
    }

//agregarCafe(int) se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.    
    public void agregarCafe(Cafetera cafetera) {

        System.out.println("Indique la cantidad de café a ingresar: ");
        int cafeAgregado = read.nextInt();
        int cafeNecesario = cafetera.getCapacidadMaxima() - cafetera.getCantidadActual();
        int cafeteraActualizada;

        if (cafeAgregado < cafeNecesario) {
            cafeteraActualizada = cafetera.getCantidadActual() + cafeAgregado;
            cafetera.setCantidadActual(cafeteraActualizada);
            System.out.println("Se agregó el café indicado. La cafetera tiene " + cafetera.getCantidadActual() + " c.c. de una capacidad máxima de " + cafetera.getCapacidadMaxima());
        } else {
            int cafeSobrante = cafeAgregado - cafeNecesario;
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
            System.out.println("Se procedió a llenar la cafetera y sobraron " + cafeSobrante + " c.c. de café.");
        }

    }

}
