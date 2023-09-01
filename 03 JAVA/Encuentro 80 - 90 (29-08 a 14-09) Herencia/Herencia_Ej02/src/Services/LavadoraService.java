package Services;

import Entities.Lavadora;
import java.util.Scanner;

public class LavadoraService extends ElectrodomesticoService {

    Lavadora lavadora = new Lavadora();

    public void crearLavadora() {

        Scanner read = new Scanner(System.in).useDelimiter("\n");

        super.crearElectrodomestico();

        System.out.println("Ingrese la carga:");
        lavadora.setCarga(read.nextInt());
    }

    public void precioFinalLavadora() {

        super.precioFinal();

        if (lavadora.getCarga() > 30) {
            lavadora.setPrecio((lavadora.getPrecio() + 500));
        }

    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Capacidad de carga: " + lavadora.getCarga());
    }

}
