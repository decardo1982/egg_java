package todocode_01;

import java.util.Scanner;

public class vector_temperaturas {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de ciudades:");
        int longitud = read.nextInt();

        String ciudades[] = new String[longitud];
        double minimas[] = new double[longitud];
        double maximas[] = new double[longitud];

        for (int i = 0; i < longitud; i++) {
            System.out.print("Ingrese el nombre de la ciudad Nº " + (i + 1) + ": ");
            ciudades[i] = read.next();
            System.out.print("Ingrese la temperatura mínima: ");
            minimas[i] = read.nextDouble();
            System.out.print("Ingrese la temperatura máxima: ");
            maximas[i] = read.nextDouble();
        }

        Double minima = 99999.00;
        Double maxima = -99999.00;
        int posMin = -1;
        int posMax = -1;

        //determinamos la mínimaa
        for (int i = 0; i < ciudades.length; i++) {

            if (minimas[i] < minima) {
                minima = minimas[i];
                posMin = i;
            }
            if (maximas[i] > maxima) {
                maxima = maximas[i];
                posMax = i;
            }
        }

        System.out.println("");
        System.out.println("La temperatura mínima se registró en " + ciudades[posMin] + " con " + minimas[posMin] + "ºC.");
        System.out.println("La temperatura máxima se registró en " + ciudades[posMax] + " con " + maximas[posMax] + "ºC.");

    }

}
