package todocode_01;

import java.util.Scanner;

public class vector_temperaturas {
    
    public static void main(String[] args){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de ciudades:");
        int longitud = read.nextInt();
        
        String ciudades[] = new String[longitud];
        double tempMin[] = new double[longitud];
        double tempMax[] = new double[longitud];
        double maxima = 0.0;
        double minima = 1000.0;
        String ciudadMaxima = "";
        String ciudadMinima = "";
        
        for (int i = 0; i < longitud; i++) {
            System.out.print("Ingrese el nombre de la ciudad " + (i+1) + ": ");
            ciudades[i] = read.next();
            System.out.print("Ingrese la temperatura mínima: ");
            tempMin[i] = read.nextDouble();
            System.out.print("Ingrese la temperatura máxima: ");
            tempMax[i] = read.nextDouble();
            
            if (tempMin[i] < minima) {
                ciudadMinima = ciudades[i];
            }
            if (tempMax[i] > maxima) {
                ciudadMaxima = ciudades[i];
            }
        }
        
        System.out.println("");
        System.out.println("La ciudad " + ciudadMinima + "");
        
    }
    
}
