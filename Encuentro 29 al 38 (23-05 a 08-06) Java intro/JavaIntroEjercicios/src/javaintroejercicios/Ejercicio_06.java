/*
Crear un programa que dado un numero determine si es par o impar
*/
package javaintroejercicios;

import java.util.Scanner;


public class Ejercicio_06 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número para determinar si es par o impar:");
        int num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par.");
            
        } else {
        System.out.println("El número " + num + " no es par.");
    }
    }
}
