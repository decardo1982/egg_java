/*2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar. */
package javaintroejerciciosextra;

import java.util.Scanner;

public class EjercicioExtra_02 {
    public static void main(String[] args){
        
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese un valor para la variable A: ");
        int A = reader.nextInt();
        System.out.print("Ingrese un valor para la variable B: ");
        int B = reader.nextInt();
        System.out.print("Ingrese un valor para la variable C: ");
        int C = reader.nextInt();
        System.out.print("Ingrese un valor para la variable D: ");
        int D = reader.nextInt();
        
        int aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);

    }
    
}
