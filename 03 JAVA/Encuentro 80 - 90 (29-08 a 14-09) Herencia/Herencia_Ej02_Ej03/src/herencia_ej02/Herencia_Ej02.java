package herencia_ej02;

import Entities.Lavarropa;
import Services.LavarropaService;
import Services.TelevisorService;
import java.util.ArrayList;
import Entities.Electrodomestico;
import Entities.Televisor;
import Enums.Color;
import Enums.ConsumoEnergetico;

public class Herencia_Ej02 {

    public static void main(String[] args) {
        //Lavarropa
        //        LavarropaService lava = new LavarropaService();
        //        lava.crearLavarropa();
        //        lava.precioFinal();
        //        lava.mostrar();

        //TV
        //        TelevisorService tv = new TelevisorService();
        //        tv.crearTelevisor();
        //        tv.precioFinal();
        //        tv.mostrar();
        
        
        //Ejercicio 3:
        
        Lavarropa lava1 = new Lavarropa(40, 1200d, Color.BLANCO, 80d, ConsumoEnergetico.A);
        Lavarropa lava2 = new Lavarropa(30, 1000d, Color.NEGRO, 30d, ConsumoEnergetico.C);
        Televisor tv1 = new Televisor(52, true, 1500.0, Color.GRIS, 35d, ConsumoEnergetico.A);
        Televisor tv2 = new Televisor(28, false, 1100.0, Color.NEGRO, 25d, ConsumoEnergetico.B);

        
        ArrayList<Electrodomestico> electrodomestico = new ArrayList<>();
        electrodomestico.add(lava1);
        electrodomestico.add(lava2);
        electrodomestico.add(tv1);
        electrodomestico.add(tv2);
        
        double total = 0;
        
        for (int i = 0; i < electrodomestico.size(); i++) {
            System.out.println("Electro " + i + " tiene un precio final de: " + electrodomestico.get(i).getPrecio());
            total += electrodomestico.get(i).getPrecio();
        }
        
        System.out.println("La sumatoria de precios es " + total);

    }

}
