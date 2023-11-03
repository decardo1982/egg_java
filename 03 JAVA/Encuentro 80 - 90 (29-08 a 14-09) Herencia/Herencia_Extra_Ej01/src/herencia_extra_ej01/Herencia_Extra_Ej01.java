package herencia_extra_ej01;

import Entities.Barco;
//import Entities.Cliente;
import Entities.Velero;
import Entities.Yate;
import Entities.aMotor;
import java.util.ArrayList;
import java.util.Scanner;

public class Herencia_Extra_Ej01 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        
//        Cliente cliente1 = new Cliente("Dario", 805);
//        Cliente cliente2 = new Cliente("Cecirish", 2103);
        Velero velero1 = new Velero(1, "Narfy", 10, 2020);
        aMotor motorizado1 = new aMotor(20, "Cupido Motorizado", 20, 2010);
        aMotor motorizado2 = new aMotor(10, "Kitt", 10, 2015);
        Yate yate1 = new Yate(1, 100, "Coyotin", 10, 2022);
        Yate yate2 = new Yate(10, 1000, "Taco", 100, 2023);
        
        ArrayList<Barco> barcos = new ArrayList<>();
        
        barcos.add(velero1);
        barcos.add(motorizado1);
        barcos.add(motorizado2);
        barcos.add(yate1);
        barcos.add(yate2);
        
        
        System.out.println("Ingrese la cantidad de días a alquilar:");
        int dias = read.nextInt();
        for (Barco barco : barcos) {
            int total = dias * barco.valorModulo();     
            System.out.println("Alquiler por " + dias + " dias el barco " + barco.getMatricula() + " tiene un costo de " + total);
        }
        

    }
    
}
