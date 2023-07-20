package ej09_matematica;

import Servicio.MatematicaServicio;

public class Ej09_Matematica {


    public static void main(String[] args) {
        
        MatematicaServicio numeritos = new MatematicaServicio();
        
        numeritos.crearNumeros();
        numeritos.devolverMayor();
        numeritos.calcularPotencia();
        numeritos.calcularRaiz();

    }
    
}
