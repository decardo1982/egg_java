/*10. Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.*/
package javaintroejerciciosextra;

import java.util.Scanner;

public class EjercicioExtra_10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int numSecreto = num1 * num2;
        boolean acerto = false;

        System.out.println("num1= " + num1 + " num2= " + num2 + " numSecreto= " + numSecreto);

        System.out.print("Adivine el número secreto: ");
        int intento = read.nextInt();
        
        do {
            if (intento==numSecreto) {
                System.out.println("¡Muy bien! ¡Adivinó el número secreto!");
                acerto = true;
                break;
            } else {
                System.out.print("Intente nuevamente: ");
                intento = read.nextInt();
            }
        } while (acerto==false);
        

    }

}