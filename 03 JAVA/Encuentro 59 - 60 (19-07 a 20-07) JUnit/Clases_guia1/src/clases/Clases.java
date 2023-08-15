package clases;

import Entities.DNI;
import Entities.Persona;

public class Clases {

    public static void main(String[] args) {
        
        DNI dni = new DNI();
        
        dni.setSerie("A");
        dni.setNumero(29414783);
        
        Persona dario = new Persona("Dario", "Cardozo", dni);
        
        System.out.println("Persona: " + dario);
    }
    
}
