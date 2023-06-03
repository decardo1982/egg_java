/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

[0] [-2] [4]    [0] [2][-4]
[2]  [0] [2]    [-2][0][-2]
[-4][-2] [0]    [4] [2][-0]


*/
package javaintroejercicios;

import java.util.Random;

public class Ejercicio_19 {
    public static void main(String[] args){
        //creamos las matrices de 3x3
        
        int matrix[][] = new int[3][3];
        int traspuesta[][] = new int[3][3];
        
        Random random = new Random();
        
        //llenamos la matrix con números aleatorios entre -2 y 2
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = random.nextInt(10) -5;
            }
        }
        //llenamos la traspuesta a partir de la matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                traspuesta[i][j] = matrix[j][i];
            }
        }
        //mostramos ambas por pantalla:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("--------------------------------------------");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + traspuesta[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
