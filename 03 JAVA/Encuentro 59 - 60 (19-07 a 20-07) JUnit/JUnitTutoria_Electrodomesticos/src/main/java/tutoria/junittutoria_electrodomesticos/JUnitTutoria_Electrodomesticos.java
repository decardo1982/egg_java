
package tutoria.junittutoria_electrodomesticos;

import java.util.ArrayList;
import java.util.List;



// Este ejercicio está hecho por Valentina Navia

public class JUnitTutoria_Electrodomesticos {

    public static void main(String[] args) {
        /*Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
        deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
        televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
        precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
        2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
        electrodomésticos, 2000 para lavadora y 5000 para televisor.*/

        List<Appliance> lista = new ArrayList<>();
        List<Television> listaTV = new ArrayList<>();
        List<WashingM> listaWM = new ArrayList<>();
        int precioTV = 0;
        int precioWM = 0;

        WashingM wm = new WashingM(1000, "red", 'b', 50, 40);
        wm.finalPrice();
        listaWM.add(wm);
        lista.add(wm);

        WashingM wm2 = new WashingM(1500, "red", 'b', 50, 40);
        wm2.finalPrice();
        listaWM.add(wm2);
        lista.add(wm2);

        /*for (WashingM aux : listaWM) {
            aux.finalPrice();
            lista.add(aux);
            System.out.println("Precio del lavarropas: " + aux.getPrice());
            precioWM += aux.getPrice();
        }
        System.out.println("El precio de todos los lavarropas es de: " + precioWM);*/

        Television tv = new Television(1000, "blue", 'f', 40, 42, true);
        tv.finalPrice();
        listaTV.add(tv);
        lista.add(tv);

        /*Television tv2 = new Television(2000, "blue", 'b', 50, 50, false);
        tv2.finalPrice();
        listaTV.add(tv2);
        lista.add(tv2);*/

        /*for (Television aux : listaTV) {
            aux.finalPrice();
            lista.add(aux);
            System.out.println("Precio del televisor: " + aux.getPrice());
            precioTV += aux.getPrice();
        }
        System.out.println("El precio de todos los televisores es de: " + precioTV);

        System.out.println("El precio de todos los electrodomésticos es de: " + (precioWM + precioTV));*/

        for (Appliance aux: lista){
            if(aux instanceof WashingM){
                System.out.println("Precio del lavarropas: " + aux.getPrice());
                precioWM += aux.getPrice();
        }if(aux instanceof Television){
                System.out.println("Precio del televisor: " + aux.getPrice());
                precioTV += aux.getPrice();
            }
        }
        System.out.println("El precio de todos los lavarropas es de: " + precioWM);
        System.out.println("El precio de todos los televisores es de: " + precioTV);
        System.out.println("El precio de todos los electrodomésticos es de: " + (precioWM + precioTV));
    }
 }

