/*
16. Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package javaintroejerciciosextra;

import java.util.Scanner;

public class EjercicioExtra_16 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Cantidad de personas a ingresar:");
        int cantidadPersonas = read.nextInt();
        int contadorPersonas = 0;

        while (cantidadPersonas > contadorPersonas) {
            System.out.print("Ingrese nombre Persona #" + (contadorPersonas + 1) + ": ");
            String nombre = read.next();
            System.out.print("Ingrese edad: ");
            int edad = read.nextInt();
            System.out.println("");
            System.out.print(nombre + " tiene " + edad + " años y ");
            if (esMayorEdad(edad)) {
                System.out.println("es mayor de edad.");
            } else {
                System.out.println("no es mayor de edad.");
            }
            System.out.println("");
            System.out.println("¿Desea ingresar otro nombre? (Ingrese 'No' para detener)");
            String opcion = read.next();
            if (opcion.equalsIgnoreCase("No")) {
                break;
            }
            contadorPersonas++;
        }
    }

    public static boolean esMayorEdad(int edad) {
        return edad >= 18;
    }

}
