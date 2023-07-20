/*
18. Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package javaintroejerciciosextra;

import java.util.Scanner;

public class EjercicioExtra_18 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        int sumatoria = 0;
        
        System.out.print("Ingrese la dimensión del vector: ");
        int N = read.nextInt();
        
        int[] vector = new int[N];
        
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el valor para la posición " + (i + 1));
            vector[i] = read.nextInt();
            sumatoria += vector[i];
        }        
        System.out.println("La sumatoria de los números del vector es " + sumatoria);
    }    
}
