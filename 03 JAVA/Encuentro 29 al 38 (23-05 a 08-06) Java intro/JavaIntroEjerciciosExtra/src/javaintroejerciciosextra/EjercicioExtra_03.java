/*3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package javaintroejerciciosextra;

import java.util.Scanner;

public class EjercicioExtra_03 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        String letter = read.nextLine().toLowerCase();

        if (letter.equals("a")
                || (letter.equals("e"))
                || (letter.equals("i"))
                || (letter.equals("o"))
                || (letter.equals("u"))) {
            System.out.println("La letra es una vocal");
        } else {
            System.out.println("La letra NO es una vocal");
        }
    }
}
