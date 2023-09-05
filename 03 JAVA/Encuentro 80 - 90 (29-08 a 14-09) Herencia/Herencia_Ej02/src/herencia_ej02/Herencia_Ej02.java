package herencia_ej02;

import Entities.Lavarropa;
import Services.LavarropaService;
import Services.TelevisorService;

public class Herencia_Ej02 {

    public static void main(String[] args) {
        
//        LavarropaService lava = new LavarropaService();
//        lava.crearLavarropa();
//        lava.precioFinal();
//        lava.mostrar();
        
        TelevisorService tv = new TelevisorService();
        tv.crearTelevisor();
        tv.precioFinal();
        tv.mostrar();
            

    }

}
