/*
su matrícula, su eslora en metros y año de fabricación.
 */
package Services;

import Entidades.Barco;
import java.util.Scanner;

public class BarcoServices {
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected Barco barco;
    
    public void crearBarco(){
        System.out.println("Ingrese la matricula del barco");
        barco.setMatricula(leer.next());
        System.out.println("Ingrese los metros de eslora");
        barco.setEslora(leer.nextInt());
        System.out.println("Ingrese el año de fabricacion");
        barco.setAnioFabricacion(leer.nextInt());
    }
    
    public long calcularModulo(){
        return barco.getEslora() * 10;
    }

    public Barco getBarco() {
        return barco;
    }
    
}
