/*
15. Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package javaintroejerciciosextra;

import java.util.Scanner;


public class EjercicioExtra_15 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        double resultado = 0;
        
        System.out.print("Ingrese el primer número: ");
        int num1 = read.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = read.nextInt();
        
        System.out.println("----------------------------");
        System.out.println("Elegir operación a realizar:");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicación");
        System.out.println("4: División");
        int opcion = read.nextInt();
        
        switch(opcion){
            case 1:
                resultado = sumarNumeros(num1, num2);
                break;
            case 2:
                resultado = restarNumeros(num1, num2);
                break;
            case 3:
                resultado = multiplicarNumeros(num1, num2);
                break;
            case 4:
                resultado = dividirNumeros(num1, num2);
                break;
            default:
                System.out.println("La opción es incorrecta.");
        }
        System.out.println("El resultado es " + resultado);
        
    }
    public static int sumarNumeros(int num1, int num2) {
        return num1+num2;
    }
    public static int restarNumeros(int num1, int num2) {
        return num1 - num2;
    }
    public static int multiplicarNumeros(int num1, int num2) {
        return num1 * num2;
    }
    public static int dividirNumeros(int num1, int num2) {
        if (num1 > num2) {
            return num1 / num2;
        } else {
            return num2 / num1;
        }
    }

    
}
