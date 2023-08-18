package Services;

import Entities.Baraja;
import Entities.Cartas;
import Enums.Palos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BarajaService {

    private Baraja mazoInicial = new Baraja();
    private Baraja cartasDadas = new Baraja();

    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    private Collections col;

    public Baraja crearBaraja() {
        System.out.println("Se crea el mazo de naipes");

        ArrayList<Cartas> cs = new ArrayList();
        ArrayList<Cartas> out = new ArrayList();
        cartasDadas.setCartas(out);

        for (Palos aux : Palos.values()) {
            String palo = aux.name();
            for (int i = 1; i <= 12; i++) {
                if (i != 8 || i != 9) {
                    Cartas c = new Cartas(i, aux);
                    cs.add(c);
                }
            }
        }
        mazoInicial.setCartas(cs);
        System.out.println("Mazo de naipes creado.");
        return mazoInicial;
    }
    
    public void barajar(){
        col.shuffle(mazoInicial.getCartas());
    }
    
    public Cartas siguienteCarta(){
        Cartas c = mazoInicial.getCartas().get(0);
        System.out.println("La siguiente carta es: " + mazoInicial.getCartas().get(0).toString());
        return c;
    }
    
    public void cartasDisponibles(){
        System.out.println("Hay " + mazoInicial.getCartas().size() + " cartas disponibles.");
    }
    
    public void darCartas(){
        System.out.println("¿Cuántas cartas desea recibir?");
        int cantidad = read.nextInt();
        
        if (cantidad <= mazoInicial.getCartas().size()) {
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Se entrega el " + mazoInicial.getCartas().get(i).toString() + " al jugador.");
            }
            for (int i = 0; i < cantidad; i++) {
                cartasDadas.getCartas().add(mazoInicial.getCartas().get(0));
                mazoInicial.getCartas().remove(0);
            }
        } else {
            System.out.println("No hay suficientes cartas, no se entrega ninguna.");
            cartasDisponibles();
        }
    }
    
    public void cartasMonton(){
        if (mazoInicial.getCartas().size() == 0) {
            System.out.println("El mazo está completo, aún no se han entregado cartas.");
        } else {
            
        }
    }

}
