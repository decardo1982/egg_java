/*
18. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
[1][0][4]       [1][0][6]
[0][5][0]       [0][5][0]
[6][0][-9]      [4][0][-9]
*/
package javaintroejercicios;

import java.util.Random;

public class Ejercicio_18 {
    public static void main(String[] args) {
        
        //creamos la matrix de 4x4
        int filas = 4;
        int columnas = 4;
        int[][] matrix = new int[filas][columnas];
        
        //llenamos con valores aleatorios entre -9 y 9
        Random random = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrix[i][j] = random.nextInt(19) - 9;
            }
            System.out.println(" ");
        }
        
        //mostramos la matriz original
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }
        
        //creamos la matrix traspuesta
        int[][] traspuesta = new int[columnas][filas];
        
        //recorremos la matrix original para llenar la traspuesta
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[j][i] = matrix[i][j];
            }
        }
        System.out.println("------------");
        //mostramos la traspuesta por pantalla
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("["+traspuesta[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
