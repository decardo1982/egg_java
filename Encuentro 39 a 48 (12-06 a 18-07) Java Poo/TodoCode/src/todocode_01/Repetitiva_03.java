/*
Se solicitan los siguientes datos para la inscripción: dni, nombre y edad.
Categorías:
Menores A (de 6 a 10 años)
Menores B (de 11 a 17 años)
Juveniles (de 18 a 30 años)
Adultos (de 31 a 50 años)
Adultos mayores (más de 50 años)

Se necesita un programa que a partir del ingreso de los datos y edad de cada
participante, se muestre por pantalla a qué categoría debe ser incripto.
Para dar fin a las inscripciones, se debe ingresar un dni con el valor 0
y un nombre con la palabra "fin"
 */
package todocode_01;

import java.util.Scanner;

public class Repetitiva_03 {

    public static void main(String[] args) {

        int dni = 1;
        String nombre = "n/n";
        int edad = 0;
        String categoria = "";

        Scanner read = new Scanner(System.in).useDelimiter("\n");
        while (dni != 0 || !nombre.equalsIgnoreCase("fin")) {
            System.out.println("Ingrese nombre:");
            nombre = read.next();
            System.out.println("Ingrese DNI:");
            dni = read.nextInt();
            System.out.println("Ingrese edad:");
            edad = read.nextInt();

            if (edad >= 6 && edad <= 10) {
                categoria = "Menores A";
            } else {
                if (edad >= 11 && edad <= 17) {
                    categoria = "Menores B";
                } else {
                    if (edad >= 18 && edad <= 30) {
                        categoria = "Juveniles";
                    } else {
                        if (edad >= 31 && edad <= 50) {
                            categoria = "Adultos";
                        } else {
                            if (edad > 51) {
                                categoria = "Adultos mayores";
                            }
                        }
                    }
                }
            }

            if (dni == 0 && nombre.equals("fin")) {
                System.out.println("Gracias!");
            } else {
                System.out.println("Inscribir en la categoría " + categoria);

            }

        }

    }

}
