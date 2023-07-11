/*
En una tabla de 4 filas y 4 columnas se guardan notas de 4 alumnos. Cada fila
corresponde a las notas y al promedio de cada alumno. Se necesita un programa
que permita cargar en las 3 posiciones (columnas) de cada fila las notas del
alumno y que en la última columna se calculen los promedios. Una vez realizados
los cálculos se desea mostrar las 3 notas de cada alumno y el promedio que
corresponda recorriendo la matriz.
 */
package todocode_01;

import java.util.Scanner;

public class matrices_01 {

    public static void main(String[] args) {

        double matriz[][] = new double[4][4];

        Scanner read = new Scanner(System.in);
        double suma = 0.0;

        //for para cargar
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese el alumno nº " + f);
                matriz[f][c] = read.nextDouble();
                suma = suma + matriz[f][c];
            }
            matriz[f][3] = suma / 3;
            suma = 0.0;
        }

        //for para recorrer
        
        for (int f = 0; f < 4; f++) {
            System.out.println("Las notas de alumno nº " + f + " son: ");
            for (int c = 0; c < 3; c++) {
                System.out.println("Nota Nº " + c + " " + matriz[f][c]);
                
            }
            System.out.println("El promedio es: " + matriz[f][3]);
        }
    }

}
