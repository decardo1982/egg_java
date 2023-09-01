package ejerciciouml03.entities;

//@author CesarQR
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baraja {

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Naipe> cartasBaraja = new ArrayList();
    ArrayList<Naipe> cartasMano = new ArrayList();

    public Baraja() {
        for (Palo palo : Palo.values()) {
            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) {
                    cartasBaraja.add(new Naipe(i, palo));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartasBaraja);
    }

    public Naipe siguienteCarta() {
        if (cartasBaraja.isEmpty()) {
            System.out.println("No hay mas cartas.");
            return null;
        } else {
            return cartasBaraja.remove(0);
        }
    }

    public void cartasDisponibles() {
        cartasBaraja.size();
    }

    public ArrayList<Naipe> darCartas() {
        System.out.print("Ingrese el numero de cartas a pedir: ");
        int number = scanner.nextInt();
        
        if (number <= cartasBaraja.size()) {
            for (int i = 0; i < number; i++) {
                cartasMano.add(siguienteCarta());
            }
        } else {
            System.out.println("No hay esa cantidad de cartas a dar");
        }
        return cartasMano;
    }
    
    public void cartasMonton(){
        System.out.println("===== CARTAS EN MONTON =====");
        if (cartasMano.isEmpty()) {
            System.out.println("No hay cartas salientes de la baraja");
        } else {
            for (Naipe cartaSaliente : cartasMano) {
                System.out.println(cartaSaliente);
            }
        }
    }
    
    public void mostrarBaraja(){
        System.out.println("===== CARTAS EN BARAJA =====");
        for (Naipe cartaBaraja : cartasBaraja) {
                System.out.println(cartaBaraja);
            }
    }
}
