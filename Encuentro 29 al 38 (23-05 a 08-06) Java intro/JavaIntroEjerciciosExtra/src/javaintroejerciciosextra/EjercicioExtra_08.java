/*8. Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/
package javaintroejerciciosextra;

import java.util.Scanner;

public class EjercicioExtra_08 {
    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Indique cuántos números serán ingresados:");
        int cantidad = read.nextInt();
        int cantPares = 0;
        int cantImpares = 0;
        
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el número " + (i+1) + " de " + cantidad + ": ");
            int n = read.nextInt();
            if (n > 0) {
                if (n%5==0) {
                    break;
                }
                if (n%2==0) {
                    cantPares++;
                } else {
                    cantImpares++;
                }   
            }
        }
        System.out.println("Cantidad Pares: " + cantPares);
        System.out.println("Impares: " + cantImpares);
    }
}