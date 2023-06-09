/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
*/
package ejercicios_guia;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        int sumatoria = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Vamos a ingresar 20 números enteros:");
        for (int i = 0; i < 20; i++) {
            int num = leer.nextInt();
            if (num == 0) {
                System.out.println("Se capturé el número cero.");
                break;
            } else {
                if (num > 0) {
                    sumatoria = sumatoria + num;    
                }
            }
        }
        System.out.println("La sumatoria de los números positivos es " + sumatoria);
    }
}

