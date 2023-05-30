/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/
package ejercicios_guia;

import java.util.Scanner;



public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor, ingresar 4 números entre 1 y 20:");
        for (int i = 0; i < 4; i++) {
            int num = leer.nextInt();
            if (num < 1 || num > 20) {
                System.out.println("El número debe estar entre 1 y 20");
                break;
            }
        }
    }
    
}
