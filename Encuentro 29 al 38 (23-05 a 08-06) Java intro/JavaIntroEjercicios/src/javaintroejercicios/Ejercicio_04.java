/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
package javaintroejercicios;

import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de los grados centígrados (ºC)");
        double gradosC = leer.nextDouble();
        double gradosF;
        gradosF = (32 + (9 * gradosC / 5));
        System.out.println("-------------------------------------------------");
        System.out.println("Los " + gradosC + "ºC equivalen a " + gradosF + "ºF");
    }
    
}
