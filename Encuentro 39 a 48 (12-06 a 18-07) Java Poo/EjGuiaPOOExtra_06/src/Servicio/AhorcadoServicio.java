package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    Ahorcado Ahorcado = new Ahorcado();

    public Ahorcado crearJuego() {
        System.out.print("Ingresar la palabra a adivinar: ");
        String palabra = read.next();
        int longitudArray = palabra.length();

        char[] Palabra = new char[longitudArray];

        for (int i = 0; i < longitudArray; i++) {

            Palabra[i] = palabra.toUpperCase().charAt(i);
        }
        System.out.println("Ingrese cantidad de intentos:");
        Ahorcado.setJugadasMaximas(read.nextInt());
        Ahorcado.setPalabra(Palabra);
        Ahorcado.setLetrasEncontradas(0);

//        System.out.println(Ahorcado.getPalabra());
//        System.out.println(Ahorcado.getJugadasMaximas());
        return Ahorcado;
    }



}
