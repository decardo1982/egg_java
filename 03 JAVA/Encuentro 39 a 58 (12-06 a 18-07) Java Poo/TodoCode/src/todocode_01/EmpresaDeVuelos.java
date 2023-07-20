package todocode_01;

import java.util.Scanner;


public class EmpresaDeVuelos {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        int vuelos[][] = new int [6][3];
        
        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese la cantidad de asientos para el destino " + f + " horario " + c);
                vuelos[f][c] = read.nextInt();
            }
        }
        
        //venta de asientos
        
        String bandera = "";
        int destino, horario, asientos;
        while (!bandera.equalsIgnoreCase("finish")){
            System.out.print("Ingrese el destino: ");
            destino = read.nextInt();
            System.out.print("Ingrese el horario: ");
            horario = read.nextInt();
            System.out.print("Ingrese la cantidad de asientos: ");
            asientos = read.nextInt();
            
            if (vuelos[destino][horario] >= asientos) {
                System.out.println("Su reserva fue realizada con éxito");
                vuelos[destino][horario] = vuelos[destino][horario] - asientos; 
            } else {
                System.out.println("No hay asientos disponibles.");
            }
            
            System.out.println("¿Desea continuar reservando? Ingrese 'finish' para terminar");
            bandera = read.next();
        }
    }
    
}
