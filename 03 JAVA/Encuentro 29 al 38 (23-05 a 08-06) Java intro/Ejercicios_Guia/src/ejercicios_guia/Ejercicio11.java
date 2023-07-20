/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
*/
package ejercicios_guia;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine();
        
        String codificacion = codificarFrase(frase);
        
        System.out.println("La frase codificada es: " + codificacion);
    }
    public static String codificarFrase(String frase) {
        String codificacion = "";
        
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            
            switch (caracter) {
                case 'a':
                case 'A':
                    codificacion += "@";
                    break;
                case 'e':
                case 'E':
                    codificacion += "#";
                    break;
                case 'i':
                case 'I':
                    codificacion += "$";
                    break;
                case 'o':
                case 'O':
                    codificacion += "%";
                    break;
                case 'u':
                case 'U':
                    codificacion += "*";
                    break;
                default:
                    codificacion += caracter;
                    break;
                    
            }
        }
        return codificacion;
     
    }
    
}
