package ej14_telefonos;

import Servicio.MovilServicio;

public class Ej14_Telefonos {

    public static void main(String[] args) {
        
        MovilServicio ms = new MovilServicio();
        
        ms.cargarCelular();
        ms.mostrarCelular();

    }
    
}
