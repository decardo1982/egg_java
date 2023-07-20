package Servicio;

import Entidades.Meses;
import java.util.Scanner;

public class MesesServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    Meses doceMeses = new Meses();

    public Meses mesSecreto() {

        String[] mes = new String[12];
        mes[0] = "enero";
        mes[1] = "febrero";
        mes[2] = "marzo";
        mes[3] = "abril";
        mes[4] = "mayo";
        mes[5] = "junio";
        mes[6] = "julio";
        mes[7] = "agosto";
        mes[8] = "septiembre";
        mes[9] = "octubre";
        mes[10] = "noviembre";
        mes[11] = "diciembre";

        String mesSecreto = mes[4];

        System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
        String mesIntento = read.next();

        boolean acerto = false;

        do {

            if (mesSecreto.equals(mesIntento)) {
                System.out.println("¡Ha acertado!");
                System.out.println("");
                acerto = true;
            } else {
                System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
                mesIntento = read.next();
            }
        } while (!acerto);

        return null;

    }

}
