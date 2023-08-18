package clases_guia2;

import Entities.Equipo;
import Entities.Jugador;
import java.util.ArrayList;
import java.util.List;

public class JugadorMain {

    public static void main(String[] args) {
        
        Jugador player1 = new Jugador("Juan", "Perez", "Arquero", 1);
        Jugador player2 = new Jugador("Paco", "Gomez", "Defensor", 2);
        Jugador player3 = new Jugador("Pedro", "Delamar", "Defensor", 3);
        Jugador player4 = new Jugador("Roberto", "Aquino", "Centro", 4);
        Jugador player5 = new Jugador("Lio", "Messi", "Delantero", 11);
        
        ArrayList<Jugador> players = new ArrayList();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        
        Equipo equipazo = new Equipo();
        equipazo.setJugadores(players);
        
        
        System.out.println("Banfield: " + equipazo);

    }
    
}
