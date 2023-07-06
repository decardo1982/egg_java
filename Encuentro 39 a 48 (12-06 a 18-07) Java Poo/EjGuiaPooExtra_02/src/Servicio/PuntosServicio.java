//Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
//atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
//usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
//los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
//que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
//calcular la distancia entre dos puntos consulte el siguiente link:
//http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html

package Servicio;

import Entidades.Puntos;
import java.util.Scanner;

public class PuntosServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    Puntos dosPuntos = new Puntos();

    public void crearPuntos() {

        System.out.println("Ingrese las coordenadas del punto 1:");
        System.out.print("x1 = ");
        dosPuntos.setX1(read.nextInt());
        System.out.print("y1 = ");
        dosPuntos.setY1(read.nextInt());
        System.out.println("");
        System.out.println("Ingrese las coordenadas del punto 2:");
        System.out.print("x2 = ");
        dosPuntos.setX2(read.nextInt());
        System.out.print("y2 = ");
        dosPuntos.setY2(read.nextInt());
        System.out.println("");
    }

    public double calcularDistancia() {
        int distanciaX = dosPuntos.getX2() - dosPuntos.getX1();
        int distanciaY = dosPuntos.getY2() - dosPuntos.getY1();

        double distancia = Math.sqrt((distanciaX * distanciaX) + (distanciaY * distanciaY));

        System.out.println("La distancia entre los dos puntos ingresados es: " + distancia);

        return distancia;
    }

}
