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

    
}
