/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
*/
package ejercicios_guia;

import java.util.Scanner;

/**
 *
 * @author dario
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entre 0 y 10");
        int num = leer.nextInt();
        
        while (num <= 0 || num >= 10) {
            System.out.println("El número debe estar entre 0 y 10, intenta de nuevo:");
            num = leer.nextInt();
        }
        System.out.println("El número ingresado es " + num);
    }
}
