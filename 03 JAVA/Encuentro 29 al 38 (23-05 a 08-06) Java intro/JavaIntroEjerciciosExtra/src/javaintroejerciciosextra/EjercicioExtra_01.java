/*1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package javaintroejerciciosextra;

import java.util.Scanner;


public class EjercicioExtra_01 {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese los minutos para calcular su equivalente: ");
        int minutos = reader.nextInt();
        int dias = 0;
        int horas = 0;
        if (minutos >= 1440) {
            do {
                minutos -= 1440;
                dias++;
            } while (minutos >=1440); 
        }
        if (minutos < 1440) {
            horas = minutos / 60;
        }
        System.out.println("Los minutos ingresados equivalen a " + dias + " dias y " + horas + " horas.");
    }
}
