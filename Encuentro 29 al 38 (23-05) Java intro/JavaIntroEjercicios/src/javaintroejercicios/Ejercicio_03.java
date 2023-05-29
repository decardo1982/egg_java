/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
*/
package javaintroejercicios;

import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String [] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una frase:");
        String frase = leer.nextLine();
        System.out.println("La frase es '" + frase + "'");
        System.out.println("La frase en mayúsculas es " + frase.toUpperCase());
        System.out.println("La frase en minúsculas es " + frase.toLowerCase());
    }
    
}
