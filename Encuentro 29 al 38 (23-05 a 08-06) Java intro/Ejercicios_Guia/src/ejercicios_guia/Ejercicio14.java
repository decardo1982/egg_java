/*
EJERCICIO 14
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
*/
package ejercicios_guia;

import java.util.Scanner;


public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        String[] Equipo = new String[6];
     //asigno los nombres   
        for (int i = 0; i < Equipo.length; i++) {
            System.out.println("Ingrese el nombre para la posición " + i);
            Equipo[i] = read.nextLine();
        }
        //muestro por pantalla
        for (int i = 0; i < Equipo.length; i++) {
            System.out.println(Equipo[i]);
        }
    }
}
