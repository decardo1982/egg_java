/*
13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
*/

package javaintroejercicios;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el número de elementos:");
        int lado = read.nextInt();
        
        dibujarCuadrado(lado);
    }
    
    public static void dibujarCuadrado(int lado){
        for (int i = 0; i <= lado; i++) {
            for (int j = 0; j <= lado; j++) {
                if (i == 0 || i == lado || j == 0 || j == lado) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
            
        }
    }
}