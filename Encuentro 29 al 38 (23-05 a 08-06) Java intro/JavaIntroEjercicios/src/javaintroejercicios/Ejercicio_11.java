/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
*/
package javaintroejercicios;

import java.util.Scanner;


public class Ejercicio_11 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        boolean salir = true;
        
        do {
        System.out.println("Ingrese el primer número:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = leer.nextInt();
        
        System.out.println("MENU");
        System.out.println("----");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("----------------");
        System.out.println("Ingrese una opción:");
        int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma es " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta es " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La division es " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro de que desea salir del programa? (S/N)");
                    String confirma = leer.next();
                    if ("S".equals(confirma.toUpperCase())) {
                        salir = false;
                    }
            }
        } while (salir == true);
    }
}
