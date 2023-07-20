/*
Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos de
los mismos pueden tener 3 categorías: 1- repositor, 2- cajero, 3- supervisor.
·Los repositores cobran $158900 + un bono de 10%
·Los cajeros cobran $256308.90 fijos
·Los supervisores cobran $355602.- en bruto al cual se le descuenta 11% de jubilacion

Se necesita un programa que, dependiendo del tipo de empleado del que se trate, 
calcule y muestre en pantalla el correpondiente sueldo.
*/

package todocode_01;

import java.util.Scanner;

public class TodoCode_01 {

    public static void main(String[] args) {
        
        double sueldoRepositor = 158900;
        double sueldoCajero = 256308.9;
        double sueldoSupervisor = 355602;
        double bono = 0.10;
        double jubilacion = 0.11;
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el tipo de empleado:");
        System.out.println("1- Repositor");
        System.out.println("2- Cajero");
        System.out.println("3- Supervisor");
        
        int opcion = read.nextInt();
        
        switch(opcion) {
            case 1:
                double sueldo1 = (sueldoRepositor + (sueldoRepositor * bono));
                System.out.println("Sueldo repositor es de $" + sueldo1);
                break;
            case 2:
                double sueldo2 = sueldoCajero;
                System.out.println("Sueldo cajero es de $" + sueldo2);
                break;
            case 3:
                double sueldo3 = sueldoSupervisor - (sueldoSupervisor * jubilacion);
                System.out.println("Sueldo supervisor es de $" + sueldo3);
                break;
            default:
                System.out.println("Opción incorrecta");
        }
        


    }
    
}
