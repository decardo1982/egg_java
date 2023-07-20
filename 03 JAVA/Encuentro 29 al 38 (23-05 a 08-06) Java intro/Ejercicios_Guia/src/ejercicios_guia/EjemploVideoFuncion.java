package ejercicios_guia;

import java.util.Scanner;


public class EjemploVideoFuncion {
    public static void main(String[] args) {
        
        int resultado = suma(10, 10);
        
        System.out.println(resultado);
        
        saludoPersonalizado("Chiquito");
        
        Scanner leer = new Scanner(System.in);
        
        String nombre = leer.next();
        saludoPersonalizado(nombre);
        saludoPersonalizado(leer.next());
    }
    
    public static int suma(int a, int b){
        
        //Logica
        int resultado = a + b;
        
        return resultado;
    }
    
    public static void saludoPersonalizado(String nombre) {
        System.out.println("Hola " + nombre + " cómo estás?");
    }
}
