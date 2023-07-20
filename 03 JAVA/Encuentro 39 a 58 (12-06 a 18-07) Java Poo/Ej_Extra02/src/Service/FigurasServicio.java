package Service;

import Entidades.Figura;
import java.util.Scanner;

public class FigurasServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Figura figura = new Figura();

    public void crearFigura() {

        double perimetro = 0;
        double area = 0;

        System.out.print("Elija la figura: \n 1 - Cuadrado \n 2 - Rectángulo \n 3 - Triángulo equilátero \n 4 - Circulo \n 5 - Hexágono \n 6 - Pentágono \n 7 - Rombo");
        int eleccion = read.nextInt();

        switch (eleccion) {
            case 1:
                figura.setTipo("Cuadrado");
                System.out.print("Ingrese el lado del cuadrado: ");
                figura.setBase(read.nextDouble());
                perimetro = figura.getBase() * 4;
                area = Math.pow(figura.getBase(), 2);
                break;

            case 2:
                figura.setTipo("Rectángulo");
                System.out.print("Ingrese la base del rectángulo: ");
                figura.setBase(read.nextDouble());
                System.out.print("Ingrese la altura del rectángulo: ");
                figura.setAltura(read.nextDouble());
                perimetro = figura.getBase() * 2 + figura.getAltura() * 2;
                area = figura.getBase() * figura.getAltura();
                break;

            case 3:
                figura.setTipo("Triángulo Equilátero");
                System.out.print("Ingrese la base del triángulo: ");
                figura.setBase(read.nextDouble());
                perimetro = figura.getBase() * 3;
                area = (figura.getBase() * (figura.getBase()*Math.sqrt(3)) / 2);
                break;

            case 4:
                figura.setTipo("Círculo");
                System.out.print("Ingrese el radio del círculo: ");
                figura.setRadio(read.nextDouble());
                perimetro = Math.PI * 2 * figura.getRadio();
                area = Math.PI * Math.pow(figura.getRadio(), 2);
                break;

            case 5:
                figura.setTipo("Hexágono");
                System.out.print("Ingrese el lado del hexágono: ");
                figura.setBase(read.nextDouble());
                System.out.print("Ingrese la apotema del hexágono: ");
                figura.setApotema(read.nextDouble());
                perimetro = figura.getBase() * 6;
                area = perimetro * figura.getApotema() / 2;
                break;

            case 6:
                figura.setTipo("Pentágono");
                System.out.print("Ingrese el lado del pentágono: ");
                figura.setBase(read.nextDouble());
                System.out.print("Ingrese la apotema del pentágono: ");
                figura.setApotema(read.nextDouble());
                perimetro = figura.getBase() * 5;
                area = perimetro * figura.getApotema() / 2;
                break;

            case 7:
                figura.setTipo("Rombo");
                System.out.print("Ingrese la diagonal principal del rombo: ");
                figura.setBase(read.nextDouble());
                System.out.print("Ingrese la diagonal secundaroa del rombo: ");
                figura.setAltura(read.nextDouble());
                perimetro = figura.getBase() * 2 + figura.getAltura() * 2;
                area = figura.getBase() * figura.getAltura() / 2;
                break;

            default:
                System.out.println("Opción no válida");
                break;
        }
        System.out.println("El " + figura.getTipo() + " ingresado tiene un perímetro de " + perimetro + " y un área de " + area);
    }
}
