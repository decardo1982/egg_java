/*
crear arbol de navidad
   *
  ***
 *****
*******

 */
package todocode_01;

import java.util.Scanner;

public class Repetitiva_04 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese la altura del árbol:");
        int altura = read.nextInt();

        for (int fila = 0; fila < altura; fila++) {
            for (int espacio = 0; espacio < (altura - fila - 1); espacio++) {
                System.out.print(" ");
            }
            for (int asterisco = 0; asterisco < (fila * 2) + 1; asterisco++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        //tronco
        int alturaTronco = 3;
        for (int base = 0; base < alturaTronco; base++) {

            //espacios en blanco
            for (int espacio = 0; espacio < (altura - 2); espacio++) {
                System.out.print(" ");
            }
            for (int tronco = 0; tronco < 3; tronco++) {
                System.out.print("|");
            }
            System.out.println("");
        }
        //barritas trongo

    }

}
