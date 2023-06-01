/*
12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals(). */
package javaintroejercicios;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        String FDE = "&&&&&";
        String cadena = "";
        int correctas = 0;
        int incorrectas = 0;
        
        do {
            System.out.println("Ingrese la cadena:");
            cadena = read.nextLine();
            
            if (cadena == FDE) {
                correctas += 1;
                break;
            } else if (
                cadena.length() == 5 &&
                cadena.substring(0,1).equals("X") &&
                cadena.substring(4,5).equals("O")
                ) {
            correctas += 1;
            
        } else {
                incorrectas += 1;
                
            }
        } while (cadena != "&&&&&");
        
        
        System.out.println("Correctas:" + correctas);
        System.out.println("Incorrectas:" + incorrectas);
        
        
        
    }
}

