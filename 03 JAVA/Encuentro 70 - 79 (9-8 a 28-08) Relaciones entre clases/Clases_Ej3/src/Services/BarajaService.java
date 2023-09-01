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
    private Collections coleccion;

    public Baraja crearBaraja() {
        System.out.println("Se crea el mazo de naipes");

        ArrayList<Cartas> cs = new ArrayList();
        ArrayList<Cartas> out = new ArrayList();
        cartasDadas.setCartas(out);

        for (Palos aux : Palos.values()) {
            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) {
                    Cartas cartitas = new Cartas(i, aux);
                    cs.add(cartitas);
                }
            }
        }
        mazoInicial.setCartas(cs);
        System.out.println("Mazo de naipes creado.");
        return mazoInicial;
    }
    
    public void barajar(){
        coleccion.shuffle(mazoInicial.getCartas());
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
                System.out.println("Se entrega " + mazoInicial.getCartas().get(i).toString() + " al jugador.");
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
            System.out.println("Se entregaron las siguientes cartas:");
            for (int i = 0; i < cartasDadas.getCartas().size(); i++) {
                System.out.println(cartasDadas.getCartas().get(i).toString() + " / ");
            }
            
        }
    }
    
    public void mostrarBaraja(){
        System.out.println("Quedan en el mazo las siguientes cartas:");
        for (int i = 0; i < mazoInicial.getCartas().size(); i++) {
            System.out.println(mazoInicial.getCartas().get(i));
        }
        
    }
    
public void mainMenu() {
        String opcion = "";
        boolean opcionValida = true;
        do {
            System.out.println("----------------------");
            System.out.println("    Menú principal");
            System.out.println("Seleccione una opción:");
            System.out.println("----------------------");
            System.out.println("1. Barajar el mazo");
            System.out.println("2. Mostrar siguiente carta");
            System.out.println("3. Cantidad de cartas disponibles");
            System.out.println("4. Dar cartas");
            System.out.println("5. Mostrar cartas dadas");
            System.out.println("6. Mostrar cartas");
            System.out.println("7. Salir");
            opcion = read.next();

            switch (opcion) {
                case "1":
                    barajar();
                    break;
                case "2":
                    siguienteCarta();
                    break;
                case "3":
                    cartasDisponibles();
                    break;
                case "4":
                    darCartas();
                    break;
                case "5":
                    cartasMonton();
                    break;
                case "6":
                    mostrarBaraja();
                    break;
                case "7":                    
                    opcionValida = false;
                    System.out.println("");
                    System.out.println("¡Gracias, vuelva prontos!");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Intente una opción válida:");
            }
        } while (opcionValida);

    }
}
