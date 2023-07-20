package Servicio;

import Entidades.NIF;
import java.util.Scanner;

public class NIFServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    NIF Nif = new NIF();

    public NIF crearNif() {
        System.out.println("Ingrese el DNI:");
        Nif.setDNI(read.nextInt());

        int resto = Nif.getDNI() % 23;

        char[] vector = new char[23];
        vector[0] = 'T';
        vector[1] = 'R';
        vector[2] = 'W';
        vector[3] = 'A';
        vector[4] = 'G';
        vector[5] = 'M';
        vector[6] = 'Y';
        vector[7] = 'F';
        vector[8] = 'P';
        vector[9] = 'D';
        vector[10] = 'X';
        vector[11] = 'B';
        vector[12] = 'N';
        vector[13] = 'J';
        vector[14] = 'Z';
        vector[15] = 'S';
        vector[16] = 'Q';
        vector[17] = 'V';
        vector[18] = 'H';
        vector[19] = 'L';
        vector[20] = 'C';
        vector[21] = 'K';
        vector[22] = 'E';

        Nif.setLetra(vector[resto]);

        return Nif;
    }

    public void Mostrar() {
        System.out.println("NIF: " + Nif.getDNI() + "-" + Nif.getLetra());
    }
}
