/*9. Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.*/

package javaintroejerciciosextra;

import java.util.Scanner;

public class EjercicioExtra_09 {
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        
        int residuo = 0;
        int cociente = 0;
        
        System.out.println("Ingrese dos números enteros mayores:");
        int dividendo = read.nextInt();
        int divisor = read.nextInt();
        
        do {
            residuo = dividendo - divisor;
            dividendo -= divisor;
            cociente++;
        } while (residuo > divisor);
        
        System.out.println("Cociente: " + cociente);
        System.out.println("Residuo: " + residuo);
        System.out.println("----------------------");
        System.out.println("Comprobación:");
        System.out.println("(Cociente x divisor) + residuo = dividendo");
        System.out.print("("+cociente + " x " + divisor+") + " + residuo + " = ");
        System.out.println((cociente*divisor) + residuo);       
    }
}