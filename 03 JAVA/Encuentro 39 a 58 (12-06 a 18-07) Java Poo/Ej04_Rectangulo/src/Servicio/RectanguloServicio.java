package Servicio;

import Entidades.Rectangulo;
import java.util.Scanner;

public class RectanguloServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo crearRectangulo() {

        Rectangulo rectangulo = new Rectangulo();

        System.out.print("Ingrese la base del rectángulo: ");
        rectangulo.setBase(read.nextInt());
        System.out.print("Ingrese la altura del recángulo: ");
        rectangulo.setAltura(read.nextInt());

        return rectangulo;
    }

    public void calcularSuperficie(int base, int altura) {
        int superficie = base * altura;
        System.out.print("La superficie del rectángulo es: " + superficie);
        System.out.println("");
    }

    public void calcularPerimetro(int base, int altura) {
        int perimetro = (base + altura) * 2;
        System.out.print("El perímetro del recángulo es: " + perimetro);
        System.out.println("");
    }

    public void dibujarRectangulo(int base, int altura) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
