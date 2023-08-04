/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package coleccionesextra1;

import java.util.ArrayList;
import java.util.Scanner;

public class ColeccionesExtra1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Integer> listaNumeros = new ArrayList();
        int n1 = 0;
        int sumatoria = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese un número:");
            n1 = read.nextInt();
            if (n1 == -99) {
                continuar = false;
                break;
            }
            sumatoria += n1;
            listaNumeros.add(n1);

        }

        System.out.println("Los números ingresados fueron:");
        for (Integer numero : listaNumeros) {
            System.out.println(numero);
        }
        System.out.println("Cantidad de números ingresados:");
        System.out.println(listaNumeros.size());
        System.out.println("");
        System.out.println("Promedio de los números ingresados:");
        System.out.println(sumatoria / listaNumeros.size());

    }

}
