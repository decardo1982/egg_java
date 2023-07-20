/*5. Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio. */
package javaintroejerciciosextra;

import java.util.Scanner;

public class EjercicioExtra_05 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String socioTipo = "";
        System.out.print("Ingrese la clase de socio (A/B/C): ");
        socioTipo = read.nextLine().toUpperCase();
        System.out.print("Ingrese el costo del tratamiento en pesos: ");
        int costoTratamiento = read.nextInt();
        
        switch(socioTipo) {
            case "A":
                System.out.println("El importe a pagar es de: " + (costoTratamiento * 0.5));
                break;
            case "B":
                System.out.println("El importe a pagar es de: " + (costoTratamiento * 0.65));
                break;
            case "C":
                System.out.println("El importe a pagar es de: " + (costoTratamiento));
                break;
            default:
                System.out.println("El tipo de socio no es válido. Intente nuevamente.");
        }
    }

}
