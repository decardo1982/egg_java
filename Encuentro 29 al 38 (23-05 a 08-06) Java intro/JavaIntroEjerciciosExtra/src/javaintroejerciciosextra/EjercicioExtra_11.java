/*11. Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados. */
package javaintroejerciciosextra;

import java.util.Scanner;

public class EjercicioExtra_11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int digitos = 0;
        int residuo = 0;

        System.out.println("Ingrese un número entero positivo:");
        int num = read.nextInt();

        if (num < 10 && num > 0) {
            digitos++;
        } else {
            residuo = num;
            digitos++;
            do {
                residuo = residuo / 10;
                digitos++;
            } while (residuo > 10);
        }
        System.out.println("el número ingresado tiene " + digitos + " dígitos");
    }
}
