package Servicio;

import Entidades.Vehiculo;
import java.util.Scanner;

public class VehiculoServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Vehiculo v1 = new Vehiculo();

    public void crearVehiculo() {

        System.out.println("Ingrese el tipo:");
        v1.setTipo(read.next());

    }

    public int Moverse() {
        System.out.print("Ingrese la cantidad de segundos: ");
        int segundos = read.nextInt();
        int metrosRecorridos = 0;

        switch (v1.getTipo()) {
            case "bicicleta":
                metrosRecorridos = segundos;
                break;
            case "motocicleta":
                metrosRecorridos = segundos * 2;
                break;
            case "automovil":
                metrosRecorridos = segundos * 3;
                break;
            default:
                System.out.println("Vehículo inválido");
                break;
        }
        System.out.println("Recorrió " + metrosRecorridos + " metros.");
        return metrosRecorridos;
    }

    public int Frenar() {
        int metrosFrenado = 0;

        if (!v1.getTipo().equals("bicicleta")) {
            metrosFrenado = 2;
        }
        return metrosFrenado;
    }

}
