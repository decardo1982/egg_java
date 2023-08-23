package clases_ej3;

import Services.BarajaService;

public class CartasMain {

    public static void main(String[] args) {

        BarajaService bs = new BarajaService();
        
        bs.crearBaraja();
        bs.mainMenu();

    }

}
