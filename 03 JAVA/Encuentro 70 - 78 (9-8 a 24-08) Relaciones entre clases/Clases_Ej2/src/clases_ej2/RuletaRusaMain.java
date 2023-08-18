package clases_ej2;

import Entities.Juego;
import Entities.Jugador;
import Entities.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

public class RuletaRusaMain {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingrese la cantidad de jugadores entre 1 y 6: ");
        int cantJugadores = read.nextInt();
        if (cantJugadores < 1 || cantJugadores > 6) {
            cantJugadores = 6;
        }

        ArrayList<Jugador> jugadores = new ArrayList<>();
        for (int i = 1; i <= cantJugadores; i++) {
            jugadores.add(new Jugador(i));
        }

        RevolverDeAgua revolver = new RevolverDeAgua();
        revolver.llenarRevolver();

        Juego juego = new Juego();
        juego.llenarJuego(jugadores, revolver);

        while (true) {
            juego.ronda();
            if (jugadores.stream().anyMatch(Jugador::estaMojado)) {
                break;
            }
        }

        juego.mostrarGanador();

    }

}
