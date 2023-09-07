package Services;

import Entities.Electrodomestico;
import Enums.Color;
import Enums.ConsumoEnergetico;
import java.util.Scanner;

public class ElectrodomesticoService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    Electrodomestico electro = new Electrodomestico();

    public void comprobarConsumoEnergetico(char letra) {

        switch (letra) {
            case 'A':
                electro.setConsumoEnergetico(ConsumoEnergetico.A);
                break;
            case 'B':
                electro.setConsumoEnergetico(ConsumoEnergetico.B);
                break;
            case 'C':
                electro.setConsumoEnergetico(ConsumoEnergetico.C);
                break;
            case 'D':
                electro.setConsumoEnergetico(ConsumoEnergetico.D);
                break;
            case 'E':
                electro.setConsumoEnergetico(ConsumoEnergetico.E);
                break;
            default:
                electro.setConsumoEnergetico(ConsumoEnergetico.F);
                break;

        }

    }

    public void comprobarColor(String color) {
        color = color.toUpperCase();

        switch (color) {
            case "NEGRO":
                electro.setColor(Color.NEGRO);
                break;
            case "ROJO":
                electro.setColor(Color.ROJO);
                break;
            case "AZUL":
                electro.setColor(Color.AZUL);
                break;
            case "GRIS":
                electro.setColor(Color.GRIS);
                break;
            default:
                electro.setColor(Color.BLANCO);
                break;
        }

    }

    public void crearElectrodomestico() {
        electro.setPrecio(1000d);

        System.out.println("Indique el color: ");
        String color = read.nextLine();
        comprobarColor(color);
        System.out.println("color: " + electro.getColor());

        System.out.println("Indique consumo energético: (A, B, C, D, E o F)");
        char consumo = read.next().toUpperCase().charAt(0);

        comprobarConsumoEnergetico(consumo);
        System.out.println("consumo: " + electro.getConsumoEnergetico());

        System.out.println("Ingrese el peso del producto: ");
        electro.setPeso(read.nextDouble());
        System.out.println("peso: " + electro.getPeso());

    }

    public void precioFinal() {
        Double precioFinal = electro.getPrecio();

        switch (electro.getConsumoEnergetico()) {
            case A:
                precioFinal += 1000d;
                break;
            case B:
                precioFinal += 800d;
                break;
            case C:
                precioFinal += 600d;
                break;
            case D:
                precioFinal += 500d;
                break;
            case E:
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

    }

    public void mostrar() {
        System.out.println("Color: " + electro.getColor());
        System.out.println("Consumo: " + electro.getConsumoEnergetico());
        System.out.println("Precio: " + electro.getPrecio());
        System.out.println("Peso: " + electro.getPeso());

    }

}
