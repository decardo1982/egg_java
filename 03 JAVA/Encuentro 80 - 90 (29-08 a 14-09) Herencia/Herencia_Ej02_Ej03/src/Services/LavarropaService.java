package Services;

import Entities.Lavarropa;
import java.util.Scanner;

public class LavarropaService extends ElectrodomesticoService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Lavarropa lavadora = new Lavarropa();

    public void crearLavarropa() {

        super.crearElectrodomestico();

        System.out.println("Ingrese la carga:");
        Integer carga = read.nextInt();
        lavadora.setCarga(carga);
    }

    @Override
    public void precioFinal() {
        System.out.println("carga: " + lavadora.getCarga());

        super.precioFinal();

        if (lavadora.getCarga() > 30) {

            electro.setPrecio(electro.getPrecio() + 500);

        }
        System.out.println("Precio final según carga: " + electro.getPrecio());

    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("carga: " + lavadora.getCarga());

    }

}
