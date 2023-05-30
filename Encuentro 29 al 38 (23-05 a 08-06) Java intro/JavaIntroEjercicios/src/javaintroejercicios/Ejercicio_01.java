/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package javaintroejercicios;

import java.util.Scanner;

/**
 *
 * @author dario
 */
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La sumatoria de ambos números es " + suma);
    }
    
    
    
}
