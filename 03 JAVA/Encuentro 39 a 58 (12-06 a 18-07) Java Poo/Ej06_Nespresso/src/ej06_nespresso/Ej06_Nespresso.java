package ej06_nespresso;

import Entidades.Cafetera;
import Servicio.CafeteraServicio;

public class Ej06_Nespresso {

    public static void main(String[] args) {
        
        CafeteraServicio cafServ = new CafeteraServicio();
        Cafetera cafetera1 = cafServ.llenarCafetera();
        
        cafServ.servirTaza(cafetera1);
        
        cafServ.vaciarCafetera(cafetera1);
        
        cafServ.agregarCafe(cafetera1);
    }

}
