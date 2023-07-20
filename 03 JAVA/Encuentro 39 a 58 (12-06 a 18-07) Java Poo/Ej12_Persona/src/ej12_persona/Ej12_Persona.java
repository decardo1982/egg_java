package ej12_persona;

import Servicio.PersonaServicio;

public class Ej12_Persona {

    public static void main(String[] args) {
        
        PersonaServicio ejemploPersona = new PersonaServicio();
        
        ejemploPersona.crearPersona();
        ejemploPersona.calcularEdad();
        ejemploPersona.menorQue(0);
        ejemploPersona.mostrarPersona();

    }
    
}
