package Entities;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Juego {

    private Integer intentos = 0;
    private Integer valor = 0;
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void empezarJuego() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(500) + 1;

        System.out.println("Aleatorio: " + numeroAleatorio);

        do {

            try {
                System.out.print("Ingrese un número entero: ");
                intentos++;
                valor = read.nextInt();
                if (valor > numeroAleatorio) {
                    System.out.println("El número es menor");
                }
                if (valor < numeroAleatorio) {
                    System.out.println("El número es mayor");
                }

            } catch (InputMismatchException e) {
                System.out.print("¡Solamente números enteros! ");
                read.next();
            }

        } while (valor != numeroAleatorio);
        System.out.println("¡Acertaste!\n"
                + "El número aleatorio " + numeroAleatorio + " es igual al número ingresado " + valor + "\n"
                + "y lo hiciste en " + intentos + " intentos.");
        read.close();

    }
}
