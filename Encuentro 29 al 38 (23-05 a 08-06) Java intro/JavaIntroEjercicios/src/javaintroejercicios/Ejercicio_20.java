/* 20. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado
y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son
correctos, es decir, están entre el 1 y el 9. */
package javaintroejercicios;

import java.util.Scanner;

public class Ejercicio_20 {

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        //Solicitamos los números para llenar la matriz
        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese un número del 1 al 9 para la posición [" + i + "]-[" + j + "]");
                    matrix[i][j] = reader.nextInt();
                } while (matrix[i][j] < 1 || matrix[i][j] > 9);
            }
        }
        // Comprobar si la matrix es mágica
        boolean esMagico = comprobarCuadradoMagico(matrix);

        if (esMagico) {
            System.out.println("El cuadrado es mágico.");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }
    }
    public static boolean comprobarCuadradoMagico(int[][] cuadrado) {
        int sumaObjetivo = sumaFila(cuadrado, 0); // Suma objetivo (suma de la primera fila)

        // Comprobar sumas de filas
        for (int i = 1; i < 3; i++) {
            if (sumaFila(cuadrado, i) != sumaObjetivo) {
                return false;
            }
        }

        // Comprobar sumas de columnas
        for (int j = 0; j < 3; j++) {
            if (sumaColumna(cuadrado, j) != sumaObjetivo) {
                return false;
            }
        }

        // Comprobar suma de la diagonal principal
        if (sumaDiagonalPrincipal(cuadrado) != sumaObjetivo) {
            return false;
        }

        // Comprobar suma de la diagonal secundaria
        if (sumaDiagonalSecundaria(cuadrado) != sumaObjetivo) {
            return false;
        }

        return true; // El cuadrado es mágico
    }

    public static int sumaFila(int[][] cuadrado, int fila) {
        int suma = 0;

        for (int j = 0; j < 3; j++) {
            suma += cuadrado[fila][j];
        }

        return suma;
    }

    public static int sumaColumna(int[][] cuadrado, int columna) {
        int suma = 0;

        for (int i = 0; i < 3; i++) {
            suma += cuadrado[i][columna];
        }

        return suma;
    }

    public static int sumaDiagonalPrincipal(int[][] cuadrado) {
        int suma = 0;

        for (int i = 0; i < 3; i++) {
            suma += cuadrado[i][i];
        }

        return suma;
    }

    public static int sumaDiagonalSecundaria(int[][] cuadrado) {
        int suma = 0;

        for (int i = 0; i < 3; i++) {
            suma += cuadrado[i][2 - i];
        }

        return suma;
    }
}

