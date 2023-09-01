package Entities;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua revolver;

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void ronda() {

        for (Jugador jugador : jugadores) {
            System.out.println("");
            System.out.print(jugador.getNombre() + " se apunta y...");
            boolean mojado = jugador.disparo(revolver);
            if (mojado) {
                System.out.print(" ¡se mojó!\n Fin del juego\n");
                return;
            } else {
                System.out.print(" el revolver no mojó.");
            }
        }
    }

    public void mostrarGanador() {
        for (Jugador jugador : jugadores) {
            if (jugador.estaMojado()) {
                System.out.println("---------------------");
                System.out.println("El " + jugador.getNombre() + " se mojó.");
                System.out.println("---------------------");

                break;
            }
        }
    }

}
