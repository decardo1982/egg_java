/*
Realizar un programa que dado por teclado un limite numerico muestre en pantalla
todos los numeros hasta ese límite empezando por 1
*/
package todocode_01;

import java.util.Scanner;


public class Repetitiva_01 {
    
    public static void main(String[] args){
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
        System.out.print("Ingrese el número límite: ");
        System.out.println("");
        int limite = read.nextInt();
        
        for (int i = 1; i <= limite; i++) {
            System.out.print("Número " + i);
            System.out.println("");
        }
    }
}
