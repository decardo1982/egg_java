package ejercicios_guia;

import java.util.Scanner;


public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número entero:");
        int num2 = leer.nextInt();
        
        if (num1 > 25 || num2 > 25) {
            System.out.println("alguno de los números es mayor a 25");
        }else {
            System.out.println("ninguno de los números es mayor a 25");
        }
    }
    }
