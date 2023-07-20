/*
16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package javaintroejercicios;

import java.util.Scanner;

public class Ejercicio_16 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int tamVector = read.nextInt();
        int[] vector = new int[tamVector];

        //llenamos el vector
        for (int i = 0; i < tamVector; i++) {
            vector[i] = (int) (Math.random() * 10);
        }

        //mostramos por pantalla
        for (int i = 0; i < tamVector; i++) {
            System.out.print(vector[i] + " / ");
        }
        System.out.println();
        System.out.println("---------------------");
        System.out.print("Ingrese el número a buscar: ");
        int numBuscado = read.nextInt();

        for (int i = 0; i < tamVector; i++) {
            if (vector[i] == numBuscado) {
                System.out.println("El número buscado se encuentra en la posición " + i);
            }

        }
    }

}
