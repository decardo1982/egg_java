
package ejerciciouml03.entities;

//@author CesarQR
public class Naipe {
    
    private int number;
    private Palo palo;
    
    public Naipe(int number, Palo palo) {
        this.number = number;
        this.palo = palo;
    }
    
    @Override
    public String toString() {
        return "Number: " + number + "\tPalo: " + palo;
    }
    
}