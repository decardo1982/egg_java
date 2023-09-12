/*
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
 */
package Services;

import Entidades.Alquiler;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

public class AlquilerServices {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Alquiler alquiler = new Alquiler();
    BarcoServices bs;
    
    public void crearAlquiler(){
        System.out.println("Ingrese su nombre");
        alquiler.setNombre(leer.next());
        System.out.println("Ingrese su DNI");
        alquiler.setDocumento(leer.next());
        System.out.println("Ingrese la fecha del alquiler");
        alquiler.setFechaAlquiler(LocalDate.parse(leer.next()));
        System.out.println("Ingrese la fecha de devolucion");
        alquiler.setFechaDevolucion(LocalDate.parse(leer.next()));
        System.out.println("Ingrese la posicion del amarre");
        alquiler.setPosicion(leer.nextInt());
        System.out.println("Ingrese el barco a alquilar");
        System.out.println("1) Velero 2) Barco a motor 3) Yate de lujo");
        switch(leer.next()){
            case "1":
                bs = new VeleroServices();
                break;
            case "2":
                bs = new MotorServices();
                break;
            case "3":
                bs = new YateServices();
                break;
        }
        bs.crearBarco();
        alquiler.setBarco(bs.getBarco());
        System.out.println(alquiler);
    }
    
    public void calcularMonto(){
        long dias = Duration.between(alquiler.getFechaAlquiler().atStartOfDay(), alquiler.getFechaDevolucion().atStartOfDay()).toDays();
        long modulo = bs.calcularModulo();
        long monto = dias *  modulo;
        System.out.println(monto);
                
    }
    
    
}
