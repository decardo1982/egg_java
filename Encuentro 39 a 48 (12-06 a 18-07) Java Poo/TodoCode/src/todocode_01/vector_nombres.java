package todocode_01;

import java.util.Scanner;

public class vector_nombres {
    
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        String vector[] = new String[8];
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese nombre: ");
            vector[i] = read.next();
        }
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Posicion " + i + " " + vector[i]);
        }
    }
    
}
