package Entities;

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
                System.out.println("Ingrese un número:");
                valor = read.nextInt();
                intentos++;

            } catch (Exception e) {
                System.out.println();
            }

            if (valor > numeroAleatorio) {
                System.out.println("El número es menor");
            }
            if (valor < numeroAleatorio) {
                System.out.println("El número es mayor");
            }

        } while (valor != numeroAleatorio);
        System.out.println("¡Acertaste!\n"
                + "El número aleatorio " + numeroAleatorio + " es igual al número ingresado " + valor + "\n"
                + "y lo hiciste en " + intentos + " intentos.");

    }
}
