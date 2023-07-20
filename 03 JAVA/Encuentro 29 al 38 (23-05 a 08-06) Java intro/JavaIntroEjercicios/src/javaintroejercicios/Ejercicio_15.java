/*
15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente
*/
package javaintroejercicios;


public class Ejercicio_15 {
    public static void main(String[] args){
        System.out.println("Rellenamos un vector con los primeros 100 números enteros y los mostramos por pantalla en orden descendente:");
        
        int[] vector = new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i] = i+1;
        }
        for (int i = 99; i >= 0; i--) {
            System.out.print(vector[i] + ", ");
            
        }
    }
    
}
