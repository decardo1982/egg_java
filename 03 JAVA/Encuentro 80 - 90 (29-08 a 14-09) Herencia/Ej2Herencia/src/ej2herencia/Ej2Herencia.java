
package ej2herencia;

import Entidades.Lavarropas;
import Entidades.Televisor;

public class Ej2Herencia {

    public static void main(String[] args) {
        Lavarropas lavarropas = new Lavarropas();
        lavarropas.crearLavarropas();
        System.out.println(lavarropas);
        
        Televisor tele = new Televisor();
        tele.crearTelevisor();
        System.out.println(tele);

    }
    
}
