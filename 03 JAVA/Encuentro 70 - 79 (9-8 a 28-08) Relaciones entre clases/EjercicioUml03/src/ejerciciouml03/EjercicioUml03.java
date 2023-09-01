
package ejerciciouml03;

//@author CesarQR

import ejerciciouml03.entities.Baraja;

public class EjercicioUml03 {

    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.barajar();
        baraja.cartasDisponibles();
        baraja.darCartas();
        baraja.cartasMonton();
        baraja.mostrarBaraja();
    }
    
}
