/*
14. Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias
 */
package javaintroejerciciosextra;

import java.util.Scanner;


public class EjercicioExtra_14 {
    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
        int edades = 0;
        int hijos = 0;
        
        System.out.print("Ingrese la cantidad de familias: ");
        int N = read.nextInt();
        
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese la cantidad de hijos para la familia Nº " + (i+1) + ": ");
            int M = read.nextInt();
            hijos += M;
            for (int j = 0; j < M; j++) {
                System.out.print("Ingrese la edad el hijo nº " + (j+1) + "/" + M + ": ");
                int edad = read.nextInt();
                edades += edad;
            }
        }
        double media = edades / hijos;
        System.out.println("La media de la edad es " + media);

    }
}
