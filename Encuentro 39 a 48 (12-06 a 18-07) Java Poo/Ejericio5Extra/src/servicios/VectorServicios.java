/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Vector;
import java.util.Scanner;

/**
 *
 * @author Daniel Atehortuua
 */
public class VectorServicios {

    Scanner leer = new Scanner(System.in);

    public Vector crearMeses() {

        Vector vector = new Vector();
        String[] aux = new String[12];

        aux[0] = "enero";
        aux[1] = "febrero";
        aux[2] = "marzo";
        aux[3] = "abril";
        aux[4] = "mayo";
        aux[5] = "junio";
        aux[6] = "julio";
        aux[7] = "agosto";
        aux[8] = "septiembre";
        aux[9] = "octubre";
        aux[10] = "noviembre";
        aux[11] = "diciembre";

        vector.setMeses(aux);
        return vector;
    }

    public void buscarMes(Vector vector) {

        String mesSecreto = vector.getMeses()[2];
        String mesUsuario;
        
        do {
            System.out.println("Ingrese el mes secreto: ");
            mesUsuario = leer.next();

            if (mesUsuario.equals(mesSecreto)) {
                System.out.println("¡Ha acertado!");
                break;

            } else {
                System.out.println("¡No acertó -_-!");
            }
        } while (!mesUsuario.equals(mesSecreto));
    }
}
