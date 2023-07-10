/*Realizar un programa que muestre en pantalla palabras ingresadas por teclado 
hasta que se ingrese la palabra "salir"*/
package todocode_01;

import java.util.Scanner;

public class Repetitiva_02 {
    
    public static void main(String[] args){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        String palabra = "";
        
        while (!palabra.equals("salir")){
            System.out.println("Ingrese una palabra:");
            palabra = read.next();
        }
        
        
        
        
    }
    
}
