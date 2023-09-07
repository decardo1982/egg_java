package Entities;

import Enums.Color;
import Enums.ConsumoEnergetico;

public class Electrodomestico {

    protected Double precio;
    protected Color color;
    protected Double peso;
    protected ConsumoEnergetico consumoEnergetico;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, Color color, Double peso, ConsumoEnergetico consumoEnergetico) {
        this.precio = precio;
        this.color = color;
        this.peso = peso;
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public ConsumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(ConsumoEnergetico consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", peso=" + peso + ", consumoEnergetico=" + consumoEnergetico + '}';
    }

}
