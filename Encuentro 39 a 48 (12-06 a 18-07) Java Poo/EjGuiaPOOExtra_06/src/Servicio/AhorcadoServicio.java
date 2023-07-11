package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    Ahorcado Ahorcadito = new Ahorcado();

    public Ahorcado crearJuego() {
        System.out.print("Ingresar la palabra a adivinar: ");
        String palabraIngresada = read.next();
        int longitudArray = palabraIngresada.length();

        char[] Palabra = new char[longitudArray];

        for (int i = 0; i < longitudArray; i++) {

            Palabra[i] = palabraIngresada.toUpperCase().charAt(i);
        }
        System.out.println("Ingrese cantidad de intentos:");
        Ahorcadito.setJugadasMaximas(read.nextInt());
        Ahorcadito.setPalabra(Palabra);
        Ahorcadito.setLetrasEncontradas(0);

//        System.out.println(Ahorcadito.getPalabra());
//        System.out.println(Ahorcadito.getJugadasMaximas());
        return Ahorcadito;
    }

    public int longitud() {
        int longitud = Ahorcadito.getPalabra().length;
        //System.out.println("La palabra tiene " + longitud + " letras.");
        return longitud;
    }

    public char buscarLetra() {
        char letraBuscada;
        boolean encontrada = false;

        System.out.println("Ingrese la letra a buscar:");
        String caracter = read.next();
        letraBuscada = Character.toUpperCase(caracter.charAt(0));

        for (int i = 0; i < longitud(); i++) {
            if (Ahorcadito.getPalabra()[i] == letraBuscada) {
                encontrada = true;
                System.out.println("La letra " + letraBuscada + " se encuentra en la posición " + (i + 1));
            }
        }
        if (!encontrada) {
            System.out.println("La letra " + letraBuscada + " no se encuentra en la palabra.");
        }

        return letraBuscada;
    }

    public Ahorcado encontradas() {
        int cantLetras = Ahorcadito.getPalabra().length;
        int letrasEncontradas = 0;
        int letrasFaltantes = cantLetras - letrasEncontradas;
        System.out.println("Letras encontradas / faltantes: " + letrasEncontradas + " / " + letrasFaltantes);

        return null;
    }

    public Ahorcado intentos() {
        int intentos = Ahorcadito.getJugadasMaximas();
        intentos--;
        System.out.println("Intentos: " + intentos);
        return null;
    }

    public Ahorcado juego() {
        crearJuego();
        longitud();
        for (int i = 0; i < Ahorcadito.getJugadasMaximas(); i++) {
            intentos();
            buscarLetra();
            encontradas();
        }

        return null;
    }

}
