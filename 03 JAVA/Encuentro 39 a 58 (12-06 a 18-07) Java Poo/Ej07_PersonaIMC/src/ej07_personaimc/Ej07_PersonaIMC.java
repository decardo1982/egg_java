package ej07_personaimc;

import Entidades.Persona;
import Servicio.PersonaServicio;

public class Ej07_PersonaIMC {

    public static void main(String[] args) {
        
        PersonaServicio PS = new PersonaServicio();
        Persona persona1 = PS.crearPersona();
        
        
        PS.calcularIMC(persona1);
        
        PS.esMayorDeEdad(persona1);

    }
    
}
