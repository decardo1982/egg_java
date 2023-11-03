package herencia_ej04;

import Entities.Circulo;
import Entities.Rectangulo;

public class Herencia_Ej04 {

    public static void main(String[] args) {
        
        Circulo c1 = new Circulo(5d);
        System.out.println("El radio del círculo es " + c1.getRadio());
        c1.calcularArea();
        c1.calcularPerimetro();
        
        Rectangulo r1 = new Rectangulo(10d, 10d);
        System.out.println("La base del rectángulo es " + r1.getBase() + " y la altura es " + r1.getAltura());
        r1.calcularArea();
        r1.calcularPerimetro();

    }
    
}
