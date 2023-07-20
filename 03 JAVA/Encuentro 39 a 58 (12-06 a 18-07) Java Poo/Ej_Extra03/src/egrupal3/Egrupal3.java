package egrupal3;

import Servicios.ClienteService;
import Servicios.RutinaService;

public class Egrupal3 {

    public static void main(String[] args) {
        ClienteService c1 = new ClienteService();
        ClienteService c2 = new ClienteService();
        ClienteService c3 = new ClienteService();
        ClienteService c4 = new ClienteService();
        RutinaService r1 = new RutinaService();
        RutinaService r2 = new RutinaService();

        c1.registrarCliente();
        c2.registrarCliente();
        c3.registrarCliente();

        r1.rellenarRutina();
        r2.rellenarRutina();
        c1.mostrar();
        r1.mostrarRutina();

        c1.actualizarCliente(0, "Juan", 20, 60, 160, "Superarla");
        r2.actualizarRutina(1, "Calistenia", 60, "Alta", "Modo guerra");

        c1.mostrar();
        r1.mostrarRutina();

        c1.eliminarCliente(1);
        r2.eliminarRutina(1);

        System.out.println("--------------------------");
        c4.registrarCliente();
        c1.mostrar();
        r1.mostrarRutina();

    }

}
