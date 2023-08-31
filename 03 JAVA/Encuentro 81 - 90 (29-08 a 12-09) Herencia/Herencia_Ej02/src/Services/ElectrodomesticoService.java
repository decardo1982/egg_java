package Services;

import Entities.Electrodomestico;
import static java.lang.Character.toUpperCase;
import java.util.Scanner;

public class ElectrodomesticoService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    Electrodomestico electro = new Electrodomestico();

    public Character comprobarConsumoEnergetico(char letra) {
//        System.out.println("letra " + letra);
        Character aux = toUpperCase(letra); //pasamos el caracter a mayúscula
//        System.out.println("aux " + aux);

        if (aux == 'A' || aux == 'B' || aux == 'C' || aux == 'D' || aux == 'E') {

            electro.setConsumoEnergetico(aux);

        } else {
            electro.setConsumoEnergetico('F');
        }
        System.out.println("ConsumoEnergetico " + electro.getConsumoEnergetico());
        return electro.getConsumoEnergetico();

    }

    public String comprobarColor(String color) {
        //System.out.println("color " + color);
        String aux = color.toUpperCase();
        //System.out.println("aux " + aux);

        if (aux.equals("NEGRO") || aux.equals("ROJO") || aux.equals("AZUL") || aux.equals("GRIS")) {
            electro.setColor(aux);
        } else {
            electro.setColor("BLANCO");
        }

        System.out.println("color = " + electro.getColor());
        return electro.getColor();

    }

    public void crearElectrodomestico() {
        electro.setPrecio(1000d);

        System.out.println("Ingrese el peso del producto: ");
        //desarrollar control para no ingesar valor menor o igualque 0

        electro.setPeso(read.nextDouble());

        System.out.println("Indique el color: ");
        electro.setColor((comprobarColor(read.next())));

        System.out.println("Indique consumo energético: (A, B, C, D, E o F)");
        electro.setConsumoEnergetico(comprobarConsumoEnergetico(read.next().charAt(0)));

    }

    public double precioFinal() {
        double precioFinal = electro.getPrecio();

        switch (electro.getConsumoEnergetico()) {
            case 'A':
                precioFinal += 1000d;
                break;
            case 'B':
                precioFinal += 800d;
                break;

            case 'C':
                precioFinal += 600d;
                break;

            case 'D':
                precioFinal += 500d;
                break;

            case 'E':
                precioFinal += 300d;
                break;
            default:
                precioFinal += 100d;
                break;
        }

        System.out.println("Precio final incluyendo consumo: " + precioFinal);

        if (electro.getPeso() <= 19) {
            precioFinal += 100d;
        } else {
            if (electro.getPeso() <= 49) {
                precioFinal += 500d;
            } else {
                if (electro.getPeso() <= 79) {
                    precioFinal += 800d;
                } else {
                    if (electro.getPeso() > 79) {
                        precioFinal += 1000d;
                    }
                }
            }
        }
        System.out.println("Precio final incluyendo peso: " + precioFinal);

        electro.setPrecio(precioFinal);

        return electro.getPrecio();

    }

}
