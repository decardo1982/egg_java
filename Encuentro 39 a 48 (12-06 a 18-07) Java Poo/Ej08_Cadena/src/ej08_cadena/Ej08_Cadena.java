package ej08_cadena;

import Entidades.Cadena;
import Servicio.CadenaServicio;

public class Ej08_Cadena {

    public static void main(String[] args) {
        
        CadenaServicio frase = new CadenaServicio();
        
        Cadena frase1 = frase.crearFrase();
        frase.mostrarVocales();
        frase.invertirFrase();

    }
    
}
