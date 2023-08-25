package clases_extra_ej2;

import Entities.Cine;
import Entities.Espectador;
import Services.CineServicio;
import java.util.ArrayList;

public class Clases_Extra_Ej2 {

    public static void main(String[] args) {
        
        CineServicio cs = new CineServicio();
        
        Cine c = cs.abrirCine();
        ArrayList<Espectador> e = cs.crearPosiblesEspectadores();
        cs.recibirPosiblesEspectadores(c, e);
        cs.verSala(c);
        cs.revisarEspectador(c);

    }
    
}
