/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
*/
package javaintroejercicios;

import java.util.Scanner;


public class Ejercicio_05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num = leer.nextInt();
        int numDoble = num * num;
        int numTriple = numDoble * num;
        double numSq = Math.sqrt(num);
        System.out.println("-----------------------------");
        System.out.println("El doble de " + num + " es " + numDoble);
        System.out.println("El triple de " + num + " es " + numTriple);
        System.out.println("La raíz cuadrada de " + num + " es " + numSq);
    }
    
}
