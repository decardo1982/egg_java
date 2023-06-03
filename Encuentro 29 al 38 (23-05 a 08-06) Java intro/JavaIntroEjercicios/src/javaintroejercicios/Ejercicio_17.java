/*
17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos). */
package javaintroejercicios;

import java.util.Scanner;

public class Ejercicio_17 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        
        System.out.print("Ingrese el tamaño del vector: ");
        int tamVector = read.nextInt();
        int[] vector = new int[tamVector];
        
        //llenamos el vector con valores aleatorios entre 1 y 99999
        for (int i = 0; i < tamVector; i++) {
            vector[i] = (int) (Math.random() * 100000);
        }
        //mostramos el vector
        for (int i = 0; i < tamVector; i++) {
            System.out.print("[" + vector[i]+ "] ");
        }
        /*
        //llenamos el vector con valores para poder determinar si funciona
        int[] vector = new int[10];
        vector[0] = 3;
        vector[1] = 3;
        vector[2] = 33633;
        vector[3] = 33363;
        vector[4] = 33333;
        vector[5] = 36666;
        vector[6] = 36663;
        vector[7] = 3333;
        vector[8] = 33333;
        vector[9] = 3333;
        /*
        //mostramos el vector
        for (int i = 0; i < 10; i++){
            System.out.print("[" + vector[i] + "] ");
        }*/

//inicializamos las variables que usaremos como contadores de números según sus dígitos
            int un_digito = 0;
            int dos_digitos = 0;
            int tres_digitos = 0;
            int cuatro_digitos = 0;
            int cinco_digitos = 0;

            for (int i = 0; i < 10; i++) {
                if (vector[i] >= 0 && vector[i] <= 9) {
                    un_digito++;
                } else  if (vector[i] >= 10 && vector[i] <= 99) {
                    dos_digitos++;
                } else if (vector[i] >= 100 && vector[i] <= 999) {
                    tres_digitos++;
                } else if (vector[i] >= 1000 && vector[i] <= 9999) {
                    cuatro_digitos++;
                } else if (vector[i] >= 10000 && vector[i] <= 99999) {
                    cinco_digitos++;
                }
                System.out.println("");

            }
            System.out.println("Números de 1 dígito: " + un_digito);
            System.out.println("Números de 2 dígitos: " + dos_digitos);
            System.out.println("Números de 3 dígito: " + tres_digitos);
            System.out.println("Números de 4 dígito: " + cuatro_digitos);
            System.out.println("Números de 5 dígito: " + cinco_digitos);

        }

    }


    /*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Defina el tamaño del vector: ");
        int n = scanner.nextInt();
        int[] vector = new int[n];
        rellenarVector(vector, n);
        identificandoNumeroDigitos(vector, n);
    }
    
    public static void rellenarVector(int [] vector, int n) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
                System.out.print("Ingrese el valor para la posicion ["+i+"] de su arreglo: ");
                vector [i] = leer.nextInt();
        }
    }
    
    public static void identificandoNumeroDigitos(int [] vector, int n) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        
        for (int i = 0; i < n; i++) {
            if ((vector[i]/10)<1) {
                a = a + 1;
            } else if ((vector[i]/100)<1) {
                b = b + 1;      
            } else if ((vector[i]/1000)<1) {
                c = c + 1;
            } else if ((vector[i]/10000)<1) {
                d = d + 1;
            } else if ((vector[i]/100000)<1) {
                e = e + 1;
            } else {
                System.out.println("el numero es de mas de 6 digitos");
            }
        }
        System.out.println("Existen "+a+" numeros de 1 digito");
        System.out.println("Existen "+b+" numeros de 2 digito");
        System.out.println("Existen "+c+" numeros de 3 digito");
        System.out.println("Existen "+d+" numeros de 4 digito");
        System.out.println("Existen "+e+" numeros de 5 digito");
    }
     */
