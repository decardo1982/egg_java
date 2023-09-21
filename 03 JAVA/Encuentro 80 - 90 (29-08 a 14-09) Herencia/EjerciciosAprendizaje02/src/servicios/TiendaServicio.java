package servicios;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import entidades.Tienda;
import java.util.Scanner;

public class TiendaServicio {
    
    private Scanner input = new Scanner(System.in);
    private Tienda tiendaRegistrada = new Tienda("Belgrano");
    private LavadoraServicio lavadoraServicio = new LavadoraServicio();
    private TelevisorServicio televisorServicio = new TelevisorServicio();
    
    public void iniciarPrograma() {
        mostrarMenu();
    }

    private void mostrarMenu() {
        Integer opcionSeleccionada;
        do {            
            System.out.println("1 - Mostrar Lista Electrodomesticos");
            System.out.println("2 - Registrar Lavadora");
            System.out.println("3 - Registrar Televisor");
            System.out.println("0 - Finalizar Programa");
            System.out.print("Ingresar opcion seleccionada: ");
            opcionSeleccionada = input.nextInt();
            enviarSolicitud(opcionSeleccionada);
        } while (opcionSeleccionada != 0);
    }

    private void enviarSolicitud(Integer opcionSeleccionada) {
        switch (opcionSeleccionada) {
            case 1 -> mostrarListaElectrodomesticos();
            case 2 -> registrarLavadora();
            case 3 -> registrarTelevisor();
            default -> finalizarPrograma();
        }
    }

    private void mostrarListaElectrodomesticos() {
        if (!tiendaRegistrada.getListaElectrodomesticos().isEmpty()) {
            tiendaRegistrada.getListaElectrodomesticos().forEach(electrodomestico -> System.out.println(electrodomestico.toString()));
        } else {
            System.out.println("La tienda no cuenta con electrodomesticos en este momento");
        }
    }

    private void registrarLavadora() {
        agregarALista(lavadoraServicio.crearLavadora(Lavadora.class));
    }

    private void registrarTelevisor() {
        agregarALista(televisorServicio.crearTelevisor(Televisor.class));
    }

    private void finalizarPrograma() {
        System.out.println("Programa Finalizado");
    }
    
    private void agregarALista(Electrodomestico electrodomestico) {
        tiendaRegistrada.getListaElectrodomesticos().add(electrodomestico);
    }
    
}
