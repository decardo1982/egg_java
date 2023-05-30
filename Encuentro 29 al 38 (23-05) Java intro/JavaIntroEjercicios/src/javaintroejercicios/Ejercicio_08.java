/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
*/
package javaintroejercicios;

import java.util.Scanner;

public class Ejercicio_08 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine();
        if (frase.length() == 8) {
            System.out.println("¡CORRECTO! La frase tiene 8 caracteres.");
        } else {
            System.out.println("INCORRECTO. La frase no tiene 8 caracteres.");
        }
    }
    
}
