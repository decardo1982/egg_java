//Realizar un programa en Java donde se creen dos arreglos:el primero será un arreglo A
//de 50 números reales, y el segundo B, un arreglo de 20 números, también reales.
//El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
//Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
//ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 0.5
//Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.
package Servicio;

import Entidades.DosArreglos;
import java.util.Arrays;
import java.util.Random;

public class DosArreglosServicio {

    DosArreglos arreglos = new DosArreglos();
    Random random = new Random();

    public int[] crearDosArreglos() {

        int[] arregloA = new int[50];
        double[] arregloB = new double[20];

        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = random.nextInt(100);
        }

        System.out.println("Arreglo A:");
        for (int i = 0; i < arregloA.length; i++) {
            System.out.println(arregloA[i] + "/");
        }

        Arrays.sort(arregloA);

        System.out.println("Arreglo A Ordenado:");
        for (int i = 0; i < arregloA.length; i++) {
            System.out.println(arregloA[i] + "/");
        }

        for (int i = 0; i < 10; i++) {
            arregloB[i] = arregloA[i];
        }
        for (int i = 10; i < 20; i++) {
            arregloB[i] = 0.5;
        }

        System.out.println("Arreglo B:");
        for (int i = 0; i < arregloB.length; i++) {
            System.out.println(arregloB[i] + "/");
        }

        return null;
    }

}
