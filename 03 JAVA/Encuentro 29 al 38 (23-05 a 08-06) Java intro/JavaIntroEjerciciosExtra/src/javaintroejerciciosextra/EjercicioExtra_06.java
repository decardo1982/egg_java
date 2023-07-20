/*6. Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general */
package javaintroejerciciosextra;

import java.util.Scanner;

public class EjercicioExtra_06 {
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de personas: ");
        int personas = reader.nextInt();
        int bajos = 0;
        int altos = 0;
        double alturaBajos = 0;
        double alturaAltos = 0;
        
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la estatura de la persona " + (i + 1));
            double estatura = reader.nextDouble();
            if (estatura < 1.6) {
                bajos++;
                alturaBajos += estatura;
            } else {
                altos++;
                alturaAltos += estatura;
            }
        }
        //System.out.println("Cantidad de personas bajas: " + bajos);
        System.out.println("Promedio de altura bajos: " + (alturaBajos/bajos));
        //System.out.println("Cantidad de personas altas: " + altos);
        //System.out.println("Promedio de altura altos: " + (alturaAltos/altos));
        //System.out.println("Cantidad de personas total: " + (bajos + altos));
        System.out.println("Promedio de altura total: " + (alturaAltos+alturaBajos)/(altos+bajos));
    
    
    }
    
}
