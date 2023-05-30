/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package javaintroejercicios;

import java.util.Scanner;


public class Ejercicio_02 {
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String name = leer.nextLine();
        System.out.println("Su nombre " + name + " está guardado en una variable.");
    }
        
}
