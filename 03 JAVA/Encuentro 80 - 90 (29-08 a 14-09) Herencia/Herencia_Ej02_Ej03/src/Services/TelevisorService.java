package Services;

import Entities.Televisor;
import java.util.Scanner;

public class TelevisorService extends ElectrodomesticoService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Televisor tv = new Televisor();

    public void crearTelevisor() {
        super.crearElectrodomestico();

        System.out.println("Ingrese la resolución del TV:");
        tv.setResolucion(read.nextInt());

        System.out.println("¿Tiene sintonizador TDT? (TRUE / FALSE)");
        tv.setSintonizador(read.nextBoolean());
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (tv.getResolucion() > 40) {
            electro.setPrecio(electro.getPrecio() * 1.3);
        }
        if (tv.isSintonizador()) {
            electro.setPrecio(electro.getPrecio() + 500);
        }
        
        System.out.println("Precio final TV: " + electro.getPrecio());
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Resolucion: " + tv.getResolucion());
        System.out.println("Sintonizador: " + tv.isSintonizador());
    }
}
