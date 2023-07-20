package ejercicio2;

import java.util.Scanner;

public class FiguraService {

    private int eleccion;
    Scanner leer = new Scanner(System.in);

    public void iniciar() {
        Figura figura = new Figura();

        double perimetro=0;
        double area=0;
        double apotema;

        System.out.println("Elija la figura: \n 1-Cuadrado \n 2-Rectangulo \n 3-Triangulo \n 4-Circulo \n 5-Hexagono \n 6-Pentagono \n 7- Rombo ");
        eleccion = leer.nextInt();


        switch (eleccion) {

            case 1:
                System.out.println("Ingrese el tamaño del lado");
                figura.setBase(leer.nextDouble());
                figura.setTipo("Cuadrado");

                perimetro = 4* figura.getBase();
                area = Math.pow(figura.getBase(), 2);

                break;
            case 2:
                System.out.println("Ingrese la base y altura del rectangulo");
                figura.setBase(leer.nextDouble());
                figura.setAltura(leer.nextDouble());
                figura.setTipo("Rectangulo");

                perimetro = 2* figura.getBase() + 2* figura.getAltura();
                area = figura.getAltura() * figura.getBase();
                break;
            case 3:
                System.out.println("Ingrese la base y altura del triangulo");
                figura.setBase(leer.nextDouble());
                figura.setAltura(leer.nextDouble());
                figura.setTipo("Triangulo");

                perimetro = 3* figura.getBase();
                area = (figura.getAltura() * figura.getBase()) / 2;
                break;
            case 4:
                System.out.println("Ingrese el radio del circulo");
                figura.setRadio(leer.nextDouble());
                figura.setTipo("Circulo");

                perimetro = Math.PI * 2 * figura.getRadio();
                area = Math.PI * (Math.pow(figura.getRadio(), 2));
                break;
            case 5:

                System.out.println("Ingrese el tamaño del lado del hexagono");
                figura.setBase(leer.nextDouble());
                figura.setTipo("Hexagono");

                apotema = (Math.sqrt(3)* figura.getBase())/2;

                perimetro = 6* figura.getBase();
                area = (perimetro*apotema)/2;
                break;
            case 6:
                System.out.println("Ingrese el tamaño del lado del pentagono");
                figura.setBase(leer.nextDouble());
                figura.setTipo("Pentagono");

                apotema = figura.getBase()/(2*Math.tan(36));

                perimetro = 5* figura.getBase();
                area = (perimetro*apotema)/2;
                break;
            case 7:
                System.out.println("Ingrese el tamaño del lado y diagonales del rombo");
                figura.setBase(leer.nextDouble());
                figura.setRadio(leer.nextDouble());
                figura.setRadio2(leer.nextDouble());
                figura.setTipo("Rombo");

                perimetro = 4* figura.getBase();
                area = (figura.getRadio()* figura.getRadio2())/2;
                break;

        }

        System.out.println(figura.getTipo() + " tiene un perimetro de  " + perimetro + " y un area de " + area);
    }
}
