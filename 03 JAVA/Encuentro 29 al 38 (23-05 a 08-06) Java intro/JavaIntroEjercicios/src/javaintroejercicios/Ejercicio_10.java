/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
*/
package javaintroejercicios;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor límite positivo:");
        int limite = leer.nextInt();
        int sumatoria = 0;
        
        while(limite < 0 || limite == 0) {
            System.out.println("El valor debe ser positivo! Intente nuevamente:");
            limite = leer.nextInt();
        }
        while (sumatoria < limite) {
            System.out.println("Ingrese un número:");
            sumatoria = sumatoria + leer.nextInt();
        }
        System.out.println("La sumatoria " + sumatoria + " sobrepasó el límite " + limite);   
    }
}
