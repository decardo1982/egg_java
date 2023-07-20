/*
EJERCICIO 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero sea múltiplo del segundo y se imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
*/
package ejercicios_guia;

import java.util.Scanner;


public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int num1 = read.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = read.nextInt();
        
        System.out.println(EsMultiplo(num1, num2));
    }
    public static boolean EsMultiplo(int num1, int num2) {
        if (num1%num2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
