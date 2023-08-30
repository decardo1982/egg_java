package Entities;

import static java.lang.Character.toUpperCase;
import java.util.Scanner;

public class Electrodomestico {

    Scanner read = new Scanner(System.in).useDelimiter("n");

    protected Double precio;
    protected String color;
    protected Double peso;
    protected Character consumoEnergetico;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, Double peso, Character consumoEnergetico) {
        this.precio = precio;
        this.color = color;
        this.peso = peso;
        this.consumoEnergetico = consumoEnergetico;
    }

    public Scanner getRead() {
        return read;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Character consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Character comprobarConsumoEnergetico(char letra) {
//        System.out.println("letra " + letra);
        Character aux = toUpperCase(letra);
//        System.out.println("aux " + aux);

        if (aux == 'A' || aux == 'B' || aux == 'C' || aux == 'D' || aux == 'E') {

            setConsumoEnergetico(aux);

        } else {
            setConsumoEnergetico('F');
        }
        System.out.println("ConsumoEnergetico " + getConsumoEnergetico());
        return consumoEnergetico;

    }

    public String comprobarColor(String color) {
//        System.out.println("color " + color);
        String aux = color.toUpperCase();
//        System.out.println("aux " + aux);

        if (aux.equals("NEGRO") || aux.equals("ROJO") || aux.equals("AZUL") || aux.equals("GRIS")) {
            setColor(aux);
        } else {
            setColor("BLANCO");
        }

        System.out.println("color = " + getColor());
        return getColor();

    }
    
    public void crearElectrodomestico(){
        System.out.println("Ingrese el precio: ");
        double precio = read.next();
    }

}
