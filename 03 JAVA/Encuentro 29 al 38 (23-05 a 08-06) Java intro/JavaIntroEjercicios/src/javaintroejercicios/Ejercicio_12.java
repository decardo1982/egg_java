/*12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario.
Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals(). */
package javaintroejercicios;

import java.util.Scanner;

public class Ejercicio_12 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String cadena;
        int correctas = 0;
        int incorrectas = 0;

        System.out.println("Ingresar cadena de hasta 5 caracteres");
        System.out.println("con formato X---O");
        System.out.println("secuencia FDE: '&&&&&'");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");

        do {
            System.out.println("Ingrese cadena:");
            cadena = read.nextLine();

            if (cadena.equals("&&&&&")) {
                break;
            }

            if (validarCadena(cadena)) {
                correctas++;

            } else {
                incorrectas++;
            }

        } while (true);

        System.out.println("Cadenas correctas: " + correctas);
        System.out.println("Cadenas incorrectas: " + incorrectas);
    }

    public static boolean validarCadena(String cadena) {
        if (cadena.length() != 5) {
            return false;
        }

        char primeraLetra = cadena.charAt(0);
        char ultimaLetra = cadena.charAt(4);

        if (primeraLetra != 'X' || ultimaLetra != 'O') {
            return false;
        }
        return true;
    }
}
