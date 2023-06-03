/*
14. Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package javaintroejercicios;

import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros a convertir:");
        int euros = read.nextInt();
        String moneda = "";

        System.out.println("¿A qué moneda desea convertir?");
        System.out.println("1. Dólares");
        System.out.println("2. Yenes");
        System.out.println("3. Libras");
        int opcion = read.nextInt();

        switch (opcion) {
            case 1:
                moneda = "DOLARES";
                break;
            case 2:
                moneda = "YENES";
                break;
            case 3:
                moneda = "LIBRAS";
                break;
            default:
                System.out.println("La opción no es válida.");
                break;
        }
        convertirEuros(euros, moneda);

    }

    public static void convertirEuros(int euros, String moneda) {
        switch (moneda) {
            case "DOLARES":
                System.out.println("Los " + euros + " € equivalen a " + (euros * 1.28611) + " " + moneda);
                break;
            case "LIBRAS":
                System.out.println("Los " + euros + " € equivalen a " + (euros * 0.86) + " "+moneda);
                break;
            case "YENES":
                System.out.println("Los " + euros + " € equivalen a " + (euros * 129.852) +" "+ moneda);
                break;
        }
    }

}
