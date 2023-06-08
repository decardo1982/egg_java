/*
7. Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package javaintroejerciciosextra;

import java.util.Scanner;

/*
public class EjercicioExtra_07 { //creado con bucle "while"

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("¿Cuántos números ingresará?");
        int cantidad = read.nextInt();
        int maximo = 0;
        int minimo = 999999999;
        int contador = 0;
        int sumatoria = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el valor: " + (i+1) + " de " + cantidad );
            int n = read.nextInt();
            while (n > 0) {
                if (n > maximo) {
                    maximo = n;
                }
                if (n < minimo) {
                    minimo = n;
                }
                contador += 1;
                sumatoria += n;
                break;
            }
        }
        System.out.println("Maximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("sumatoria: " + sumatoria);
        System.out.println("contador posi: " + contador);
        double promedio = sumatoria / contador;
        System.out.println("Promedio: " + promedio);
    }
}
*/
public class EjercicioExtra_07 { //creado con bucle "do while"

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("¿Cuántos números ingresará?");
        int cantidad = read.nextInt();
        int maximo = 0;
        int minimo = 999999999;
        int contador = 0;
        int sumatoria = 0;
        boolean positivo = false;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el valor: " + (i+1) + " de " + cantidad + " ");
            int n = read.nextInt();
            if (n>0) {
                positivo = true;
            }
            do {
                if (n > maximo) {
                    maximo = n;
                }
                if (n < minimo) {
                    minimo = n;
                }
                contador += 1;
                sumatoria += n;
                break;
            } while (positivo=true);
        }
        System.out.println("Maximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("sumatoria: " + sumatoria);
        System.out.println("contador posi: " + contador);
        double promedio = sumatoria / contador;
        System.out.println("Promedio: " + promedio);
    }
}